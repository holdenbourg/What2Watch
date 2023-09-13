package com.example.what2watch.Controllers;

import com.example.what2watch.Models.FilmModel;
import com.example.what2watch.Main;
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

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class FilmItemController implements Initializable {
    @FXML private Button addButton;
    @FXML private ImageView posterImageView;
    @FXML private Label releaseDateLabel;
    @FXML private Label titleLabel;
    @FXML private Label typeLabel;
    @FXML private Label usernameLabel;
    @FXML private Label posterUrlLabel;

    public FilmItemController() {
        posterImageView = new ImageView();
        titleLabel = new Label();
        releaseDateLabel = new Label();
        typeLabel = new Label();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void addButtonAction(ActionEvent event) throws IOException {
        String title = titleLabel.getText();
        Image poster = posterImageView.getImage();
        String release = releaseDateLabel.getText();
        String type = typeLabel.getText();
        String username = usernameLabel.getText();
        String posterUrl = posterUrlLabel.getText();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("Screens/rateMovieScreen.fxml"));
        Parent root = loader.load();
        Stage rateMovieStage = new Stage();
        rateMovieStage.initStyle(StageStyle.UNDECORATED);
        rateMovieStage.setScene(new Scene(root, 1920, 1080));
        rateMovieStage.show();

        RateMovieController dataSetter = loader.getController();
        dataSetter.setTitle(title);
        dataSetter.setPoster(poster);
        dataSetter.setType(type);
        dataSetter.setRelease(release);
        dataSetter.setUsername(username);
        dataSetter.setPosterUrl(posterUrl);
    }

    public void setData(FilmModel film) throws URISyntaxException {
        if (film.getPoster() == null){
            File file = new File("/W2W Images/NoPoster.jpg");
            Image image = new Image(file.toURI().toString());
            posterImageView.setImage(image);

        } else {
            Image image = new Image(film.getPoster());
            ImageView imageView = new ImageView(image);
            posterImageView.setImage(imageView.getImage());
            centerImage();

        }
        titleLabel.setText(film.getTitle());
        releaseDateLabel.setText(String.valueOf(film.getReleaseDate()));
        typeLabel.setText(film.getType());

    }
    public void setUsername(String username) {
        usernameLabel.setText(username);
    }
    public void setPosterUrl(String url) {
        posterUrlLabel.setText(url);
    }

    public void centerImage() {
        Image img = posterImageView.getImage();

        if (img != null) {
            double w = 0;
            double h = 0;

            double ratioX = posterImageView.getFitWidth() / img.getWidth();
            double ratioY = posterImageView.getFitHeight() / img.getHeight();

            double reducCoeff = 0;
            if(ratioX >= ratioY) {
                reducCoeff = ratioY;
            } else {
                reducCoeff = ratioX;
            }

            w = img.getWidth() * reducCoeff;
            h = img.getHeight() * reducCoeff;

            posterImageView.setX((posterImageView.getFitWidth() - w) / 2);
            posterImageView.setY((posterImageView.getFitHeight() - h) / 2);

        }
    }


    // TODO getter/setter
    public ImageView getPosterImageView() {return posterImageView;}
    public void setPosterImageView(ImageView posterImageView) {this.posterImageView = posterImageView;}

    public Label getReleaseDateLabel() {return releaseDateLabel;}
    public void setReleaseDateLabel(Label releaseDateLabel) {this.releaseDateLabel = releaseDateLabel;}

    public Label getTitleLabel() {return titleLabel;}
    public void setTitleLabel(Label titleLabel) {this.titleLabel = titleLabel;}

    public Label getTypeLabel() {return typeLabel;}
    public void setTypeLabel(Label typeLabel) {this.typeLabel = typeLabel;}
}
