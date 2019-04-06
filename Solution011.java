import java.io.*;
import java.util.*;

public class Solution011 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data011.txt");
    List<Integer> output = new ArrayList<>();

    input.remove(0);

    for (String row : input) {
      String[] textIntegers = row.split(" ");
      int a = Integer.parseInt(textIntegers[0]);
      int b = Integer.parseInt(textIntegers[1]);
      int c = Integer.parseInt(textIntegers[2]);

      int result = a * b + c;
      int sum = 0, remainder = 0;

      while (result > 0) {
        remainder = result % 10;
        sum += remainder;
        result /= 10;
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
