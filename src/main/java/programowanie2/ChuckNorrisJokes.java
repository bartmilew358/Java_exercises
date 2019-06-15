package programowanie2;

import com.google.gson.Gson;
import programowanie2.sms.Joke;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ChuckNorrisJokes {

    public static void main(String[] args) throws IOException {

        final URL url = new URL("https://api.chucknorris.io/jokes/random");
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
        Joke joke = gson.fromJson(sb.toString(), Joke.class);
        System.out.println();



    }
}
