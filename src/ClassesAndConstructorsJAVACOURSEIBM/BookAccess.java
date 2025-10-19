package ClassesAndConstructorsJAVACOURSEIBM;

public class BookAccess {
    public static void main(String s[]) {

        // The book1 is created using the parameterized constructor:
        Book book1 = new Book("Atomic Habits", "James Clear", 30.00f);

        // The book2 is created using the default constructor:
        Book book2 = new Book();
        book2.setTitle("Sapiens");
        book2.setAuthor("Yuval Noah Harari");
        book2.setPrice(25.00f);

        System.out.println("The first book object is ");
        System.out.println(book1);
        System.out.println("The second book object is ");
        System.out.println(book2);
    }
}