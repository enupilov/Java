package lesson7;

public class FeedingApp {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {new Cat("Matroskin", 10), new Cat("Vaska", 7), new Cat("Pushok", 5)};
        Plate plate = new Plate(0);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println();
        System.out.println("increase food by 100");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println();
        System.out.println("Cats take food:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
