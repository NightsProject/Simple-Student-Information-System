
package SIS.Components;

import SIS.Main;
import java.io.*;
import java.util.*;

import SIS.Components.Objects.College;
public class Read {
    
    public static void readCollegeData(){
        
        try{
            File collegeData = new File("src/SIS/Components/Data/CollegeData.csv");
            Scanner scan = new Scanner(collegeData);
            
            int i = 0;
            while(scan.hasNextLine()){
                
                
                String collegeDataFormat[] = new String[Main.COLLEGEDATA_FORMAT];
                String data;
                
                data = scan.nextLine();
                
                if(data.equals(Main.END_LINE)){
                    Main.college[i].setCollegeCode("END");
                    break;
                }
                
                collegeDataFormat = data.split("/");
    
                Main.college[i].setCollegeCode(collegeDataFormat[0]);
                Main.college[i].setCollegeName(collegeDataFormat[1]);
                        
                i++;
            }
            scan.close();

            
        }
        catch (IOException e){
            
        }
        
        
        
        
        
    }
    
     public static void readProgramData(){
        
        try{
            File programData = new File("src/SIS/Components/Data/ProgramData.csv");
            Scanner scan = new Scanner(programData);
            
            int i = 0;
            while(scan.hasNextLine()){
                
                
                String programDataFormat[] = new String[Main.PROGRAMDATA_FORMAT];
                String data;
                
                data = scan.nextLine();
                
                if(data.equals(Main.END_LINE)){
                    Main.program[i].setProgramCode("END");
                    break;
                }
                
                programDataFormat = data.split("/");
    
                Main.program[i].setProgramCode(programDataFormat[0]);
                Main.program[i].setProgramName(programDataFormat[1]);
                Main.program[i].setCollegeCode(programDataFormat[2]);
                
                i++;
            }
            scan.close();

            
        }
        catch (IOException e){
            
        }
        
        
        
        
        
    }
    
    public static void readStudentData(){
        
        try{
            File studentData = new File("src/SIS/Components/Data/StudentData.csv");
            Scanner scan = new Scanner(studentData);
            
            int i = 0;
            while(scan.hasNextLine()){
                
                
                String studentDataFormat[] = new String[Main.STUDENTDATA_FORMAT];
                String data;
                
                data = scan.nextLine();
                
                if(data.equals(Main.END_LINE)){
                    Main.student[i].setIdNum("END");
                    break;
                }
                
                studentDataFormat = data.split("/");
    
                Main.student[i].setIdNum(studentDataFormat[0]);
                Main.student[i].setFirstName(studentDataFormat[1]);
                Main.student[i].setLastName(studentDataFormat[2]);
                Main.student[i].setYearLevel(studentDataFormat[3]);
                Main.student[i].setGender(studentDataFormat[4]);
                Main.student[i].setProgramCode(studentDataFormat[5]);
                Main.student[i].setProgramName(studentDataFormat[6]);
                Main.student[i].setCollegeCode(studentDataFormat[7]);
                Main.student[i].setCollegeName(studentDataFormat[8]);
                
                i++;
            }
            scan.close();

            
        }
        catch (IOException e){
            
        }
        
        
        
        
        
    }
    
    
    
}
