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

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML
    private Button signUpButton;
    @FXML private Button cancelButton;
    @FXML private Label signUpOverheadLabel;
    @FXML private ImageView signUpPageImageView;
    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private TextField usernameTextField;
    @FXML private PasswordField passwordTextField;
    @FXML private PasswordField confirmPasswordTextField;

    private static final String IDLE_BUTTON_STYLE = "-fx-background-color: 000000; -fx-border-color: 000000;";
    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: 000000; -fx-border-color: ffffff;";


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        signUpButton.setStyle(IDLE_BUTTON_STYLE);
        signUpButton.setOnMouseEntered(e -> signUpButton.setStyle(HOVERED_BUTTON_STYLE));
        signUpButton.setOnMouseExited(e -> signUpButton.setStyle(IDLE_BUTTON_STYLE));

        cancelButton.setStyle(IDLE_BUTTON_STYLE);
        cancelButton.setOnMouseEntered(e -> cancelButton.setStyle(HOVERED_BUTTON_STYLE));
        cancelButton.setOnMouseExited(e -> cancelButton.setStyle(IDLE_BUTTON_STYLE));
    }

    public void signUpButtonAction(ActionEvent event) throws IOException {

        if (passwordTextField.getText().equals(confirmPasswordTextField.getText())) {
            registerAccount();
            landingStage();

        } else {
            signUpOverheadLabel.setTextFill(Color.rgb(233,69,69));
            signUpOverheadLabel.setText("Passwords do not match");

        }
    }
    public void cancelButtonAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }


    public void registerAccount() {
        DatabaseConnection connection = new DatabaseConnection();
        Connection connectDB = connection.getConnection();

        String first = firstNameTextField.getText();
        String last = lastNameTextField.getText();
        String user = usernameTextField.getText();
        String pass = passwordTextField.getText();

        String call = "INSERT INTO UserAccounts (Firstname, Lastname, Username, Password) VALUES ('" + first + "', '" + last + "', '" + user + "', '" + pass + "')";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(call);
            signUpOverheadLabel.setTextFill(Color.WHITE);
            signUpOverheadLabel.setText("This account has been registered successfully");

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();

        }
    }
    public void landingStage() throws IOException {
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

        Stage stage = (Stage) signUpButton.getScene().getWindow();
        stage.close();
    }
}
