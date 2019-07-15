package zadaniaZCv.chuck;

import com.google.gson.Gson;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class ChuckNorrisJokes {

    public static void main(String[] args) throws IOException {

        getJokeAboutChuck(10);
    }

    private static void getJokeAboutChuck(int numberOfJokes) throws IOException {

        ArrayList<String> array = new ArrayList<>();

        for (int i = 0; i < numberOfJokes; i++) {

            final URL url = new URL("https://api.chucknorris.io/jokes/random");
            final URLConnection urlConnection = url.openConnection();
            urlConnection.addRequestProperty("User-Agent", "Chrome");
            final BufferedReader in = new BufferedReader(new InputStreamReader(
                    urlConnection.getInputStream()));
            String inputLine;

            StringBuilder sb = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
//                System.out.println(inputLine);
                sb.append(inputLine);
            }
            in.close();

            Gson gson = new Gson();
            Joke joke = gson.fromJson(sb.toString(), Joke.class);

            if (array.contains(joke.getValue())) {
                continue;
            }
            array.add(joke.getValue());
            System.out.println(joke.value);
        }
    }
}
