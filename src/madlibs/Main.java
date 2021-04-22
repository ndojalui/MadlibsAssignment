package madlibs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    MadlibsUI mad;

    @Override
    public void start(Stage primaryStage) throws Exception{
// getting loader and a pane for the first scene.
        // loader will then give a possibility to get related controller
        FXMLLoader firstPaneLoader = new FXMLLoader(getClass().getResource("madlibsUI.fxml"));
        Parent firstPane = firstPaneLoader.load();
        Scene firstScene = new Scene(firstPane, 549, 540);
        primaryStage.setResizable(false);

        // getting loader and a pane for the second scene
        FXMLLoader secondPageLoader = new FXMLLoader(getClass().getResource("parisStory.fxml"));
        Parent secondPane = secondPageLoader.load();
        Scene secondScene = new Scene(secondPane, 570, 540);

        // getting loader and a pane for the third scene
        FXMLLoader thirdPageLoader = new FXMLLoader(getClass().getResource("moonStory.fxml"));
        Parent thirdPane = thirdPageLoader.load();
        Scene thirdScene = new Scene(thirdPane, 570, 540);

        // getting loader and a pane for the fourth scene
        FXMLLoader fourthPageLoader = new FXMLLoader(getClass().getResource("englishStory.fxml"));
        Parent fourthPane = fourthPageLoader.load();
        Scene fourthScene = new Scene(fourthPane, 570, 540);

        // injecting second scene into the controller of the first scene
        MadlibsUI firstPaneController = firstPaneLoader.getController();
        firstPaneController.setSecondScene(secondScene);

        // injecting third scene into the controller of the first scene
        firstPaneController.setThirdScene(thirdScene);

        // injecting fourth scene into the controller of the first scene
        firstPaneController.setFourthScene(fourthScene);

        // injecting first scene into the controller of the second scene
        parisStoryController secondPaneController = secondPageLoader.getController();
        secondPaneController.setFirstScene(firstScene);

        // injecting first scene into the controller of the third scene
        moonStoryController thirdPaneController = thirdPageLoader.getController();
        thirdPaneController.setFirstScene(firstScene);

        // injecting first scene into the controller of the fourth scene
        englishStoryController fourthPaneController = fourthPageLoader.getController();
        fourthPaneController.setFirstScene(firstScene);

        primaryStage.setTitle("Madlibs"); //Sets the title of the program
        primaryStage.setScene(firstScene); //sets the default scene
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
