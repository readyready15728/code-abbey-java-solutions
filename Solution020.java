import java.io.*;
import java.util.*;

public class Solution020 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data020.txt");
    List<Integer> output = new ArrayList<Integer>();

    input.remove(0);
    
    for (String row : input) {
      int sum = 0;
      char charAtIndex;

      for (int i = 0; i < row.length(); i++) {
        charAtIndex = row.charAt(i);

        switch (charAtIndex) {
          case 'a':
            sum++;
            break;
          case 'e':
            sum++;
            break;
          case 'i':
            sum++;
            break;
          case 'o':
            sum++;
            break;
          case 'u':
            sum++;
            break;
          case 'y':
            sum++;
            break;
        }
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
