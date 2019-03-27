import java.io.*;
import java.util.*;

public class Solution010 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data010.txt");
    List<String> output = new ArrayList<String>();

    input.remove(0);

    for (String row : input) {
      String[] textIntegers = row.split(" ");
      int x1 = Integer.parseInt(textIntegers[0]);
      int y1 = Integer.parseInt(textIntegers[1]);
      int x2 = Integer.parseInt(textIntegers[2]);
      int y2 = Integer.parseInt(textIntegers[3]);

      int m = (y2 - y1) / (x2 - x1);
      int b = y1 - m * x1;

      output.add(String.format("(%d %d)", m, b));
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
