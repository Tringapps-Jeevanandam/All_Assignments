package project.student;
import java.util.*;
import java.util.logging.*;

public class STUD {
    public static final Logger Log = Logger.getLogger("InfoLogging");
    private STUD(){
        Log.info("Sorting Student GPA");
    }
    public static void stud() {
        String name;
        int age;
        double gpa;
        int x;
        List<STUDENT> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try{
        Log.info("How many student details you want to enter:");
        x = sc.nextInt();
        for(int i = 0;i<x;i++){
            Log.info("Enter Student Name, Age, GPA");
            name = sc.next();
            age = sc.nextInt();
            gpa = sc.nextDouble();
            studentList.add(new STUDENT(name,age,gpa));
        }
      
        sc.close();
        for(STUDENT student:studentList){
            Log.info("Name: " + student.getName());
            Log.info("Age: " + student.getAge());
            Log.info("GPA: " + student.getGpa());
        }

        Collections.sort(studentList, new Comparator<STUDENT>() {
            @Override
            public int compare(STUDENT s1, STUDENT s2) {
                return s2.getGpa().compareTo(s1.getGpa());
            }
        });
        Log.info("After Sorting ");

        for(STUDENT student:studentList){
            Log.info("Name: " + student.getName());
            Log.info("GPA: " + student.getGpa());
        }
    }
    catch(InputMismatchException e){
        String exp="Exception"+e;
        Log.info(exp);
        x= sc.nextInt();
    }
    }
}
