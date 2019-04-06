package pl.sda.interfaces;

public class Fish implements Animal, Swimmable, Being {
    @Override
    public String getName() {
        return "Dagmara";
    }

    @Override
    public String speak() {
        return "bul bul";
    }

    @Override
    public String swim() {
        return "potrafi";
    }

    @Override
    public int getAge() {
        return 1;
    }

    @Override
    public boolean isAlive() {

        if (getAge() > MAX_AGE) {
            return false;
        }
        return true;
    }
}
