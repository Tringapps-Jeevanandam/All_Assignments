package project.main;
import project.bankaccount.Bank;
import project.collections.Collections;
import project.contacts.ContactMain;
import project.creditcard.CreditCard;
import project.dbconnection.database;
import project.files.files;
import project.hashtree.hashtree;
import project.point.Point2d;
import project.school.School;
import project.shape.Shape;
import project.simplecalc.SimpleCalc;
import project.student.STUD;
import project.tictactoe.TicTacToe;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final Logger Log = Logger.getLogger("infoLogging");
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        do{
            try{
            Log.info("1.Bank Account\t2.Shape\t\t3.Credit Card\t4.DB connnection\n5.Points\t6.Student GPA\t7.SimpleCalc\t8.File reading\n9.Collections\t10.Contacts\t11.Hashset,Map,Treeseet\t12.School\n13.TicTacToe\t14.Exit");
            Log.info("------Enter Your Choice------");
            int choice = input.nextInt();
            switch(choice){
                case 1:Bank.bank(); break;
                case 2:Shape.shap(); break;
                case 3:CreditCard.credit(); break;
                case 4:database.db(); break;
                case 5:Point2d.pointmain(); break;
                case 6:STUD.stud(); break;
                case 7:SimpleCalc.calc(); break;
                case 8:files.file(); break;
                case 9:Collections.collections(); break;
                case 10:ContactMain.contacts(); break;
                case 11:hashtree.ds(); break;
                case 12:School.schl(); break;
                case 13:TicTacToe.ttt(); break;
                case 14:flag=false;break;
                default: Log.info("***Enter Correct choice***");break;
            }


            }
            catch(Exception e){
                String exp = "Exception:"+e;
                Log.info(exp);
                
            }
        }while(flag);

    }
    
}
