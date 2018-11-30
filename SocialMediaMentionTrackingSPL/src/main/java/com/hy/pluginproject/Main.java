package com.hy.pluginproject;

import twitter4j.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main implements CommandLineRunner{

	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("App working...");
				
	}

}