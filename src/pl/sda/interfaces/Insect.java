package pl.sda.interfaces;

public class Insect implements Animal, Flyable, Being{
    @Override
    public String getName() {
        return "Heniek";
    }

    @Override
    public String speak() {
        return "ksz ksz";
    }


    @Override
    public String fly() {
        return "potrafi";
    }

    @Override
    public int getAge() {
        return 99;
    }

    @Override
    public boolean isAlive() {

        if (getAge() > MAX_AGE) {
            return false;
        }
        return true;
    }
}
