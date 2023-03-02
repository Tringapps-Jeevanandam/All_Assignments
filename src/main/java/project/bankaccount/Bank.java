package project.bankaccount;
import java.util.*;
import java.util.logging.Logger;

public class Bank{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    private Bank(){
        Log.info("Simple Bank Account");
    }

    public static void bank() {
    BankAcc bk = new BankAcc();
    int ch;
    boolean flag = true;
    Scanner so = new Scanner(System.in);
    while(flag){
    try{

    Log.info("Enter Your choice \n 1.deposit\n 2.Withdraw\n 3.View Balance\n 4.exit");
    ch = so.nextInt();
    switch(ch){
        case 1: bk.deposit();break;
        case 2: bk.withdraw();break;
        case 3: bk.display();break;
        case 4: flag = false;break;
        default: flag=false; break;     
        }
       }
       catch(InputMismatchException e){
        String exp = "Exception:"+ e;
        Log.info(exp);
        so.nextLine();
    }
    }  
}
}
