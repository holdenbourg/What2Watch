package com.example.what2watch.Controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class ExitController implements Initializable {

    @FXML private ImageView exitPageImageView;
    @FXML private Button yesButton;
    @FXML private Button noButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*
        File ExitPageFile = new File("C:\\Users\\holde\\jProjects\\What2Watch\\src\\main\\resources\\Images\\ExitPage.jpg");
        Image ExitPage = new Image(ExitPageFile.toURI().toString());
        exitPageImageView.setImage(ExitPage);

         */
    }

    public void yesButtonAction(ActionEvent event) {
        Platform.exit();
    }
    public void noButtonAction(ActionEvent event) {
        Stage stage = (Stage) noButton.getScene().getWindow();
        stage.close();
    }

}
