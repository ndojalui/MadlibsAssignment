package madlibs;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class englishStoryController {
    public Button addTextButton;
    // Gets text submitted in text fields
    public TextField NAME1;
    public TextField NAME2;
    public TextField NOUN;
    public TextField EXCLAMATION;

    public TextArea bottomTextArea;
    public Button menuButton;
    public Menu menuHelpAbout;
    private Scene firstScene;

    public void menuHelpAboutClicked(ActionEvent event) {// Function opens an about the program window
        Alert aboutAlert = new Alert(Alert.AlertType.INFORMATION);

        aboutAlert.setTitle("About this program");
        aboutAlert.setContentText("Follow the on screen buttons and text to play madlibs with multiple stories.");//needs text
        aboutAlert.showAndWait();
    }

    public void setFirstScene(Scene scene) {
        firstScene = scene;
    } //sets the scene from main

    public void menuClicked(ActionEvent actionEvent) { // when pressed, switches to first scene
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(firstScene);
    }


    public void addBottomText(ActionEvent actionEvent) { // adds the text + madlibs to the bottom text area
        if (bottomTextArea.getText() != null) bottomTextArea.clear(); //  clears the text already in the field if there is any
        bottomTextArea.appendText(NAME1.getText()+"\n" +
                "What country you from!\n" +
                NAME2.getText()+"\n" +
                "(petrified)\n" +
                NOUN.getText()+"?\n" +
                NAME1.getText()+"\n" +
                "\""+NOUN.getText()+"\" ain't no country I know! Do\n" +
                "they speak English in \""+NOUN.getText()+"?\"\n" +
                NAME2.getText()+"\n" +
                "(near heart attack)\n" +
                NOUN.getText()+"?\n" +
                NAME1.getText()+"\n" +
                "English-"+EXCLAMATION.getText()+"-can-you-speak-\n" +
                "it?\n" +
                NAME2.getText()+"\n" +
                "Yes.\n" +
                NAME1.getText()+"\n" +
                "Then you understand what I'm sayin'?\n" +
                NAME2.getText()+"\n" +
                "Yes.\n" +
                NAME1.getText()+"\n" +
                "Now describe what Marsellus Wallace\n" +
                "looks like!");

    }
}
