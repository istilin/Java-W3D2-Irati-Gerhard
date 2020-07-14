package Gerhard.A2;

class Menu {

    String MainDish;
    String Desert;
    String Soup;

    public Menu(String MainDish, String Desert, String Soup) {
        this.MainDish = MainDish;
        this.Desert = Desert;
        this.Soup = Soup;
    }
    public String getSoupOfTheDay(){
        return this.Soup;
    }
    public void printMenu(){
        System.out.printf("\nWeek Menu:\nSoup of the Day: %s\nMain Dish: %s\nDesert: %s",this.Soup,this.MainDish,this.Desert);
    }
}
