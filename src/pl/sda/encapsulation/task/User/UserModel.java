package pl.sda.encapsulation.task.User;

public class UserModel {
    String firstName;
    private String lastName;
    protected final int AGE = 55;

    public String getFirstName() {
        return firstName;
    }
}
