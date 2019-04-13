package pl.sda.inner;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Samples {
    public static void main(String[] args) {
        List<Product> products = Lists.newArrayList(
                new Product(3, "Radio"),
                new Product(5, "TV"),
                new Product(1, "TV"),
                new Product(2, "Laptop"),
                new Product(4, "XBox")
        );

        //klasa zwykła zewnętrzna
        ProductBaseComparator baseComparator = new ProductBaseComparator();
        products.sort(baseComparator);
        System.out.println("products(baseComparator) = " + products);

        //kilka klas w jednym pliku
        ProductComparatorsByIdReversed comparatorsByIdReversed = new ProductComparatorsByIdReversed();
        products.sort(comparatorsByIdReversed);
        System.out.println("products(comparatorsByIdReversed) = " + products);

        ProductComparatorsByName productComparatorsByName = new ProductComparatorsByName();
        products.sort(productComparatorsByName);
        System.out.println("products(productComparatorsByName) = " + products);

        //klasa statyczna wewnętrzna
        Product.ByNameReversed byNameReversed = new Product.ByNameReversed();
        products.sort(byNameReversed);
        System.out.println("products(byNameReversed) = " + products);

        //klasa zwykła wewnętrzna
        Product product = new Product(100, "");
        Product.ByNameAndId byNameAndId = product.new ByNameAndId();
        products.sort(byNameAndId);
        System.out.println("products(byNameAndId) = " + products);

        //anonimowa klasa zagnieżdżona
        Comparator<Product> nestedComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId() - o2.getId();
            }
        };
        products.sort(nestedComparator);
        System.out.println("products(nestedComparator) = " + products);

        //lambda
        Comparator<Product> lambdaComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        products.sort(lambdaComparator);
        System.out.println("products(lambdaComparator) = " + products);

        //the same
        Comparator<Product> lambdaComparator2 = Samples::compare1;
        products.sort(lambdaComparator2);
        System.out.println("products(lambdaComparator2) = " + products);

        Comparator<Product> lambdaComparator3 = (o1, o2) -> o2.getName().compareTo(o1.getName());
        products.sort(lambdaComparator3);
        System.out.println("products(lambdaComparator3) = " + products);


        // rozbudowana wersja lambdy

        Comparator<Product> lambdaComparator4 = (o1, o2) -> {
            if (o1.getName().length() != o2.getName().length()) {
                return o2.getName().length() - o1.getName().length();
            }
            return o1.getId() - o2.getId();
        };
        products.sort(lambdaComparator4);
        System.out.println("products(lambdaComparator4) = " + products);

        // removeIf()

        Predicate<Product> predicate = product1 -> product1.getName().length() <= 3;

        products.removeIf(predicate);
        System.out.println("predicate = " + products);

    }

    public static int compare1(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}