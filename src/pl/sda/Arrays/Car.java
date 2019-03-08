package pl.sda.Arrays;

public class Car {

    private String brand;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car1{" + "brand='" + brand + '\'' + ", color='" + color + '\'' + '}';
    }
}
