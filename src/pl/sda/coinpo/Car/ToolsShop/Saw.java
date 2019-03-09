package pl.sda.coinpo.Car.ToolsShop;

public class Saw extends Tool {

    private int lenght;

    public Saw(String model, double price, int lenght) {
        super(model, price);
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public String toString() {
        return "Saw{" +
                "model='" + model + '\'' +
                ", price=" + price +
                "lenght=" + lenght +
                '}';
    }

    public String getDetails() {
        return super.getDetails() + " Saw lenght " + lenght;
    }


}
