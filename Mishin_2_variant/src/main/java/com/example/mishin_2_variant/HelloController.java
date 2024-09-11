package com.example.mishin_2_variant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<?> Ontype;

    @FXML
    private Button exit;

    @FXML
    private TextField login;

    @FXML
    private TextField pass;

    @FXML
    private Button vhod;

    @FXML
    void Onexit(ActionEvent event) {
    System.exit(0);
    }
//кнопка выхода,при нажатие выходит из программы
    @FXML
    void Onlogin(ActionEvent event) {

    }

    @FXML
    void Onpass(ActionEvent event) {

    }

    @FXML
    void Onvhod(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Ontype != null : "fx:id=\"Ontype\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert exit != null : "fx:id=\"exit\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert pass != null : "fx:id=\"pass\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vhod != null : "fx:id=\"vhod\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
