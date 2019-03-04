package pl.sda.objectstask.family;

public class Family {

    private Person husband;
    private Person wife;
    private Person child;
    private String name;

    public Family(Person husband, Person wife, Person child, String name) {
        this.husband = husband;
        this.wife = wife;
        this.child = child;
        this.name = name;
    }

    public Person getHusband() {
        return husband;
    }

    public Person getWife() {
        return wife;
    }

    public Person getChild() {
        return child;
    }

    public String getName() {
        return name;
    }

    //Zadanie 4 #strings
    //Dodaj do klas reprezentujących osobę i rodzinę utworzonych w zadaniu na początku zajęć metody toString(),
    //które w czytelny sposób wyświetlą informacje o obiekcie.

    @Override
    public String toString() {
        return "Family{" +
                "husband=" + husband +
                ", wife=" + wife +
                ", child=" + child +
                ", name='" + name + '\'' +
                '}';
    }
}
