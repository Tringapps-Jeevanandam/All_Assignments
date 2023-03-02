package project.shape;

import java.util.*;
import java.util.logging.Logger;
public class Shape{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    private Shape(){
        Log.info("Area and perimeter of Shapes");
    }
    public static void shap() {
        int choice;
        String shapeName;
        double r;
        double len;
        double wid;
        double s1;
        double s2;
        double s3;
        String temp;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            try{
            Log.info("1.Circle\n2.Rectangle\n3.Triangle\n4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:{
                    Log.info("Enter Radius:");
                    r = sc.nextDouble();
                    shapeName = "Circle";
                    Shape2 sh = new Shape2(shapeName, r);
                    temp = "Area of Circle: "+sh.area(r);
                    Log.info(temp);
                    temp = "Perimeter of Circle: "+sh.perimeter(r);
                  Log.info(temp);

                }break;
                case 2:{
                	Log.info("Enter Length and Width:");
                	len = sc.nextDouble();
                	wid = sc.nextDouble();
                	shapeName = "Rectangle";
                	Shape2 sh = new Shape2(shapeName, len,wid);
                    temp = "Area of Rectangle: "+sh.area(len, wid);
                	Log.info(temp);
                    temp ="Perimeter of Rectangle: "+sh.perimeter(len, wid);
                	Log.info(temp);

                }break;
                case 3:{
                	Log.info("Enter Three sides of the triangle:");
                	s1 = sc.nextDouble();
                	s2 = sc.nextDouble();
                	s3 = sc.nextDouble();
                	shapeName = "Triangle";
                	Shape2 sh = new Shape2(shapeName,s1,s2,s3);
                    temp ="Area of Triangle:"+sh.area(s1,s2,s3);
                	Log.info(temp);
                    temp = "Perimeter of Triangle: "+sh.perimeter(s1,s2,s3);
                	Log.info(temp);
                	
                }break;
                case 4: flag = false; break;
            
                default:Log.info("***Enter right choice***");
                    break;
                   
            }
        }
        catch(Exception e){
            String exp = "Exception:"+ e;
            Log.info(exp);
            sc.nextLine();
        }
            
        }
    }
}

