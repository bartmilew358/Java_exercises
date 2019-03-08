package pl.sda.coinpo.Car;

import pl.sda.objectstask.Car.Entertainment;

public class Car {

    private String brand;
    private String color;
    private Entertainment volume;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car1{" + "brand='" + brand + '\'' + ", color='" + color + '\'' + '}';
    }
}
