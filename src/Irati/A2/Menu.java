package Irati.A2;

public class Menu {
    String MainDish;
    String Desert;
    String Soup;

    public Menu(String MainDish, String Desert, String Soup){
    this.MainDish = MainDish;
    this.Desert = Desert;
    this.Soup = Soup;
    }

    public String getSoupOfTheDay(){
        return this.Soup;
    }

    public void printMenu(){
        System.out.println("Menu consists of:\n Soup of the day: " + this.Soup + "\n Main Dish: " + this.MainDish + "\n Desert: " + this.Desert);
    }
}
