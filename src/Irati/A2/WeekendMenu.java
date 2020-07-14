package Irati.A2;

public class WeekendMenu extends Menu {
    private String Appetizer;

    public WeekendMenu(String Appetizer, String MainDish, String Desert, String Soup){
        super(MainDish, Desert, Soup);
        this.Appetizer = Appetizer;
    }

    @Override
    public String getSoupOfTheDay(){
        return this.Soup;
    }

    @Override
    public void printMenu(){
        System.out.println("Menu consists of:\n Appetizer: " + this.Appetizer + "\n Soup of the day: " + this.Soup + "\n Main Dish: " + this.MainDish + "\n Desert: " + this.Desert);
    }

}
