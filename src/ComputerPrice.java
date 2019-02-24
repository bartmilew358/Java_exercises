/*
W osobnej klasie ComputerPrice, w metodzie main() napisz program obliczający cenę komputera na podstawie jego części.
Program ma wypisać na konsolę osobno cenę samego komputera:
płyta główna, procesor, pamięć RAM, dysk twardy i osobno
cenę komputera i monitora. W cenie należy uwzględnić podatek VAT = 23%.
*/

//
//public class ComputerPrice {
//    public static void main(String[] args) {
//
//        double plyta_glowna = 450;
//        double obudowa = 550;
//        double procesor = 1250;
//        double zasilacz = 350;
//        double karta_graficzna = 1750;
//        double ram = 500;
//        double suma = plyta_glowna + obudowa + procesor + zasilacz + karta_graficzna+ram;
//
//        System.out.println("Cena elementow komputera: ");
//        System.out.println("Płyta główna = " + plyta_glowna + " zł + VAT = " + plyta_glowna*.23 + " zł" + " Razem = " + plyta_glowna*1.23 + " zł");
//        System.out.println("Obudowa = " + obudowa + " zł + VAT = " + obudowa*.23 + " zł" + " Razem = " + obudowa*1.23 + " zł");
//        System.out.println("Procesor = " + procesor + " zł + VAT = " + procesor*.23 + " zł" + " Razem = " + procesor*1.23 + " zł");
//        System.out.println("Zasilacz = " + zasilacz + " zł + VAT = " + zasilacz*.23 + " zł" + " Razem = " + zasilacz*1.23 + " zł");
//        System.out.println("Karta graficzna = " + karta_graficzna + " zł + VAT = " + karta_graficzna*.23 + " zł" + " Razem = " + karta_graficzna*1.23 + " zł");
//        System.out.println("Ram = " + ram + " zł + VAT = " + ram*.23 + " zł" + " Razem = " + ram*1.23 + " zł");
//        System.out.println("Suma = " + suma + " zł + VAT = " + suma*.23 + " zł" + " Razem = " + suma*1.23 + " zł");
//
//    }
//
//}

public class ComputerPrice {


        private double plyta_glowna = 450;
        private double obudowa = 550;
        private double procesor = 1250;
        private double zasilacz = 350;
        private double karta_graficzna = 1750;
        private double ram = 500;
        private double monitor = 999;

        public double getComputerPrice () {
            return (plyta_glowna+obudowa+procesor+zasilacz+karta_graficzna+ram);

        }

        public double getMonitorPrice () {
            return(monitor);
        }

        public double getComputerAndMonitorPrice() {
            return (monitor+plyta_glowna+obudowa+procesor+zasilacz+karta_graficzna+ram);
        }


}

