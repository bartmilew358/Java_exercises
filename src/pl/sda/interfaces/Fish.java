package pl.sda.interfaces;

public class Fish implements Animal {
    @Override
    public String getName() {
        return "Dagmara";
    }

    @Override
    public String speak() {
        return "bul bul";
    }
}
