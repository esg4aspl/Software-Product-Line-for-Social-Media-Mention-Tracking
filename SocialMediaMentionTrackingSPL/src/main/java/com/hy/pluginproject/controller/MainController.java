package com.hy.pluginproject.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hy.pluginproject.model.FeedModel;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import net.xeoh.plugins.base.PluginManager;
import net.xeoh.plugins.base.impl.PluginManagerFactory;
import twitter4j.Paging;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@RestController
@RequestMapping("/api")
public class MainController {


	@RequestMapping("/enablePlugin")
	public void enablePlugin() {

		System.out.println("Works...");

		//PluginManager pm = PluginManagerFactory.createPluginManager();
		//pm.addPluginsFrom(new File("plugins/").toURI());

		  ConfigurationBuilder cb = new ConfigurationBuilder();
	       cb.setOAuthConsumerKey("ET7qvZgvkHliCUQ8pUe09SFev");
	       cb.setOAuthConsumerSecret("culgOtALdkW55Ox2oGVq6l5ypH53ChVoMq2eokyUnmARZKFAP0");
	       cb.setOAuthAccessToken("1039253264775217152-S4QEuE2YyuTJ2OfUpuZjYMKqYo8ocm");
	       cb.setOAuthAccessTokenSecret("PoPrDFy8sd4TyAlNTLEqP6A97bpnNwt8Nadz1KH9hczaV");

	       Twitter twitter = new TwitterFactory(cb.build()).getInstance();

	       int pageno = 1;
	       String user = "sp_lfor";
	       List statuses = new ArrayList();

	       while (true) {

	         try {

	           int size = statuses.size();
	           Paging page = new Paging(pageno++, 100);
	           statuses.addAll(twitter.getUserTimeline(user, page));
	           if (statuses.size() == size)
	               break;
	                    }
	         catch(TwitterException e) {

	           e.printStackTrace();
	         }
	       }

	       System.out.println("Total: "+statuses);
	   
	}

	@RequestMapping("/getFeeds")
	public String getFeeds() {

	    ArrayList<FeedModel> feeds = new ArrayList<FeedModel>();
	    
	    ObjectMapper mapper = new ObjectMapper();   
		
		try {
			
			//String url = "http://www.milliyet.com.tr/rss/rssNew/dunyaRss.xml";
			//String url = "https://www.ntv.com.tr/spor.rss";
			String url = "https://www.transfermarkt.co.uk/rss/news";

			
			try (XmlReader reader = new XmlReader(new URL(url))) {
				SyndFeed feed = new SyndFeedInput().build(reader);
				System.out.println(feed.getTitle());
				System.out.println("***********************************");
				for (SyndEntry entry : feed.getEntries()) {
					System.out.println("Link:" + entry.getLink());
					System.out.println("Title:" + entry.getTitle());
					System.out.println("Date:" + entry.getPublishedDate());
					System.out.println("Description:" + entry.getDescription().getValue());
					FeedModel f = new FeedModel(entry.getLink(), entry.getTitle(), entry.getPublishedDate());
					feeds.add(f);
					System.out.println("***********************************");
				}
				System.out.println("Done");
			}
		}  catch (Exception e) {
			e.printStackTrace();
		}
		
		String projectAsString = "";
		try {
			projectAsString = mapper.writeValueAsString(feeds);
		    }
		 catch (IOException e) {
			System.out.println("Error in creating JSON which includes uploaded file details...");
		 }
	
		return projectAsString;
	}

}
