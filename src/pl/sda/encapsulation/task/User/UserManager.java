package pl.sda.encapsulation.task.User;

public class UserManager {
    public UserModel user;

    private void createUser(String firstName, String lastName, int age) {
        user = new UserModel();
    }

    protected UserModel getUser() {
        return user;
    }
}
