package com.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {

    @FXML
    private JFXButton encryptBrowseBtn;

    @FXML
    private JFXButton decryptBrowseBtn;

    @FXML
    private JFXTextField encryptPathTxt;

    @FXML
    private JFXTextField decryptPathTxt;

    @FXML
    private JFXTextField encryptKeyTxt;

    @FXML
    private JFXTextField decryptKeyTxt;

    @FXML
    private JFXButton decryptBtn;

    @FXML
    private JFXButton encryptBtn;


    public String txtPathChooser() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select a file to Encrypt/Decrypt");
        FileChooser.ExtensionFilter txtFilter = new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(txtFilter);
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile!=null) {
            return (selectedFile.getAbsolutePath());
        } else {
            return null;
        }
    }

    @FXML
    public void encryptBrowseBtnAction(ActionEvent actionEvent) {
        encryptPathTxt.setText(txtPathChooser());
    }

    @FXML
    public void decryptBrowseBtnAction(ActionEvent actionEvent) {
        decryptPathTxt.setText(txtPathChooser());
    }

    public void encryptBtnAction(ActionEvent actionEvent) {
    }

    public void decryptBtnAction(ActionEvent actionEvent) {
    }
}
