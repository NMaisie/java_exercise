package OOP.car_system;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> v = new ArrayList<>();
        System.out.println("All Vehicle: ");

        v.add(new Car("Ford", "Expedition", 2020, 8));
    }
}