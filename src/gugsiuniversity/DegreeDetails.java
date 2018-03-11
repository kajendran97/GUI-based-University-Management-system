
package gugsiuniversity;


public class DegreeDetails {
   private String degreeName;
   private String degreeClass;
    
    DegreeDetails (String degreeName,String degreeClass){
        this.degreeName = degreeName;
        this.degreeClass = degreeClass;

    }

    public String getDegreeName(){
        return this.degreeName;
    }
    public String getDegreeClass(){
        return this.degreeClass;
    }
}
