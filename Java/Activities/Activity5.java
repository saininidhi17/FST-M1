package Activity2;

abstract class Book {
	String title;

	// Abstract method in parent class
	abstract void setTitle(String title);

	// Concrete method in parent class
	String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	// Define abstract method in child class
	public void setTitle(String title) {
		this.title = title;
	}
}

public class Activity5 {
	public static void main(String[] args) {
		// Initialize title of the book
		String title = "Hover Car Racer";
		// Create object for MyBook which is a child class
		Book newNovel = new MyBook();
		// Set title
		newNovel.setTitle(title);

		// Print result
		System.out.println("The title is: " + newNovel.getTitle());
	}
}