package pl.sda.encapsulation.user;

public class UserManager {
    private UserModel user;

    private void createUser(String firstName, String lastName, int age) {

        user = new UserModel(firstName, lastName,age);
    }

    public UserModel getUser() {
        return user;
    }
}
