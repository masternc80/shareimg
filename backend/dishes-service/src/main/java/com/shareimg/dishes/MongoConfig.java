package com.shareimg.dishes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;

import lombok.NonNull;

@Configuration
@EnableMongoAuditing
@EnableReactiveMongoRepositories(
    basePackages = "com.shareimg.dishes.repository")
public class MongoConfig extends AbstractReactiveMongoConfiguration {

	  @Autowired
	  private MongoProperties mongoProperties;
	  /**
	   * Return the Reactive Streams {@link MongoClient} instance to connect to. 
	   * Annotate with {@link Bean} in case you want
	   * to expose a {@link MongoClient} instance to the {@link ApplicationContext}.
	   *
	   * @return never {@literal null}.
	   */
	  @NonNull
	  @Override
	  public MongoClient reactiveMongoClient() {
	    return MongoClients.create();
	  }

	@Override
	protected String getDatabaseName() {
	    return mongoProperties.getDatabase();
	}
}
