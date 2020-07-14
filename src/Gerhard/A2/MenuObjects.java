package Gerhard.A2;

public class MenuObjects {
    public static void main(String[] args) {
        Menu menuDay = new WeekdayMenu("Beef Stroganoff","Battenberg cake","Gazpacho");
        Menu menuEnd = new WeekendMenu("Macaroni and Cheese","Babka","Bouillabaisse","Grilled Bourbon Maple Wings");
        System.out.println("\nSoup of the Day for the Week is: "+menuDay.getSoupOfTheDay());
        System.out.println("Soup of the Day for the Weekend is: "+menuEnd.getSoupOfTheDay());

        menuDay.printMenu();
        System.out.println();
        menuEnd.printMenu();
    }
}
