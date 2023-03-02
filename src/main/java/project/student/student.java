package project.student;


public class STUDENT {
    String name;
    int age;
    double gpa;

    student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    protected void setName(String name){
        this.name = name;
    }
    protected void setAge(int age){
        this.age = age;
    }
    protected void setGpa(double gpa){
        this.gpa = gpa;
    }
    
    protected String getName(){
        return name;
    }
    protected String getAge(){
        return Integer.toString(age);
    }
    protected String getGpa(){
        return Double.toString(gpa);
    }
}
