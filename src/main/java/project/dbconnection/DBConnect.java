package project.dbconnection;

import java.util.logging.Logger;
public class DBConnect {
    public static final Logger Log = Logger.getLogger("InfoLogging");
    static int flag = 0;
    static DBConnect con = null;
    private DBConnect(){

    }

     protected static DBConnect getInstance(){
        if(con == null){
            con = new DBConnect();
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

