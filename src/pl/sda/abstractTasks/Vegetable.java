package pl.sda.abstractTasks;

public abstract class Vegetable extends Food{

    public Vegetable(String name) {
        super(name);
    }

    public FoodType getType(){

        return FoodType.VEGETABLE;

    }

}
