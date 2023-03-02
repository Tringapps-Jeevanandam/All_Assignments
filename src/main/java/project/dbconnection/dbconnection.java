package project.dbconnection;

import java.util.logging.Logger;
public class dbconnection {
    public static final Logger Log = Logger.getLogger("InfoLogging");
    static int flag = 0;
    static dbconnection con = null;
    private dbconnection(){

    }

     protected static dbconnection getInstance(){
        if(con == null){
            con = new dbconnection();
        }
        return con;
    }

     protected static void newconnection(){
        flag = 1;
        String str = "Connection created: "+con;
        Log.info(str);

    }

    protected static void closeconnection(){
        con = null;
        flag = 0;
        Log.info("Connection Closed");
    }
}

