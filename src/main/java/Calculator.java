

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Calculator extends Application {
    private TextField firstNumberTextField;
    private TextField secondNumberTextField;
    private Label resultLabel;

    @Override
    public void start(Stage stage) throws Exception {
        firstNumberTextField = new TextField();
        secondNumberTextField = new TextField();
        resultLabel = new Label();

        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");

//        addButton.setOnAction(event -> {
//            int firstNumber = Integer.parseInt(firstNumberTextField.getText());
//            int secondNumber = Integer.parseInt(secondNumberTextField.getText());
//            int result = firstNumber + secondNumber;
//            resultLabel.setText(String.valueOf(result));
//        });
//
//        subtractButton.setOnAction(event -> {
//            int firstNumber = Integer.parseInt(firstNumberTextField.getText());
//            int secondNumber = Integer.parseInt(secondNumberTextField.getText());
//            int result = firstNumber - secondNumber;
//            resultLabel.setText(String.valueOf(result));
//        });
//
//        multiplyButton.setOnAction(event -> {
//            int firstNumber = Integer.parseInt(firstNumberTextField.getText());
//            int secondNumber = Integer.parseInt(secondNumberTextField.getText());
//            int result = firstNumber * secondNumber;
//            resultLabel.setText(String.valueOf(result));
//        });
//
//        divideButton.setOnAction(event -> {
//            int firstNumber = Integer.parseInt(firstNumberTextField.getText());
//            int secondNumber = Integer.parseInt(secondNumberTextField.getText());
//            int result = firstNumber / secondNumber;
//            resultLabel.setText(String.valueOf(result));
//        });
//
//        GridPane layout = new GridPane();
//        layout.add(firstNumberTextField, 0, 0);
//        layout.add(secondNumberTextField, 1, 0);
//        layout.add(addButton, 0, 1);
//        layout.add(subtractButton, 1, 1);
//        layout.add(multiplyButton, 2, 1);
//        layout.add(divideButton, 3, 1);
//        layout.add(resultLabel, 0, 2, 4, 1);
//
//        Scene scene = new Scene(layout, 400, 300);
//        stage.setScene(scene);
//        stage.setTitle("Calculator");
//        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
