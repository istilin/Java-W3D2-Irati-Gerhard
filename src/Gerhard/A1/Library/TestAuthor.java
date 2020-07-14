package Gerhard.A1.Library;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Gerhard","gerhardx123@xasd.com","gerhardxxxxx", 'm');
        System.out.printf("Name: %s\nEmail: %s\nInstagram: %s\nGender: %s",author.getName(),author.getEmail(),author.getInstagram(),author.getGender());
    }
}
