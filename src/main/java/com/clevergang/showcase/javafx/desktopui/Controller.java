package com.clevergang.showcase.javafx.desktopui;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 * This Controller is instantiated by JavaFX based on the value set in the fx:controller attribute
 * in the sampleForm.fxml
 */
public class Controller {

    // These fields are bound to the UI elements using the fx:id attributes on the fields
    public TextField nameTextField;
    public TextField surnameTextField;
    public TextField birthTextField;
    public CheckBox checkboxOne;
    public CheckBox checkboxTwo;

    /**
     * This is an action which is called when button in UI is pressed. Notice that it's enough to
     * define the onAction attribute with correct name and the controller method is bound to the onAction event! Beautiful!
     */
    public void handlePrintToLogfileButtonClick(ActionEvent event) {
        StringBuilder summary = new StringBuilder();
        summary.append("Form results are: ");
        summary.append(nameTextField.getText());
        summary.append(", ");
        summary.append(surnameTextField.getText());
        summary.append(", ");
        summary.append(birthTextField.getText());
        summary.append(", ");
        summary.append(checkboxOne.isSelected());
        summary.append(", ");
        summary.append(checkboxTwo.isSelected());

        System.out.println(summary.toString());
    }

}
