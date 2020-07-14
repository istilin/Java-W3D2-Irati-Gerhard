package Irati.A1.library;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;

    public Book (String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book (String name, Author author, double price, int quantity){
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthorName(){
        return author.getName();
    }

    public String getAuthorEmail(){
        return author.getEmail();
    }

    public char getAuthorGender(){
        return author.getGender();
    }

    public void display(){
        System.out.println("Book title: " + this.name);
        System.out.println("Author name: " + author.getName());
        System.out.println("Author email: " + author.getEmail());
        System.out.println("Author gender: " + author.getGender());
        System.out.println("Author instagram: " + author.getInstagram());
        System.out.println("Price of book: " + this.price);
        System.out.println("Quantity of books: " + this.quantity);
    }
}
