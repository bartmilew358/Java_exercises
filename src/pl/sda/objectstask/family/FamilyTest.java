package pl.sda.objectstask.family;//public class FamilyTest {
//
//    public static void main(String[] args) {
//
//        FamilyTree family1 = new FamilyTree("Czarkowscy", "Cezary", "Czarkowski", 22, "Cecylia", "Czarkowska", 24, "Czygomir", "Czarkowski", 2);
//        FamilyTree family2 = new FamilyTree("Greenstein", "Szmailo", "Greenstein", 30, "Tamara", "Greenstein", 28, "Adam", "Greenstein", 6);
//
//        System.out.println(family1.family());
//        System.out.println(family2.family());
//    }
//}


public class FamilyTest {

//    Person ojciec = new Person("Janusz", "Elton", 28);

    public static void main(String[] args) {

        Person husband1 = new Person("Ryszard", "Ochucki", 44);
//        husband1 = null;
        System.out.println("husband 1 = " + husband1);

        Person wife1 = new Person("a", "b", 20);
        Person child1 = new Person("d", "e", 30);

        Family family1 = new Family(husband1, wife1, child1, "Okoń");
        System.out.println("family1 = " + family1);

        System.out.println("avgAge = " + (husband1.getPersonAge() + wife1.getPersonAge() + child1.getPersonAge())/3);




    }



}


