package com.example.what2watch.Controllers;

import com.example.what2watch.Models.RatedFilmModel;
import com.example.what2watch.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MoviesController implements Initializable {

    @FXML private ImageView posterImageView;
    @FXML private Label titleLabel;
    @FXML private Label typeLabel;
    @FXML private Label releaseDateLabel;
    @FXML private Label ratingLabel;
    @FXML private Label dateRatedLabel;

    @FXML private Label actingLabel;
    @FXML private Label actingRatingLabel;
    @FXML private Label visualsLabel;
    @FXML private Label visualsRatingLabel;
    @FXML private Label pacingLabel;
    @FXML private Label pacingRatingLabel;
    @FXML private Label storyLabel;
    @FXML private Label storyRatingLabel;
    @FXML private Label climaxLabel;
    @FXML private Label climaxRatingLabel;
    @FXML private Label endingLabel;
    @FXML private Label endingRatingLabel;

    @FXML private Button editButton;
    @FXML private Button removeButton;
    @FXML private Label usernameLabel;

    @FXML private VBox filmLayoutVBox;

    public MoviesController() {
        titleLabel = new Label();
        releaseDateLabel = new Label();
        typeLabel = new Label();
        posterImageView = new ImageView();

        actingLabel = new Label();
        visualsLabel = new Label();
        storyLabel = new Label();
        climaxLabel = new Label();
        pacingLabel = new Label();
        endingLabel = new Label();
        ratingLabel = new Label();

        dateRatedLabel = new Label();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*
        posterImageView.setOpacity(0);
        titleLabel.setOpacity(0);
        typeLabel.setOpacity(0);
        releaseDateLabel.setOpacity(0);
        ratingLabel.setOpacity(0);
        dateRatedLabel.setOpacity(0);

        actingLabel.setOpacity(0);
        actingRatingLabel.setOpacity(0);
        visualsLabel.setOpacity(0);
        visualsRatingLabel.setOpacity(0);
        pacingLabel.setOpacity(0);
        pacingRatingLabel.setOpacity(0);
        storyLabel.setOpacity(0);
        storyRatingLabel.setOpacity(0);
        climaxLabel.setOpacity(0);
        climaxRatingLabel.setOpacity(0);
        endingLabel.setOpacity(0);
        endingRatingLabel.setOpacity(0);

        editButton.setOpacity(0);
        removeButton.setOpacity(0);

         */
    }

    public void setUsername(String username) {
        usernameLabel.setOpacity(0);
        String newUser = username.substring(0,6);
        usernameLabel.setText(newUser);
    }

    public void setMovieList(List<RatedFilmModel> movieList) {
        for (int i = 0; i < movieList.size(); i++) {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(Main.class.getResource("Screens/ratedItem.fxml"));

            try {
                HBox hBox = fxmlLoader.load();
                RatedItemController ric = fxmlLoader.getController();
                ric.setData(movieList.get(i));
                filmLayoutVBox.getChildren().add(hBox);

            } catch (IOException e) {
                e.printStackTrace();

            } catch (URISyntaxException e) {
                e.printStackTrace();

            }
        }
    }

    public void setTitle(String title) {
        titleLabel.setText(title);
        titleLabel.setOpacity(100);
    }
    public void setReleaseYear(int releaseYear) {
        releaseDateLabel.setText(String.valueOf(releaseYear));
        releaseDateLabel.setOpacity(100);
    }
    public void setType(String type) {
        typeLabel.setText(type);
        typeLabel.setOpacity(100);
    }
    public void setPoster(String poster) {
        posterImageView.setImage(new Image(poster));
        posterImageView.setOpacity(100);
    }
    public void setActing(int acting) {
        actingLabel.setText(String.valueOf(acting));
        actingLabel.setOpacity(100);
    }
    public void setVisuals(int visuals) {
        visualsLabel.setText(String.valueOf(visuals));
        visualsLabel.setOpacity(100);
    }
    public void setStory(int story) {
        storyLabel.setText(String.valueOf(story));
        storyLabel.setOpacity(100);
    }
    public void setClimax(int climax) {
        climaxLabel.setText(String.valueOf(climax));
        climaxLabel.setOpacity(100);
    }
    public void setPacing(int pacing) {
        pacingLabel.setText(String.valueOf(pacing));
        pacingLabel.setOpacity(100);
    }
    public void setEnding(int ending) {
        endingLabel.setText(String.valueOf(ending));
        endingLabel.setOpacity(100);
    }
    public void setOvrRating(double rating) {
        ratingLabel.setText(String.valueOf(rating));
        ratingLabel.setOpacity(100);
    }
    public void setDateRated(String dateRated) {
        dateRatedLabel.setText(generateFixedDate(dateRated));
        dateRatedLabel.setOpacity(100);
    }

    public String generateFixedDate(String date) {
        String dateStr = String.valueOf(date);

        String correctYear = dateStr.substring(0, 4);
        String correctMonth;
        String correctDay;

        String month = dateStr.substring(5, 7);

        switch (month) {
            case "01":
                correctMonth = "January";
                break;
            case "02":
                correctMonth = "February";
                break;
            case "03":
                correctMonth = "March";
                break;
            case "04":
                correctMonth = "April";
                break;
            case "05":
                correctMonth = "May";
                break;
            case "06":
                correctMonth = "June";
                break;
            case "07":
                correctMonth = "July";
                break;
            case "08":
                correctMonth = "August";
                break;
            case "09":
                correctMonth = "September";
                break;
            case "10":
                correctMonth = "October";
                break;
            case "11":
                correctMonth = "November";
                break;
            case "12":
                correctMonth = "December";
                break;
            default:
                correctMonth = "Month";
                break;
        }

        String day = dateStr.substring(8, 10);

        switch (day) {
            case "01":
                correctDay = "1";
                break;
            case "02":
                correctDay = "2";
                break;
            case "03":
                correctDay = "3";
                break;
            case "04":
                correctDay = "4";
                break;
            case "05":
                correctDay = "5";
                break;
            case "06":
                correctDay = "6";
                break;
            case "07":
                correctDay = "7";
                break;
            case "08":
                correctDay = "8";
                break;
            case "09":
                correctDay = "9";
                break;
            default:
                correctDay = day;
                break;
        }

        return correctMonth + " " + correctDay + ", " + correctYear;
    }
}
