
package SIS.com.objects;

import SIS.Main;
import java.util.Collections;
import java.util.Comparator;


public class College {
    
    protected String collegeCode;
    protected String collegeName;

    public College(){};
    
    public College(String collegeCode, String collegeName){
        this.collegeCode = collegeCode;
        this.collegeName = collegeName;
    }
    
    public College(String collegeCode){
        this.collegeCode = collegeCode;
    }
    
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
        return collegeCode + "," + collegeName;
    }
    
    public static void sortCollegeByCode() {
    Collections.sort(Main.collegeData, Comparator.comparing((College college) -> {
        String collegeCode = college.getCollegeCode();

        if (collegeCode == null) {
            return 2; // Null values come last
        }
        if ("END".equals(collegeCode)) {
            return 1; // "END" comes after non-null values but before nulls
        }
        return 0; // Non-null values come first
    }).thenComparing(College::getCollegeCode, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)));
}
    
}
