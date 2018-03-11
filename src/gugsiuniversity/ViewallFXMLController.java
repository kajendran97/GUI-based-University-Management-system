
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
import javafx.stage.Stage;



public class ViewallFXMLController implements Initializable {
    @FXML private Label lblfirstname;
    @FXML private Label lbllastname;
    @FXML private Label lblstudentid;
    
    @FXML private Button btnNext;
    @FXML private Button btnPrevious;
    @FXML private Button btnDelete;
    
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
    int  count =0;
    
    @FXML 
   private void DeleteClicked(ActionEvent evt) throws IOException{
      if(studentarr.size()>0){
       studentarr.remove(count-1);
       modulearr.remove(count-1);
       degreearr.remove(count-1);
      
       
       Stage stage= (Stage) (((Node) evt.getSource()).getScene().getWindow());
       stage.close(); 
      }
   }
   
   
    @FXML 
   private void NextClicked(ActionEvent evt) throws IOException{
       if(studentarr.size()>count){
            lblfirstname.setText(studentarr.get(count).getFirstname());
       lbllastname.setText(studentarr.get(count).getLastname());
       lblstudentid.setText(studentarr.get(count).getStudentid());
       lblcore1marks.setText(""+modulearr.get(count).getCore1marks());
           lblcore2marks.setText(""+modulearr.get(count).getCore2marks());
           lblcore3marks.setText(""+modulearr.get(count).getCore3marks()); 
           lblcore4marks.setText(""+modulearr.get(count).getCore4marks());
           lblcore5marks.setText(""+modulearr.get(count).getCore5marks());
           lblcore6marks.setText(""+modulearr.get(count).getCore6marks());
           lblcore7marks.setText(""+modulearr.get(count).getCore7marks());
           lblcore8marks.setText(""+modulearr.get(count).getCore8marks());
           lblopt1.setText(modulearr.get(count).getOpMod1());
           lblopt2.setText(modulearr.get(count).getOpMod2());
           lblopt3.setText(modulearr.get(count).getOpMod3());
           lblopt4.setText(modulearr.get(count).getOpMod4());
           lblopt5.setText(modulearr.get(count).getOpMod5());
           lblopt6.setText(modulearr.get(count).getOpMod6());
           lblopt7.setText(modulearr.get(count).getOpMod7());
           lblopt1marks.setText(""+modulearr.get(count).getOpMod1Marks());
           lblopt2marks.setText(""+modulearr.get(count).getOpMod2Marks());
           lblopt3marks.setText(""+modulearr.get(count).getOpMod3Marks());
           lblopt4marks.setText(""+modulearr.get(count).getOpMod4Marks());
           lblopt5marks.setText(""+modulearr.get(count).getOpMod5Marks());
           lblopt6marks.setText(""+modulearr.get(count).getOpMod6Marks());
           lblopt7marks.setText(""+modulearr.get(count).getOpMod7Marks());
           lblseminar.setText(modulearr.get(count).getSeminar());
           lblprojectType.setText(modulearr.get(count).getProjectType());
           lblprojectResult.setText(modulearr.get(count).getProjectResult());
           lblGPA.setText(""+modulearr.get(count).getGPA());
           lblDegreeName.setText(degreearr.get(count).getDegreeName());
           lblDegreeClass.setText(degreearr.get(count).getDegreeClass());
             count++;
       }
       
   }
    
