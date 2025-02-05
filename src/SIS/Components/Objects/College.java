
package SIS.Components.Objects;


public class College {
    
    protected String collegeCode;
    protected String collegeName;

    public College(){};
    
    
    public String getCollegeCode() {
        return collegeCode;
    }

    public void setCollegeCode(String collegeCode) {
        this.collegeCode = collegeCode;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    public String collegeData(){
        return collegeCode + "/" + collegeName;
    }
}
