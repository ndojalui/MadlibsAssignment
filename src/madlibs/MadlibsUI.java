package madlibs;

import javafx.event.ActionEvent;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MadlibsUI {
    public MenuItem menuHelpAbout;
    public Button parisStory;
    public Button moonStory;
    public Button englishStory;

    private Scene secondScene;
    private Scene thirdScene;
    private Scene fourthScene;

    public void menuHelpAboutClicked(ActionEvent actionEvent) {// Function opens an about the program window
        Alert aboutAlert = new Alert(Alert.AlertType.INFORMATION);

        aboutAlert.setTitle("About this program");
        aboutAlert.setContentText("Follow the on screen buttons and text to play madlibs with multiple stories.");//needs text
        aboutAlert.showAndWait();
    }
    public void setSecondScene(Scene scene) {
        secondScene = scene;
    }//sets the scene from main
    public void parisStoryClicked(ActionEvent actionEvent){// when pressed, switches to 2nd scene
        Stage primaryStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        primaryStage.setScene(secondScene);

    }
    public void setThirdScene(Scene scene) {
        thirdScene = scene;
    }//sets the scene from main
    public void moonStoryClicked(ActionEvent actionEvent) {// when pressed, switches to 3rd scene
        Stage primaryStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        primaryStage.setScene(thirdScene);
    }

    public void setFourthScene(Scene scene) {
        fourthScene = scene;
    }//sets the scene from main
    public void englishStoryClicked(ActionEvent actionEvent) {// when pressed, switches to 4th scene
        Stage primaryStage = (Stage)(((Node)actionEvent.getSource()).getScene().getWindow());
        primaryStage.setScene(fourthScene);
    }
}

