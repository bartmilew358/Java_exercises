package programowanie2.list;

public class App {

    public static void main(String[] args) {

        MyList list = new MyList();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(4);
        list.add_by_index(3, 8);

        list.show();
        System.out.println("Size of list = " + list.size());

    }


}
