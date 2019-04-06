package pl.sda.stat;

public class ProductTest {
    public static void main(String[] args) {
        Product jogurt = new Product("Yogojux", 1000);
        Product chleb = new Product("Pumpernikel", 400);
        Product karp = new Product("Karp_typu_ryba", 705.5);
        Product kasza = new Product("Kuskus", 99);
        Product pies = new Product("Dingoper", 1006.99);

        printProducts(jogurt,chleb,karp,kasza,pies);
    }

    private static void printProducts(Product... products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
