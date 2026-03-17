public class ArrayExample {

    public static void main(String[] args) {
//    	basicArray();
    	arrayWithCustomObjects();
    }

	private static void arrayWithCustomObjects() {
		Book[] books = new Book[10];
		books[0] = new Book("1", "Learn Java", 123.3F, "Pariwesh ");
		System.out.println(books[0]);
	}

	private static void basicArray() {

//      int[] numbers = {10,20,30,40,50};
      int[] numbers =  new int[10];  
      numbers[1] =10;
      System.out.println(numbers[2]);		
	}
}
