package pl.sda.abstractTasks;

public class Carrot extends Vegetable {

    public Carrot(String name) {
        super(name);
    }

    @Override
    public String getTaste() {
        return "crispy";
    }
}
