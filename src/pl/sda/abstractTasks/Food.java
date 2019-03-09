// kod jest udostępniony na gicie

package pl.sda.abstractTasks;

public abstract class Food {


    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getTaste();
    public abstract FoodType getType();


    }

