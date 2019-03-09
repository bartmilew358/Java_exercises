package pl.sda.coinpo.Car.ToolsShop;

public class Hammer extends Tool {

    private double weight;

    public Hammer(String model, double price, double weight) {
        super(model, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Hammer{" +
                "weight=" + weight +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
