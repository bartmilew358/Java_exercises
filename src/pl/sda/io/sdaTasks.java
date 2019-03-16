package pl.sda.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Task 3 - Napisz kod, który zapisze do pliku Twoje imię i nazwisko.
// Task 4 - Napisz kod, który odczyta plik tekstowy i wyświetli jego zawartość na konsoli.

public class sdaTasks {

    public static void main(String[] args) {

        Path baseFolder = Paths.get("C:\\io_test");
        System.out.println("baseFolder = " + baseFolder);

        try {
            //sprawdzanie i tworzenie katalogu na dysku
            if(Files.exists(baseFolder.getParent()) && !Files.exists(baseFolder)) {
                Files.createDirectory(baseFolder);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path = baseFolder.resolve("text.txt");
        try {
            //sprawdzanie i tworzenie pliku na dysku
            if(!Files.exists(path)) {
                Files.createFile(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //zapisujemy tekst do pliku
        try(FileWriter fileWriter = new FileWriter(path.toString())) {
            fileWriter.write("Bartłomiej Milewski");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileReader fileReader = new FileReader(path.toString())) {
            int read;
            while((read = fileReader.read()) != -1) {
                char character = (char) read;
                System.out.print(character);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Task 5 - Napisz kod, który skopiuje zawartość dowolnego pliku (tekstowego lub binarnego) do drugiego pliku.

//        Files.copy


    }
}