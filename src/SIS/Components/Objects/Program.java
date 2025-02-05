
package SIS.Components.Objects;


public class Program extends College{
    
    protected String programCode;
    protected String programName;

    public Program(){};
    

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    
    public String getProgramName() {
        return programName;
    }

    
    public void setProgramName(String programName) {
        this.programName = programName;
    }

  
    public String getCollegeCode() {
        return super.collegeCode;
    }

    
    public void setCollegeCode(String collegeCode) {
        super.collegeCode = collegeCode;
    }
    
    public String programData(){
        return programCode + "/" + programName + "/" + collegeCode;
    }
}
