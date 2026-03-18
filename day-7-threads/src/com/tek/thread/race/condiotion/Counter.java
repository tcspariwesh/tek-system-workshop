package com.tek.thread.race.condiotion;

class Counter {
	int count = 0;

	void increment() {
		System.out.println(Thread.currentThread());
		count++;
	}
}
