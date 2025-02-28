
package SIS.com;


import java.io.*;
import SIS.Main;

public class Write {
    
    public static void writeCollege(){
        
        try{

            boolean append = false;
            int indicator;
            int count;

            File collegeData = new File(Main.collegeDataFilePath);
            FileWriter write = new FileWriter(collegeData, append);

            count = 0;
            indicator = 0;

            while(indicator < Main.collegeData.size()){
                
                indicator++;
                if(Main.END.equals(Main.collegeData.get(count).getCollegeCode())){
                    break;
                } 
                

                if(indicator == 1){
                        append = true;
                        write.close();
                        write = new FileWriter(collegeData, append);
                }
                
              write.write(Main.collegeData.get(count).collegeData() + "\n");
                count++;
            }
            
            write.write(Main.END_LINE);
            write.close();
        }
        catch(IOException e){
            
        }

   }
    
    public static void writeProgram(){
        
        try{

            boolean append = false;
            int indicator;
            int count;

            File programData = new File(Main.programDataFilePath);
            FileWriter write = new FileWriter(programData, append);

            count = 0;
            indicator = 0;

            while(indicator < Main.programData.size()){
                
                indicator++;
                if(Main.END.equals(Main.programData.get(count).getProgramCode())){
                    break;
                } 
                

                if(indicator == 1){
                        append = true;
                        write.close();
                        write = new FileWriter(programData, append);
                }
                
              write.write(Main.programData.get(count).programData() + "\n");
                count++;
            }
            
            write.write(Main.END_LINE);
            write.close();
        }
        catch(IOException e){
            
        }

   }
    
     public static void writeStudent(){
        
        try{

            boolean append = false;
            int indicator;
            int count;

            File studentData = new File(Main.studentDataFilePath);
            FileWriter write = new FileWriter(studentData, append);

            count = 0;
            indicator = 0;
            
            while(indicator < Main.studentData.size()){
                
                indicator++;
                if(Main.END.equals(Main.studentData.get(count).getIdNum())){
                    break;
                } 
                

                if(indicator == 1){
                        append = true;
                        write.close();
                        write = new FileWriter(studentData, append);
                }
                
              write.write(Main.studentData.get(count).studentData() + "\n");
                count++;
            }
            
            write.write(Main.END_LINE);
            write.close();
        }
        catch(IOException e){
            
        }

   }
}