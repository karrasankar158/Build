package com.in.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/s")
public class SampleRestController {

	@GetMapping("/a")
	public ResponseEntity<String> name(){
		return new ResponseEntity<String>("Sankar",HttpStatus.OK);
	}
}
