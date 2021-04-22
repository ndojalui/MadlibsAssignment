package madlibs;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class parisStoryController {
    public Menu menuHelpAbout;
    public TextArea bottomTextArea;
    public Button addTextButton;
    // Gets text submitted in text fields
    public TextField NOUN1;
    public TextField EXCLAMATION;
    public TextField NOUN2;
    public TextField NOUN3;

    public Button menuButton;
    private Scene firstScene;

    public void menuHelpAboutClicked(ActionEvent event) {// Function opens an about the program window
        Alert aboutAlert = new Alert(Alert.AlertType.INFORMATION);

        aboutAlert.setTitle("About this program");
        aboutAlert.setContentText("Follow the on screen buttons and text to play madlibs with multiple stories.");//needs text
        aboutAlert.showAndWait();
    }

    public void setFirstScene(Scene scene) {
        firstScene = scene;
    }//sets the scene from main

    public void menuClicked(ActionEvent actionEvent) {// when pressed, switches to first scene
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(firstScene);
    }

    public void addBottomText(ActionEvent actionEvent) {// adds the text + madlibs to the bottom text area
        if (bottomTextArea.getText() != null) bottomTextArea.clear();//  clears the text already in the field if there is any
        bottomTextArea.appendText("VINCENT:\n" +
                "\n" +
                "you know what\n" +
                "they call a "+NOUN1.getText()+" with\n" +
                NOUN2.getText()+" in Paris?\n" +
                "\n" +
                "JULES:\n" +
                "\n" +
                "They don't call it a "+NOUN1.getText()+"\n" +
                "with "+NOUN2.getText()+"\n" +
                "\n" +
                "VINCENT:\n" +
                "\n" +
                "No, they got the metric system there,\n" +
                "they wouldn't know what the "+EXCLAMATION.getText()+" a\n" +
                NOUN1.getText()+" is.\n" +
                "\n" +
                "JULES:\n" +
                "\n" +
                "What'd they call it?\n" +
                "\n" +
                "VINCENT:\n" +
                "\n" +
                NOUN3.getText()+" with "+NOUN2.getText()+".");
    }
}
