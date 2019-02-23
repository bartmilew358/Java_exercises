/* W osobnej klasie FahrenheitConverter, w metodzie main()
napisz program przekształcający dane o temperaturze podanej w skali Fahrenheit do skali Celsjusza.
 Dane wejściowe (temperatura w skali Fahrenheit) podać w inicjacji odpowiedniej
  zmiennej w programie. Sprawdź czy program
   poprawnie oblicza temperatury dla danych:
        32 °F = 0 °C; 212 °F = 100 °C
*/

public class FahrenheitConverter {
    public static void main(String[] args) {

    double temp_F = 212;
    double temp_c = (temp_F - 32) / 1.8;

    // C = (F - 32) / 1.8;

        System.out.println("Temperatura F = " + temp_F);
        System.out.println("Temperatura C = " + temp_c);


    }
}
