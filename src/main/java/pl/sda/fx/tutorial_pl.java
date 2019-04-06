package pl.sda.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.stage.StageStyle;

import java.awt.*;

public class tutorial_pl extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stackPane = new StackPane();
        Button button = new Button("Button");
        button.setText("jux");

        stackPane.getChildren().add(button);

        Scene scene = new Scene(stackPane, 400, 600);

        primaryStage.setWidth(400);
        primaryStage.setHeight(400);

        // gdzie ma się otwierać okno
//        primaryStage.setX(0);
//        primaryStage.setY(0);

        // stały rozmiar okna głównego
//        primaryStage.setResizable(false);

//        primaryStage.setFullScreen(true);


        // style
//        primaryStage.initStyle(StageStyle.DECORATED);
//        primaryStage.initStyle(StageStyle.UNDECORATED);
//        primaryStage.initStyle(StageStyle.TRANSPARENT);
//        primaryStage.initStyle(StageStyle.UTILITY);

        //przezroczystość okna
//        primaryStage.setOpacity(0.5);

        primaryStage.setScene(scene);
        primaryStage.setTitle("First window");
        primaryStage.show();

    }
}
