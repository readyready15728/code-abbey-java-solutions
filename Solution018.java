import java.io.*;
import java.util.*;

public class Solution018 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data018.txt");
    List<Float> output = new ArrayList<Float>();

    input.remove(0);
    
    for (String row : input) {
      String[] textIntegers = row.split(" ");

      int x = Integer.parseInt(textIntegers[0]);
      int n = Integer.parseInt(textIntegers[1]);
      float r = 1;

      for (int i = 0; i < n; i++) {
        r = (r + (float) x / r) / 2;
      }

      output.add(r);
    }

    for (int i = 0; i < output.size(); i++) {
      System.out.print(output.get(i));

      if (i != output.size() - 1) {
        System.out.print(' ');
      }
    }

    System.out.println();
  }
}
