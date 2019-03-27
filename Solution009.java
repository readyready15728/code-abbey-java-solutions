import java.io.*;
import java.util.*;

public class Solution009 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data009.txt");
    List<Integer> output = new ArrayList<Integer>();

    input.remove(0);

    for (String row : input) {
      String[] textIntegers = row.split(" ");
      int a = Integer.parseInt(textIntegers[0]);
      int b = Integer.parseInt(textIntegers[1]);
      int c = Integer.parseInt(textIntegers[2]);

      if (a + b >= c && a + c >= b && b + c >= a) {
        output.add(1);
      } else {
        output.add(0);
      }
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
