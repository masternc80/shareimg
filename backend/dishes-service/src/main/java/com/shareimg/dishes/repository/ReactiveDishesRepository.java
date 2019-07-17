package com.shareimg.dishes.repository;


import com.shareimg.dishes.entity.Dish;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ReactiveDishesRepository extends ReactiveMongoRepository<Dish, Integer> {

}
