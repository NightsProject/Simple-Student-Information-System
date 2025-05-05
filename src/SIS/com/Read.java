
package SIS.com;

import SIS.Main;
import SIS.com.objects.College;
import SIS.com.objects.Program;
import SIS.com.objects.Student;
import java.io.*;
import java.util.*;

public class Read {
    
    public static void readDataCsv(){
        readCollegeData();
        readProgramData();
        readStudentData();
        readYearLevel();
        readYear();
    }
    public static void readCollegeData(){
        
        try{
            File collegeData = new File(Main.collegeDataFilePath);
            Scanner scan = new Scanner(collegeData);
            
          
            while(scan.hasNextLine()){
                
                
                String collegeDataFormat[] = new String[Main.COLLEGEDATA_FORMAT];
                String data;
                
                data = scan.nextLine();
                
                if(data.equals(Main.END_LINE)){
                    Main.collegeData.add(new College("END"));
                    break;
                }
                
                collegeDataFormat = data.split(",");
                Main.collegeData.add(new College(collegeDataFormat[0], collegeDataFormat[1]));
                
                
            }
            scan.close();

            
        }
        catch (IOException e){
            
        }
        
        
        
        
        
    }
    
     public static void readProgramData(){
        
        try{
            File programData = new File(Main.programDataFilePath);
            Scanner scan = new Scanner(programData);
            
           
            while(scan.hasNextLine()){
                
                
                String programDataFormat[] = new String[Main.PROGRAMDATA_FORMAT];
                String data;
                
                data = scan.nextLine();
                
                if(data.equals(Main.END_LINE)){
                    Main.programData.add(new Program(Main.END));
                    break;
                }
                
                programDataFormat = data.split(",");
    
                Main.programData.add(new Program(programDataFormat[0], programDataFormat[1], programDataFormat[2]));
              
            }
            scan.close();

            
        }
        catch (IOException e){
            
        }
        
        
        
        
        
    }
    
    public static void readStudentData(){
        
        try{
            File studentData = new File(Main.studentDataFilePath);
            Scanner scan = new Scanner(studentData);
            
   
            while(scan.hasNextLine()){
                
                
                String studentDataFormat[] = new String[Main.STUDENTDATA_FORMAT];
                String data;
                
                data = scan.nextLine();
                
                if(data.equals(Main.END_LINE)){
                    Main.studentData.add(new Student(Main.END));
                    break;
                }
                
                studentDataFormat = data.split(",");
                Main.studentData.add(new Student(studentDataFormat[0], studentDataFormat[1], studentDataFormat[2], studentDataFormat[3], studentDataFormat[4], studentDataFormat[5]));

             
            }
            scan.close();

            
        }
        catch (IOException e){
            
        }
        
        
        
        
        
    }
    
    public static void readYearLevel(){
        
        try{
            
            File yearLevelData = new File(Main.yearLevelDataFilePath);
            Scanner scan = new Scanner(yearLevelData);
            
            int count = 0;
            while(scan.hasNextLine()){
                
                Main.YearLevel[count] = scan.nextLine();
                count++;
                
            }
            Main.YearLevel[count + 1] = Main.END;
            
            scan.close();
        }catch(IOException e){
            
        }
        
    }
    
    public static void readYear(){
        
        try{
            
            File yearData = new File("src/SIS/com/data/Year.csv");
            Scanner scan = new Scanner(yearData);
            
            int count = 0;
            while(scan.hasNextLine()){
                
                Main.Years[count] = scan.nextLine();
                count++;
                
            }
            scan.close();
            
        }catch(IOException e){
            
        }
        
    }
    
}
