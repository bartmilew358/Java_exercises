package pl.sda.encapsulation.item;

public class ItemManager {
    ItemModel createShopItem(String title, String description, double price) {

        return new ItemModel(title, description, price);

    }
}
