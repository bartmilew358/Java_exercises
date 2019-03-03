package pl.sda.objectstask.Car;

public class Entertainment extends Car {

    private boolean radio;

    public Entertainment(String brand,
                         String color,
                         Entertainment radio,
                         boolean radio1) {
        super(brand, color, radio);
        this.radio = radio1;
    }
}
