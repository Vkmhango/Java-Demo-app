package Restaurant_Ordering_System;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class FoodMenu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    
    @FXML
    private Button dashboard;

    @FXML
    private Button customization;

    @FXML
    private Button logout;

    // Right Pane Controls
    @FXML
    private Button dineIn;

    @FXML
    private Button takeout;

    @FXML
    private TextArea invoiceArea;

    // Panes for swapping
    @FXML
    private AnchorPane rootPane;

    @FXML
    private AnchorPane middlePane;

    @FXML
    private AnchorPane invoicePane;

    // Keep original children so we can restore them
    private boolean isCustomizationView = false;

    @FXML
    private void handleDashboard() {
        if (isCustomizationView) {
            rootPane.getChildren().removeIf(node -> node instanceof javafx.scene.control.SplitPane);

            if (!rootPane.getChildren().contains(middlePane)) {
                rootPane.getChildren().add(middlePane);
                middlePane.setLayoutX(182.0);
                middlePane.setLayoutY(43.0);
            }

            if (!rootPane.getChildren().contains(invoicePane)) {
                rootPane.getChildren().add(invoicePane);
                invoicePane.setLayoutX(613.0);
                invoicePane.setLayoutY(7.0);
            }

            isCustomizationView = false;
        }
    }

    @FXML
    private void handleCustomization() {
        if (!isCustomizationView) {
            // remove middle + invoice panes
            rootPane.getChildren().remove(middlePane);
            rootPane.getChildren().remove(invoicePane);

            // create new SplitPane for customization
            javafx.scene.control.SplitPane splitPane = new javafx.scene.control.SplitPane();
            splitPane.setPrefSize(600, 500);
            splitPane.setLayoutX(182.0);
            splitPane.setLayoutY(43.0);

            javafx.scene.control.TextArea customizationArea = new javafx.scene.control.TextArea("Customization Options...");
            javafx.scene.control.TextArea previewArea = new javafx.scene.control.TextArea("Preview Area...");

            splitPane.getItems().addAll(customizationArea, previewArea);

            rootPane.getChildren().add(splitPane);
            isCustomizationView = true;
        }
    }

    @FXML
    void initialize() {
        assert dashboard != null : "fx:id=\"dashboard\" was not injected: check your FXML file 'FoodMenu.fxml'.";
        assert customization != null : "fx:id=\"customization\" was not injected: check your FXML file 'FoodMenu.fxml'.";
        assert logout != null : "fx:id=\"logout\" was not injected: check your FXML file 'FoodMenu.fxml'.";
        assert dineIn != null : "fx:id=\"dineIn\" was not injected: check your FXML file 'FoodMenu.fxml'.";
        assert takeout != null : "fx:id=\"takeout\" was not injected: check your FXML file 'FoodMenu.fxml'.";
        assert middlePane != null : "fx:id=\"middlePane\" was not injected: check your FXML file 'FoodMenu.fxml'.";
        assert invoicePane != null : "fx:id=\"invoicePane\" was not injected: check your FXML file 'FoodMenu.fxml'.";
    }
}