    @FXML 
   private void PreviousClicked(ActionEvent evt) throws IOException{
       if(studentarr.size()>=count && count>=2 ){
           count-=2;
            lblfirstname.setText(studentarr.get(count).getFirstname());
       lbllastname.setText(studentarr.get(count).getLastname());
       lblstudentid.setText(studentarr.get(count).getStudentid());
       lblcore1marks.setText(""+modulearr.get(count).getCore1marks());
           lblcore2marks.setText(""+modulearr.get(count).getCore2marks());
           lblcore3marks.setText(""+modulearr.get(count).getCore3marks()); 
           lblcore4marks.setText(""+modulearr.get(count).getCore4marks());
           lblcore5marks.setText(""+modulearr.get(count).getCore5marks());
           lblcore6marks.setText(""+modulearr.get(count).getCore6marks());
           lblcore7marks.setText(""+modulearr.get(count).getCore7marks());
           lblcore8marks.setText(""+modulearr.get(count).getCore8marks());
           lblopt1.setText(modulearr.get(count).getOpMod1());
           lblopt2.setText(modulearr.get(count).getOpMod2());
           lblopt3.setText(modulearr.get(count).getOpMod3());
           lblopt4.setText(modulearr.get(count).getOpMod4());
           lblopt5.setText(modulearr.get(count).getOpMod5());
           lblopt6.setText(modulearr.get(count).getOpMod6());
           lblopt7.setText(modulearr.get(count).getOpMod7());
           lblopt1marks.setText(""+modulearr.get(count).getOpMod1Marks());
           lblopt2marks.setText(""+modulearr.get(count).getOpMod2Marks());
           lblopt3marks.setText(""+modulearr.get(count).getOpMod3Marks());
           lblopt4marks.setText(""+modulearr.get(count).getOpMod4Marks());
           lblopt5marks.setText(""+modulearr.get(count).getOpMod5Marks());
           lblopt6marks.setText(""+modulearr.get(count).getOpMod6Marks());
           lblopt7marks.setText(""+modulearr.get(count).getOpMod7Marks());
           lblseminar.setText(modulearr.get(count).getSeminar());
           lblprojectType.setText(modulearr.get(count).getProjectType());
           lblprojectResult.setText(modulearr.get(count).getProjectResult());
           lblGPA.setText(""+modulearr.get(count).getGPA());
           lblDegreeName.setText(degreearr.get(count).getDegreeName());
           lblDegreeClass.setText(degreearr.get(count).getDegreeClass());
             count++;
       }
       
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       if(studentarr.size()>0){   
       lblfirstname.setText(studentarr.get(0).getFirstname());
       lbllastname.setText(studentarr.get(0).getLastname());
       lblstudentid.setText(studentarr.get(0).getStudentid());
       lblcore1marks.setText(""+modulearr.get(0).getCore1marks());
           lblcore2marks.setText(""+modulearr.get(0).getCore2marks());
           lblcore3marks.setText(""+modulearr.get(0).getCore3marks()); 
           lblcore4marks.setText(""+modulearr.get(0).getCore4marks());
           lblcore5marks.setText(""+modulearr.get(0).getCore5marks());
           lblcore6marks.setText(""+modulearr.get(0).getCore6marks());
           lblcore7marks.setText(""+modulearr.get(0).getCore7marks());
           lblcore8marks.setText(""+modulearr.get(0).getCore8marks());
           lblopt1.setText(modulearr.get(0).getOpMod1());
           lblopt2.setText(modulearr.get(0).getOpMod2());
           lblopt3.setText(modulearr.get(0).getOpMod3());
           lblopt4.setText(modulearr.get(0).getOpMod4());
           lblopt5.setText(modulearr.get(0).getOpMod5());
           lblopt6.setText(modulearr.get(0).getOpMod6());
           lblopt7.setText(modulearr.get(0).getOpMod7());
           lblopt1marks.setText(""+modulearr.get(0).getOpMod1Marks());
           lblopt2marks.setText(""+modulearr.get(0).getOpMod2Marks());
           lblopt3marks.setText(""+modulearr.get(0).getOpMod3Marks());
           lblopt4marks.setText(""+modulearr.get(0).getOpMod4Marks());
           lblopt5marks.setText(""+modulearr.get(0).getOpMod5Marks());
           lblopt6marks.setText(""+modulearr.get(0).getOpMod6Marks());
           lblopt7marks.setText(""+modulearr.get(0).getOpMod7Marks());
           lblseminar.setText(modulearr.get(0).getSeminar());
           lblprojectType.setText(modulearr.get(0).getProjectType());
           lblprojectResult.setText(modulearr.get(0).getProjectResult());
           lblGPA.setText(""+modulearr.get(0).getGPA());
           lblDegreeName.setText(degreearr.get(0).getDegreeName());
           lblDegreeClass.setText(degreearr.get(0).getDegreeClass());
             count++;
       }
    }    
    
}
