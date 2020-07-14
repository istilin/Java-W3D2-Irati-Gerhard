package Irati.A2;

public class Main {
    public static void main(String[] args) {
        Menu menu1 = new WeekdayMenu("Fish", "Tiramisu", "Tomato soup");
        Menu menu2 = new WeekendMenu("Spring rolls", "Chicken wok", "fried banana", "Miso soup");
        System.out.println(menu1.getSoupOfTheDay());
        System.out.println(menu2.getSoupOfTheDay());
        menu1.printMenu();
        menu2.printMenu();
    }
}
