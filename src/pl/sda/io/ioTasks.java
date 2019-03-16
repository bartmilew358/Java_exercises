package pl.sda.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ioTasks {

    public static void main(String[] args) {

        Path baseFolder = Paths.get("C:\\io_test");
        System.out.println("baseFolder = " + baseFolder);

        try {

            if(!Files.exists(baseFolder)) {
                Files.createDirectories(baseFolder);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path = baseFolder.resolve("text.txt");
        try {
            if(!Files.exists(path)) {
                Files.createFile(path);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        try {

            Stream<Path> stream = Files.list(baseFolder);
            List<Path> pathList = stream.collect(Collectors.toList());
            for (Path path1 : pathList){
                System.out.println("Path: " + path1);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }


    }


}
