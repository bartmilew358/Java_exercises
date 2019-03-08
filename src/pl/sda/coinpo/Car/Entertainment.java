package pl.sda.coinpo.Car;

public class Entertainment {

    int volume = 5;
    private boolean isMusicOn(){
        return (volume > 0);
    }
    public void volumeUp () {
        volume = volume + 1;
    }
    public void volumeDown(){
        volume = volume - 1;
    }

}
