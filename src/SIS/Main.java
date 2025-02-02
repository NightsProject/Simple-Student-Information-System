
package SIS;


import SIS.Components.Objects.College;
import SIS.Components.Objects.Program;
import SIS.Components.Objects.Student;

import SIS.Components.Read;

import SIS.Components.Frames.MainMenu;
import SIS.Components.Frames.AddStudent;

import javax.swing.*;

public class Main {
    
    public static String END_LINE = "END/This is the end of the file/END";
    
    
    
    //Maximum 
    public static int MAX_COLLEGE = 9999;
    public static int MAX_PROGRAM = 9999;
    public static int MAX_STUDENT = 9999;
    
    //Format
    public static int COLLEGEDATA_FORMAT = 2; // Code/Name
    public static int PROGRAMDATA_FORMAT = 3; // Code/Name/CollegeCode
    public static int STUDENTDATA_FORMAT = 9; // IdNum/Firstname/Lastname/YearLevel/Gender/ProgramCode/programName/CollegeCode/CollegeName
    
    //Object array
    public static College college[] = new College[MAX_COLLEGE];
    public static Program program[] = new Program[MAX_PROGRAM];
    public static Student student[] = new Student[MAX_STUDENT];
    
    //Frames
    public static MainMenu menu;
    public static AddStudent addStudent;
    
    public static void main(String[] args) {
        
        //setting Look and Feel 
        try{
            UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
            
        }catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e){
            
        }
        //-----------------------
        
        //instantiation of object arrays
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
        
        
        showMenuForm();
        
        /*
        //temp
        for(int i = 0; i < MAX_COLLEGE; i++){
            
            if("END".equals(college[i].getCollegeCode())){
                break;
            }
            System.out.print("College " + i + "\n");
            System.out.print(college[i].getCollegeCode() + ": " + college[i].getCollegeName() + "\n\n");
            
        }
        
        for(int i = 0; i < MAX_PROGRAM; i++){
            
            if("END".equals(program[i].getProgramCode())){
                break;
            }
            
            System.out.print("Program " + i + "\n");
            System.out.print(program[i].getProgramCode() + ": " + program[i].getProgramName() + "\n");
            System.out.print("Coleege Code: " + program[i].getCollegeCode() + "\n\n");
        }
     
        for(int i = 0; i < MAX_STUDENT; i++){
            
            if("END".equals(student[i].getIdNum())){
                break;
            }
            
               
            System.out.print("Student " + i + "\n");
            System.out.print("ID Num: " + student[i].getIdNum() + "\n");
            System.out.print("Firstname: " + student[i].getFirstName() + "\n");
            System.out.print(student[i].getLastName() + "\n");
            System.out.print(student[i].getYearLevel() + "\n");
            System.out.print(student[i].getGender() + "\n");
            System.out.print(student[i].getProgramCode() + "\n");
            System.out.print(student[i].getProgramName() + "\n");
            System.out.print(student[i].getCollegeCode() + "\n");
            System.out.print(student[i].getCollegeName() + "\n");
        
        //------------
        
        }
        */
    }
    
    public static void showMenuForm(){  
        menu = new MainMenu();
        menu.setVisible(true);
    }
    
    
    
    
    public static void showAddStudentForm(){
        if (addStudent == null){
            addStudent = new AddStudent();
        }
         addStudent.setVisible(true);
    }
    
    public static void disposeAddStudentForm(){
        addStudent.dispose();   
    }
}
