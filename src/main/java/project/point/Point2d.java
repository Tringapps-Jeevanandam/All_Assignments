package project.point;

import java.util.*;
import java.util.logging.Logger;
public class Point2d {
   public static final Logger Log = Logger.getLogger("InfoLogging");
   public static void pointmain()  {
       float x1;
       float x2;
       float y1;
       float y2;
       Scanner sc = new Scanner(System.in);
       try{
            Log.info("Enter x1 and y1:");
                x1 = sc.nextFloat();
                y1 = sc.nextFloat();
            Log.info("Enter x2 and y2:");
                x2 = sc.nextFloat();
                y2 = sc.nextFloat();
            sc.close();
            
            Point obj1 = new Point(x1, x2, y1, y2);
            String cmpr = "Point equals Point2: "+obj1.equals();
            Log.info(cmpr);
            Point obj2 = new Point(obj1);
            String op1 = "Original Point (x1,y1) "+obj1.x1+" "+obj1.y1+" (x2,y2) "+obj1.x2+" "+obj1.y2;
            String op2 = "After Cloning (x1 ,y1) "+obj2.x1+" "+obj2.y1+" (x2,y2) "+obj2.x2+" "+obj2.y2;
            Log.info(op1);
            Log.info(op2);
        } 
        catch(Exception e){
            String exp = "Exception:"+e;
            Log.info(exp);
            sc.nextLine();

        }
}  

   
}