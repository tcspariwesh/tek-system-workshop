package basics;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		manageBooks();
//		stringSurprise();
	}

	private static void stringSurprise() {
		String s1 = new String("Book1"); //string literal, goes to stringpool
		String s3 = new String("Book1"); //string literal, goes to stringpool
		String s2 = new String("Book1");
		System.out.println(s1 == s2);
	}

	private static void manageBooks() {
		List<String> books = new ArrayList<>();
		books.add("Book1");
		books.add("Book1");
		books.add(2,"Book3");
		System.out.println(books.size());
		books.remove(0);
		System.out.println("after remove=" + books.size());
		books.forEach((book) -> System.out.println(book));
	}
}
