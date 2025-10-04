package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/Login_page/Login.fxml"));
        primaryStage.setTitle("Kamchemani Restaurant System");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void setScene(String fxmlFile) {
        try {
            Parent root = FXMLLoader.load(Main.class.getResource(fxmlFile));
            primaryStage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
