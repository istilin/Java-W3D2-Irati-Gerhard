package Gerhard.A1.Library;

public class Author {

    private String name;
    private String email;
    private String instagram;
    private char gender;

    public Author(String name, String email, String instagram, char gender){
        this.name = name;
        this.email = email;
        this.instagram = instagram;
        this.gender = gender;
    }


    public String toString(){
        return name+""+email+""+instagram+""+gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
