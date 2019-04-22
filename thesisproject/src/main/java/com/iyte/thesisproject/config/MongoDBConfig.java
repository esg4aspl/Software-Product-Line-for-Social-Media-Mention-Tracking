package com.iyte.thesisproject.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.iyte.thesisproject.repository.FeedRepository;

@EnableMongoRepositories(basePackageClasses = FeedRepository.class)
@Configuration
public class MongoDBConfig {

	@Bean
	CommandLineRunner commandLineRunner(FeedRepository feedRepository) {
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception{
				
			}
		};
	}
	
	
}
