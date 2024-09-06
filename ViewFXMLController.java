package ermiasAntigegn;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewFXMLController implements Initializable {

    @FXML
    private Button clear;
    @FXML
    private Button del;
    @FXML
    private Button modul;
    @FXML
    private Button divide;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button multiply;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button mines;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button plus;
    @FXML
    private Button dot;
    @FXML
    private Button btn0;
    @FXML
    private Button equal;
    private TextField txtDisplay; // Added to manipulate the display
    
    private double firstNum;
    private double secondNum;
    private double result;
    private String Operations;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialization logic if needed
    }    

    @FXML
    private void clearButtonHandler(ActionEvent event) {
        txtDisplay.setText("0"); // Clear the display
    }

    @FXML
    private void delButtonHandler(ActionEvent event) {
        String currentText = txtDisplay.getText();
        if (currentText.length() > 1) {
            txtDisplay.setText(currentText.substring(0, currentText.length() - 1)); // Remove last character
        } else {
            txtDisplay.setText("0"); // Reset if nothing left
        }
    }

    @FXML
    private void modulButtonHandler(ActionEvent event) {
        // Implement modulus logic here
    }

    @FXML
    private void divideButtonHandler(ActionEvent event) {
        firstNum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.clear();
        Operations = "/";
    }

    @FXML
    private void buttonSevenHandler(ActionEvent event) {
        appendToDisplay("7");
    }

    @FXML
    private void buttonEightHandler(ActionEvent event) {
        appendToDisplay("8");
    }

    @FXML
    private void buttonNineHandler(ActionEvent event) {
        appendToDisplay("9");
    }

    @FXML
    private void multiplyButtonHandler(ActionEvent event) {
        firstNum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.clear();
        Operations = "*";
    }

    @FXML
    private void buttonFourHandler(ActionEvent event) {
        String enteredNumber = txtDisplay.getText()+btn4.getText();
        txtDisplay.setText(enteredNumber);
    }

    @FXML
    private void buttonFiveHandler(ActionEvent event) {
        String enteredNumber = txtDisplay.getText()+btn5.getText();
        txtDisplay.setText(enteredNumber);
    }

    @FXML
    private void buttonSixHandler(ActionEvent event) {
        String enteredNumber = txtDisplay.getText()+btn6.getText();
        txtDisplay.setText(enteredNumber);
    }

    @FXML
    private void minesButtonHandler(ActionEvent event) {
        firstNum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.clear();
        Operations = "-";
    }

    @FXML
    private void buttonOneHandler(ActionEvent event) {
        String enteredNumber = txtDisplay.getText()+btn1.getText();
        txtDisplay.setText(enteredNumber);
    }

    @FXML
    private void buttonTwoHandler(ActionEvent event) {
        String enteredNumber = txtDisplay.getText()+btn2.getText();
        txtDisplay.setText(enteredNumber);
    }

    @FXML
    private void buttonThreeHandler(ActionEvent event) {
        String enteredNumber = txtDisplay.getText()+btn3.getText();
        txtDisplay.setText(enteredNumber);
    }

    @FXML
    private void plusButtonHandler(ActionEvent event) {
        firstNum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.clear();
        Operations = "+";
    }

    @FXML
    private void dotButtonHandler(ActionEvent event) {
        String currentText = txtDisplay.getText();
        if (!currentText.contains(".")) {
            txtDisplay.setText(currentText + "."); // Append dot if not present
        }
    }

    @FXML
    private void buttonZeroHandler(ActionEvent event) {
        String enteredNumber = txtDisplay.getText()+btn0.getText();
        txtDisplay.setText(enteredNumber);
    }

    @FXML
    private void equalButtonHandler(ActionEvent event) {
        // Implement equal logic here
    }

    private void appendToDisplay(String value) {
        String currentText = txtDisplay.getText();
        if (currentText.equals("0")) {
            txtDisplay.setText(value); // Replace if current is zero
        } else {
            txtDisplay.setText(currentText + value); // Append value
        }
    }
}
