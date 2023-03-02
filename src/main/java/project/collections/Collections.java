package project.collections;

import java.util.Scanner;
import java.util.logging.*;

public class Collections 
{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void collections()
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        boolean temp =true;
        while(temp){
            Log.info("1.ArrayList 2.Array 3.Exit");
            ch = sc.nextInt();
            switch(ch){
                case 1: {
                    ARR a = new ARR();
                    a.arrli();
                    break;
                }
                case 2:{
                    StackArr sa = new StackArr();
                    sa.satckarr();
                    break;
                }
                case 3: temp = false;break;
                default: break;
            }

        }
    }
}
