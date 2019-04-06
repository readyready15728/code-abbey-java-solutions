import java.io.*;
import java.util.*;

public class Solution016 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data016.txt");
    List<Integer> output = new ArrayList<>();

    input.remove(0);

    for (String row : input) {
      String[] textIntegers = row.split(" ");
      int sum = 0;

      for (String textInteger : textIntegers) {
        sum += Integer.parseInt(textInteger);
      }

      output.add((int) Math.round((float) sum / (textIntegers.length - 1)));
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
