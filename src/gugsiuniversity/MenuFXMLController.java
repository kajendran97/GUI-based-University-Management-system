/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gugsiuniversity;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class MenuFXMLController implements Initializable {
    
    
   
    @FXML private Button btnSearch;
    @FXML private Button btnAddnew;
   
    @FXML private Button btnViewAll;
    @FXML private Button btnEditStudent;
  
    @FXML private Button btnLogout;
    
    
   @FXML 
   public  void searchClicked(ActionEvent evt) throws IOException{
       
        Parent root = FXMLLoader.load(getClass().getResource("StudentdetailFXML.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Student Detail");
            stage.setScene(scene);
            stage.show();
   }
   
   @FXML 
   private void addnewClicked(ActionEvent evt) throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("AddstudentFXML.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Add Student");
            stage.setScene(scene);
            stage.show();
   }
   
   @FXML 
   private void EditStudentClicked(ActionEvent evt) throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("EditStudentFXML.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Edit Student");
            stage.setScene(scene);
            stage.show();
   }
   @FXML 
   private void ViewAllClicked(ActionEvent evt) throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("ViewallFXML.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("View All Students");
            stage.setScene(scene);
            stage.show();
   }

  
  
   
   @FXML 
   private void logoutClicked(ActionEvent evt) throws IOException{
       Parent root = FXMLLoader.load(getClass().getResource("LoginFXML.fxml"));
            Scene scene = new Scene(root);
            Stage stage= (Stage) (((Node) evt.getSource()).getScene().getWindow());
            stage.setTitle("Login Gugsi University");
            stage.setScene(scene);
            stage.show(); 
   }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
