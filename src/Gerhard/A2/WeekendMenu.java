package Gerhard.A2;

public class WeekendMenu extends Menu {
    private String Appetizer;

    public WeekendMenu(String MainDish, String Desert, String Soup, String Appetizer) {
        super(MainDish, Desert, Soup);
        this.Appetizer = Appetizer;
    }
    public String getSoupOfTheDay(){
        return this.Soup;
    }
    public void printMenu(){
        System.out.printf("\nWeekend Menu:\nAppetizer: %s\nSoup of the Day: %s\nMain Dish: %s\nDesert: %s",this.Appetizer,this.Soup,this.MainDish,this.Desert);
    }
}

