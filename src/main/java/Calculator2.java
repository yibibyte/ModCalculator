import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator2 extends Application {

    private TextField display;

    private String currentInput = "";
    private String operator = "";
    private double firstOperand = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        display = new TextField();
        display.setEditable(false);
        display.setMinWidth(300);
        GridPane.setColumnSpan(display, 4);
        grid.add(display, 0, 0, 4, 1);

        String[][] buttonLabels = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"0", ".", "=", "+"}
        };

        for (int i = 0; i < buttonLabels.length; i++) {
            for (int j = 0; j < buttonLabels[i].length; j++) {
                Button button = new Button(buttonLabels[i][j]);
                button.setMinWidth(75);
                button.setOnAction(e -> handleButtonClick(button.getText()));
                grid.add(button, j, i + 1);
            }
        }

        Scene scene = new Scene(grid, 300, 400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void handleButtonClick(String value) {
        if (isNumeric(value) || value.equals(".")) {
            currentInput += value;
            display.setText(currentInput);
        } else if (isOperator(value)) {
            if (!currentInput.isEmpty()) {
                firstOperand = Double.parseDouble(currentInput);
                operator = value;
                currentInput = "";
            }
        } else if (value.equals("=")) {
            if (!currentInput.isEmpty()) {
                double secondOperand = Double.parseDouble(currentInput);
                double result = performOperation(firstOperand, secondOperand, operator);
                display.setText(String.valueOf(result));
                currentInput = "";
            }
        } else {
            // Clear button
            currentInput = "";
            firstOperand = 0;
            operator = "";
            display.clear();
        }
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private boolean isOperator(String str) {
        return str.matches("[*/+-]");
    }

    private double performOperation(double firstOperand, double secondOperand, String operator) {
        switch (operator) {
            case "+":
                return firstOperand + secondOperand;
            case "-":
                return firstOperand - secondOperand;
            case "*":
                return firstOperand * secondOperand;
            case "/":
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                } else {
                    // Handle division by zero
                    return 0;
                }
            default:
                return 0;
        }
    }
}

