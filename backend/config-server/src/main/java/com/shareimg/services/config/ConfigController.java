package com.shareimg.services.config;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@RequestMapping("/status")
	public String status() {
		return "ConfigServer v1.0. Local time: " + new Date();
	}
}
