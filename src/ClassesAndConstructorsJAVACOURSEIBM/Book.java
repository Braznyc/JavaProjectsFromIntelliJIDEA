package ClassesAndConstructorsJAVACOURSEIBM;

public class Book {

    // Instance Variables (Fields). private means these variables can only be accessed within this class
    private String title;
    private String author;
    private float price;

    // Default Constructor, called when creating a book object with new Book():
    public Book() {
        this.title = null;
        this.author = null; // Note: price is not initialized here, so it gets default value of 0.0
    }

    // Parameterized Constructor. Called when creating a book object with new Book("Title", "Author", 25.99f)
    //Takes three parameters: title, author, and price
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Setter methods to modify the private fields after object creation
    // Each takes a parameter and assigns it to the corresponding instance variable
    // Follows encapsulation principle - controlled access to private data
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Getter methods to retrieve the private field values
    // Return the corresponding instance variable
    // Enable read access to encapsulated data

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    // Overrides the default toString() method from Object class
    // Returns a formatted string representation of the Book object
    //String.format("%.2f", this.price): Formats price to 2 decimal places
    //\n: Newline characters for better formatting
    public String toString() {
        return "Title - " + this.title + "\nAuthor - "
                + this.author + "\nPrice - "+ String.format("%.2f", this.price);
    }
}

/*
Key Concepts Demonstrated:
Encapsulation: Private fields with public getters/setters

Constructors: Multiple ways to create Book objects

Method Overriding: Custom toString() implementation

Data Hiding: Fields are private, access through methods
*/