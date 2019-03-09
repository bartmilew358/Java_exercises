package pl.sda.coinpo.Car;

public class CarApp {
    public static void main(String[] args) {
        Car c1 = new Car("Ford", "Silver", new Entertainment(true, 12));
        System.out.println(c1.toString());
        c1.turnOffRadio();
        System.out.println(c1.toString());
        c1.turnOnRadio();
        System.out.println(c1.toString());
        c1.setVolume(0);
        System.out.println(c1.toString());
        c1.setVolume(20);
        System.out.println("Current volume: " + c1.getVolume());
        System.out.println("Radio status: " + c1.isRadioOn());
        c1.turnOffRadio();
        System.out.println("Radio status: " + c1.isRadioOn());
    }
}