package pl.sda.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Base64;

public class description extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TextField textField1 = new TextField();
        TextField textField2 = new TextField();

        Button encodeButton = new Button("Encode!");
        encodeButton.setOnAction(e -> encode(textField1, textField2));


        VBox box = new VBox();
        box.setPadding(new Insets(20));
        box.setSpacing(20);
        box.getChildren().addAll(textField1, encodeButton, textField2);

        primaryStage.setScene(new Scene(box));
        primaryStage.show();
    }

        private void encode(TextField textField1, TextField textField2) {

        String valueBeforeEncode = textField1.getText();
        String encodedValue = Base64.getEncoder().encodeToString(valueBeforeEncode.getBytes());
        textField2.setText(encodedValue);

        ClipboardContent clipboardContent = new ClipboardContent();
        clipboardContent.putString(encodedValue);

        Clipboard clipboard = Clipboard.getSystemClipboard();
        clipboard.setContent(clipboardContent);
        }
}
