package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order1;
import com.example.demo.service.NoteService;

@RestController // JSON
@RequestMapping("/order")
public class NoteController {// dependent
	@Autowired
	NoteService noteService;// dependency

	@GetMapping
	Order1 getOrder() {
		return noteService.getOrder();
	}
	@PostMapping
	Integer createOrder(Order1 order1) {
		return noteService.addOrder(order1);

	}
}
