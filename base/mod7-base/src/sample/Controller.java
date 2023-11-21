package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> choice;

    @FXML
    private Label gramm;

    @FXML
    private TextField input;

    @FXML
    private Label kilo;

    @FXML
    private Label ton;

    @FXML
    void initialize() {
        Choice();
        choice.setOnAction(actionEvent -> Start());

    }

    void Choice() {
        ObservableList<String> lab = FXCollections.observableArrayList("Тонны", "Килограммы", "Граммы");
        choice.setItems(lab);
    }

    void Text() {
        input.textProperty().addListener(
                (observable, oldValue, newValue) -> ton.setText(newValue));
    }

    void Start() {
        if (choice.getValue().equals("Тонны")) {
            input.textProperty().addListener(
                    (observable, oldValue, newValue) -> ton.setText(newValue));
            input.textProperty().addListener(
                    (observable, oldValue, newValue) -> kilo.setText(Integer.toString(Integer.parseInt(newValue)*1000)));
            input.textProperty().addListener(
                    (observable, oldValue, newValue) -> gramm.setText(Integer.toString(Integer.parseInt(newValue)*1000000)));
        } else if (choice.getValue().equals("Килограммы")) {
            input.textProperty().addListener(
                    (observable, oldValue, newValue) -> ton.setText(Double.toString(Double.parseDouble(newValue)*0.001)));
            input.textProperty().addListener(
                    (observable, oldValue, newValue) -> kilo.setText(newValue));
            input.textProperty().addListener(
                    (observable, oldValue, newValue) -> gramm.setText(Integer.toString(Integer.parseInt(newValue)*1000)));
        } else if (choice.getValue().equals("Граммы")) {
            input.textProperty().addListener(
                    (observable, oldValue, newValue) -> ton.setText(Double.toString(Double.parseDouble(newValue)*0.001)));
            input.textProperty().addListener(
                    (observable, oldValue, newValue) -> kilo.setText(newValue));
            input.textProperty().addListener(
                    (observable, oldValue, newValue) -> gramm.setText(Double.toString(Double.parseDouble(newValue)*0.000001)));
        }

    }
}

