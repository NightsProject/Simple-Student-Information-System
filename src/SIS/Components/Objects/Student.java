
package SIS.Components.Objects;

public class Student extends Program{
    
    private String idNum;
    private String firstName;
    private String lastName;
    private String yearLevel;
    private String gender;

    
    public Student(){};

    public Student(String idNum, String firstName, String lastName, String yearLevel, String gender, String programCode, String programName, String collegeCode, String collegeName){
        this.idNum = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearLevel = yearLevel;
        this.gender = gender;
        super.programCode = programCode;
        super.programName = programName;
        super.collegeCode = collegeCode;
        super.collegeName = collegeName;
    };
    
    
    
    public String getIdNum() {
        return idNum;
    }

   
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

  
    public String getFirstName() {
        return firstName;
    }

   
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   
    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

 
    public String getYearLevel() {
        return yearLevel;
    }

  
    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

   
    public String getGender() {
        return gender;
    }

   
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProgramCode(){
        return super.programCode;
    }

    
    public void setProgramCode(String programCode) {
        super.programCode = programCode;
    }

    public String studentData(){
        return idNum + "/" + firstName + "/" + lastName + "/" + yearLevel + "/" + gender + "/" + collegeCode + "/" + programCode;
    }
    
}
