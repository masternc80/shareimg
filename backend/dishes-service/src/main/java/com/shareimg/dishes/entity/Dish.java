package com.shareimg.dishes.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Dish {
	@Id
	ObjectId _id;
    int id;
    String name;
    String image;
    String category;
    boolean featured;
    String label;
    Double price;
    String description;

}
