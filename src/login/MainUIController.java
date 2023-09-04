/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package login;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 19010
 */
public class MainUIController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button LogoutID;

    @FXML
    private Button InstructionsID;

    @FXML
    private Button PaymentID;

    @FXML
    private Button EventsID;

    @FXML
    private Button CreditsID;

    @FXML
    void handleEventsAction(ActionEvent event) throws ClassNotFoundException, SQLException,IOException {
        Parent MainUI = FXMLLoader.load(getClass().getResource("Events.fxml"));
        Scene src2 = new Scene (MainUI);
        Stage app_primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_primaryStage.setScene(src2);
        app_primaryStage.show();
    }

    @FXML
    void handleInstructionsAction(ActionEvent event) {

    }

    @FXML
    void handleLogoutAction(ActionEvent event)throws ClassNotFoundException, SQLException,IOException {

        Parent MainUI = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene src2 = new Scene (MainUI);
        Stage app_primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_primaryStage.setScene(src2);
        app_primaryStage.show();
        
    }

    @FXML
    void handlePaymentAction(ActionEvent event) {

    }
    
        @FXML
    void handleCreditsAction(ActionEvent event) {

    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
