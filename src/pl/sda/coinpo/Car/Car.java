package pl.sda.coinpo.Car;

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
