package pl.sda.generics.exercises;

import java.util.List;

public class NumbersBox<T extends Number> {

    private List<T> items;


    public NumbersBox(List<T> items) {
        this.items = items;
    }

    public boolean isEmpty(List<T> items) {

        if (items.isEmpty()){
           return true;
        }else {
            return false;
        }
    }

    public T firstElement() {

        return items.get(0);
    }

    public int firstElementAsInt() {

        T firstElement = firstElement();
        return firstElement.intValue();
    }


    public T lastElement() {

        return items.get(items.size()-1);
    }

    public int lastElementAsInt() {

        T lastElement = lastElement();
        return lastElement.intValue();
    }

    @Override
    public String toString() {
        return "NumbersBox{" +
                "items=" + items +
                '}';
    }
}