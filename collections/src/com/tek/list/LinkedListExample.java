package com.tek.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<>();

		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Bangalore");
		if (cities instanceof LinkedList<String>) { //safe coding
			LinkedList<String> linkedList = ((LinkedList) cities);// downcasting
			linkedList.addFirst("Chennai");
		}
		System.out.println(cities);
	}
}
