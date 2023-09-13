package com.example.what2watch.Controllers;

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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class FinalRatingController implements Initializable {

    @FXML private Label actingLabel;
    @FXML private Button addButton;
    @FXML private Button backButton;
    @FXML private Label climaxLabel;
    @FXML private Label endingLabel;
    @FXML private Label finalRatingLabel;
    @FXML private Label pacingLabel;
    @FXML private ImageView posterImageView;
    @FXML private Label releaseLabel;
    @FXML private Label storyLabel;
    @FXML private Label titleLabel;
    @FXML private Label typeLabel;
    @FXML private Label usernameLabel;
    @FXML private Label visualsLabel;
    @FXML private Label posterUrlLabel;

    private static final String IDLE_BUTTON_STYLE = "-fx-background-color: 000000; -fx-border-color: 000000;";
    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: 000000; -fx-border-color: ffffff;";


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addButton.setStyle(IDLE_BUTTON_STYLE);
        addButton.setOnMouseEntered(e -> addButton.setStyle(HOVERED_BUTTON_STYLE));
        addButton.setOnMouseExited(e -> addButton.setStyle(IDLE_BUTTON_STYLE));
    }


    // TODO buttons
    public void backButtonAction(ActionEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }
    public void addRatingAction() throws IOException, InterruptedException {

        String title = titleLabel.getText();
        int releaseDate = Integer.parseInt(releaseLabel.getText());
        String type = typeLabel.getText();
        String poster = posterUrlLabel.getText();
        int acting = Integer.parseInt(actingLabel.getText().substring(findColon(actingLabel.getText())));
        int visuals = Integer.parseInt(visualsLabel.getText().substring(findColon(visualsLabel.getText())));
        int story = Integer.parseInt(storyLabel.getText().substring(findColon(storyLabel.getText())));
        int climax = Integer.parseInt(climaxLabel.getText().substring(findColon(climaxLabel.getText())));
        int pacing = Integer.parseInt(pacingLabel.getText().substring(findColon(pacingLabel.getText())));
        int ending = Integer.parseInt(endingLabel.getText().substring(findColon(endingLabel.getText())));
        double rating = Double.parseDouble(finalRatingLabel.getText().substring(findColon(finalRatingLabel.getText())));
        String username = usernameLabel.getText();
        LocalDate dateRated = LocalDate.now();

        DatabaseConnection connection = new DatabaseConnection();
        Connection connectDB = connection.getConnection();

        String call = "INSERT INTO allratings (title, releaseDate, type, poster, acting, visuals, story, climax, pacing, ending, rating, username, dateRated) VALUES ('" + title + "', '" + releaseDate + "', '" + type + "', '" + poster + "', '" + acting + "', '" + visuals + "', '" + story + "', '" + climax + "', '" + pacing + "', '" + ending + "', '" + rating + "', '" + username + "', '" + dateRated + "')";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(call);

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();

        }


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("Screens/landingScreen.fxml"));
        Parent root = loader.load();
        Stage landingStage = new Stage();
        landingStage.initStyle(StageStyle.UNDECORATED);
        landingStage.setScene(new Scene(root, 1920, 1080));
        landingStage.show();

        LandingController dataSetter = loader.getController();
        dataSetter.setUsername(username);
        dataSetter.setRatedTitle(title);
    }


    // TODO set methods
    public void setUsername(String username) {usernameLabel.setText(username);}
    public void setTitle(String title) {titleLabel.setText(title);}
    public void setPoster(Image poster) {
        posterImageView.setImage(poster);
    }
    public void setType(String type) {
        typeLabel.setText(type);
    }
    public void setRelease(String release) {
        releaseLabel.setText(release);
    }
    public void setPosterUrl(String url) {
        posterUrlLabel.setText(url);
    }
    public void setActing(int acting) {
        actingLabel.setText("Acting: " + acting);
    }
    public void setVisuals(int visuals) {
        visualsLabel.setText("Visuals: " + visuals);
    }
    public void setStory(int story) {
        storyLabel.setText("Story: " + story);
    }
    public void setClimax(int climax) {
        climaxLabel.setText("Climax: " + climax);
    }
    public void setPacing(int pacing) {
        pacingLabel.setText("Pacing: " + pacing);
    }
    public void setEnding(int ending) {
        endingLabel.setText("Ending: " + ending);
    }
    public void setRating(double rating) {
        finalRatingLabel.setText("Final Rating: " + rating);
    }

    public int findColon(String input) {
        return input.indexOf(':') + 2;
    }


}