
package gugsiuniversity;


public class ModuleDetails {
    private int core1marks;
    private int core2marks;
    private int core3marks;
    private int core4marks;
    private int core5marks;
    private int core6marks;
    private int core7marks;
    private int core8marks;
    private String opMod1;
    private String opMod2;
    private String opMod3;
    private String opMod4;
    private String opMod5;
    private String opMod6;
    private String opMod7;
    private int opMod1Marks;
    private int opMod2Marks;
    private int opMod3Marks;
    private int opMod4Marks;
    private int opMod5Marks;
    private int opMod6Marks;
    private int opMod7Marks;
    private String seminar;
    private String projectType;
    private String projectResult;
    private int totalCredits;
    private double GPA;
    
     ModuleDetails (int core1marks,int core2marks,int core3marks,int core4marks,int core5marks,
            int core6marks,int core7marks,int core8marks,String opMod1,String opMod2,String opMod3,String opMod4,
            String opMod5,String opMod6,String opMod7,int opMod1Marks,int opMod2Marks,int opMod3Marks,
            int opMod4Marks,int opMod5Marks,int opMod6Marks,int opMod7Marks,String seminar,String projectType,
            String projectResult,int totalCredits,double GPA){
    
    this.core1marks = core1marks;
    this.core2marks = core2marks;
    this.core3marks = core3marks;
    this.core4marks = core4marks;
    this.core5marks = core5marks;
    this.core6marks = core6marks;
    this.core7marks = core7marks;
    this.core8marks = core8marks;
    this.opMod1 = opMod1;
    this.opMod2 = opMod2;
    this.opMod3 = opMod3;
    this.opMod4 = opMod4;
    this.opMod5 = opMod5;
    this.opMod6 = opMod6;
    this.opMod7 = opMod7;
    this.opMod1Marks = opMod1Marks;
    this.opMod2Marks = opMod2Marks;
    this.opMod3Marks = opMod3Marks;
    this.opMod4Marks = opMod4Marks;
    this.opMod5Marks = opMod5Marks;
    this.opMod6Marks = opMod6Marks;
    this.opMod7Marks = opMod7Marks;
    this.seminar = seminar;
    this.projectType = projectType;
    this.projectResult = projectResult;
    this.totalCredits = totalCredits;
    this.GPA = GPA;
    
    
    }
    
    public int getCore1marks(){
        return this.core1marks;
    }
    public int getCore2marks(){
        return this.core2marks;
    } 
    public int getCore3marks(){
        return this.core3marks;
    } 
    public int getCore4marks(){
        return this.core4marks;
    } 
    public int getCore5marks(){
        return this.core5marks;
    }
    public int getCore6marks(){
        return this.core6marks;
    }
    public int getCore7marks(){
        return this.core7marks;
    }
    public int getCore8marks(){
        return this.core8marks;
    }
    
    public String getOpMod1(){
        return this.opMod1;
    }
    public String getOpMod2(){
        return this.opMod2;
    }
    public String getOpMod3(){
        return this.opMod3;
    }
    public String getOpMod4(){
        return this.opMod4;
    }
    public String getOpMod5(){
        return this.opMod5;
    }
    public String getOpMod6(){
        return this.opMod6;
    }
    public String getOpMod7(){
        return this.opMod7;
    }
    
    public int getOpMod1Marks(){
        return this.opMod1Marks;
    }
    public int getOpMod2Marks(){
        return this.opMod2Marks;
    }
    public int getOpMod3Marks(){
        return this.opMod3Marks;
    }
    public int getOpMod4Marks(){
        return this.opMod4Marks;
    }
    public int getOpMod5Marks(){
        return this.opMod5Marks;
    }
    public int getOpMod6Marks(){
        return this.opMod6Marks;
    }
    public int getOpMod7Marks(){
        return this.opMod7Marks;
    }
    
    public String getSeminar(){
        return this.seminar;
    }
    public String getProjectType(){
        return this.projectType;
    }
    public String getProjectResult(){
        return this.projectResult;
    }
    public double getGPA(){
        return this.GPA;
    }
}
