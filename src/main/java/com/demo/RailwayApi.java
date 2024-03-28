package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RailwayApi {

@GetMapping("show1")
public String show() {
	return "API created succesfully now";
}
}
