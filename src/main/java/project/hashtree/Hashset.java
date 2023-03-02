package project.hashtree;


import java.util.HashSet;
import java.util.logging.Logger;


public class Hashset {
    public static final Logger Log = Logger.getLogger("InfoLogging");

    protected void hset() {
        HashSet<BookDetails> set = new HashSet<BookDetails>();
        BookDetails bk1 = new BookDetails("OOps in Java", "Agarwal", 3201);
        BookDetails bk3 = new BookDetails("python", "Jones", 2021);
        BookDetails bk2 = new BookDetails("App Development", "vishwa", 4321);

        set.add(bk1);
        set.add(bk2);
        set.add(bk3);
        String print;

        for (BookDetails s : set) {
            print =s.bookName + " " + s.authorName + " " + s.sno;
            Log.info(print);
        }
        String res = "" + set.remove(bk3);
        Log.info(res);
        for (BookDetails s : set) {
            print =s.bookName + " " + s.authorName + " " + s.sno;
            Log.info(print);
        }
        String size = ""+set.size();
        Log.info(size);
        String s1 = ""+bk2.equals(bk3);
        Log.info(s1);
        String hc = ""+bk1.hashCode();
        Log.info(hc);

    }

}
