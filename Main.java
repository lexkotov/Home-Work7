package Lesson7;

public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = {new Cat("Baks", 3), new Cat("Crank", 2), new Cat("Kyzia",15)};

        Plate plate = new Plate( 10);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
