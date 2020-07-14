package Irati.A2;

public class WeekdayMenu extends Menu{

    public WeekdayMenu(String MainDish, String Desert, String Soup){
        super(MainDish, Desert, Soup);
    }
    @Override
    public String getSoupOfTheDay(){
        return this.Soup;
    }

}
