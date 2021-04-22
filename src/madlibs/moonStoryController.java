package madlibs;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class moonStoryController {
    public Button addTextButton;
    // Gets text submitted in text fields
    public TextField LOCATION;
    public TextField DIFFICULTY1;
    public TextField POTIME;
    public TextField DIFFICULTY2;

    public TextArea bottomTextArea;
    public Button menuButton;
    public Menu menuHelpAbout;
    public MenuItem saveButton;
    public VBox windowLabel;
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
        bottomTextArea.appendText("We choose to go to the "+LOCATION.getText()+". \n" +
                "We choose to go to "+LOCATION.getText()+" in this "+POTIME.getText()+" \n" +
                "and do the other things,\n" +
                "not because they are "+DIFFICULTY1.getText()+", \n" +
                "but because they are "+DIFFICULTY2.getText()+",");

    }

    public void saveStory(ActionEvent actionEvent) {

        FileChooser fileChooser = new FileChooser();
        Stage stage;
        stage = (Stage)windowLabel.getScene().getWindow();

        File currentFile = fileChooser.showSaveDialog(stage);

        FileWriter fw;

        try {
            fw = new FileWriter(currentFile.getAbsolutePath());
        } catch (IOException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR, cannot create file with selected name ");
            alert.setContentText("Please try again with a different name");
            alert.show();
            return;
        }

        String madlibsText = bottomTextArea.getText();

        try {
            fw.write(madlibsText);
        } catch (IOException e) {
            System.out.println("Error writing file");
        }

        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


