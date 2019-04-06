import java.io.*;
import java.util.*;

public class Solution025 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data025.txt");
    List<Integer> output = new ArrayList<Integer>();

    input.remove(0);

    for (String row : input) {
      String[] textIntegers = row.split(" ");

      int a = Integer.parseInt(textIntegers[0]);
      int c = Integer.parseInt(textIntegers[1]);
      int m = Integer.parseInt(textIntegers[2]);
      int x0 = Integer.parseInt(textIntegers[3]);
      int n = Integer.parseInt(textIntegers[4]);

      int xN = x0;

      for (int i = 0; i < n; i++) {
        xN = (a * xN + c) % m;
      }

      output.add(xN);
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
