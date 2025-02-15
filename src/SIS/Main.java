
package SIS;


import SIS.com.objects.College;
import SIS.com.objects.Program;
import SIS.com.objects.Student;

import SIS.com.Read;

import SIS.com.frames.MainWindow;
import com.formdev.flatlaf.FlatDarkLaf;

public class Main {
    
    public static String END_LINE = "END/This is the end of the file/END";
    public static String END = "END";
    
    
    //Maximum 
    public static int MAX_COLLEGE = 9999;
    public static int MAX_PROGRAM = 9999;
    public static int MAX_STUDENT = 9999;
    public static int MAX_YEARLEVEL_LIST = 50;
    
    //Format
    public static int COLLEGEDATA_FORMAT = 2; // Code/Name
    public static int PROGRAMDATA_FORMAT = 3; // Code/Name/CollegeCode
    public static int STUDENTDATA_FORMAT = 7; // IdNum/Firstname/Lastname/YearLevel/Gender/CollegeCode/ProgramCode
    
    //Object array
    public static College college[] = new College[MAX_COLLEGE];
    public static Program program[] = new Program[MAX_PROGRAM];
    public static Student student[] = new Student[MAX_STUDENT];
    
    //Arrays
    public static String YearLevel[] = new String[50];
    public static String Years[] = new String[50];
    
    //Frames
    public static MainWindow menu;
    
    public static void main(String[] args) {
        
        //setting Look and Feel 
        FlatDarkLaf.setup();
        //-----------------------
        
        
        //instialize object arrays
        for(int i = 0; i < MAX_COLLEGE; i++){
            college[i] = new College();
        }
        
        for(int i = 0; i < MAX_PROGRAM; i++){
            program[i] = new Program();
        }
        
        for(int i = 0; i < MAX_STUDENT; i++){
            student[i] = new Student();
        }
        //------------------------
        
        Read.readCollegeData();
        Read.readProgramData();
        Read.readStudentData();
        Read.readYearLevel();
        Read.readYear();
        
        showMenuForm();
        
    }
    
    public static void showMenuForm(){  
        menu = new MainWindow();
        menu.setVisible(true);
    }
    
  
}
