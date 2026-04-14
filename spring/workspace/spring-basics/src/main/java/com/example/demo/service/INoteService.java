package com.example.demo.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Order1;

public interface INoteService {

	Iterable<Order1> getOrder();

	Integer addOrder(Order1 order1);

	Optional<Order1> getOrderById(Integer id);

}