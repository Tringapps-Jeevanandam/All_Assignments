package project.student;
import java.util.*;
import java.util.logging.*;

public class StudTest {
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public static void stud() {
        String name;
        int age;
        double gpa;
        int x;
        List<student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try{
        Log.info("How many student details you want to enter:");
        x = sc.nextInt();
        for(int i = 0;i<x;i++){
            Log.info("Enter Student Name, Age, GPA");
            name = sc.next();
            age = sc.nextInt();
            gpa = sc.nextDouble();
            studentList.add(new student(name,age,gpa));
        }
      
        sc.close();
        for(student student:studentList){
            Log.info("Name: " + student.getName());
            Log.info("Age: " + student.getAge());
            Log.info("GPA: " + student.getGpa());
        }

        Collections.sort(studentList, new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                return s2.getGpa().compareTo(s1.getGpa());
            }
        });
        Log.info("After Sorting ");

        for(student student:studentList){
            Log.info("Name: " + student.getName());
            Log.info("GPA: " + student.getGpa());
        }
    }
    catch(InputMismatchException e){
        System.out.println("Exception"+e);
        x= sc.nextInt();
    }
    }
}
