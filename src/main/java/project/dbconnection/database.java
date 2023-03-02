package project.dbconnection;
import java.util.*;
import java.util.logging.Logger;

public class DataBase {
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void db() {
        Scanner input = new Scanner(System.in);
        boolean flag=true;
        while(flag){
            try{
            DBConnect.getInstance();
            Log.info("1.New Connection\n2.Close Connection\n3.Exit\nEnter choice:");
            int option = input.nextInt();
            switch(option){
                case 1: DBConnect.newconnection(); 
                        break;
                case 2: DBConnect.closeconnection(); 
                        break;
                case 3: flag=false; 
                        break;
                default: Log.info("***Enter correct choice***"); 
                        break;
              }
            }catch(Exception e){
                String exp = "Exception:"+e;
                Log.info(exp);
                input.nextInt();
            }
    
        }
    }
    
}

