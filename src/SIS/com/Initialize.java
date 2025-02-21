
package SIS.com;

import SIS.Main;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nights
 */
public class Initialize {
    
    public static void readyFiles(){
        
        readyCollegeDataCsv();
        readyProgramDataCsv();
        readyStudentDataCsv();
        readyYearLevelCsv();
        
    }
    
    public static void readyCollegeDataCsv(){
        
        try{
            
            File collegeData = new File("CollegeData.csv");
            Main.collegeDataFilePath = collegeData.getAbsolutePath();
            
            FileWriter write = new FileWriter(collegeData, true);
            Scanner scan = new Scanner(collegeData);
            
            int count = 0;
            while (scan.hasNextLine()) {
                count++;
                break;
            }
        
            if (collegeData.exists() && count == 0) {
                write.write(Main.END_LINE);
            }
        
            
        write.close();
        scan.close();
                
       
            
        } catch (IOException e){
            
        }
        
    }
    
    public static void readyProgramDataCsv(){
        
         try{
            
            File programData = new File("ProgramData.csv");
            Main.programDataFilePath = programData.getAbsolutePath();
            
            FileWriter write = new FileWriter(programData, true);
            Scanner scan = new Scanner(programData);
            
            int count = 0;
            while (scan.hasNextLine()) {
                count++;
                break;
            }
        
            
            if(programData.exists() && count == 0){
                write.write(Main.END_LINE);
                write.close();
            }
   
            
        } catch (IOException e){
            
        }
    }
    
    public static void readyStudentDataCsv(){
        
        try{
            
            File studentData = new File("StudentData.csv");
            Main.studentDataFilePath = studentData.getAbsolutePath();
            
            FileWriter write = new FileWriter(studentData, true);
            Scanner scan = new Scanner(studentData);
            
            int count = 0;
            while (scan.hasNextLine()) {
                count++;
                break;
            }
            if(studentData.exists() && count == 0){
                write.write(Main.END_LINE);
                write.close();
            }
   
            
        } catch (IOException e){
            
        }
    }
    
    public static void readyYearLevelCsv(){
        
          try{
            
            File yearLevel = new File("YearLevelData.csv");
            Main.yearLevelDataFilePath = yearLevel.getAbsolutePath();
            
            FileWriter write = new FileWriter(yearLevel, true);
            Scanner scan = new Scanner(yearLevel);
            
            int count = 0;
            while (scan.hasNextLine()) {
                count++;
                break;
            }
            
            if(yearLevel.exists() && count == 0){
                write.write("First Year \n");
                write.write("Second Year \n");
                write.write("Third Year \n");
                write.write("Fourth Year \n");
                write.write("Fifth Year \n");
                write.write("Sixth Year \n");
                write.close();
            }
   
            
        } catch (IOException e){
            
        }
      
    }
}
