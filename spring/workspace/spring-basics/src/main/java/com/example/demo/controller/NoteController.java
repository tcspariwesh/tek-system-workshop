package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order1;
import com.example.demo.service.NoteService;
@RestController //JSON
public class NoteController {//dependent
	@Autowired
	NoteService noteService;//dependency
	@GetMapping("/order")
	Order1 getOrder(){
		return noteService.getOrder();
	}
}
