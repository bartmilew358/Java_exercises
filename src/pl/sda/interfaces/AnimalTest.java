package pl.sda.interfaces;

// zrobione do zadania 6 włącznie

public class AnimalTest {

    public static void main(String[] args) {


        Animal bird = new Bird();
        Animal fish = new Fish();
        Animal insect = new Insect();

        Animal[] animals = {bird, fish, insect};

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says " + animal.speak());
        }

        System.out.println(((Bird) bird).fly());

        System.out.println(((Bird) bird).getAge() + " " + ((Bird) bird).isAlive());
        System.out.println(((Fish) fish).getAge() + " " + ((Fish) fish).isAlive());
        System.out.println(((Insect) insect).getAge() + " " + ((Fish) fish).isAlive() );
    }
}
