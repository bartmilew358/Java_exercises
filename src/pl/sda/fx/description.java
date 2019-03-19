package pl.sda.fx;

import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Base64;

public class description extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Text text2 = new Text("800");
        Button button = new Button("Przelicz!");
        Text text = new Text("przed przeliczeniem na Base64");


//nmnmnmnm
//        String encoded = Base64.getEncoder().encodeToString();

//        button.setOnAction(e -> text.setText(encoded));

        TextField textField = new TextField();
        Label label = new Label();
        ObjectProperty<Font> fontProperty = label.fontProperty();
        fontProperty.setValue(new Font(36));
        textField.setOnAction(e -> label.setText(textField.getText()));

        VBox box = new VBox();
        ObservableList<Node> children = box.getChildren();
        children.addAll(text2, button, text, label);

        primaryStage.setTitle("Base64 description");
        primaryStage.setScene(new Scene(box, 300, 200));
        primaryStage.show();
    }
}
