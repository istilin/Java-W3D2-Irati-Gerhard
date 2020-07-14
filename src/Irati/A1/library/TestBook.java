package Irati.A1.library;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("Some dude", "abc@abc.com", 'm', "instagram.com/author");
        Book book1 = new Book("Alice in Wonderland", author, 20);
        Book book2 = new Book("Crazy book", author, 30, 4);

        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getName());
        System.out.println(book1.getAuthor().getEmail());
        System.out.println(book1.getAuthorName());
        System.out.println(book1.getAuthorEmail());
        System.out.println(book1.getAuthorGender());
        System.out.println("\n");
        book2.display();


    }
}
