
package gugsiuniversity;

import static gugsiuniversity.AddstudentFXMLController.degreearr;
import static gugsiuniversity.AddstudentFXMLController.modulearr;
import static gugsiuniversity.AddstudentFXMLController.studentarr;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class StudentdetailFXMLController implements Initializable {

    @FXML private Label lblfirstname;
    @FXML private Label lbllastname;
    @FXML private Label lblstudentid;
    @FXML private TextField txtinputstid;
    @FXML private Button btnSearch;
    @FXML private Button btnDelete;
    @FXML private Label errmessage;
    
    @FXML private Label lblcore1marks;
    @FXML private Label lblcore2marks;
    @FXML private Label lblcore3marks;
    @FXML private Label lblcore4marks;
    @FXML private Label lblcore5marks;
    @FXML private Label lblcore6marks;
    @FXML private Label lblcore7marks;
    @FXML private Label lblcore8marks;
    
    @FXML private Label lblopt1;
    @FXML private Label lblopt2;
    @FXML private Label lblopt3;
    @FXML private Label lblopt4;
    @FXML private Label lblopt5;
    @FXML private Label lblopt6;
    @FXML private Label lblopt7;
    
    @FXML private Label lblopt1marks;
    @FXML private Label lblopt2marks;
    @FXML private Label lblopt3marks;
    @FXML private Label lblopt4marks;
    @FXML private Label lblopt5marks;
    @FXML private Label lblopt6marks;
    @FXML private Label lblopt7marks;
    @FXML private Label lblseminar;
    @FXML private Label lblprojectType;
    @FXML private Label lblprojectResult;
    @FXML private Label lblGPA;
    @FXML private Label lblDegreeName;
    @FXML private Label lblDegreeClass;
    private int i;
    
    
    @FXML
    private void searchClicked(ActionEvent evt){
        String inputstid = txtinputstid.getText();
        boolean studentfound=false;
        
        for( i=0; i<studentarr.size();i++){
            if(studentarr.get(i).getStudentid().equalsIgnoreCase(inputstid)){
                studentfound=true;
                errmessage.setText("");
                lblfirstname.setText(studentarr.get(i).getFirstname());
                lbllastname.setText(studentarr.get(i).getLastname());
                lblstudentid.setText(studentarr.get(i).getStudentid());
                break;
                
            }
        }
        if(studentfound==false){
            errmessage.setText("Student not found*");
        }
        else if (studentfound==true){
           lblcore1marks.setText(""+modulearr.get(i).getCore1marks());
           lblcore2marks.setText(""+modulearr.get(i).getCore2marks());
           lblcore3marks.setText(""+modulearr.get(i).getCore3marks()); 
           lblcore4marks.setText(""+modulearr.get(i).getCore4marks());
           lblcore5marks.setText(""+modulearr.get(i).getCore5marks());
           lblcore6marks.setText(""+modulearr.get(i).getCore6marks());
           lblcore7marks.setText(""+modulearr.get(i).getCore7marks());
           lblcore8marks.setText(""+modulearr.get(i).getCore8marks());
           lblopt1.setText(modulearr.get(i).getOpMod1());
           lblopt2.setText(modulearr.get(i).getOpMod2());
           lblopt3.setText(modulearr.get(i).getOpMod3());
           lblopt4.setText(modulearr.get(i).getOpMod4());
           lblopt5.setText(modulearr.get(i).getOpMod5());
           lblopt6.setText(modulearr.get(i).getOpMod6());
           lblopt7.setText(modulearr.get(i).getOpMod7());
           lblopt1marks.setText(""+modulearr.get(i).getOpMod1Marks());
           lblopt2marks.setText(""+modulearr.get(i).getOpMod2Marks());
           lblopt3marks.setText(""+modulearr.get(i).getOpMod3Marks());
           lblopt4marks.setText(""+modulearr.get(i).getOpMod4Marks());
           lblopt5marks.setText(""+modulearr.get(i).getOpMod5Marks());
           lblopt6marks.setText(""+modulearr.get(i).getOpMod6Marks());
           lblopt7marks.setText(""+modulearr.get(i).getOpMod7Marks());
           lblseminar.setText(modulearr.get(i).getSeminar());
           lblprojectType.setText(modulearr.get(i).getProjectType());
           lblprojectResult.setText(modulearr.get(i).getProjectResult());
           lblGPA.setText(""+modulearr.get(i).getGPA());
           lblDegreeName.setText(degreearr.get(i).getDegreeName());
           lblDegreeClass.setText(degreearr.get(i).getDegreeClass());
        }
    }
    
    @FXML 
   private void DeleteClicked(ActionEvent evt) throws IOException{
       if(studentarr.size()>0){
       studentarr.remove(i);
       modulearr.remove(i);
       degreearr.remove(i);
       
       
       Stage stage= (Stage) (((Node) evt.getSource()).getScene().getWindow());
       stage.close(); 
       }
   }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
