import java.io.*;
import java.util.*;

public class Solution004 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data004.txt");
    List<Integer> output = new ArrayList<>();

    input.remove(0);

    for (String row : input) {
      String[] textIntegers = row.split(" ");
      int a = Integer.parseInt(textIntegers[0]);
      int b = Integer.parseInt(textIntegers[1]);

      output.add(Math.min(a, b));
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
