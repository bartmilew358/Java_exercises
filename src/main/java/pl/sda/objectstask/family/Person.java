package pl.sda.objectstask.family;

public class Person {

    private String personName;
    private String personSurname;
    private int personAge;


    public Person(String personName, String personSurname, int personAge) {
        this.personName = personName;
        this.personSurname = personSurname;
        this.personAge = personAge;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public int getPersonAge() {
        return personAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personSurname='" + personSurname + '\'' +
                ", personAge=" + personAge +
                '}';
    }
}
