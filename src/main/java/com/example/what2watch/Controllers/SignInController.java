package com.example.what2watch.Controllers;

import com.example.what2watch.Controllers.LandingController;
import com.example.what2watch.Main;
import com.example.what2watch.Database.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class SignInController implements Initializable {

    @FXML private Button signInButton;
    @FXML private Button signUpButton;
    @FXML private Button closeButton;
    @FXML private Label signInOverheadLabel;
    @FXML private ImageView signInPageImageView;
    @FXML private TextField usernameTextField;
    @FXML private PasswordField passwordTextField;

    private static final String IDLE_BUTTON_STYLE = "-fx-background-color: 000000; -fx-border-color: 000000;";
    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: 000000; -fx-border-color: ffffff;";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        signInButton.setStyle(IDLE_BUTTON_STYLE);
        signInButton.setOnMouseEntered(e -> signInButton.setStyle(HOVERED_BUTTON_STYLE));
        signInButton.setOnMouseExited(e -> signInButton.setStyle(IDLE_BUTTON_STYLE));

        signUpButton.setStyle(IDLE_BUTTON_STYLE);
        signUpButton.setOnMouseEntered(e -> signUpButton.setStyle(HOVERED_BUTTON_STYLE));
        signUpButton.setOnMouseExited(e -> signUpButton.setStyle(IDLE_BUTTON_STYLE));

        closeButton.setStyle(IDLE_BUTTON_STYLE);
        closeButton.setOnMouseEntered(e -> closeButton.setStyle(HOVERED_BUTTON_STYLE));
        closeButton.setOnMouseExited(e -> closeButton.setStyle(IDLE_BUTTON_STYLE));
    }

    public void signInButtonAction(ActionEvent event) {
        if (usernameTextField.getText().isBlank() == false && passwordTextField.getText().isBlank() == false){
            validateLogin();

        } else {
            signInOverheadLabel.setTextFill(Color.rgb(233,69,69));
            signInOverheadLabel.setText("Please enter username and password");

        }
    }
    public void signUpButtonAction(ActionEvent event) {
        registerAccountStage();
    }
    public void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    public void validateLogin() {
        DatabaseConnection connection = new DatabaseConnection();
        Connection connectDB = connection.getConnection();

        String verifyLogin = "SELECT count(1) FROM w2wdatabase.useraccounts WHERE Username = '" + usernameTextField.getText() + "' AND Password = '" + passwordTextField.getText() + "'";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while(queryResult.next()){

                if (queryResult.getInt(1) == 1) {
                    String username = usernameTextField.getText();

                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(Main.class.getResource("Screens/landingScreen.fxml"));
                    Parent root = loader.load();
                    Stage landingStage = new Stage();
                    landingStage.initStyle(StageStyle.UNDECORATED);
                    landingStage.setScene(new Scene(root, 1920, 1080));
                    landingStage.show();

                    LandingController usernameSetter = loader.getController();
                    usernameSetter.setUsername(username);

                    Stage stage = (Stage) closeButton.getScene().getWindow();
                    stage.close();

                } else {
                    signInOverheadLabel.setTextFill(Color.rgb(233,69,69));
                    signInOverheadLabel.setText("Login doesn't match what we have in the system");

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();

        }
    }

    public void registerAccountStage() {

        try {
            Parent root = FXMLLoader.load(Main.class.getResource("Screens/signUpScreen.fxml"));
            Stage registerStage = new Stage();
            registerStage.initStyle(StageStyle.UNDECORATED);
            registerStage.setScene(new Scene(root, 1028, 790));
            registerStage.show();

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }


}
