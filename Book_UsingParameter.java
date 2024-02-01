package constructor;

public class Book_UsingParameter {
    // Instance variables
    String title;
    String author;
    int year;

    // Parameterized constructor
    public Book_UsingParameter(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display book information
    public void displayInfo() {
    	System.out.println("Book Information \n");
        System.out.println("Name: " + title + " by " + author + ", Published in " + year);
    }

    public static void main(String[] args) {
        // Creating an object of the Book class using the parameterized constructor
    	Book_UsingParameter myBook = new Book_UsingParameter("Java Programming", "John Doe", 2021);

        // Calling a method to display book information
        myBook.displayInfo();
    }
}
