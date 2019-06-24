package programowanie2.nbp;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NbpApp {

    public static void main(String[] args) throws IOException {


        URL url = new URL("http://api.nbp.pl/api/exchangerates/rates/c/usd/today/?format=json");

        final URLConnection urlConnection = url.openConnection();
        urlConnection.addRequestProperty("User-Agent", "Chrome");
        final BufferedReader in = new BufferedReader(new InputStreamReader(
                urlConnection.getInputStream()));
        String inputLine;
        StringBuilder sb = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            sb.append(inputLine);
        }

        in.close();

        Gson gson = new Gson();
        Nbp nbp = gson.fromJson(sb.toString(), Nbp.class);

//        System.out.println(nbp.getCode());



    }
}
