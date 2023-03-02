package project.school;
import java.util.*;
import java.util.logging.Logger;
public class SchoolInfo {
    public static final Logger Log = Logger.getLogger("InfoLogging");
    String studName;
    int grade;
    float gpa;
    SchoolInfo(String studname,int grade,float gpa){
        this.studName = studname;
        this.grade = grade;
        this.gpa = gpa;
    }
    protected void updategpa(){
        float newgpa;
        Scanner sc = new Scanner(System.in);
        Log.info("Enter new GPA");
        newgpa = sc.nextFloat();
        this.gpa = newgpa;
        sc.close();
    }
    protected String displayDetails(){
        return this.studName+" has a "+this.gpa+" GPA";
    }
    
}