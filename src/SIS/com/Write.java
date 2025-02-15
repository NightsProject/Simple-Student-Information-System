
package SIS.com;


import java.io.*;
import SIS.Main;

public class Write {
    
    public static void writeCollege(){
        
        try{

            boolean append = false;
            int indicator;
            int count;

            File collegeData = new File("src/SIS/Components/Data/CollegeData.csv");
            FileWriter write = new FileWriter(collegeData, append);

            count = 0;
            indicator = 0;

            while(indicator < Main.college.length){
                
                indicator++;
                if(Main.END.equals(Main.college[count].getCollegeCode())){
                    break;
                } 
                

                if(indicator == 1){
                        append = true;
                        write.close();
                        write = new FileWriter(collegeData, append);
                }
                
              write.write(Main.college[count].collegeData() + "\n");
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

            File programData = new File("src/SIS/Components/Data/ProgramData.csv");
            FileWriter write = new FileWriter(programData, append);

            count = 0;
            indicator = 0;

            while(indicator < Main.program.length){
                
                indicator++;
                if(Main.END.equals(Main.program[count].getProgramCode())){
                    break;
                } 
                

                if(indicator == 1){
                        append = true;
                        write.close();
                        write = new FileWriter(programData, append);
                }
                
              write.write(Main.program[count].programData() + "\n");
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

            File studentData = new File("src/SIS/Components/Data/StudentData.csv");
            FileWriter write = new FileWriter(studentData, append);

            count = 0;
            indicator = 0;
            
            while(indicator < Main.student.length){
                
                indicator++;
                if(Main.END.equals(Main.student[count].getIdNum())){
                    break;
                } 
                

                if(indicator == 1){
                        append = true;
                        write.close();
                        write = new FileWriter(studentData, append);
                }
                
              write.write(Main.student[count].studentData() + "\n");
                count++;
            }
            
            write.write(Main.END_LINE);
            write.close();
        }
        catch(IOException e){
            
        }

   }
}