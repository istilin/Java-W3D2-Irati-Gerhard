package Gerhard.A1.Library;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("Konrad Fernando","fernando@kontrad.com","fernandosreisen",'m');
        Book book = new Book("Fernandos Romantic love Story",author,12.5);
        Book book2 = new Book("Aleksis Road to the Mountain",author,22.1,2);
        System.out.println("\n\nBook 1: ");
        System.out.printf("Book title: %s\nAuthor: %s\nE-Mail: %s\nInstagram: %s\nGender: %s\nPrice: %.2f",
                book.getName(),
                book.getAuthor().getName(),
                book.getAuthor().getEmail(),
                book.getAuthor().getInstagram(),
                book.getAuthor().getGender(),
                book.getPrice());

        System.out.println("\n\nBook 2: ");
        System.out.printf("Book title: %s\nAuthor: %s\nE-Mail: %s\nInstagram: %s\nGender: %s\nPrice: %.2f\nQuantity: %d\n",
                book2.getName(),
                book2.getAuthor().getName(),
                book2.getAuthor().getEmail(),
                book2.getAuthor().getInstagram(),
                book2.getAuthor().getGender(),
                book2.getPrice(),
                book2.getQuantity());
    }
}