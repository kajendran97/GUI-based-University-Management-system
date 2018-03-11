
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginFXMLController implements Initializable {
    
    @FXML private Label lblmessage;
    @FXML private TextField txtusername;
    @FXML private PasswordField pfpassword;
    @FXML private Button btnlogin;
    
    
    @FXML
    private void loginClicked (ActionEvent evt) throws IOException{
        String username = txtusername.getText();
        String password = pfpassword.getText();
        
        if(username.equals("admin") && password.equals("1234")){
            lblmessage.setText("");
            Parent root = FXMLLoader.load(getClass().getResource("MenuFXML.fxml"));
            Scene scene = new Scene(root);
            Stage stage= (Stage) (((Node) evt.getSource()).getScene().getWindow());
            stage.setTitle("Main Menu: Gugsi University");
            stage.setScene(scene);
            stage.show();
            
        }
        else{
            lblmessage.setText("Invalid username or Password*");
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
