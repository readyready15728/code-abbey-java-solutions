import java.io.*;
import java.util.*;

public class Solution003 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data003.txt");
    List<Integer> output = new ArrayList<>();

    input.remove(0);

    for (String row : input) {
      int sum = 0;

      for (String str : row.split(" ")) {
        sum += Integer.parseInt(str.strip());
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
