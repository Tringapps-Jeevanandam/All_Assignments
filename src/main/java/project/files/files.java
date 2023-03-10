package project.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FILES{
  public static final Logger Log = Logger.getLogger("InfoLogging");
  private FILES(){
    Log.info("Files reading ");
  }

  public static void file() throws IOException {
    String fileName = "newfile.txt";
    Map<String, Integer> wordCounts = new HashMap<>();

    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] words = line.split("\\s+");
        for (String word : words) {
          word = word.toLowerCase();
          if (!wordCounts.containsKey(word)) {
            wordCounts.put(word, 0);
          }
          wordCounts.put(word, wordCounts.get(word) + 1);
        }
      }
    }

    PriorityQueue<Map.Entry<String, Integer>> wordCountQueue = new PriorityQueue<>(
        new Comparator<Map.Entry<String, Integer>>() {
          @Override
          public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
            return b.getValue() - a.getValue();
          }
        });
    wordCountQueue.addAll(wordCounts.entrySet());

    while (!wordCountQueue.isEmpty()) {
      Map.Entry<String, Integer> entry = wordCountQueue.poll();
      String print = "The word \"" + entry.getKey() + "\" appears " + entry.getValue() + " times.";
      Log.info(print);

    }
  }
}
