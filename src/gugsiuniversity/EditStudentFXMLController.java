/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gugsiuniversity;

import static gugsiuniversity.AddstudentFXMLController.degreearr;
import static gugsiuniversity.AddstudentFXMLController.modulearr;
import static gugsiuniversity.AddstudentFXMLController.projects;
import static gugsiuniversity.AddstudentFXMLController.s1optmodules;
import static gugsiuniversity.AddstudentFXMLController.s2optmodules;
import static gugsiuniversity.AddstudentFXMLController.studentarr;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.Node;


import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class EditStudentFXMLController implements Initializable {

    @FXML private TextField txtfname;
    @FXML private TextField txtlname;
    @FXML private TextField txtstudentid;
    
    @FXML private TextField txtmarks531;
    @FXML private TextField txtmarks535;
    @FXML private TextField txtmarks537;
    @FXML private TextField txtmarks538;
    @FXML private TextField txtmarks539;
    @FXML private TextField txtmarks546;
    @FXML private TextField txtmarks554;
    @FXML private TextField txtmarks555;
    
    @FXML private RadioButton rbtnseminar;
    
    @FXML private ComboBox cmbboxop1;
    @FXML private ComboBox cmbboxop2;
    @FXML private ComboBox cmbboxop3;
    @FXML private ComboBox cmbboxop4;
    @FXML private ComboBox cmbboxop5;
    @FXML private ComboBox cmbboxop6;
    @FXML private ComboBox cmbboxop7;
    
    @FXML private TextField txtop1marks;
    @FXML private TextField txtop2marks;
    @FXML private TextField txtop3marks;
    @FXML private TextField txtop4marks;
    @FXML private TextField txtop5marks;
    @FXML private TextField txtop6marks;
    @FXML private TextField txtop7marks;
    
    @FXML private ComboBox cmbboxproject;
    @FXML private RadioButton rbtnproject;
     
    @FXML private Button btnSave;
     @FXML private TextField txtinputstid;
    @FXML private Button btnSearch;
    @FXML private Button btnDelete;
    @FXML private Label errmessage;
      private int i;
    
    
    @FXML
    private void searchClicked(ActionEvent evt){
        String inputstid = txtinputstid.getText();
        boolean studentfound=false;
        
        for( i=0; i<studentarr.size();i++){
            if(studentarr.get(i).getStudentid().equalsIgnoreCase(inputstid)){
                studentfound=true;
                errmessage.setText("");
                txtfname.setText(studentarr.get(i).getFirstname());
                txtlname.setText(studentarr.get(i).getLastname());
                txtstudentid.setText(studentarr.get(i).getStudentid());
                break;
                
            }
        }
        if(studentfound==false){
            errmessage.setText("Student not found*");
        }
        else if (studentfound==true){
           txtmarks531.setText(""+modulearr.get(i).getCore1marks());
           txtmarks535.setText(""+modulearr.get(i).getCore2marks());
          txtmarks537.setText(""+modulearr.get(i).getCore3marks()); 
           txtmarks538.setText(""+modulearr.get(i).getCore4marks());
           txtmarks539.setText(""+modulearr.get(i).getCore5marks());
           txtmarks546.setText(""+modulearr.get(i).getCore6marks());
           txtmarks554.setText(""+modulearr.get(i).getCore7marks());
           txtmarks555.setText(""+modulearr.get(i).getCore8marks());
           cmbboxop1.setValue(modulearr.get(i).getOpMod1());
           cmbboxop2.setValue(modulearr.get(i).getOpMod2());
           cmbboxop3.setValue(modulearr.get(i).getOpMod3());
           cmbboxop4.setValue(modulearr.get(i).getOpMod4());
           cmbboxop5.setValue(modulearr.get(i).getOpMod5());
           cmbboxop6.setValue(modulearr.get(i).getOpMod6());
           cmbboxop7.setValue(modulearr.get(i).getOpMod7());
           txtop1marks.setText(""+modulearr.get(i).getOpMod1Marks());
           txtop2marks.setText(""+modulearr.get(i).getOpMod2Marks());
           txtop3marks.setText(""+modulearr.get(i).getOpMod3Marks());
           txtop4marks.setText(""+modulearr.get(i).getOpMod4Marks());
           txtop5marks.setText(""+modulearr.get(i).getOpMod5Marks());
           txtop6marks.setText(""+modulearr.get(i).getOpMod6Marks());
           txtop7marks.setText(""+modulearr.get(i).getOpMod7Marks());
           
           
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
    
   @FXML
   private  void SaveClicked(ActionEvent evt) throws IOException{
      if(studentarr.size()>0){
       String firstname = txtfname.getText();
       String lastname = txtlname.getText();
       String studentid = txtstudentid.getText();
       
       Student st = new Student(firstname,lastname,studentid);
       studentarr.set(i, st);
      
       
       double totalGP=0;
       int totalCredits=0;
       
       
       int core1marks = Integer.parseInt(txtmarks531.getText());
            if(core1marks>29){totalCredits+=2;}
            totalGP+=calculateGP(core1marks);
            
       int core2marks = Integer.parseInt(txtmarks535.getText());
            if(core2marks>29){totalCredits+=2;}
            totalGP+=calculateGP(core2marks);
            
       int core3marks = Integer.parseInt(txtmarks537.getText());
            if(core3marks>29){totalCredits+=2;}
            totalGP+=calculateGP(core3marks);
            
       int core4marks = Integer.parseInt(txtmarks538.getText());
            if(core4marks>29){totalCredits+=2;}
            totalGP+=calculateGP(core4marks);
            
       int core5marks = Integer.parseInt(txtmarks539.getText());
            if(core5marks>29){totalCredits+=2;}
            totalGP+=calculateGP(core5marks);
            
       int core6marks = Integer.parseInt(txtmarks546.getText());
            if(core6marks>29){totalCredits+=2;}
            totalGP+=calculateGP(core6marks);
            
       int core7marks = Integer.parseInt(txtmarks554.getText());
            if(core7marks>29){totalCredits+=2;}
            totalGP+=calculateGP(core7marks);
            
       int core8marks = Integer.parseInt(txtmarks555.getText());
            if(core8marks>29){totalCredits+=2;}
            totalGP+=calculateGP(core8marks);
       
       String opMod1 = (String) cmbboxop1.getValue();
       String opMod2 = (String) cmbboxop2.getValue();
       String opMod3 = (String) cmbboxop3.getValue();
       String opMod4 = (String) cmbboxop4.getValue();
       String opMod5 = (String) cmbboxop5.getValue();
       String opMod6 = (String) cmbboxop6.getValue();
       String opMod7 = (String) cmbboxop7.getValue();
       
       int opMod1Marks = Integer.parseInt(txtop1marks.getText());
            if(opMod1Marks>29){totalCredits+=2;}
            totalGP+=calculateGP(opMod1Marks);
            
       int opMod2Marks = Integer.parseInt(txtop2marks.getText());
            if(opMod2Marks>29){totalCredits+=2;}
            totalGP+=calculateGP(opMod2Marks);
            
       int opMod3Marks = Integer.parseInt(txtop3marks.getText());
            if(opMod3Marks>29){totalCredits+=2;}
            totalGP+=calculateGP(opMod3Marks);
            
       int opMod4Marks = Integer.parseInt(txtop4marks.getText());
            if(opMod4Marks>29){totalCredits+=2;}
            totalGP+=calculateGP(opMod4Marks);
            
       int opMod5Marks = Integer.parseInt(txtop5marks.getText());
            if(opMod5Marks>29){totalCredits+=2;}
            totalGP+=calculateGP(opMod5Marks);
            
       int opMod6Marks = Integer.parseInt(txtop6marks.getText());
            if(opMod6Marks>29){totalCredits+=2;}
            totalGP+=calculateGP(opMod6Marks);
            
       int opMod7Marks = Integer.parseInt(txtop7marks.getText());
            if(opMod7Marks>29){totalCredits+=2;}
            totalGP+=calculateGP(opMod7Marks);
       
         double GPA = Math.round((totalGP/totalCredits)*100.0)/100.0;    
            
            
       String seminar;
       if(rbtnseminar.isSelected()){
           seminar = "Pass";
           totalCredits+=1;
       }
       else seminar = "Fail";
       
       
       String projectType = (String) cmbboxproject.getValue();
       
       String projectResult;
       if(rbtnproject.isSelected() && projectType.equalsIgnoreCase("Industrial")){
           projectResult = "Pass";
           totalCredits+=15;
         }
       else if(rbtnproject.isSelected() && projectType.equalsIgnoreCase("Research")){
           projectResult = "Pass";
           totalCredits+=30;
         }
       else if (projectType.equalsIgnoreCase("None")){
           projectResult = "-";
       }
       else projectResult = "Fail";
       
       ModuleDetails md = new ModuleDetails(core1marks,core2marks,core3marks,core4marks,core5marks,
            core6marks,core7marks,core8marks,opMod1,opMod2,opMod3,opMod4,
            opMod5,opMod6,opMod7,opMod1Marks,opMod2Marks,opMod3Marks,
            opMod4Marks,opMod5Marks,opMod6Marks,opMod7Marks,seminar,projectType,
            projectResult,totalCredits,GPA);
       
       modulearr.set(i, md);
       
       String degreeClass = DegreeClass(GPA,totalCredits);
       String degreeName = DegreeName(totalCredits,GPA);
       
       DegreeDetails dd = new DegreeDetails(degreeName,degreeClass);
       degreearr.set(i, dd);
       
       Stage stage= (Stage) (((Node) evt.getSource()).getScene().getWindow());
       stage.close(); 
       
      }
   }
   
   private double calculateGP(int marks){
       double GP=0;
       if(marks>0 && marks<=29){
           GP = 0.00;
       }
       else if(marks>29 && marks<=34){
           GP = 1.00*2;
       }
       else if(marks>34 && marks<=39){
           GP = 1.67*2;
       }
       else if(marks>39 && marks<=44){
           GP = 2.00*2;
       }
       else if(marks>44 && marks<=54){
           GP = 2.33*2;
       }
       else if(marks>54 && marks<=59){
           GP = 2.67*2;
       }
       else if(marks>59 && marks<=64){
           GP = 3.00*2;
       }
       else if(marks>64 && marks<=69){
           GP = 3.33*2;
       }
       else if(marks>69 && marks<=84){
           GP = 3.67*2;
       }
       else if(marks>84 && marks<=100){
           GP = 4.00*2;
       }
       return GP;
   
   }
   
   private String DegreeClass(double GPA,int Credits){
       String DClass="-";
       if(Credits>=30){
       if(GPA<=4.00 && GPA>=3.70){
           DClass = "Distinction";
       }
       else if(GPA>=3.50){
           DClass = "Merit";
       }
       else if(GPA>=3.00){
           DClass = "Pass";
       }
       }
       
       return DClass;
   }
   
   private String DegreeName(int Credits, double GPA){
       String DegreeName="-";
       
       if(Credits>=60 && GPA>=3.00){
           DegreeName="M.Sc Computer Science (by Research)";
       }
       else if(Credits>=45 && GPA>=3.00){
           DegreeName="M.Sc Computer Science (by Coursework and Research)";
       }
       else if(Credits>=30 && GPA>=3.00){
           DegreeName="M.Sc Computer Science (by Coursework)";
       }
       else if(Credits>=25){
           DegreeName="Postgraduate Diploma in Computer Science";
       }
  
       
       return DegreeName;
   }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbboxop1.setItems(s1optmodules);
        cmbboxop1.setValue("None");
        cmbboxop2.setItems(s1optmodules);
        cmbboxop2.setValue("None");
        cmbboxop3.setItems(s1optmodules);
        cmbboxop3.setValue("None");
        cmbboxop4.setItems(s2optmodules);
        cmbboxop4.setValue("None");
        cmbboxop5.setItems(s2optmodules);
        cmbboxop5.setValue("None");
        cmbboxop6.setItems(s2optmodules);
        cmbboxop6.setValue("None");
        cmbboxop7.setItems(s2optmodules);
        cmbboxop7.setValue("None");
        
        cmbboxproject.setItems(projects);
        cmbboxproject.setValue("None");
    }    
    
}
