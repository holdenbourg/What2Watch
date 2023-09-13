package com.example.what2watch.Controllers;

import com.example.what2watch.Models.FilmModel;
import com.example.what2watch.Main;
import com.example.what2watch.Database.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class AddController implements Initializable {

    @FXML private Label usernameLabel;
    @FXML private ImageView addPageImageView;
    @FXML private TextField entertainmentTextField;
    @FXML private Button backButton;
    @FXML private Button searchButton;
    @FXML private VBox filmLayoutVBox;
    @FXML private Label posterLabel;
    @FXML private Label titleLabel;
    @FXML private Label releaseDateLabel;
    @FXML private Label typeLabel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    public void backButtonAction(ActionEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }
    public void searchButtonAction(ActionEvent event) throws IOException, InterruptedException {
        posterLabel.setOpacity(100);
        titleLabel.setOpacity(100);
        releaseDateLabel.setOpacity(100);
        typeLabel.setOpacity(100);

        List<FilmModel> list = new ArrayList<>();

        String search = entertainmentTextField.getText();
        String search2 = search.replaceAll("\\s","%20");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://online-movie-database.p.rapidapi.com/auto-complete?q=" + search2))
                .header("X-RapidAPI-Key", "e4c771251dmsh6e55ad64c9b2e04p1f5016jsn838792c00f38")
                .header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        ArrayList<String> searchResults = getRightAnswers(response.body());

        String[] posters = getPosters(response.body());
        String[] titles = getTitles(response.body());
        int[] releases = getReleases(response.body());
        String[] types = getTypes(response.body());

        for (int i = 0; i < searchResults.size(); i++) {
            String poster = posters[i];
            String title = titles[i];
            int release = releases[i];
            String type = types[i];

            if (!(type.equalsIgnoreCase("videoGame"))) {
                FilmModel newFilm = new FilmModel(poster, title, release, type);
                list.add(newFilm);
            }
        }

        filmLayoutVBox.setSpacing(10);

        for (int i = 0; i < list.size(); i++) {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(Main.class.getResource("Screens/filmItem.fxml"));

            try {
                HBox hBox = fxmlLoader.load();
                FilmItemController fic = fxmlLoader.getController();
                fic.setPosterUrl(list.get(i).getPoster());
                fic.setData(list.get(i));
                fic.setUsername(usernameLabel.getText());
                filmLayoutVBox.getChildren().add(hBox);

            } catch (IOException e) {
                e.printStackTrace();

            } catch (URISyntaxException e) {
                e.printStackTrace();

            }
        }
    }

    public void setUsername(String username) {
        usernameLabel.setText("Add for: " + username);
    }

    public static ArrayList<String> getRightAnswers(String response) {
        String[] answers = response.split("},\\{");
        ArrayList<String> rightAnswers = new ArrayList<>();

        for (int i = 0; i < answers.length; i++){
            if (answers[i].contains("\"imageUrl\":\"") && answers[i].contains("\"l\":\"") && answers[i].contains("\"y\":")){
                rightAnswers.add(answers[i]);
            }
        }

        return rightAnswers;
    }
    public static String[] getPosters(String response) {
        ArrayList<String> rightAnswers = getRightAnswers(response);
        String[] posters = new String[rightAnswers.size()];

        for (int i = 0; i < rightAnswers.size(); i++) {
            String currentAnswer = rightAnswers.get(i);

            int front = currentAnswer.indexOf("\"imageUrl\":\"");

            String newAnswer = currentAnswer.substring(front + 12);

            posters[i] = newAnswer;
        }

        String[] posterUrls = new String[rightAnswers.size()];

        for (int i = 0; i < posterUrls.length; i++) {
            String currentAnswer = posters[i];

            String url = currentAnswer.substring(0, currentAnswer.indexOf("\",\""));

            posterUrls[i] = url;
        }

        return posterUrls;
    }
    public static String[] getTitles(String response) {
        ArrayList<String> rightAnswers = getRightAnswers(response);
        String[] longTitles = new String[rightAnswers.size()];

        for (int i = 0; i < rightAnswers.size(); i++) {
            String currentAnswer = rightAnswers.get(i);

            int front = currentAnswer.indexOf("\"l\":\"");

            String newAnswer = currentAnswer.substring(front + 5);

            longTitles[i] = newAnswer;
        }

        String[] titles = new String[rightAnswers.size()];

        for (int i = 0; i < titles.length; i++) {
            String currentAnswer = longTitles[i];

            String url = currentAnswer.substring(0, currentAnswer.indexOf("\",\""));

            titles[i] = url;
        }

        return titles;
    }
    public static int[] getReleases(String response) {
        ArrayList<String> rightAnswers = getRightAnswers(response);
        String[] longYears = new String[rightAnswers.size()];

        for (int i = 0; i < rightAnswers.size(); i++) {
            String currentAnswer = rightAnswers.get(i);

            int front = currentAnswer.indexOf("\"y\":");

            String newAnswer = currentAnswer.substring(front + 4);

            longYears[i] = newAnswer;
        }

        int[] releaseYear = new int[rightAnswers.size()];

        for (int i = 0; i < releaseYear.length; i++) {
            String currentAnswer = longYears[i];

            int year = Integer.parseInt(currentAnswer.substring(0, 4));

            releaseYear[i] = year;
        }

        return releaseYear;
    }
    public static String[] getTypes(String response) {
        ArrayList<String> rightAnswers = getRightAnswers(response);
        String[] longTypes = new String[rightAnswers.size()];

        for (int i = 0; i < rightAnswers.size(); i++) {
            String currentAnswer = rightAnswers.get(i);

            int front = currentAnswer.indexOf("\"qid\":\"");

            String newAnswer = currentAnswer.substring(front + 7);

            longTypes[i] = newAnswer;
        }

        String[] types = new String[rightAnswers.size()];

        for (int i = 0; i < types.length; i++) {
            String currentAnswer = longTypes[i];

            String type = currentAnswer.substring(0, currentAnswer.indexOf("\",\""));

            switch (type){
                case "video":
                    type = "Video";
                    break;
                case "tvSeries":
                    type = "TV Show";
                    break;
                case "tvMovie", "movie":
                    type = "Movie";
                    break;
                case "podcastSeries", "podcast":
                    type = "Podcast";
                    break;
            }

            types[i] = type;
        }

        return types;
    }


}
