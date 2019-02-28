/*
W klasie ComputerPrice wydziel metody getComputerPrice(), getMonitorPrice() i getComputerAndMonitorPrice(),
 ostatnia z metod ma korzystać z dwóch pierwszych.
 Zmienną VAT ustaw jako pole klasy ComputerPrice.
 */

public class ComputerPriceApp {

    public static void main(String[] args) {

        ComputerPrice priceC1 = new ComputerPrice(1.23,300,350,500, 100, 1000, 600, 800);

        System.out.println("VAT rate = " + (((priceC1.vatTax))-1)*100 + " %");
        System.out.println("Computer Price w/o TAX = " + priceC1.getComputerPrice());
        System.out.println("Computer Price with TAX = " + priceC1.getComputerPrice());
        System.out.println("Monitor Price w/o TAX = " + priceC1.getMonitorPrice());
        System.out.println("Monitor Price with TAX = " + priceC1.getMonitorPriceWithTax());
        System.out.println("Computer and Monitor Price w/o TAX = " + priceC1.getComputerAndMonitorPrice());
        System.out.println("Computer and Monitor Price with TAX = " + priceC1.getComputerAndMonitorPriceWithTax());
    }
}
