package pl.sda.interfaces;

public class Bird implements Animal{


    @Override
    public String getName() {
        return "ptak1";
    }

    @Override
    public String speak() {
        return "fi fi fi";
    }
}
