package Gerhard.A2;

public class WeekdayMenu extends Menu{
    public WeekdayMenu(String MainDish, String Desert, String Soup) {
        super(MainDish, Desert, Soup);
    }
    public String getSoupOfTheDay(){
        return this.Soup;
    }
}
