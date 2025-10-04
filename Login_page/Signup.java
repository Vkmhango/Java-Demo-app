package Login_page;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import app.Main;

public class Signup {

    @FXML
    private TextField emailField;

    @FXML
    private TextField passwordField;

    @FXML
    void handleSignup(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sign Up");
        alert.setHeaderText(null);
        alert.setContentText("Account created successfully!");
        alert.showAndWait();

        // Redirect to login page after signup
        Main.setScene("/Login_page/Login.fxml");
    }
}
