package project.hashtree;

import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.Comparator;

public class TREE{
    public static final Logger Log = Logger.getLogger("InfoLogging");
  protected void tree() {
    TreeSet<String> names = new TreeSet<>();

    names.add("Vivin");
    names.add("Arun");
    names.add("Jeeva");
    names.add("Jerry");
    names.add("Bala");

    String tree ="TreeSet" + names;
    Log.info(tree);  
    TreeSet<String> sortedNames = new TreeSet<>(new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s2.compareTo(s1);
      }
    });
    sortedNames.addAll(names);
    String stree = "Sorted TreeSet(descending order): " + sortedNames;
    Log.info(stree);  
    stree ="Contains Jerry " + names.contains("Jerry");
    Log.info(stree);
    names.remove("Bala");
    stree = "TreeSet after removing Bala: " + names;
    Log.info(stree);  
    stree = "First element: " + names.first();
    Log.info(stree); 
    stree = "Last element: " + names.last();
    Log.info(stree);  
    String size = "Size: " + names.size();
    Log.info(size);  
    names.clear();
    size = "Size: " + names.size();
    Log.info(size);
  }
}

