package pl.sda.coinpo.Car.ToolsShop;

public class Tool {

    public String model;
    public double price;


    public Tool(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getDetails() {
        return "Tool " + model +" price " + price;
    }


}
