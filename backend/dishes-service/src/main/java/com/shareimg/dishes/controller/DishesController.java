package com.shareimg.dishes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shareimg.dishes.entity.Dish;
import com.shareimg.dishes.repository.ReactiveDishesRepository;

@RestController
@RequestMapping("/dishes")
public class DishesController {

	@Autowired
	private ReactiveDishesRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Dish>> getDishes() {
		return repository.findAll()
		.collectList()
		.map(list -> ResponseEntity.ok(list))
		.block();
	}
}
