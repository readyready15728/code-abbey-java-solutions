import java.io.*;
import java.util.*;

public class Solution026 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data026.txt");
    List<String> output = new ArrayList<>();

    input.remove(0);

    for (String row : input) {
      String[] textIntegers = row.split(" ");
      int pInitial = Integer.parseInt(textIntegers[0]);
      int qInitial = Integer.parseInt(textIntegers[1]);
      int p = pInitial;
      int q = qInitial;
      int r;

      do {
        r = p % q;
        p = q;
        q = r;
      } while (r != 0);

      output.add(String.format("(%d %d)", p, pInitial * qInitial / p));
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
