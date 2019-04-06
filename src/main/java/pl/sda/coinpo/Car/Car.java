package pl.sda.coinpo.Car;

public class Car {
    private String brand;
    private String color;
    private Entertainment radio;

    public Car(String brand, String color, Entertainment radio) {
        this.radio = radio;
        this.brand = brand;
        this.color = color;
    }
    public void turnOnRadio(){
        radio.setOn(true);
    }
    public void turnOffRadio(){
        radio.setOn(false);
    }
    public void setVolume(int vol){
        radio.setVolume(vol);
    }
    public int getVolume(){
        return radio.getVolume();
    }
    public boolean isRadioOn(){
        return radio.isOn();
    }


    @Override
    public String toString() {
        return "Car " +
                "brand = " + brand + " , color = " + color + " , radio = " + radio;
    }
}
