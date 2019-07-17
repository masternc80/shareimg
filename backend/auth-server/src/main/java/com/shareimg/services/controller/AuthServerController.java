package com.shareimg.services.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthServerController {

	@GetMapping("/status")
	public String status() {
		return "AuthServer v1.0. Local time: " + new Date();
	}
}
