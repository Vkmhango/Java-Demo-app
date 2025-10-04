package Login_page;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import app.Main;

public class Login {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    void handleLogin(ActionEvent event) {
        String email = usernameField.getText().trim();
        String password = passwordField.getText().trim();

        // Staff login
        if (email.equalsIgnoreCase("sm25@16")) {
            Main.setScene("/Staff_page/Staff.fxml");

            // Admin login
        } else if (email.equalsIgnoreCase("admin25@16")) {
            Main.setScene("/Admin_page/Admin_page.fxml");

            // Default FoodMenu login
        } else if (email.equalsIgnoreCase("Group16") && password.equals("0206")) {
            Main.setScene("/Restaurant_Ordering_System/FoodMenu.fxml");

            // Invalid login
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("Invalid email or password.");
            alert.showAndWait();
        }
    }

    @FXML
    void handleSignUp(ActionEvent event) {
        Main.setScene("/Login_page/Signup.fxml");
    }
}
