package pl.sda.interfaces;

public class Bird implements Animal, Flyable, Being{


    @Override
    public String getName() {
        return "ptak1";
    }

    @Override
    public String speak() {
        return "fi fi fi";
    }

    @Override
    public String fly() {
        return "potrafi";
    }

    @Override
    public int getAge() {
        return 180;
    }

    @Override
    public boolean isAlive() {

        if (getAge() > MAX_AGE) {
            return false;
        }
        return true;
    }
}
