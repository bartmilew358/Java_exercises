package pl.sda.encapsulation;

import pl.sda.encapsulation.item.ItemModel;
import pl.sda.encapsulation.user.UserModel;

public class OnlineShop {
    public static void main(String[] args) {

        ItemModel item1 = new ItemModel("book1", "abut java", 99);
        System.out.println(item1.getTitle() + " " + item1.getDescription() + " " + item1.getPrice());

        UserModel user1 = new UserModel("Janusz", "Renta", 50);
        System.out.println(user1.getFirstName() + " " + user1.getLastName() + " " + user1.getAge());

        //


    }
}
