package pl.sda.abstractTasks;

public class FoodTest {

    public static void main(String[] args) {
        Food chicken = new Chicken("kurczak bojler");
        Food ham = new Ham("pig");
        Food carrot = new Carrot("koń");
        Food salad = new Salad("liściasta");

        System.out.println("chicken = " + chicken.getTaste() + " type: "+ chicken.getType() + " typ " + chicken.getName());
        System.out.println("ham = " + ham.getTaste());
        System.out.println("carrot = " + carrot.getTaste());
        System.out.println("salad = " + salad.getTaste());
    }
}
