package pl.sda.functional;

//Utwórz kolekcję zawierającą obiekty typu Person. Napisz metodę do przeszukiwania kolekcji (po nazwie) z wykorzystaniem interfejsu stream().
//* Napisz kod umożliwiający wprowadzanie danych do przeszukiwania kolekcji z poziomu konsoli. Obsłuż możliwe do wystąpienia wyjątki oraz
// zadbaj by Twój program zawsze wyświetlał odpowiednie komunikaty dla użytkownika.
//
//Wykorzystaj kolekcję z obiektami typu Person i używając interfejsu stream(),
//wyciągnij wszystkie nazwy, posortuj, zmień wszystkie litery na wielkie, ogranicz do 5 elementów i na koniec utwórz jeden
//String zawierający przetworzone nazwy scalone ze sobą (za pomocą przecinka).


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PersonTask {

    public static void main(String[] args) {


        Person person1 = new Person(118, "Ala");
        Person person2 = new Person(11, "Ula");
        Person person3 = new Person(18, "Ela");
        Person person4 = new Person(218, "Ila");
        Person person5 = new Person(148, "Lla");
        Person person6 = new Person(19, "Gla");
        Person person7 = new Person(44, "Rumun");
        Person person8 = new Person(23, "Ala8");
        Person person9 = new Person(90, "T1000");
        Person person10 = new Person(91, "Ala69");
        Person person11 = new Person(8, "Wilde_Snake");
        Person person12 = new Person(8, "MateoOfMolimbden");

        List<Person> personList = Arrays.asList(person1,person2,person3, person4, person5, person6,
                person7, person8, person9, person10, person11, person12);

        System.out.println(personList);
        System.out.println();
        System.out.println("Give me the name: ");

        String name = inputName();
        List<Person> personList1 = findPerson(name, personList);
        if(personList1.isEmpty()) {
            System.out.println("I can't find that name. Please go away. Think about it and try again.");
        } else {
            System.out.println(personList1);
        }

        Optional<String> personList2 = personList.stream().map(s -> s.getName()).sorted().map(s -> s.toUpperCase()).limit(5).reduce((a, b) -> a + " " + b);
        System.out.println(personList2);

    }

    static String inputName () {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    static List<Person> findPerson (String name, List<Person> personList) {
        return personList.stream().filter (s-> s.getName().equals(name)).collect(Collectors.toList());
    }


}
