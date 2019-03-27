import java.io.*;
import java.util.*;

public class Solution013 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data013.txt");
    List<Integer> output = new ArrayList<Integer>();

    input.remove(0);

    for (String textInteger : input.get(0).split(" ")) {
      int anInteger = Integer.parseInt(textInteger);
      int sum = 0, remainder = 0;
      List<Integer> digits = new ArrayList<Integer>();

      while (anInteger > 0) {
        remainder = anInteger % 10;
        digits.add(0, remainder);
        anInteger /= 10;
      }

      for (int i = 0; i < digits.size(); i++) {
        sum += (i + 1) * digits.get(i);
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
