package com.example.what2watch.Controllers;

import com.example.what2watch.Controllers.FinalRatingController;
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
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class RateMovieController implements Initializable {

    @FXML private Button actingOneButton;
    @FXML private Label actingOneLabel;
    @FXML private Button actingTwoButton;
    @FXML private Label actingTwoLabel;
    @FXML private Button actingThreeButton;
    @FXML private Label actingThreeLabel;
    @FXML private Button actingFourButton;
    @FXML private Label actingFourLabel;
    @FXML private Button actingFiveButton;
    @FXML private Label actingFiveLabel;
    @FXML private Button actingSixButton;
    @FXML private Label actingSixLabel;
    @FXML private Button actingSevenButton;
    @FXML private Label actingSevenLabel;
    @FXML private Button actingEightButton;
    @FXML private Label actingEightLabel;
    @FXML private Button actingNineButton;
    @FXML private Label actingNineLabel;
    @FXML private Button actingTenButton;
    @FXML private Label actingTenLabel;

    @FXML private Button visualsOneButton;
    @FXML private Label visualsOneLabel;
    @FXML private Button visualsTwoButton;
    @FXML private Label visualsTwoLabel;
    @FXML private Button visualsThreeButton;
    @FXML private Label visualsThreeLabel;
    @FXML private Button visualsFourButton;
    @FXML private Label visualsFourLabel;
    @FXML private Button visualsFiveButton;
    @FXML private Label visualsFiveLabel;
    @FXML private Button visualsSixButton;
    @FXML private Label visualsSixLabel;
    @FXML private Button visualsSevenButton;
    @FXML private Label visualsSevenLabel;
    @FXML private Button visualsEightButton;
    @FXML private Label visualsEightLabel;
    @FXML private Button visualsNineButton;
    @FXML private Label visualsNineLabel;
    @FXML private Button visualsTenButton;
    @FXML private Label visualsTenLabel;

    @FXML private Button storyOneButton;
    @FXML private Label storyOneLabel;
    @FXML private Button storyTwoButton;
    @FXML private Label storyTwoLabel;
    @FXML private Button storyThreeButton;
    @FXML private Label storyThreeLabel;
    @FXML private Button storyFourButton;
    @FXML private Label storyFourLabel;
    @FXML private Button storyFiveButton;
    @FXML private Label storyFiveLabel;
    @FXML private Button storySixButton;
    @FXML private Label storySixLabel;
    @FXML private Button storySevenButton;
    @FXML private Label storySevenLabel;
    @FXML private Button storyEightButton;
    @FXML private Label storyEightLabel;
    @FXML private Button storyNineButton;
    @FXML private Label storyNineLabel;
    @FXML private Button storyTenButton;
    @FXML private Label storyTenLabel;

    @FXML private Button climaxOneButton;
    @FXML private Label climaxOneLabel;
    @FXML private Button climaxTwoButton;
    @FXML private Label climaxTwoLabel;
    @FXML private Button climaxThreeButton;
    @FXML private Label climaxThreeLabel;
    @FXML private Button climaxFourButton;
    @FXML private Label climaxFourLabel;
    @FXML private Button climaxFiveButton;
    @FXML private Label climaxFiveLabel;
    @FXML private Button climaxSixButton;
    @FXML private Label climaxSixLabel;
    @FXML private Button climaxSevenButton;
    @FXML private Label climaxSevenLabel;
    @FXML private Button climaxEightButton;
    @FXML private Label climaxEightLabel;
    @FXML private Button climaxNineButton;
    @FXML private Label climaxNineLabel;
    @FXML private Button climaxTenButton;
    @FXML private Label climaxTenLabel;

    @FXML private Button pacingOneButton;
    @FXML private Label pacingOneLabel;
    @FXML private Button pacingTwoButton;
    @FXML private Label pacingTwoLabel;
    @FXML private Button pacingThreeButton;
    @FXML private Label pacingThreeLabel;
    @FXML private Button pacingFourButton;
    @FXML private Label pacingFourLabel;
    @FXML private Button pacingFiveButton;
    @FXML private Label pacingFiveLabel;
    @FXML private Button pacingSixButton;
    @FXML private Label pacingSixLabel;
    @FXML private Button pacingSevenButton;
    @FXML private Label pacingSevenLabel;
    @FXML private Button pacingEightButton;
    @FXML private Label pacingEightLabel;
    @FXML private Button pacingNineButton;
    @FXML private Label pacingNineLabel;
    @FXML private Button pacingTenButton;
    @FXML private Label pacingTenLabel;

    @FXML private Button endingOneButton;
    @FXML private Label endingOneLabel;
    @FXML private Button endingTwoButton;
    @FXML private Label endingTwoLabel;
    @FXML private Button endingThreeButton;
    @FXML private Label endingThreeLabel;
    @FXML private Button endingFourButton;
    @FXML private Label endingFourLabel;
    @FXML private Button endingFiveButton;
    @FXML private Label endingFiveLabel;
    @FXML private Button endingSixButton;
    @FXML private Label endingSixLabel;
    @FXML private Button endingSevenButton;
    @FXML private Label endingSevenLabel;
    @FXML private Button endingEightButton;
    @FXML private Label endingEightLabel;
    @FXML private Button endingNineButton;
    @FXML private Label endingNineLabel;
    @FXML private Button endingTenButton;
    @FXML private Label endingTenLabel;

    @FXML private ImageView backgroundImageView;
    @FXML private Label headerLabel;
    @FXML private Label warningLabel;
    @FXML private Label usernameLabel;
    @FXML private Button addRatingButton;
    @FXML private Button backButton;
    @FXML private ImageView posterImageView;
    @FXML private Label typeLabel;
    @FXML private Label releaseLabel;
    @FXML private Label posterUrlLabel;

    private static final String IDLE_BUTTON_STYLE = "-fx-background-color: 000000; -fx-border-color: 000000;";
    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: 000000; -fx-border-color: ffffff;";


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        warningLabel.setText("Select one from each category");

        addRatingButton.setStyle(IDLE_BUTTON_STYLE);
        addRatingButton.setOnMouseEntered(e -> addRatingButton.setStyle(HOVERED_BUTTON_STYLE));
        addRatingButton.setOnMouseExited(e -> addRatingButton.setStyle(IDLE_BUTTON_STYLE));
    }

    public void backButtonAction(ActionEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    public void addRatingButtonAction(ActionEvent event) throws IOException {
        String username = usernameLabel.getText();

        int startIndex = (headerLabel.getText().indexOf('"') + 1);
        String tempStr = headerLabel.getText().substring(startIndex);
        int endIndex = tempStr.indexOf('"');
        String title = headerLabel.getText().substring(startIndex, startIndex + endIndex);

        Image poster = posterImageView.getImage();
        String posterUrl = posterUrlLabel.getText();
        String release = releaseLabel.getText();
        String type = typeLabel.getText();


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("Screens/finalRatingScreen.fxml"));
        Parent root = loader.load();
        Stage landingStage = new Stage();
        landingStage.initStyle(StageStyle.UNDECORATED);
        landingStage.setScene(new Scene(root, 1920, 1080));
        landingStage.show();

        FinalRatingController dataSetter = loader.getController();
        dataSetter.setUsername(username);
        dataSetter.setTitle(title);
        dataSetter.setPoster(poster);
        dataSetter.setPosterUrl(posterUrl);
        dataSetter.setRelease(release);
        dataSetter.setType(type);
        dataSetter.setActing(getActing());
        dataSetter.setVisuals(getVisuals());
        dataSetter.setStory(getStory());
        dataSetter.setClimax(getClimax());
        dataSetter.setPacing(getPacing());
        dataSetter.setEnding(getEnding());
        dataSetter.setRating(getRating());
    }

    public void setUsername(String username) {usernameLabel.setText(username.substring(9));}
    public void setTitle(String title) {
        headerLabel.setText("Rate \"" + title + "\" On The Following Aspects");
    }
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

    public int getActing() {
        int actingRating = 0;
        Paint selectedColor = Color.rgb(255, 165, 0);

        Paint oneColor = actingOneLabel.getTextFill();
        Paint twoColor = actingTwoLabel.getTextFill();
        Paint threeColor = actingThreeLabel.getTextFill();
        Paint fourColor = actingFourLabel.getTextFill();
        Paint fiveColor = actingFiveLabel.getTextFill();
        Paint sixColor = actingSixLabel.getTextFill();
        Paint sevenColor = actingSevenLabel.getTextFill();
        Paint eightColor = actingEightLabel.getTextFill();
        Paint nineColor = actingNineLabel.getTextFill();
        Paint tenColor = actingTenLabel.getTextFill();

        if (oneColor.equals(selectedColor)){
            actingRating = 1;
        }
        if (twoColor.equals(selectedColor)){
            actingRating = 2;
        }
        if (threeColor.equals(selectedColor)){
            actingRating = 3;
        }
        if (fourColor.equals(selectedColor)){
            actingRating = 4;
        }
        if (fiveColor.equals(selectedColor)){
            actingRating = 5;
        }
        if (sixColor.equals(selectedColor)){
            actingRating = 6;
        }
        if (sevenColor.equals(selectedColor)){
            actingRating = 7;
        }
        if (eightColor.equals(selectedColor)){
            actingRating = 8;
        }
        if (nineColor.equals(selectedColor)){
            actingRating = 9;
        }
        if (tenColor.equals(selectedColor)){
            actingRating = 10;
        }

        return actingRating;
    }
    public int getVisuals() {
        int visualsRating = 0;
        Paint selectedColor = Color.rgb(255, 165, 0);

        Paint oneColor = visualsOneLabel.getTextFill();
        Paint twoColor = visualsTwoLabel.getTextFill();
        Paint threeColor = visualsThreeLabel.getTextFill();
        Paint fourColor = visualsFourLabel.getTextFill();
        Paint fiveColor = visualsFiveLabel.getTextFill();
        Paint sixColor = visualsSixLabel.getTextFill();
        Paint sevenColor = visualsSevenLabel.getTextFill();
        Paint eightColor = visualsEightLabel.getTextFill();
        Paint nineColor = visualsNineLabel.getTextFill();
        Paint tenColor = visualsTenLabel.getTextFill();

        if (oneColor.equals(selectedColor)){
            visualsRating = 1;
        }
        if (twoColor.equals(selectedColor)){
            visualsRating = 2;
        }
        if (threeColor.equals(selectedColor)){
            visualsRating = 3;
        }
        if (fourColor.equals(selectedColor)){
            visualsRating = 4;
        }
        if (fiveColor.equals(selectedColor)){
            visualsRating = 5;
        }
        if (sixColor.equals(selectedColor)){
            visualsRating = 6;
        }
        if (sevenColor.equals(selectedColor)){
            visualsRating = 7;
        }
        if (eightColor.equals(selectedColor)){
            visualsRating = 8;
        }
        if (nineColor.equals(selectedColor)){
            visualsRating = 9;
        }
        if (tenColor.equals(selectedColor)){
            visualsRating = 10;
        }

        return visualsRating;
    }
    public int getStory() {
        int storyRating = 0;
        Paint selectedColor = Color.rgb(255, 165, 0);

        Paint oneColor = storyOneLabel.getTextFill();
        Paint twoColor = storyTwoLabel.getTextFill();
        Paint threeColor = storyThreeLabel.getTextFill();
        Paint fourColor = storyFourLabel.getTextFill();
        Paint fiveColor = storyFiveLabel.getTextFill();
        Paint sixColor = storySixLabel.getTextFill();
        Paint sevenColor = storySevenLabel.getTextFill();
        Paint eightColor = storyEightLabel.getTextFill();
        Paint nineColor = storyNineLabel.getTextFill();
        Paint tenColor = storyTenLabel.getTextFill();

        if (oneColor.equals(selectedColor)){
            storyRating = 1;
        }
        if (twoColor.equals(selectedColor)){
            storyRating = 2;
        }
        if (threeColor.equals(selectedColor)){
            storyRating = 3;
        }
        if (fourColor.equals(selectedColor)){
            storyRating = 4;
        }
        if (fiveColor.equals(selectedColor)){
            storyRating = 5;
        }
        if (sixColor.equals(selectedColor)){
            storyRating = 6;
        }
        if (sevenColor.equals(selectedColor)){
            storyRating = 7;
        }
        if (eightColor.equals(selectedColor)){
            storyRating = 8;
        }
        if (nineColor.equals(selectedColor)){
            storyRating = 9;
        }
        if (tenColor.equals(selectedColor)){
            storyRating = 10;
        }

        return storyRating;
    }
    public int getClimax() {
        int climaxRating = 0;
        Paint selectedColor = Color.rgb(255, 165, 0);

        Paint oneColor = climaxOneLabel.getTextFill();
        Paint twoColor = climaxTwoLabel.getTextFill();
        Paint threeColor = climaxThreeLabel.getTextFill();
        Paint fourColor = climaxFourLabel.getTextFill();
        Paint fiveColor = climaxFiveLabel.getTextFill();
        Paint sixColor = climaxSixLabel.getTextFill();
        Paint sevenColor = climaxSevenLabel.getTextFill();
        Paint eightColor = climaxEightLabel.getTextFill();
        Paint nineColor = climaxNineLabel.getTextFill();
        Paint tenColor = climaxTenLabel.getTextFill();

        if (oneColor.equals(selectedColor)){
            climaxRating = 1;
        }
        if (twoColor.equals(selectedColor)){
            climaxRating = 2;
        }
        if (threeColor.equals(selectedColor)){
            climaxRating = 3;
        }
        if (fourColor.equals(selectedColor)){
            climaxRating = 4;
        }
        if (fiveColor.equals(selectedColor)){
            climaxRating = 5;
        }
        if (sixColor.equals(selectedColor)){
            climaxRating = 6;
        }
        if (sevenColor.equals(selectedColor)){
            climaxRating = 7;
        }
        if (eightColor.equals(selectedColor)){
            climaxRating = 8;
        }
        if (nineColor.equals(selectedColor)){
            climaxRating = 9;
        }
        if (tenColor.equals(selectedColor)){
            climaxRating = 10;
        }

        return climaxRating;
    }
    public int getPacing() {
        int pacingRating = 0;
        Paint selectedColor = Color.rgb(255, 165, 0);

        Paint oneColor = pacingOneLabel.getTextFill();
        Paint twoColor = pacingTwoLabel.getTextFill();
        Paint threeColor = pacingThreeLabel.getTextFill();
        Paint fourColor = pacingFourLabel.getTextFill();
        Paint fiveColor = pacingFiveLabel.getTextFill();
        Paint sixColor = pacingSixLabel.getTextFill();
        Paint sevenColor = pacingSevenLabel.getTextFill();
        Paint eightColor = pacingEightLabel.getTextFill();
        Paint nineColor = pacingNineLabel.getTextFill();
        Paint tenColor = pacingTenLabel.getTextFill();

        if (oneColor.equals(selectedColor)){
            pacingRating = 1;
        }
        if (twoColor.equals(selectedColor)){
            pacingRating = 2;
        }
        if (threeColor.equals(selectedColor)){
            pacingRating = 3;
        }
        if (fourColor.equals(selectedColor)){
            pacingRating = 4;
        }
        if (fiveColor.equals(selectedColor)){
            pacingRating = 5;
        }
        if (sixColor.equals(selectedColor)){
            pacingRating = 6;
        }
        if (sevenColor.equals(selectedColor)){
            pacingRating = 7;
        }
        if (eightColor.equals(selectedColor)){
            pacingRating = 8;
        }
        if (nineColor.equals(selectedColor)){
            pacingRating = 9;
        }
        if (tenColor.equals(selectedColor)){
            pacingRating = 10;
        }

        return pacingRating;
    }
    public int getEnding() {
        int endingRating = 0;
        Paint selectedColor = Color.rgb(255, 165, 0);

        Paint oneColor = endingOneLabel.getTextFill();
        Paint twoColor = endingTwoLabel.getTextFill();
        Paint threeColor = endingThreeLabel.getTextFill();
        Paint fourColor = endingFourLabel.getTextFill();
        Paint fiveColor = endingFiveLabel.getTextFill();
        Paint sixColor = endingSixLabel.getTextFill();
        Paint sevenColor = endingSevenLabel.getTextFill();
        Paint eightColor = endingEightLabel.getTextFill();
        Paint nineColor = endingNineLabel.getTextFill();
        Paint tenColor = endingTenLabel.getTextFill();

        if (oneColor.equals(selectedColor)){
            endingRating = 1;
        }
        if (twoColor.equals(selectedColor)){
            endingRating = 2;
        }
        if (threeColor.equals(selectedColor)){
            endingRating = 3;
        }
        if (fourColor.equals(selectedColor)){
            endingRating = 4;
        }
        if (fiveColor.equals(selectedColor)){
            endingRating = 5;
        }
        if (sixColor.equals(selectedColor)){
            endingRating = 6;
        }
        if (sevenColor.equals(selectedColor)){
            endingRating = 7;
        }
        if (eightColor.equals(selectedColor)){
            endingRating = 8;
        }
        if (nineColor.equals(selectedColor)){
            endingRating = 9;
        }
        if (tenColor.equals(selectedColor)){
            endingRating = 10;
        }

        return endingRating;
    }
    public double getRating() {
        double acting = getActing();
        double visuals = getVisuals();
        double story = getStory();
        double climax = getClimax();
        double pacing = getPacing();
        double ending = getEnding();

        double longRating = (acting + visuals + story + climax + pacing + ending)/6;
        final DecimalFormat df = new DecimalFormat("0.00");
        double rating = Double.parseDouble(df.format(longRating));

        return rating;
    }
    
    public void actingOneButtonAction(ActionEvent event) {
        actingOneLabel.setTextFill(Color.rgb(255, 165, 0));
        actingOneLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        actingOneLabel.setLayoutY(315);
        actingTwoLabel.setTextFill(Color.WHITE);
        actingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTwoLabel.setLayoutY(320);
        actingThreeLabel.setTextFill(Color.WHITE);
        actingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingThreeLabel.setLayoutY(320);
        actingFourLabel.setTextFill(Color.WHITE);
        actingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFourLabel.setLayoutY(320);
        actingFiveLabel.setTextFill(Color.WHITE);
        actingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFiveLabel.setLayoutY(320);
        actingSixLabel.setTextFill(Color.WHITE);
        actingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSixLabel.setLayoutY(320);
        actingSevenLabel.setTextFill(Color.WHITE);
        actingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSevenLabel.setLayoutY(320);
        actingEightLabel.setTextFill(Color.WHITE);
        actingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingEightLabel.setLayoutY(320);
        actingNineLabel.setTextFill(Color.WHITE);
        actingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingNineLabel.setLayoutY(320);
        actingTenLabel.setTextFill(Color.WHITE);
        actingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTenLabel.setLayoutY(320);
    }
    public void actingTwoButtonAction(ActionEvent event) {
        actingOneLabel.setTextFill(Color.WHITE);
        actingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingOneLabel.setLayoutY(320);
        actingTwoLabel.setTextFill(Color.rgb(255, 165, 0));
        actingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        actingTwoLabel.setLayoutY(315);
        actingTwoLabel.setLayoutX(253);
        actingThreeLabel.setTextFill(Color.WHITE);
        actingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingThreeLabel.setLayoutY(320);
        actingFourLabel.setTextFill(Color.WHITE);
        actingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFourLabel.setLayoutY(320);
        actingFiveLabel.setTextFill(Color.WHITE);
        actingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFiveLabel.setLayoutY(320);
        actingSixLabel.setTextFill(Color.WHITE);
        actingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSixLabel.setLayoutY(320);
        actingSevenLabel.setTextFill(Color.WHITE);
        actingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSevenLabel.setLayoutY(320);
        actingEightLabel.setTextFill(Color.WHITE);
        actingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingEightLabel.setLayoutY(320);
        actingNineLabel.setTextFill(Color.WHITE);
        actingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingNineLabel.setLayoutY(320);
        actingTenLabel.setTextFill(Color.WHITE);
        actingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTenLabel.setLayoutY(320);
    }
    public void actingThreeButtonAction(ActionEvent event) {
        actingOneLabel.setTextFill(Color.WHITE);
        actingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingOneLabel.setLayoutY(320);
        actingTwoLabel.setTextFill(Color.WHITE);
        actingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTwoLabel.setLayoutY(320);
        actingThreeLabel.setTextFill(Color.rgb(255, 165, 0));
        actingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        actingThreeLabel.setLayoutY(315);
        actingThreeLabel.setLayoutX(253);
        actingFourLabel.setTextFill(Color.WHITE);
        actingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFourLabel.setLayoutY(320);
        actingFiveLabel.setTextFill(Color.WHITE);
        actingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFiveLabel.setLayoutY(320);
        actingSixLabel.setTextFill(Color.WHITE);
        actingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSixLabel.setLayoutY(320);
        actingSevenLabel.setTextFill(Color.WHITE);
        actingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSevenLabel.setLayoutY(320);
        actingEightLabel.setTextFill(Color.WHITE);
        actingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingEightLabel.setLayoutY(320);
        actingNineLabel.setTextFill(Color.WHITE);
        actingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingNineLabel.setLayoutY(320);
        actingTenLabel.setTextFill(Color.WHITE);
        actingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTenLabel.setLayoutY(320);
    }
    public void actingFourButtonAction(ActionEvent event) {
        actingOneLabel.setTextFill(Color.WHITE);
        actingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingOneLabel.setLayoutY(320);
        actingTwoLabel.setTextFill(Color.WHITE);
        actingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTwoLabel.setLayoutY(320);
        actingThreeLabel.setTextFill(Color.WHITE);
        actingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingThreeLabel.setLayoutY(320);
        actingFourLabel.setTextFill(Color.rgb(255, 165, 0));
        actingFourLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        actingFourLabel.setLayoutY(315);
        actingFourLabel.setLayoutX(253);
        actingFiveLabel.setTextFill(Color.WHITE);
        actingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFiveLabel.setLayoutY(320);
        actingSixLabel.setTextFill(Color.WHITE);
        actingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSixLabel.setLayoutY(320);
        actingSevenLabel.setTextFill(Color.WHITE);
        actingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSevenLabel.setLayoutY(320);
        actingEightLabel.setTextFill(Color.WHITE);
        actingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingEightLabel.setLayoutY(320);
        actingNineLabel.setTextFill(Color.WHITE);
        actingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingNineLabel.setLayoutY(320);
        actingTenLabel.setTextFill(Color.WHITE);
        actingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTenLabel.setLayoutY(320);
    }
    public void actingFiveButtonAction(ActionEvent event) {
        actingOneLabel.setTextFill(Color.WHITE);
        actingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingOneLabel.setLayoutY(320);
        actingTwoLabel.setTextFill(Color.WHITE);
        actingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTwoLabel.setLayoutY(320);
        actingThreeLabel.setTextFill(Color.WHITE);
        actingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingThreeLabel.setLayoutY(320);
        actingFourLabel.setTextFill(Color.WHITE);
        actingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFourLabel.setLayoutY(320);
        actingFiveLabel.setTextFill(Color.rgb(255, 165, 0));
        actingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        actingFiveLabel.setLayoutY(315);
        actingFiveLabel.setLayoutX(253);
        actingSixLabel.setTextFill(Color.WHITE);
        actingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSixLabel.setLayoutY(320);
        actingSevenLabel.setTextFill(Color.WHITE);
        actingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSevenLabel.setLayoutY(320);
        actingEightLabel.setTextFill(Color.WHITE);
        actingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingEightLabel.setLayoutY(320);
        actingNineLabel.setTextFill(Color.WHITE);
        actingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingNineLabel.setLayoutY(320);
        actingTenLabel.setTextFill(Color.WHITE);
        actingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTenLabel.setLayoutY(320);
    }
    public void actingSixButtonAction(ActionEvent event) {
        actingOneLabel.setTextFill(Color.WHITE);
        actingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingOneLabel.setLayoutY(320);
        actingTwoLabel.setTextFill(Color.WHITE);
        actingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTwoLabel.setLayoutY(320);
        actingThreeLabel.setTextFill(Color.WHITE);
        actingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingThreeLabel.setLayoutY(320);
        actingFourLabel.setTextFill(Color.WHITE);
        actingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFourLabel.setLayoutY(320);
        actingFiveLabel.setTextFill(Color.WHITE);
        actingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFiveLabel.setLayoutY(320);
        actingSixLabel.setTextFill(Color.rgb(255, 165, 0));
        actingSixLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        actingSixLabel.setLayoutY(315);
        actingSixLabel.setLayoutX(253);
        actingSevenLabel.setTextFill(Color.WHITE);
        actingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSevenLabel.setLayoutY(320);
        actingEightLabel.setTextFill(Color.WHITE);
        actingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingEightLabel.setLayoutY(320);
        actingNineLabel.setTextFill(Color.WHITE);
        actingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingNineLabel.setLayoutY(320);
        actingTenLabel.setTextFill(Color.WHITE);
        actingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTenLabel.setLayoutY(320);
    }
    public void actingSevenButtonAction(ActionEvent event) {
        actingOneLabel.setTextFill(Color.WHITE);
        actingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingOneLabel.setLayoutY(320);
        actingTwoLabel.setTextFill(Color.WHITE);
        actingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTwoLabel.setLayoutY(320);
        actingThreeLabel.setTextFill(Color.WHITE);
        actingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingThreeLabel.setLayoutY(320);
        actingFourLabel.setTextFill(Color.WHITE);
        actingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFourLabel.setLayoutY(320);
        actingFiveLabel.setTextFill(Color.WHITE);
        actingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFiveLabel.setLayoutY(320);
        actingSixLabel.setTextFill(Color.WHITE);
        actingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSixLabel.setLayoutY(320);
        actingSevenLabel.setTextFill(Color.rgb(255, 165, 0));
        actingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        actingSevenLabel.setLayoutY(315);
        actingSevenLabel.setLayoutX(253);
        actingEightLabel.setTextFill(Color.WHITE);
        actingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingEightLabel.setLayoutY(320);
        actingNineLabel.setTextFill(Color.WHITE);
        actingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingNineLabel.setLayoutY(320);
        actingTenLabel.setTextFill(Color.WHITE);
        actingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTenLabel.setLayoutY(320);
    }
    public void actingEightButtonAction(ActionEvent event) {
        actingOneLabel.setTextFill(Color.WHITE);
        actingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingOneLabel.setLayoutY(320);
        actingTwoLabel.setTextFill(Color.WHITE);
        actingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTwoLabel.setLayoutY(320);
        actingThreeLabel.setTextFill(Color.WHITE);
        actingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingThreeLabel.setLayoutY(320);
        actingFourLabel.setTextFill(Color.WHITE);
        actingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFourLabel.setLayoutY(320);
        actingFiveLabel.setTextFill(Color.WHITE);
        actingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFiveLabel.setLayoutY(320);
        actingSixLabel.setTextFill(Color.WHITE);
        actingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSixLabel.setLayoutY(320);
        actingSevenLabel.setTextFill(Color.WHITE);
        actingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSevenLabel.setLayoutY(320);
        actingEightLabel.setTextFill(Color.rgb(255, 165, 0));
        actingEightLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        actingEightLabel.setLayoutY(315);
        actingEightLabel.setLayoutX(253);
        actingNineLabel.setTextFill(Color.WHITE);
        actingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingNineLabel.setLayoutY(320);
        actingTenLabel.setTextFill(Color.WHITE);
        actingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTenLabel.setLayoutY(320);
    }
    public void actingNineButtonAction(ActionEvent event) {
        actingOneLabel.setTextFill(Color.WHITE);
        actingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingOneLabel.setLayoutY(320);
        actingTwoLabel.setTextFill(Color.WHITE);
        actingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTwoLabel.setLayoutY(320);
        actingThreeLabel.setTextFill(Color.WHITE);
        actingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingThreeLabel.setLayoutY(320);
        actingFourLabel.setTextFill(Color.WHITE);
        actingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFourLabel.setLayoutY(320);
        actingFiveLabel.setTextFill(Color.WHITE);
        actingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFiveLabel.setLayoutY(320);
        actingSixLabel.setTextFill(Color.WHITE);
        actingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSixLabel.setLayoutY(320);
        actingSevenLabel.setTextFill(Color.WHITE);
        actingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSevenLabel.setLayoutY(320);
        actingEightLabel.setTextFill(Color.WHITE);
        actingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingEightLabel.setLayoutY(320);
        actingNineLabel.setTextFill(Color.rgb(255, 165, 0));
        actingNineLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        actingNineLabel.setLayoutY(315);
        actingNineLabel.setLayoutX(253);
        actingTenLabel.setTextFill(Color.WHITE);
        actingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTenLabel.setLayoutY(320);
    }
    public void actingTenButtonAction(ActionEvent event) {
        actingOneLabel.setTextFill(Color.WHITE);
        actingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingOneLabel.setLayoutY(320);
        actingTwoLabel.setTextFill(Color.WHITE);
        actingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingTwoLabel.setLayoutY(320);
        actingThreeLabel.setTextFill(Color.WHITE);
        actingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingThreeLabel.setLayoutY(320);
        actingFourLabel.setTextFill(Color.WHITE);
        actingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFourLabel.setLayoutY(320);
        actingFiveLabel.setTextFill(Color.WHITE);
        actingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingFiveLabel.setLayoutY(320);
        actingSixLabel.setTextFill(Color.WHITE);
        actingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSixLabel.setLayoutY(320);
        actingSevenLabel.setTextFill(Color.WHITE);
        actingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingSevenLabel.setLayoutY(320);
        actingEightLabel.setTextFill(Color.WHITE);
        actingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingEightLabel.setLayoutY(320);
        actingNineLabel.setTextFill(Color.WHITE);
        actingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        actingNineLabel.setLayoutY(320);
        actingTenLabel.setTextFill(Color.rgb(255, 165, 0));
        actingTenLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        actingTenLabel.setLayoutY(315);
        actingTenLabel.setLayoutX(253);

    }

    public void visualsOneButtonAction(ActionEvent event) {
        visualsOneLabel.setTextFill(Color.rgb(255, 165, 0));
        visualsOneLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        visualsOneLabel.setLayoutY(315);
        visualsTwoLabel.setTextFill(Color.WHITE);
        visualsTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTwoLabel.setLayoutY(320);
        visualsThreeLabel.setTextFill(Color.WHITE);
        visualsThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsThreeLabel.setLayoutY(320);
        visualsFourLabel.setTextFill(Color.WHITE);
        visualsFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFourLabel.setLayoutY(320);
        visualsFiveLabel.setTextFill(Color.WHITE);
        visualsFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFiveLabel.setLayoutY(320);
        visualsSixLabel.setTextFill(Color.WHITE);
        visualsSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSixLabel.setLayoutY(320);
        visualsSevenLabel.setTextFill(Color.WHITE);
        visualsSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSevenLabel.setLayoutY(320);
        visualsEightLabel.setTextFill(Color.WHITE);
        visualsEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsEightLabel.setLayoutY(320);
        visualsNineLabel.setTextFill(Color.WHITE);
        visualsNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsNineLabel.setLayoutY(320);
        visualsTenLabel.setTextFill(Color.WHITE);
        visualsTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTenLabel.setLayoutY(320);
    }
    public void visualsTwoButtonAction(ActionEvent event) {
        visualsOneLabel.setTextFill(Color.WHITE);
        visualsOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsOneLabel.setLayoutY(320);
        visualsTwoLabel.setTextFill(Color.rgb(255, 165, 0));
        visualsTwoLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        visualsTwoLabel.setLayoutY(315);
        visualsTwoLabel.setLayoutX(1148);
        visualsThreeLabel.setTextFill(Color.WHITE);
        visualsThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsThreeLabel.setLayoutY(320);
        visualsFourLabel.setTextFill(Color.WHITE);
        visualsFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFourLabel.setLayoutY(320);
        visualsFiveLabel.setTextFill(Color.WHITE);
        visualsFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFiveLabel.setLayoutY(320);
        visualsSixLabel.setTextFill(Color.WHITE);
        visualsSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSixLabel.setLayoutY(320);
        visualsSevenLabel.setTextFill(Color.WHITE);
        visualsSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSevenLabel.setLayoutY(320);
        visualsEightLabel.setTextFill(Color.WHITE);
        visualsEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsEightLabel.setLayoutY(320);
        visualsNineLabel.setTextFill(Color.WHITE);
        visualsNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsNineLabel.setLayoutY(320);
        visualsTenLabel.setTextFill(Color.WHITE);
        visualsTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTenLabel.setLayoutY(320);
    }
    public void visualsThreeButtonAction(ActionEvent event) {
        visualsOneLabel.setTextFill(Color.WHITE);
        visualsOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsOneLabel.setLayoutY(320);
        visualsTwoLabel.setTextFill(Color.WHITE);
        visualsTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTwoLabel.setLayoutY(320);
        visualsThreeLabel.setTextFill(Color.rgb(255, 165, 0));
        visualsThreeLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        visualsThreeLabel.setLayoutY(315);
        visualsThreeLabel.setLayoutX(1148);
        visualsFourLabel.setTextFill(Color.WHITE);
        visualsFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFourLabel.setLayoutY(320);
        visualsFiveLabel.setTextFill(Color.WHITE);
        visualsFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFiveLabel.setLayoutY(320);
        visualsSixLabel.setTextFill(Color.WHITE);
        visualsSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSixLabel.setLayoutY(320);
        visualsSevenLabel.setTextFill(Color.WHITE);
        visualsSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSevenLabel.setLayoutY(320);
        visualsEightLabel.setTextFill(Color.WHITE);
        visualsEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsEightLabel.setLayoutY(320);
        visualsNineLabel.setTextFill(Color.WHITE);
        visualsNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsNineLabel.setLayoutY(320);
        visualsTenLabel.setTextFill(Color.WHITE);
        visualsTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTenLabel.setLayoutY(320);
    }
    public void visualsFourButtonAction(ActionEvent event) {
        visualsOneLabel.setTextFill(Color.WHITE);
        visualsOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsOneLabel.setLayoutY(320);
        visualsTwoLabel.setTextFill(Color.WHITE);
        visualsTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTwoLabel.setLayoutY(320);
        visualsThreeLabel.setTextFill(Color.WHITE);
        visualsThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsThreeLabel.setLayoutY(320);
        visualsFourLabel.setTextFill(Color.rgb(255, 165, 0));
        visualsFourLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        visualsFourLabel.setLayoutY(315);
        visualsFourLabel.setLayoutX(1148);
        visualsFiveLabel.setTextFill(Color.WHITE);
        visualsFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFiveLabel.setLayoutY(320);
        visualsSixLabel.setTextFill(Color.WHITE);
        visualsSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSixLabel.setLayoutY(320);
        visualsSevenLabel.setTextFill(Color.WHITE);
        visualsSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSevenLabel.setLayoutY(320);
        visualsEightLabel.setTextFill(Color.WHITE);
        visualsEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsEightLabel.setLayoutY(320);
        visualsNineLabel.setTextFill(Color.WHITE);
        visualsNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsNineLabel.setLayoutY(320);
        visualsTenLabel.setTextFill(Color.WHITE);
        visualsTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTenLabel.setLayoutY(320);
    }
    public void visualsFiveButtonAction(ActionEvent event) {
        visualsOneLabel.setTextFill(Color.WHITE);
        visualsOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsOneLabel.setLayoutY(320);
        visualsTwoLabel.setTextFill(Color.WHITE);
        visualsTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTwoLabel.setLayoutY(320);
        visualsThreeLabel.setTextFill(Color.WHITE);
        visualsThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsThreeLabel.setLayoutY(320);
        visualsFourLabel.setTextFill(Color.WHITE);
        visualsFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFourLabel.setLayoutY(320);
        visualsFiveLabel.setTextFill(Color.rgb(255, 165, 0));
        visualsFiveLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        visualsFiveLabel.setLayoutY(315);
        visualsFiveLabel.setLayoutX(1148);
        visualsSixLabel.setTextFill(Color.WHITE);
        visualsSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSixLabel.setLayoutY(320);
        visualsSevenLabel.setTextFill(Color.WHITE);
        visualsSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSevenLabel.setLayoutY(320);
        visualsEightLabel.setTextFill(Color.WHITE);
        visualsEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsEightLabel.setLayoutY(320);
        visualsNineLabel.setTextFill(Color.WHITE);
        visualsNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsNineLabel.setLayoutY(320);
        visualsTenLabel.setTextFill(Color.WHITE);
        visualsTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTenLabel.setLayoutY(320);
    }
    public void visualsSixButtonAction(ActionEvent event) {
        visualsOneLabel.setTextFill(Color.WHITE);
        visualsOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsOneLabel.setLayoutY(320);
        visualsTwoLabel.setTextFill(Color.WHITE);
        visualsTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTwoLabel.setLayoutY(320);
        visualsThreeLabel.setTextFill(Color.WHITE);
        visualsThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsThreeLabel.setLayoutY(320);
        visualsFourLabel.setTextFill(Color.WHITE);
        visualsFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFourLabel.setLayoutY(320);
        visualsFiveLabel.setTextFill(Color.WHITE);
        visualsFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFiveLabel.setLayoutY(320);
        visualsSixLabel.setTextFill(Color.rgb(255, 165, 0));
        visualsSixLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        visualsSixLabel.setLayoutY(315);
        visualsSixLabel.setLayoutX(1148);
        visualsSevenLabel.setTextFill(Color.WHITE);
        visualsSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSevenLabel.setLayoutY(320);
        visualsEightLabel.setTextFill(Color.WHITE);
        visualsEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsEightLabel.setLayoutY(320);
        visualsNineLabel.setTextFill(Color.WHITE);
        visualsNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsNineLabel.setLayoutY(320);
        visualsTenLabel.setTextFill(Color.WHITE);
        visualsTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTenLabel.setLayoutY(320);
    }
    public void visualsSevenButtonAction(ActionEvent event) {
        visualsOneLabel.setTextFill(Color.WHITE);
        visualsOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsOneLabel.setLayoutY(320);
        visualsTwoLabel.setTextFill(Color.WHITE);
        visualsTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTwoLabel.setLayoutY(320);
        visualsThreeLabel.setTextFill(Color.WHITE);
        visualsThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsThreeLabel.setLayoutY(320);
        visualsFourLabel.setTextFill(Color.WHITE);
        visualsFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFourLabel.setLayoutY(320);
        visualsFiveLabel.setTextFill(Color.WHITE);
        visualsFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFiveLabel.setLayoutY(320);
        visualsSixLabel.setTextFill(Color.WHITE);
        visualsSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSixLabel.setLayoutY(320);
        visualsSevenLabel.setTextFill(Color.rgb(255, 165, 0));
        visualsSevenLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        visualsSevenLabel.setLayoutY(315);
        visualsSevenLabel.setLayoutX(1148);
        visualsEightLabel.setTextFill(Color.WHITE);
        visualsEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsEightLabel.setLayoutY(320);
        visualsNineLabel.setTextFill(Color.WHITE);
        visualsNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsNineLabel.setLayoutY(320);
        visualsTenLabel.setTextFill(Color.WHITE);
        visualsTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTenLabel.setLayoutY(320);
    }
    public void visualsEightButtonAction(ActionEvent event) {
        visualsOneLabel.setTextFill(Color.WHITE);
        visualsOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsOneLabel.setLayoutY(320);
        visualsTwoLabel.setTextFill(Color.WHITE);
        visualsTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTwoLabel.setLayoutY(320);
        visualsThreeLabel.setTextFill(Color.WHITE);
        visualsThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsThreeLabel.setLayoutY(320);
        visualsFourLabel.setTextFill(Color.WHITE);
        visualsFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFourLabel.setLayoutY(320);
        visualsFiveLabel.setTextFill(Color.WHITE);
        visualsFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFiveLabel.setLayoutY(320);
        visualsSixLabel.setTextFill(Color.WHITE);
        visualsSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSixLabel.setLayoutY(320);
        visualsSevenLabel.setTextFill(Color.WHITE);
        visualsSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSevenLabel.setLayoutY(320);
        visualsEightLabel.setTextFill(Color.rgb(255, 165, 0));
        visualsEightLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        visualsEightLabel.setLayoutY(315);
        visualsEightLabel.setLayoutX(1148);
        visualsNineLabel.setTextFill(Color.WHITE);
        visualsNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsNineLabel.setLayoutY(320);
        visualsTenLabel.setTextFill(Color.WHITE);
        visualsTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTenLabel.setLayoutY(320);
    }
    public void visualsNineButtonAction(ActionEvent event) {
        visualsOneLabel.setTextFill(Color.WHITE);
        visualsOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsOneLabel.setLayoutY(320);
        visualsTwoLabel.setTextFill(Color.WHITE);
        visualsTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTwoLabel.setLayoutY(320);
        visualsThreeLabel.setTextFill(Color.WHITE);
        visualsThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsThreeLabel.setLayoutY(320);
        visualsFourLabel.setTextFill(Color.WHITE);
        visualsFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFourLabel.setLayoutY(320);
        visualsFiveLabel.setTextFill(Color.WHITE);
        visualsFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFiveLabel.setLayoutY(320);
        visualsSixLabel.setTextFill(Color.WHITE);
        visualsSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSixLabel.setLayoutY(320);
        visualsSevenLabel.setTextFill(Color.WHITE);
        visualsSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSevenLabel.setLayoutY(320);
        visualsEightLabel.setTextFill(Color.WHITE);
        visualsEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsEightLabel.setLayoutY(320);
        visualsNineLabel.setTextFill(Color.rgb(255, 165, 0));
        visualsNineLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        visualsNineLabel.setLayoutY(315);
        visualsNineLabel.setLayoutX(1148);
        visualsTenLabel.setTextFill(Color.WHITE);
        visualsTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTenLabel.setLayoutY(320);
    }
    public void visualsTenButtonAction(ActionEvent event) {
        visualsOneLabel.setTextFill(Color.WHITE);
        visualsOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsOneLabel.setLayoutY(320);
        visualsTwoLabel.setTextFill(Color.WHITE);
        visualsTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsTwoLabel.setLayoutY(320);
        visualsThreeLabel.setTextFill(Color.WHITE);
        visualsThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsThreeLabel.setLayoutY(320);
        visualsFourLabel.setTextFill(Color.WHITE);
        visualsFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFourLabel.setLayoutY(320);
        visualsFiveLabel.setTextFill(Color.WHITE);
        visualsFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsFiveLabel.setLayoutY(320);
        visualsSixLabel.setTextFill(Color.WHITE);
        visualsSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSixLabel.setLayoutY(320);
        visualsSevenLabel.setTextFill(Color.WHITE);
        visualsSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsSevenLabel.setLayoutY(320);
        visualsEightLabel.setTextFill(Color.WHITE);
        visualsEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsEightLabel.setLayoutY(320);
        visualsNineLabel.setTextFill(Color.WHITE);
        visualsNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        visualsNineLabel.setLayoutY(320);
        visualsTenLabel.setTextFill(Color.rgb(255, 165, 0));
        visualsTenLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        visualsTenLabel.setLayoutY(315);
        visualsTenLabel.setLayoutX(1148);

    }

    public void storyOneButtonAction(ActionEvent event) {
        storyOneLabel.setTextFill(Color.rgb(255, 165, 0));
        storyOneLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        storyOneLabel.setLayoutY(515);
        storyTwoLabel.setTextFill(Color.WHITE);
        storyTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTwoLabel.setLayoutY(520);
        storyThreeLabel.setTextFill(Color.WHITE);
        storyThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyThreeLabel.setLayoutY(520);
        storyFourLabel.setTextFill(Color.WHITE);
        storyFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFourLabel.setLayoutY(520);
        storyFiveLabel.setTextFill(Color.WHITE);
        storyFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFiveLabel.setLayoutY(520);
        storySixLabel.setTextFill(Color.WHITE);
        storySixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySixLabel.setLayoutY(520);
        storySevenLabel.setTextFill(Color.WHITE);
        storySevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySevenLabel.setLayoutY(520);
        storyEightLabel.setTextFill(Color.WHITE);
        storyEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyEightLabel.setLayoutY(520);
        storyNineLabel.setTextFill(Color.WHITE);
        storyNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyNineLabel.setLayoutY(520);
        storyTenLabel.setTextFill(Color.WHITE);
        storyTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTenLabel.setLayoutY(520);
    }
    public void storyTwoButtonAction(ActionEvent event) {
        storyOneLabel.setTextFill(Color.WHITE);
        storyOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyOneLabel.setLayoutY(520);
        storyTwoLabel.setTextFill(Color.rgb(255, 165, 0));
        storyTwoLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        storyTwoLabel.setLayoutY(515);
        storyTwoLabel.setLayoutX(253);
        storyThreeLabel.setTextFill(Color.WHITE);
        storyThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyThreeLabel.setLayoutY(520);
        storyFourLabel.setTextFill(Color.WHITE);
        storyFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFourLabel.setLayoutY(520);
        storyFiveLabel.setTextFill(Color.WHITE);
        storyFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFiveLabel.setLayoutY(520);
        storySixLabel.setTextFill(Color.WHITE);
        storySixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySixLabel.setLayoutY(520);
        storySevenLabel.setTextFill(Color.WHITE);
        storySevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySevenLabel.setLayoutY(520);
        storyEightLabel.setTextFill(Color.WHITE);
        storyEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyEightLabel.setLayoutY(520);
        storyNineLabel.setTextFill(Color.WHITE);
        storyNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyNineLabel.setLayoutY(520);
        storyTenLabel.setTextFill(Color.WHITE);
        storyTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTenLabel.setLayoutY(520);
    }
    public void storyThreeButtonAction(ActionEvent event) {
        storyOneLabel.setTextFill(Color.WHITE);
        storyOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyOneLabel.setLayoutY(520);
        storyTwoLabel.setTextFill(Color.WHITE);
        storyTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTwoLabel.setLayoutY(520);
        storyThreeLabel.setTextFill(Color.rgb(255, 165, 0));
        storyThreeLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        storyThreeLabel.setLayoutY(515);
        storyThreeLabel.setLayoutX(253);
        storyFourLabel.setTextFill(Color.WHITE);
        storyFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFourLabel.setLayoutY(520);
        storyFiveLabel.setTextFill(Color.WHITE);
        storyFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFiveLabel.setLayoutY(520);
        storySixLabel.setTextFill(Color.WHITE);
        storySixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySixLabel.setLayoutY(520);
        storySevenLabel.setTextFill(Color.WHITE);
        storySevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySevenLabel.setLayoutY(520);
        storyEightLabel.setTextFill(Color.WHITE);
        storyEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyEightLabel.setLayoutY(520);
        storyNineLabel.setTextFill(Color.WHITE);
        storyNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyNineLabel.setLayoutY(520);
        storyTenLabel.setTextFill(Color.WHITE);
        storyTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTenLabel.setLayoutY(520);
    }
    public void storyFourButtonAction(ActionEvent event) {
        storyOneLabel.setTextFill(Color.WHITE);
        storyOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyOneLabel.setLayoutY(520);
        storyTwoLabel.setTextFill(Color.WHITE);
        storyTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTwoLabel.setLayoutY(520);
        storyThreeLabel.setTextFill(Color.WHITE);
        storyThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyThreeLabel.setLayoutY(520);
        storyFourLabel.setTextFill(Color.rgb(255, 165, 0));
        storyFourLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        storyFourLabel.setLayoutY(515);
        storyFourLabel.setLayoutX(253);
        storyFiveLabel.setTextFill(Color.WHITE);
        storyFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFiveLabel.setLayoutY(520);
        storySixLabel.setTextFill(Color.WHITE);
        storySixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySixLabel.setLayoutY(520);
        storySevenLabel.setTextFill(Color.WHITE);
        storySevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySevenLabel.setLayoutY(520);
        storyEightLabel.setTextFill(Color.WHITE);
        storyEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyEightLabel.setLayoutY(520);
        storyNineLabel.setTextFill(Color.WHITE);
        storyNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyNineLabel.setLayoutY(520);
        storyTenLabel.setTextFill(Color.WHITE);
        storyTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTenLabel.setLayoutY(520);
    }
    public void storyFiveButtonAction(ActionEvent event) {
        storyOneLabel.setTextFill(Color.WHITE);
        storyOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyOneLabel.setLayoutY(520);
        storyTwoLabel.setTextFill(Color.WHITE);
        storyTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTwoLabel.setLayoutY(520);
        storyThreeLabel.setTextFill(Color.WHITE);
        storyThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyThreeLabel.setLayoutY(520);
        storyFourLabel.setTextFill(Color.WHITE);
        storyFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFourLabel.setLayoutY(520);
        storyFiveLabel.setTextFill(Color.rgb(255, 165, 0));
        storyFiveLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        storyFiveLabel.setLayoutY(515);
        storyFiveLabel.setLayoutX(253);
        storySixLabel.setTextFill(Color.WHITE);
        storySixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySixLabel.setLayoutY(520);
        storySevenLabel.setTextFill(Color.WHITE);
        storySevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySevenLabel.setLayoutY(520);
        storyEightLabel.setTextFill(Color.WHITE);
        storyEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyEightLabel.setLayoutY(520);
        storyNineLabel.setTextFill(Color.WHITE);
        storyNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyNineLabel.setLayoutY(520);
        storyTenLabel.setTextFill(Color.WHITE);
        storyTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTenLabel.setLayoutY(520);
    }
    public void storySixButtonAction(ActionEvent event) {
        storyOneLabel.setTextFill(Color.WHITE);
        storyOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyOneLabel.setLayoutY(520);
        storyTwoLabel.setTextFill(Color.WHITE);
        storyTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTwoLabel.setLayoutY(520);
        storyThreeLabel.setTextFill(Color.WHITE);
        storyThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyThreeLabel.setLayoutY(520);
        storyFourLabel.setTextFill(Color.WHITE);
        storyFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFourLabel.setLayoutY(520);
        storyFiveLabel.setTextFill(Color.WHITE);
        storyFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFiveLabel.setLayoutY(520);
        storySixLabel.setTextFill(Color.rgb(255, 165, 0));
        storySixLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        storySixLabel.setLayoutY(515);
        storySixLabel.setLayoutX(253);
        storySevenLabel.setTextFill(Color.WHITE);
        storySevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySevenLabel.setLayoutY(520);
        storyEightLabel.setTextFill(Color.WHITE);
        storyEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyEightLabel.setLayoutY(520);
        storyNineLabel.setTextFill(Color.WHITE);
        storyNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyNineLabel.setLayoutY(520);
        storyTenLabel.setTextFill(Color.WHITE);
        storyTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTenLabel.setLayoutY(520);
    }
    public void storySevenButtonAction(ActionEvent event) {
        storyOneLabel.setTextFill(Color.WHITE);
        storyOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyOneLabel.setLayoutY(520);
        storyTwoLabel.setTextFill(Color.WHITE);
        storyTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTwoLabel.setLayoutY(520);
        storyThreeLabel.setTextFill(Color.WHITE);
        storyThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyThreeLabel.setLayoutY(520);
        storyFourLabel.setTextFill(Color.WHITE);
        storyFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFourLabel.setLayoutY(520);
        storyFiveLabel.setTextFill(Color.WHITE);
        storyFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFiveLabel.setLayoutY(520);
        storySixLabel.setTextFill(Color.WHITE);
        storySixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySixLabel.setLayoutY(520);
        storySevenLabel.setTextFill(Color.rgb(255, 165, 0));
        storySevenLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        storySevenLabel.setLayoutY(515);
        storySevenLabel.setLayoutX(253);
        storyEightLabel.setTextFill(Color.WHITE);
        storyEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyEightLabel.setLayoutY(520);
        storyNineLabel.setTextFill(Color.WHITE);
        storyNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyNineLabel.setLayoutY(520);
        storyTenLabel.setTextFill(Color.WHITE);
        storyTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTenLabel.setLayoutY(520);
    }
    public void storyEightButtonAction(ActionEvent event) {
        storyOneLabel.setTextFill(Color.WHITE);
        storyOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyOneLabel.setLayoutY(520);
        storyTwoLabel.setTextFill(Color.WHITE);
        storyTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTwoLabel.setLayoutY(520);
        storyThreeLabel.setTextFill(Color.WHITE);
        storyThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyThreeLabel.setLayoutY(520);
        storyFourLabel.setTextFill(Color.WHITE);
        storyFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFourLabel.setLayoutY(520);
        storyFiveLabel.setTextFill(Color.WHITE);
        storyFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFiveLabel.setLayoutY(520);
        storySixLabel.setTextFill(Color.WHITE);
        storySixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySixLabel.setLayoutY(520);
        storySevenLabel.setTextFill(Color.WHITE);
        storySevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySevenLabel.setLayoutY(520);
        storyEightLabel.setTextFill(Color.rgb(255, 165, 0));
        storyEightLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        storyEightLabel.setLayoutY(515);
        storyEightLabel.setLayoutX(253);
        storyNineLabel.setTextFill(Color.WHITE);
        storyNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyNineLabel.setLayoutY(520);
        storyTenLabel.setTextFill(Color.WHITE);
        storyTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTenLabel.setLayoutY(520);
    }
    public void storyNineButtonAction(ActionEvent event) {
        storyOneLabel.setTextFill(Color.WHITE);
        storyOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyOneLabel.setLayoutY(520);
        storyTwoLabel.setTextFill(Color.WHITE);
        storyTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTwoLabel.setLayoutY(520);
        storyThreeLabel.setTextFill(Color.WHITE);
        storyThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyThreeLabel.setLayoutY(520);
        storyFourLabel.setTextFill(Color.WHITE);
        storyFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFourLabel.setLayoutY(520);
        storyFiveLabel.setTextFill(Color.WHITE);
        storyFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFiveLabel.setLayoutY(520);
        storySixLabel.setTextFill(Color.WHITE);
        storySixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySixLabel.setLayoutY(520);
        storySevenLabel.setTextFill(Color.WHITE);
        storySevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySevenLabel.setLayoutY(520);
        storyEightLabel.setTextFill(Color.WHITE);
        storyEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyEightLabel.setLayoutY(520);
        storyNineLabel.setTextFill(Color.rgb(255, 165, 0));
        storyNineLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        storyNineLabel.setLayoutY(515);
        storyNineLabel.setLayoutX(253);
        storyTenLabel.setTextFill(Color.WHITE);
        storyTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTenLabel.setLayoutY(520);
    }
    public void storyTenButtonAction(ActionEvent event) {
        storyOneLabel.setTextFill(Color.WHITE);
        storyOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyOneLabel.setLayoutY(520);
        storyTwoLabel.setTextFill(Color.WHITE);
        storyTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyTwoLabel.setLayoutY(520);
        storyThreeLabel.setTextFill(Color.WHITE);
        storyThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyThreeLabel.setLayoutY(520);
        storyFourLabel.setTextFill(Color.WHITE);
        storyFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFourLabel.setLayoutY(520);
        storyFiveLabel.setTextFill(Color.WHITE);
        storyFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyFiveLabel.setLayoutY(520);
        storySixLabel.setTextFill(Color.WHITE);
        storySixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySixLabel.setLayoutY(520);
        storySevenLabel.setTextFill(Color.WHITE);
        storySevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storySevenLabel.setLayoutY(520);
        storyEightLabel.setTextFill(Color.WHITE);
        storyEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyEightLabel.setLayoutY(520);
        storyNineLabel.setTextFill(Color.WHITE);
        storyNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        storyNineLabel.setLayoutY(520);
        storyTenLabel.setTextFill(Color.rgb(255, 165, 0));
        storyTenLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        storyTenLabel.setLayoutY(515);
        storyTenLabel.setLayoutX(253);

    }

    public void climaxOneButtonAction(ActionEvent event) {
        climaxOneLabel.setTextFill(Color.rgb(255, 165, 0));
        climaxOneLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        climaxOneLabel.setLayoutY(515);
        climaxTwoLabel.setTextFill(Color.WHITE);
        climaxTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTwoLabel.setLayoutY(520);
        climaxThreeLabel.setTextFill(Color.WHITE);
        climaxThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxThreeLabel.setLayoutY(520);
        climaxFourLabel.setTextFill(Color.WHITE);
        climaxFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFourLabel.setLayoutY(520);
        climaxFiveLabel.setTextFill(Color.WHITE);
        climaxFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFiveLabel.setLayoutY(520);
        climaxSixLabel.setTextFill(Color.WHITE);
        climaxSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSixLabel.setLayoutY(520);
        climaxSevenLabel.setTextFill(Color.WHITE);
        climaxSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSevenLabel.setLayoutY(520);
        climaxEightLabel.setTextFill(Color.WHITE);
        climaxEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxEightLabel.setLayoutY(520);
        climaxNineLabel.setTextFill(Color.WHITE);
        climaxNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxNineLabel.setLayoutY(520);
        climaxTenLabel.setTextFill(Color.WHITE);
        climaxTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTenLabel.setLayoutY(520);
    }
    public void climaxTwoButtonAction(ActionEvent event) {
        climaxOneLabel.setTextFill(Color.WHITE);
        climaxOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxOneLabel.setLayoutY(520);
        climaxTwoLabel.setTextFill(Color.rgb(255, 165, 0));
        climaxTwoLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        climaxTwoLabel.setLayoutY(515);
        climaxTwoLabel.setLayoutX(1148);
        climaxThreeLabel.setTextFill(Color.WHITE);
        climaxThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxThreeLabel.setLayoutY(520);
        climaxFourLabel.setTextFill(Color.WHITE);
        climaxFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFourLabel.setLayoutY(520);
        climaxFiveLabel.setTextFill(Color.WHITE);
        climaxFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFiveLabel.setLayoutY(520);
        climaxSixLabel.setTextFill(Color.WHITE);
        climaxSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSixLabel.setLayoutY(520);
        climaxSevenLabel.setTextFill(Color.WHITE);
        climaxSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSevenLabel.setLayoutY(520);
        climaxEightLabel.setTextFill(Color.WHITE);
        climaxEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxEightLabel.setLayoutY(520);
        climaxNineLabel.setTextFill(Color.WHITE);
        climaxNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxNineLabel.setLayoutY(520);
        climaxTenLabel.setTextFill(Color.WHITE);
        climaxTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTenLabel.setLayoutY(520);
    }
    public void climaxThreeButtonAction(ActionEvent event) {
        climaxOneLabel.setTextFill(Color.WHITE);
        climaxOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxOneLabel.setLayoutY(520);
        climaxTwoLabel.setTextFill(Color.WHITE);
        climaxTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTwoLabel.setLayoutY(520);
        climaxThreeLabel.setTextFill(Color.rgb(255, 165, 0));
        climaxThreeLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        climaxThreeLabel.setLayoutY(515);
        climaxThreeLabel.setLayoutX(1148);
        climaxFourLabel.setTextFill(Color.WHITE);
        climaxFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFourLabel.setLayoutY(520);
        climaxFiveLabel.setTextFill(Color.WHITE);
        climaxFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFiveLabel.setLayoutY(520);
        climaxSixLabel.setTextFill(Color.WHITE);
        climaxSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSixLabel.setLayoutY(520);
        climaxSevenLabel.setTextFill(Color.WHITE);
        climaxSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSevenLabel.setLayoutY(520);
        climaxEightLabel.setTextFill(Color.WHITE);
        climaxEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxEightLabel.setLayoutY(520);
        climaxNineLabel.setTextFill(Color.WHITE);
        climaxNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxNineLabel.setLayoutY(520);
        climaxTenLabel.setTextFill(Color.WHITE);
        climaxTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTenLabel.setLayoutY(520);
    }
    public void climaxFourButtonAction(ActionEvent event) {
        climaxOneLabel.setTextFill(Color.WHITE);
        climaxOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxOneLabel.setLayoutY(520);
        climaxTwoLabel.setTextFill(Color.WHITE);
        climaxTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTwoLabel.setLayoutY(520);
        climaxThreeLabel.setTextFill(Color.WHITE);
        climaxThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxThreeLabel.setLayoutY(520);
        climaxFourLabel.setTextFill(Color.rgb(255, 165, 0));
        climaxFourLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        climaxFourLabel.setLayoutY(515);
        climaxFourLabel.setLayoutX(1148);
        climaxFiveLabel.setTextFill(Color.WHITE);
        climaxFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFiveLabel.setLayoutY(520);
        climaxSixLabel.setTextFill(Color.WHITE);
        climaxSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSixLabel.setLayoutY(520);
        climaxSevenLabel.setTextFill(Color.WHITE);
        climaxSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSevenLabel.setLayoutY(520);
        climaxEightLabel.setTextFill(Color.WHITE);
        climaxEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxEightLabel.setLayoutY(520);
        climaxNineLabel.setTextFill(Color.WHITE);
        climaxNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxNineLabel.setLayoutY(520);
        climaxTenLabel.setTextFill(Color.WHITE);
        climaxTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTenLabel.setLayoutY(520);
    }
    public void climaxFiveButtonAction(ActionEvent event) {
        climaxOneLabel.setTextFill(Color.WHITE);
        climaxOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxOneLabel.setLayoutY(520);
        climaxTwoLabel.setTextFill(Color.WHITE);
        climaxTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTwoLabel.setLayoutY(520);
        climaxThreeLabel.setTextFill(Color.WHITE);
        climaxThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxThreeLabel.setLayoutY(520);
        climaxFourLabel.setTextFill(Color.WHITE);
        climaxFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFourLabel.setLayoutY(520);
        climaxFiveLabel.setTextFill(Color.rgb(255, 165, 0));
        climaxFiveLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        climaxFiveLabel.setLayoutY(515);
        climaxFiveLabel.setLayoutX(1148);
        climaxSixLabel.setTextFill(Color.WHITE);
        climaxSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSixLabel.setLayoutY(520);
        climaxSevenLabel.setTextFill(Color.WHITE);
        climaxSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSevenLabel.setLayoutY(520);
        climaxEightLabel.setTextFill(Color.WHITE);
        climaxEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxEightLabel.setLayoutY(520);
        climaxNineLabel.setTextFill(Color.WHITE);
        climaxNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxNineLabel.setLayoutY(520);
        climaxTenLabel.setTextFill(Color.WHITE);
        climaxTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTenLabel.setLayoutY(520);
    }
    public void climaxSixButtonAction(ActionEvent event) {
        climaxOneLabel.setTextFill(Color.WHITE);
        climaxOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxOneLabel.setLayoutY(520);
        climaxTwoLabel.setTextFill(Color.WHITE);
        climaxTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTwoLabel.setLayoutY(520);
        climaxThreeLabel.setTextFill(Color.WHITE);
        climaxThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxThreeLabel.setLayoutY(520);
        climaxFourLabel.setTextFill(Color.WHITE);
        climaxFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFourLabel.setLayoutY(520);
        climaxFiveLabel.setTextFill(Color.WHITE);
        climaxFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFiveLabel.setLayoutY(520);
        climaxSixLabel.setTextFill(Color.rgb(255, 165, 0));
        climaxSixLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        climaxSixLabel.setLayoutY(515);
        climaxSixLabel.setLayoutX(1148);
        climaxSevenLabel.setTextFill(Color.WHITE);
        climaxSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSevenLabel.setLayoutY(520);
        climaxEightLabel.setTextFill(Color.WHITE);
        climaxEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxEightLabel.setLayoutY(520);
        climaxNineLabel.setTextFill(Color.WHITE);
        climaxNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxNineLabel.setLayoutY(520);
        climaxTenLabel.setTextFill(Color.WHITE);
        climaxTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTenLabel.setLayoutY(520);
    }
    public void climaxSevenButtonAction(ActionEvent event) {
        climaxOneLabel.setTextFill(Color.WHITE);
        climaxOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxOneLabel.setLayoutY(520);
        climaxTwoLabel.setTextFill(Color.WHITE);
        climaxTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTwoLabel.setLayoutY(520);
        climaxThreeLabel.setTextFill(Color.WHITE);
        climaxThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxThreeLabel.setLayoutY(520);
        climaxFourLabel.setTextFill(Color.WHITE);
        climaxFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFourLabel.setLayoutY(520);
        climaxFiveLabel.setTextFill(Color.WHITE);
        climaxFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFiveLabel.setLayoutY(520);
        climaxSixLabel.setTextFill(Color.WHITE);
        climaxSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSixLabel.setLayoutY(520);
        climaxSevenLabel.setTextFill(Color.rgb(255, 165, 0));
        climaxSevenLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        climaxSevenLabel.setLayoutY(515);
        climaxSevenLabel.setLayoutX(1148);
        climaxEightLabel.setTextFill(Color.WHITE);
        climaxEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxEightLabel.setLayoutY(520);
        climaxNineLabel.setTextFill(Color.WHITE);
        climaxNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxNineLabel.setLayoutY(520);
        climaxTenLabel.setTextFill(Color.WHITE);
        climaxTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTenLabel.setLayoutY(520);
    }
    public void climaxEightButtonAction(ActionEvent event) {
        climaxOneLabel.setTextFill(Color.WHITE);
        climaxOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxOneLabel.setLayoutY(520);
        climaxTwoLabel.setTextFill(Color.WHITE);
        climaxTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTwoLabel.setLayoutY(520);
        climaxThreeLabel.setTextFill(Color.WHITE);
        climaxThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxThreeLabel.setLayoutY(520);
        climaxFourLabel.setTextFill(Color.WHITE);
        climaxFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFourLabel.setLayoutY(520);
        climaxFiveLabel.setTextFill(Color.WHITE);
        climaxFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFiveLabel.setLayoutY(520);
        climaxSixLabel.setTextFill(Color.WHITE);
        climaxSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSixLabel.setLayoutY(520);
        climaxSevenLabel.setTextFill(Color.WHITE);
        climaxSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSevenLabel.setLayoutY(520);
        climaxEightLabel.setTextFill(Color.rgb(255, 165, 0));
        climaxEightLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        climaxEightLabel.setLayoutY(515);
        climaxEightLabel.setLayoutX(1148);
        climaxNineLabel.setTextFill(Color.WHITE);
        climaxNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxNineLabel.setLayoutY(520);
        climaxTenLabel.setTextFill(Color.WHITE);
        climaxTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTenLabel.setLayoutY(520);
    }
    public void climaxNineButtonAction(ActionEvent event) {
        climaxOneLabel.setTextFill(Color.WHITE);
        climaxOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxOneLabel.setLayoutY(520);
        climaxTwoLabel.setTextFill(Color.WHITE);
        climaxTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTwoLabel.setLayoutY(520);
        climaxThreeLabel.setTextFill(Color.WHITE);
        climaxThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxThreeLabel.setLayoutY(520);
        climaxFourLabel.setTextFill(Color.WHITE);
        climaxFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFourLabel.setLayoutY(520);
        climaxFiveLabel.setTextFill(Color.WHITE);
        climaxFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFiveLabel.setLayoutY(520);
        climaxSixLabel.setTextFill(Color.WHITE);
        climaxSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSixLabel.setLayoutY(520);
        climaxSevenLabel.setTextFill(Color.WHITE);
        climaxSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSevenLabel.setLayoutY(520);
        climaxEightLabel.setTextFill(Color.WHITE);
        climaxEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxEightLabel.setLayoutY(520);
        climaxNineLabel.setTextFill(Color.rgb(255, 165, 0));
        climaxNineLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        climaxNineLabel.setLayoutY(515);
        climaxNineLabel.setLayoutX(1148);
        climaxTenLabel.setTextFill(Color.WHITE);
        climaxTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTenLabel.setLayoutY(520);
    }
    public void climaxTenButtonAction(ActionEvent event) {
        climaxOneLabel.setTextFill(Color.WHITE);
        climaxOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxOneLabel.setLayoutY(520);
        climaxTwoLabel.setTextFill(Color.WHITE);
        climaxTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxTwoLabel.setLayoutY(520);
        climaxThreeLabel.setTextFill(Color.WHITE);
        climaxThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxThreeLabel.setLayoutY(520);
        climaxFourLabel.setTextFill(Color.WHITE);
        climaxFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFourLabel.setLayoutY(520);
        climaxFiveLabel.setTextFill(Color.WHITE);
        climaxFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxFiveLabel.setLayoutY(520);
        climaxSixLabel.setTextFill(Color.WHITE);
        climaxSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSixLabel.setLayoutY(520);
        climaxSevenLabel.setTextFill(Color.WHITE);
        climaxSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxSevenLabel.setLayoutY(520);
        climaxEightLabel.setTextFill(Color.WHITE);
        climaxEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxEightLabel.setLayoutY(520);
        climaxNineLabel.setTextFill(Color.WHITE);
        climaxNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        climaxNineLabel.setLayoutY(520);
        climaxTenLabel.setTextFill(Color.rgb(255, 165, 0));
        climaxTenLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        climaxTenLabel.setLayoutY(515);
        climaxTenLabel.setLayoutX(1148);
    }

    public void pacingOneButtonAction(ActionEvent event) {
        pacingOneLabel.setTextFill(Color.rgb(255, 165, 0));
        pacingOneLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        pacingOneLabel.setLayoutY(715);
        pacingTwoLabel.setTextFill(Color.WHITE);
        pacingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTwoLabel.setLayoutY(720);
        pacingThreeLabel.setTextFill(Color.WHITE);
        pacingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingThreeLabel.setLayoutY(720);
        pacingFourLabel.setTextFill(Color.WHITE);
        pacingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFourLabel.setLayoutY(720);
        pacingFiveLabel.setTextFill(Color.WHITE);
        pacingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFiveLabel.setLayoutY(720);
        pacingSixLabel.setTextFill(Color.WHITE);
        pacingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSixLabel.setLayoutY(720);
        pacingSevenLabel.setTextFill(Color.WHITE);
        pacingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSevenLabel.setLayoutY(720);
        pacingEightLabel.setTextFill(Color.WHITE);
        pacingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingEightLabel.setLayoutY(720);
        pacingNineLabel.setTextFill(Color.WHITE);
        pacingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingNineLabel.setLayoutY(720);
        pacingTenLabel.setTextFill(Color.WHITE);
        pacingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTenLabel.setLayoutY(720);
    }
    public void pacingTwoButtonAction(ActionEvent event) {
        pacingOneLabel.setTextFill(Color.WHITE);
        pacingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingOneLabel.setLayoutY(720);
        pacingTwoLabel.setTextFill(Color.rgb(255, 165, 0));
        pacingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        pacingTwoLabel.setLayoutY(715);
        pacingTwoLabel.setLayoutX(253);
        pacingThreeLabel.setTextFill(Color.WHITE);
        pacingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingThreeLabel.setLayoutY(720);
        pacingFourLabel.setTextFill(Color.WHITE);
        pacingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFourLabel.setLayoutY(720);
        pacingFiveLabel.setTextFill(Color.WHITE);
        pacingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFiveLabel.setLayoutY(720);
        pacingSixLabel.setTextFill(Color.WHITE);
        pacingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSixLabel.setLayoutY(720);
        pacingSevenLabel.setTextFill(Color.WHITE);
        pacingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSevenLabel.setLayoutY(720);
        pacingEightLabel.setTextFill(Color.WHITE);
        pacingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingEightLabel.setLayoutY(720);
        pacingNineLabel.setTextFill(Color.WHITE);
        pacingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingNineLabel.setLayoutY(720);
        pacingTenLabel.setTextFill(Color.WHITE);
        pacingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTenLabel.setLayoutY(720);
    }
    public void pacingThreeButtonAction(ActionEvent event) {
        pacingOneLabel.setTextFill(Color.WHITE);
        pacingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingOneLabel.setLayoutY(720);
        pacingTwoLabel.setTextFill(Color.WHITE);
        pacingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTwoLabel.setLayoutY(720);
        pacingThreeLabel.setTextFill(Color.rgb(255, 165, 0));
        pacingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        pacingThreeLabel.setLayoutY(715);
        pacingThreeLabel.setLayoutX(253);
        pacingFourLabel.setTextFill(Color.WHITE);
        pacingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFourLabel.setLayoutY(720);
        pacingFiveLabel.setTextFill(Color.WHITE);
        pacingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFiveLabel.setLayoutY(720);
        pacingSixLabel.setTextFill(Color.WHITE);
        pacingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSixLabel.setLayoutY(720);
        pacingSevenLabel.setTextFill(Color.WHITE);
        pacingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSevenLabel.setLayoutY(720);
        pacingEightLabel.setTextFill(Color.WHITE);
        pacingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingEightLabel.setLayoutY(720);
        pacingNineLabel.setTextFill(Color.WHITE);
        pacingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingNineLabel.setLayoutY(720);
        pacingTenLabel.setTextFill(Color.WHITE);
        pacingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTenLabel.setLayoutY(720);
    }
    public void pacingFourButtonAction(ActionEvent event) {
        pacingOneLabel.setTextFill(Color.WHITE);
        pacingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingOneLabel.setLayoutY(720);
        pacingTwoLabel.setTextFill(Color.WHITE);
        pacingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTwoLabel.setLayoutY(720);
        pacingThreeLabel.setTextFill(Color.WHITE);
        pacingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingThreeLabel.setLayoutY(720);
        pacingFourLabel.setTextFill(Color.rgb(255, 165, 0));
        pacingFourLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        pacingFourLabel.setLayoutY(715);
        pacingFourLabel.setLayoutX(253);
        pacingFiveLabel.setTextFill(Color.WHITE);
        pacingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFiveLabel.setLayoutY(720);
        pacingSixLabel.setTextFill(Color.WHITE);
        pacingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSixLabel.setLayoutY(720);
        pacingSevenLabel.setTextFill(Color.WHITE);
        pacingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSevenLabel.setLayoutY(720);
        pacingEightLabel.setTextFill(Color.WHITE);
        pacingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingEightLabel.setLayoutY(720);
        pacingNineLabel.setTextFill(Color.WHITE);
        pacingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingNineLabel.setLayoutY(720);
        pacingTenLabel.setTextFill(Color.WHITE);
        pacingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTenLabel.setLayoutY(720);
    }
    public void pacingFiveButtonAction(ActionEvent event) {
        pacingOneLabel.setTextFill(Color.WHITE);
        pacingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingOneLabel.setLayoutY(720);
        pacingTwoLabel.setTextFill(Color.WHITE);
        pacingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTwoLabel.setLayoutY(720);
        pacingThreeLabel.setTextFill(Color.WHITE);
        pacingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingThreeLabel.setLayoutY(720);
        pacingFourLabel.setTextFill(Color.WHITE);
        pacingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFourLabel.setLayoutY(720);
        pacingFiveLabel.setTextFill(Color.rgb(255, 165, 0));
        pacingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        pacingFiveLabel.setLayoutY(715);
        pacingFiveLabel.setLayoutX(253);
        pacingSixLabel.setTextFill(Color.WHITE);
        pacingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSixLabel.setLayoutY(720);
        pacingSevenLabel.setTextFill(Color.WHITE);
        pacingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSevenLabel.setLayoutY(720);
        pacingEightLabel.setTextFill(Color.WHITE);
        pacingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingEightLabel.setLayoutY(720);
        pacingNineLabel.setTextFill(Color.WHITE);
        pacingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingNineLabel.setLayoutY(720);
        pacingTenLabel.setTextFill(Color.WHITE);
        pacingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTenLabel.setLayoutY(720);
    }
    public void pacingSixButtonAction(ActionEvent event) {
        pacingOneLabel.setTextFill(Color.WHITE);
        pacingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingOneLabel.setLayoutY(720);
        pacingTwoLabel.setTextFill(Color.WHITE);
        pacingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTwoLabel.setLayoutY(720);
        pacingThreeLabel.setTextFill(Color.WHITE);
        pacingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingThreeLabel.setLayoutY(720);
        pacingFourLabel.setTextFill(Color.WHITE);
        pacingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFourLabel.setLayoutY(720);
        pacingFiveLabel.setTextFill(Color.WHITE);
        pacingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFiveLabel.setLayoutY(720);
        pacingSixLabel.setTextFill(Color.rgb(255, 165, 0));
        pacingSixLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        pacingSixLabel.setLayoutY(715);
        pacingSixLabel.setLayoutX(253);
        pacingSevenLabel.setTextFill(Color.WHITE);
        pacingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSevenLabel.setLayoutY(720);
        pacingEightLabel.setTextFill(Color.WHITE);
        pacingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingEightLabel.setLayoutY(720);
        pacingNineLabel.setTextFill(Color.WHITE);
        pacingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingNineLabel.setLayoutY(720);
        pacingTenLabel.setTextFill(Color.WHITE);
        pacingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTenLabel.setLayoutY(720);
    }
    public void pacingSevenButtonAction(ActionEvent event) {
        pacingOneLabel.setTextFill(Color.WHITE);
        pacingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingOneLabel.setLayoutY(720);
        pacingTwoLabel.setTextFill(Color.WHITE);
        pacingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTwoLabel.setLayoutY(720);
        pacingThreeLabel.setTextFill(Color.WHITE);
        pacingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingThreeLabel.setLayoutY(720);
        pacingFourLabel.setTextFill(Color.WHITE);
        pacingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFourLabel.setLayoutY(720);
        pacingFiveLabel.setTextFill(Color.WHITE);
        pacingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFiveLabel.setLayoutY(720);
        pacingSixLabel.setTextFill(Color.WHITE);
        pacingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSixLabel.setLayoutY(720);
        pacingSevenLabel.setTextFill(Color.rgb(255, 165, 0));
        pacingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        pacingSevenLabel.setLayoutY(715);
        pacingSevenLabel.setLayoutX(253);
        pacingEightLabel.setTextFill(Color.WHITE);
        pacingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingEightLabel.setLayoutY(720);
        pacingNineLabel.setTextFill(Color.WHITE);
        pacingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingNineLabel.setLayoutY(720);
        pacingTenLabel.setTextFill(Color.WHITE);
        pacingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTenLabel.setLayoutY(720);
    }
    public void pacingEightButtonAction(ActionEvent event) {
        pacingOneLabel.setTextFill(Color.WHITE);
        pacingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingOneLabel.setLayoutY(720);
        pacingTwoLabel.setTextFill(Color.WHITE);
        pacingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTwoLabel.setLayoutY(720);
        pacingThreeLabel.setTextFill(Color.WHITE);
        pacingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingThreeLabel.setLayoutY(720);
        pacingFourLabel.setTextFill(Color.WHITE);
        pacingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFourLabel.setLayoutY(720);
        pacingFiveLabel.setTextFill(Color.WHITE);
        pacingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFiveLabel.setLayoutY(720);
        pacingSixLabel.setTextFill(Color.WHITE);
        pacingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSixLabel.setLayoutY(720);
        pacingSevenLabel.setTextFill(Color.WHITE);
        pacingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSevenLabel.setLayoutY(720);
        pacingEightLabel.setTextFill(Color.rgb(255, 165, 0));
        pacingEightLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        pacingEightLabel.setLayoutY(715);
        pacingEightLabel.setLayoutX(253);
        pacingNineLabel.setTextFill(Color.WHITE);
        pacingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingNineLabel.setLayoutY(720);
        pacingTenLabel.setTextFill(Color.WHITE);
        pacingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTenLabel.setLayoutY(720);
    }
    public void pacingNineButtonAction(ActionEvent event) {
        pacingOneLabel.setTextFill(Color.WHITE);
        pacingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingOneLabel.setLayoutY(720);
        pacingTwoLabel.setTextFill(Color.WHITE);
        pacingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTwoLabel.setLayoutY(720);
        pacingThreeLabel.setTextFill(Color.WHITE);
        pacingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingThreeLabel.setLayoutY(720);
        pacingFourLabel.setTextFill(Color.WHITE);
        pacingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFourLabel.setLayoutY(720);
        pacingFiveLabel.setTextFill(Color.WHITE);
        pacingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFiveLabel.setLayoutY(720);
        pacingSixLabel.setTextFill(Color.WHITE);
        pacingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSixLabel.setLayoutY(720);
        pacingSevenLabel.setTextFill(Color.WHITE);
        pacingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSevenLabel.setLayoutY(720);
        pacingEightLabel.setTextFill(Color.WHITE);
        pacingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingEightLabel.setLayoutY(720);
        pacingNineLabel.setTextFill(Color.rgb(255, 165, 0));
        pacingNineLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        pacingNineLabel.setLayoutY(715);
        pacingNineLabel.setLayoutX(253);
        pacingTenLabel.setTextFill(Color.WHITE);
        pacingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTenLabel.setLayoutY(720);
    }
    public void pacingTenButtonAction(ActionEvent event) {
        pacingOneLabel.setTextFill(Color.WHITE);
        pacingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingOneLabel.setLayoutY(720);
        pacingTwoLabel.setTextFill(Color.WHITE);
        pacingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingTwoLabel.setLayoutY(720);
        pacingThreeLabel.setTextFill(Color.WHITE);
        pacingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingThreeLabel.setLayoutY(720);
        pacingFourLabel.setTextFill(Color.WHITE);
        pacingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFourLabel.setLayoutY(720);
        pacingFiveLabel.setTextFill(Color.WHITE);
        pacingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingFiveLabel.setLayoutY(720);
        pacingSixLabel.setTextFill(Color.WHITE);
        pacingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSixLabel.setLayoutY(720);
        pacingSevenLabel.setTextFill(Color.WHITE);
        pacingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingSevenLabel.setLayoutY(720);
        pacingEightLabel.setTextFill(Color.WHITE);
        pacingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingEightLabel.setLayoutY(720);
        pacingNineLabel.setTextFill(Color.WHITE);
        pacingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        pacingNineLabel.setLayoutY(720);
        pacingTenLabel.setTextFill(Color.rgb(255, 165, 0));
        pacingTenLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        pacingTenLabel.setLayoutY(715);
        pacingTenLabel.setLayoutX(253);

    }

    public void endingOneButtonAction(ActionEvent event) {
        endingOneLabel.setTextFill(Color.rgb(255, 165, 0));
        endingOneLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        endingOneLabel.setLayoutY(715);
        endingTwoLabel.setTextFill(Color.WHITE);
        endingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTwoLabel.setLayoutY(720);
        endingThreeLabel.setTextFill(Color.WHITE);
        endingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingThreeLabel.setLayoutY(720);
        endingFourLabel.setTextFill(Color.WHITE);
        endingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFourLabel.setLayoutY(720);
        endingFiveLabel.setTextFill(Color.WHITE);
        endingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFiveLabel.setLayoutY(720);
        endingSixLabel.setTextFill(Color.WHITE);
        endingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSixLabel.setLayoutY(720);
        endingSevenLabel.setTextFill(Color.WHITE);
        endingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSevenLabel.setLayoutY(720);
        endingEightLabel.setTextFill(Color.WHITE);
        endingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingEightLabel.setLayoutY(720);
        endingNineLabel.setTextFill(Color.WHITE);
        endingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingNineLabel.setLayoutY(720);
        endingTenLabel.setTextFill(Color.WHITE);
        endingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTenLabel.setLayoutY(720);
    }
    public void endingTwoButtonAction(ActionEvent event) {
        endingOneLabel.setTextFill(Color.WHITE);
        endingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingOneLabel.setLayoutY(720);
        endingTwoLabel.setTextFill(Color.rgb(255, 165, 0));
        endingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        endingTwoLabel.setLayoutY(715);
        endingTwoLabel.setLayoutX(1148);
        endingThreeLabel.setTextFill(Color.WHITE);
        endingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingThreeLabel.setLayoutY(720);
        endingFourLabel.setTextFill(Color.WHITE);
        endingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFourLabel.setLayoutY(720);
        endingFiveLabel.setTextFill(Color.WHITE);
        endingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFiveLabel.setLayoutY(720);
        endingSixLabel.setTextFill(Color.WHITE);
        endingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSixLabel.setLayoutY(720);
        endingSevenLabel.setTextFill(Color.WHITE);
        endingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSevenLabel.setLayoutY(720);
        endingEightLabel.setTextFill(Color.WHITE);
        endingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingEightLabel.setLayoutY(720);
        endingNineLabel.setTextFill(Color.WHITE);
        endingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingNineLabel.setLayoutY(720);
        endingTenLabel.setTextFill(Color.WHITE);
        endingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTenLabel.setLayoutY(720);
    }
    public void endingThreeButtonAction(ActionEvent event) {
        endingOneLabel.setTextFill(Color.WHITE);
        endingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingOneLabel.setLayoutY(720);
        endingTwoLabel.setTextFill(Color.WHITE);
        endingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTwoLabel.setLayoutY(720);
        endingThreeLabel.setTextFill(Color.rgb(255, 165, 0));
        endingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        endingThreeLabel.setLayoutY(715);
        endingThreeLabel.setLayoutX(1148);
        endingFourLabel.setTextFill(Color.WHITE);
        endingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFourLabel.setLayoutY(720);
        endingFiveLabel.setTextFill(Color.WHITE);
        endingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFiveLabel.setLayoutY(720);
        endingSixLabel.setTextFill(Color.WHITE);
        endingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSixLabel.setLayoutY(720);
        endingSevenLabel.setTextFill(Color.WHITE);
        endingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSevenLabel.setLayoutY(720);
        endingEightLabel.setTextFill(Color.WHITE);
        endingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingEightLabel.setLayoutY(720);
        endingNineLabel.setTextFill(Color.WHITE);
        endingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingNineLabel.setLayoutY(720);
        endingTenLabel.setTextFill(Color.WHITE);
        endingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTenLabel.setLayoutY(720);
    }
    public void endingFourButtonAction(ActionEvent event) {
        endingOneLabel.setTextFill(Color.WHITE);
        endingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingOneLabel.setLayoutY(720);
        endingTwoLabel.setTextFill(Color.WHITE);
        endingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTwoLabel.setLayoutY(720);
        endingThreeLabel.setTextFill(Color.WHITE);
        endingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingThreeLabel.setLayoutY(720);
        endingFourLabel.setTextFill(Color.rgb(255, 165, 0));
        endingFourLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        endingFourLabel.setLayoutY(715);
        endingFourLabel.setLayoutX(1148);
        endingFiveLabel.setTextFill(Color.WHITE);
        endingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFiveLabel.setLayoutY(720);
        endingSixLabel.setTextFill(Color.WHITE);
        endingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSixLabel.setLayoutY(720);
        endingSevenLabel.setTextFill(Color.WHITE);
        endingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSevenLabel.setLayoutY(720);
        endingEightLabel.setTextFill(Color.WHITE);
        endingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingEightLabel.setLayoutY(720);
        endingNineLabel.setTextFill(Color.WHITE);
        endingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingNineLabel.setLayoutY(720);
        endingTenLabel.setTextFill(Color.WHITE);
        endingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTenLabel.setLayoutY(720);
    }
    public void endingFiveButtonAction(ActionEvent event) {
        endingOneLabel.setTextFill(Color.WHITE);
        endingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingOneLabel.setLayoutY(720);
        endingTwoLabel.setTextFill(Color.WHITE);
        endingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTwoLabel.setLayoutY(720);
        endingThreeLabel.setTextFill(Color.WHITE);
        endingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingThreeLabel.setLayoutY(720);
        endingFourLabel.setTextFill(Color.WHITE);
        endingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFourLabel.setLayoutY(720);
        endingFiveLabel.setTextFill(Color.rgb(255, 165, 0));
        endingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        endingFiveLabel.setLayoutY(715);
        endingFiveLabel.setLayoutX(1148);
        endingSixLabel.setTextFill(Color.WHITE);
        endingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSixLabel.setLayoutY(720);
        endingSevenLabel.setTextFill(Color.WHITE);
        endingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSevenLabel.setLayoutY(720);
        endingEightLabel.setTextFill(Color.WHITE);
        endingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingEightLabel.setLayoutY(720);
        endingNineLabel.setTextFill(Color.WHITE);
        endingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingNineLabel.setLayoutY(720);
        endingTenLabel.setTextFill(Color.WHITE);
        endingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTenLabel.setLayoutY(720);
    }
    public void endingSixButtonAction(ActionEvent event) {
        endingOneLabel.setTextFill(Color.WHITE);
        endingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingOneLabel.setLayoutY(720);
        endingTwoLabel.setTextFill(Color.WHITE);
        endingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTwoLabel.setLayoutY(720);
        endingThreeLabel.setTextFill(Color.WHITE);
        endingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingThreeLabel.setLayoutY(720);
        endingFourLabel.setTextFill(Color.WHITE);
        endingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFourLabel.setLayoutY(720);
        endingFiveLabel.setTextFill(Color.WHITE);
        endingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFiveLabel.setLayoutY(720);
        endingSixLabel.setTextFill(Color.rgb(255, 165, 0));
        endingSixLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        endingSixLabel.setLayoutY(715);
        endingSixLabel.setLayoutX(1148);
        endingSevenLabel.setTextFill(Color.WHITE);
        endingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSevenLabel.setLayoutY(720);
        endingEightLabel.setTextFill(Color.WHITE);
        endingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingEightLabel.setLayoutY(720);
        endingNineLabel.setTextFill(Color.WHITE);
        endingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingNineLabel.setLayoutY(720);
        endingTenLabel.setTextFill(Color.WHITE);
        endingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTenLabel.setLayoutY(720);
    }
    public void endingSevenButtonAction(ActionEvent event) {
        endingOneLabel.setTextFill(Color.WHITE);
        endingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingOneLabel.setLayoutY(720);
        endingTwoLabel.setTextFill(Color.WHITE);
        endingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTwoLabel.setLayoutY(720);
        endingThreeLabel.setTextFill(Color.WHITE);
        endingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingThreeLabel.setLayoutY(720);
        endingFourLabel.setTextFill(Color.WHITE);
        endingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFourLabel.setLayoutY(720);
        endingFiveLabel.setTextFill(Color.WHITE);
        endingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFiveLabel.setLayoutY(720);
        endingSixLabel.setTextFill(Color.WHITE);
        endingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSixLabel.setLayoutY(720);
        endingSevenLabel.setTextFill(Color.rgb(255, 165, 0));
        endingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        endingSevenLabel.setLayoutY(715);
        endingSevenLabel.setLayoutX(1148);
        endingEightLabel.setTextFill(Color.WHITE);
        endingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingEightLabel.setLayoutY(720);
        endingNineLabel.setTextFill(Color.WHITE);
        endingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingNineLabel.setLayoutY(720);
        endingTenLabel.setTextFill(Color.WHITE);
        endingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTenLabel.setLayoutY(720);
    }
    public void endingEightButtonAction(ActionEvent event) {
        endingOneLabel.setTextFill(Color.WHITE);
        endingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingOneLabel.setLayoutY(720);
        endingTwoLabel.setTextFill(Color.WHITE);
        endingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTwoLabel.setLayoutY(720);
        endingThreeLabel.setTextFill(Color.WHITE);
        endingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingThreeLabel.setLayoutY(720);
        endingFourLabel.setTextFill(Color.WHITE);
        endingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFourLabel.setLayoutY(720);
        endingFiveLabel.setTextFill(Color.WHITE);
        endingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFiveLabel.setLayoutY(720);
        endingSixLabel.setTextFill(Color.WHITE);
        endingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSixLabel.setLayoutY(720);
        endingSevenLabel.setTextFill(Color.WHITE);
        endingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSevenLabel.setLayoutY(720);
        endingEightLabel.setTextFill(Color.rgb(255, 165, 0));
        endingEightLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        endingEightLabel.setLayoutY(715);
        endingEightLabel.setLayoutX(1148);
        endingNineLabel.setTextFill(Color.WHITE);
        endingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingNineLabel.setLayoutY(720);
        endingTenLabel.setTextFill(Color.WHITE);
        endingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTenLabel.setLayoutY(720);
    }
    public void endingNineButtonAction(ActionEvent event) {
        endingOneLabel.setTextFill(Color.WHITE);
        endingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingOneLabel.setLayoutY(720);
        endingTwoLabel.setTextFill(Color.WHITE);
        endingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTwoLabel.setLayoutY(720);
        endingThreeLabel.setTextFill(Color.WHITE);
        endingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingThreeLabel.setLayoutY(720);
        endingFourLabel.setTextFill(Color.WHITE);
        endingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFourLabel.setLayoutY(720);
        endingFiveLabel.setTextFill(Color.WHITE);
        endingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFiveLabel.setLayoutY(720);
        endingSixLabel.setTextFill(Color.WHITE);
        endingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSixLabel.setLayoutY(720);
        endingSevenLabel.setTextFill(Color.WHITE);
        endingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSevenLabel.setLayoutY(720);
        endingEightLabel.setTextFill(Color.WHITE);
        endingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingEightLabel.setLayoutY(720);
        endingNineLabel.setTextFill(Color.rgb(255, 165, 0));
        endingNineLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        endingNineLabel.setLayoutY(715);
        endingNineLabel.setLayoutX(1148);
        endingTenLabel.setTextFill(Color.WHITE);
        endingTenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTenLabel.setLayoutY(720);
    }
    public void endingTenButtonAction(ActionEvent event) {
        endingOneLabel.setTextFill(Color.WHITE);
        endingOneLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingOneLabel.setLayoutY(720);
        endingTwoLabel.setTextFill(Color.WHITE);
        endingTwoLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingTwoLabel.setLayoutY(720);
        endingThreeLabel.setTextFill(Color.WHITE);
        endingThreeLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingThreeLabel.setLayoutY(720);
        endingFourLabel.setTextFill(Color.WHITE);
        endingFourLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFourLabel.setLayoutY(720);
        endingFiveLabel.setTextFill(Color.WHITE);
        endingFiveLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingFiveLabel.setLayoutY(720);
        endingSixLabel.setTextFill(Color.WHITE);
        endingSixLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSixLabel.setLayoutY(720);
        endingSevenLabel.setTextFill(Color.WHITE);
        endingSevenLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingSevenLabel.setLayoutY(720);
        endingEightLabel.setTextFill(Color.WHITE);
        endingEightLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingEightLabel.setLayoutY(720);
        endingNineLabel.setTextFill(Color.WHITE);
        endingNineLabel.setFont(new javafx.scene.text.Font("Impact", 70));
        endingNineLabel.setLayoutY(720);
        endingTenLabel.setTextFill(Color.rgb(255, 165, 0));
        endingTenLabel.setFont(new javafx.scene.text.Font("Impact", 80));
        endingTenLabel.setLayoutY(715);
        endingTenLabel.setLayoutX(1148);

    }

}
