package pl.sda.generics.boxes;

public class Box <T extends Fruit>{

    private T item;

    public Box(T item) {
        this.item = item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public  void isRotten() {

        item.isRotten();
    }

    public static void main(String[] args) {

        Box<Orange> orangeBox = new Box<>(new Orange());
        Box<Apple> appleBox = new Box<>(new Apple());
        Box<Strawberry> strawberryBox = new Box<>(new Strawberry());

        appleBox.isRotten();

    }



}
