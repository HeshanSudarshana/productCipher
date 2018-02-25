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
    public void encryptBrowseBtnAction(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select a file to Encrypt");
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile!=null) {
            encryptPathTxt.setText(selectedFile.getAbsolutePath());
        }
    }

    @FXML
    public void decryptBrowseBtnAction(ActionEvent actionEvent) {

    }
}
