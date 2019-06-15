package programowanie2.detectLanguage;

import com.detectlanguage.DetectLanguage;
import com.detectlanguage.Result;
import com.detectlanguage.errors.APIError;


import java.io.*;
import java.util.List;
import java.util.Scanner;

public class detectLanguage {
    public static void main(String[] args) throws APIError, IOException {
        DetectLanguage.apiKey = "ed45b28d57f6501e03cff1c0c2cf948f";

        FileReader fileReader = new FileReader("C:\\language_files\\chunichi.txt");

        Scanner scanner = new Scanner(fileReader);
        StringBuilder textFile = new StringBuilder();
        String line = "";

        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            System.out.println(line);
            textFile.append(line);
        }

        System.out.println(textFile.toString());

        String language = DetectLanguage.simpleDetect(textFile.toString());
        System.out.println(language);
    }
}


