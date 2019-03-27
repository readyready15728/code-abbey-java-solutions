import java.io.*;
import java.util.*;

public class Solution008 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data008.txt");
    List<Integer> output = new ArrayList<Integer>();

    input.remove(0);

    for (String row : input) {
      String[] textIntegers = row.split(" ");
      int a = Integer.parseInt(textIntegers[0]);
      int b = Integer.parseInt(textIntegers[1]);
      int n = Integer.parseInt(textIntegers[2]);
      int sum = a;

      for (int i = 1; i < n; i++) {
        sum += a + i * b;
      }

      output.add(sum);
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
