/*
Utwórz nową klasę Temperature, która będzie posiadała pola: double temperature, String date, String hour.
Klasa określa temperaturę w skali Celsjusza w konkretnym dniu i o konkretnej godzinie.
Dodaj konstruktor inicjalizujący wszystkie trzy pola, metody-gettery dla każdego pola + dodaj metodę show()
która będzie zwracała napis w postaci: {date} {hour} - {temperature} °C, np: 2018-10-01 10:45 - 13 °C
 */


public class Temperature {

    double temperature;
    String date;
    String hour;

    public Temperature(){}
    public Temperature (double temperature, String date, String hour) {
        this.temperature = temperature;
        this.date = date;
        this.hour = hour;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String show (){

        return getDate() + " " + getHour() + " " + getTemperature() + "°C";
    }

    public String showInFahrenheit(){

        FahrenheitConverter temperatureConverter = new FahrenheitConverter();
        return getDate() + " " + getHour() + " " + temperatureConverter.convertToFahrenheit(getTemperature()) + "°F";
    }


    public static void main(String[] args) {

        Temperature showTemperature = new Temperature();

        showTemperature.setDate("29-02-2019");
        showTemperature.setHour("18:81");
        showTemperature.setTemperature(15);

        System.out.println(showTemperature.show());
        System.out.println(showTemperature.showInFahrenheit());

    }
}
