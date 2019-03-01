package helloworld;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorldFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label label = new Label("Kliknij niżej");
        Label label2 = new Label("Auuuu!");

        Button button = new Button("Generuj!");
        button.setOnAction(e -> System.out.println("TSZZZZZZ!"));

        Button button2 = new Button("BUMMMM!!");
        button2.setOnAction(e -> System.out.println("BUM."));

        TextField field = new TextField("Dobre nie?");

        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(label, button, field, button2, label2);

        primaryStage.setTitle("Generator wyrazów dźwiękonaśladowczych");
        primaryStage.setScene(new Scene(box, 500, 200));
        primaryStage.show();
    }
}
