package com.tek.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<String> cities = createListOfCities();
		System.out.println(cities.contains("Delhi"));
//		System.out.println(cities.remove("Delhi"));
		System.out.println(cities.lastIndexOf("delhi"));
		System.out.println(cities);
	}

	private static void defensiveDowncasting(List<String> cities) {
		if (cities instanceof LinkedList<String>) { //safe coding
			LinkedList<String> linkedList = ((LinkedList) cities);// downcasting
			linkedList.addFirst("Chennai");
		}
	}

	private static List<String> createListOfCities() {
		List<String> cities = new ArrayList<>();

		cities.add("Delhi");
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Bangalore");
		return cities;
	}
}
