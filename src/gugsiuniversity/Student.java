
package gugsiuniversity;


public class Student {
    private String firstname;
    private String lastname;
    private String studentid;
    
    Student (String firstname, String lastname, String studentid){
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentid = studentid;
        
    }
    
   
    
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    
    public String getFirstname(){
        return this.firstname;
    }
    
    public void setLasttname(String lastname){
        this.lastname = lastname;
    }
    
    public String getLastname(){
        return this.lastname;
    }
    
    public void setStudentid(String studentid){
        this.studentid = studentid;
    }
    
    public String getStudentid(){
        return this.studentid;
    }
    
    
    
    
}
