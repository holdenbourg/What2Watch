package com.example.what2watch.Controllers;

import com.example.what2watch.Models.FilmModel;
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
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class RatedItemController implements Initializable {

    @FXML private Label titleLabel;
    @FXML private Label releaseDateLabel;
    @FXML private Label ratingLabel;
    @FXML private Button editButton;
    @FXML private Label usernameLabel;
    @FXML private Label restOfInfoLabel;


    public RatedItemController() {
        ratingLabel = new Label();
        releaseDateLabel = new Label();
        titleLabel = new Label();
        usernameLabel = new Label();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void editButtonAction(ActionEvent event) throws IOException {
        String[] restOfInfo = this.restOfInfoLabel.getText().split(",");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("Screens/moviesScreen.fxml"));
        Parent root = loader.load();
        Stage moviesStage = new Stage();
        moviesStage.initStyle(StageStyle.UNDECORATED);
        moviesStage.setScene(new Scene(root, 1920, 1080));
        moviesStage.show();

        MoviesController mc = new MoviesController();

        mc.setTitle(this.titleLabel.getText());
        mc.setReleaseYear(Integer.parseInt(this.releaseDateLabel.getText()));
        mc.setOvrRating(Double.parseDouble(this.ratingLabel.getText()));

        mc.setPoster(restOfInfo[0]);
        mc.setActing(Integer.parseInt(restOfInfo[1]));
        mc.setVisuals(Integer.parseInt(restOfInfo[2]));
        mc.setStory(Integer.parseInt(restOfInfo[3]));
        mc.setClimax(Integer.parseInt(restOfInfo[4]));
        mc.setPacing(Integer.parseInt(restOfInfo[5]));
        mc.setEnding(Integer.parseInt(restOfInfo[6]));
        mc.setType(restOfInfo[7]);
        mc.setDateRated(restOfInfo[8]);
    }

    public void setData(RatedFilmModel film) throws URISyntaxException {
        titleLabel.setText(film.getTitle());
        releaseDateLabel.setText(String.valueOf(film.getReleaseYear()));
        usernameLabel.setText(film.getUsername());
        restOfInfoLabel.setText(film.getRestOfInfo());

        if (film.getRating() == 10.0){
            ratingLabel.setText(String.valueOf(10));
        } else {
            ratingLabel.setText(String.valueOf(film.getRating()));
        }
    }

    public Label getTitleLabel() {return titleLabel;}
    public void setTitleLabel(Label titleLabel) {this.titleLabel = titleLabel;}

    public Label getReleaseDateLabel() {return releaseDateLabel;}
    public void setReleaseDateLabel(Label releaseDateLabel) {this.releaseDateLabel = releaseDateLabel;}

    public Label getRatingLabel() {return ratingLabel;}
    public void setRatingLabel(Label ratingLabel) {this.ratingLabel = ratingLabel;}


}
