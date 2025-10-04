package Admin_page;

import javafx.fxml.FXML;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import app.Main; 

public class Admin {

    @FXML
    private Font x1;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    @FXML
    void logout() {
        Main.setScene("/Login_page/Login.fxml");
    }
}
