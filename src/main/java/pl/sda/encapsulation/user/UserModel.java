package pl.sda.encapsulation.user;

public class UserModel {
    private String firstName;
    private String lastName1;
    //private String lastName2;
    private int age = 55;

    // final AGE - stala

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName1;

    }

    public int getAge() {
        return age;
    }

    public UserModel(String firstName, String lastName1, int age) {
        this.firstName = firstName;
        this.lastName1 = lastName1;
        this.age = age;
    }
}
