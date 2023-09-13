package com.example.what2watch.Controllers;

import com.example.what2watch.Models.RatedFilmModel;
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
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class LandingController implements Initializable {

    @FXML private Button activeButton;
    @FXML private Button comingSoonButton;
    @FXML private Button addButton;
    @FXML private Button moviesButton;
    @FXML private Button showsButton;
    @FXML private Button searchButton;
    @FXML private Button settingsButton;
    @FXML private Button exitButton;
    @FXML private Line activeLine;
    @FXML private Line comingSoonLine;
    @FXML private Label usernameLabel;
    @FXML private Label footerLabel;
    @FXML private ImageView landingPageImageView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void addButtonAction(ActionEvent event) throws IOException {
        addStage();
    }
    public void moviesButtonAction(ActionEvent event) throws IOException {
        moviesStage();
    }
    public void showsButtonAction(ActionEvent event) throws IOException {
        showsStage();
    }
    public void settingsButtonAction(ActionEvent event) throws IOException {
        settingsStage();
    }
    public void exitButtonAction(ActionEvent event) throws IOException {
        exitStage();
    }

    public void activeButtonAction(ActionEvent event) {
        comingSoonLine.setOpacity(0);
        activeLine.setOpacity(100);
    }
    public void comingSoonButtonAction(ActionEvent event) {
        activeLine.setOpacity(0);
        comingSoonLine.setOpacity(100);
    }

    public void setUsername(String username) {
        usernameLabel.setText(username);
    }
    public void setRatedTitle(String title) throws InterruptedException {
        footerLabel.setTextFill(Color.rgb(255, 165, 0));
        footerLabel.setText("Your rating for \"" + title + "\" has been added");

        wait(5000);
        footerLabel.setText("");
    }

    public void addStage() throws IOException {
        String username = usernameLabel.getText();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("Screens/addScreen.fxml"));
        Parent root = loader.load();
        Stage landingStage = new Stage();
        landingStage.initStyle(StageStyle.UNDECORATED);
        landingStage.setScene(new Scene(root, 1920, 1080));
        landingStage.show();

        AddController usernameSetter = loader.getController();
        usernameSetter.setUsername(username);
    }
    public void moviesStage() throws IOException {
        String username = usernameLabel.getText();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("Screens/moviesScreen.fxml"));
        Parent root = loader.load();
        Stage moviesStage = new Stage();
        moviesStage.initStyle(StageStyle.UNDECORATED);
        moviesStage.setScene(new Scene(root, 1920, 1080));
        moviesStage.show();

        DatabaseConnection connection = new DatabaseConnection();
        Connection connectDB = connection.getConnection();

        String movieRetrieval = "SELECT * FROM w2wdatabase.allratings WHERE username = '" + usernameLabel.getText() + "' AND type = 'Movie'";

        List<RatedFilmModel> movieList = new ArrayList<>();

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(movieRetrieval);


            while(queryResult.next()){

                String title = queryResult.getString(2);
                int releaseYear = queryResult.getInt(3);
                double ovrRating = queryResult.getDouble(12);

                String poster = queryResult.getString(5);
                int acting = queryResult.getInt(6);
                int visuals = queryResult.getInt(7);
                int story = queryResult.getInt(8);
                int climax = queryResult.getInt(9);
                int pacing = queryResult.getInt(10);
                int ending = queryResult.getInt(11);
                String type = queryResult.getString(4);
                Date dateRated = queryResult.getDate(14);

                String restOfInfo = poster + "," + acting + "," + visuals + "," +story + "," + climax + "," + pacing + "," + ending + "," + type + "," + dateRated;

                RatedFilmModel movie = new RatedFilmModel(title, releaseYear, ovrRating, usernameLabel.getText(), restOfInfo);
                movieList.add(movie);
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();

        }

        MoviesController dataSetter = loader.getController();
        dataSetter.setUsername(username);
        dataSetter.setMovieList(movieList);
    }
    public void showsStage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("Screens/showsScreen.fxml"));
        Parent root = loader.load();
        Stage showsStage = new Stage();
        showsStage.initStyle(StageStyle.UNDECORATED);
        showsStage.setScene(new Scene(root, 1920, 1080));
        showsStage.show();
    }
    public void settingsStage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("Screens/settingsScreen.fxml"));
        Parent root = loader.load();
        Stage settingsStage = new Stage();
        settingsStage.initStyle(StageStyle.UNDECORATED);
        settingsStage.setScene(new Scene(root, 1920, 1080));
        settingsStage.show();
    }
    public void exitStage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("Screens/exitScreen.fxml"));
        Parent root = loader.load();
        Stage exitStage = new Stage();
        exitStage.initStyle(StageStyle.UNDECORATED);
        exitStage.setScene(new Scene(root, 1920, 1080));
        exitStage.show();
    }

}
