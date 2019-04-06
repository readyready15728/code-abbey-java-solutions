import java.io.*;
import java.util.*;

public class Solution027 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data027.txt");
    List<Integer> output = new ArrayList<Integer>();
    int n = Integer.parseInt(input.get(0));
    int[] a = new int[n];
    String[] textIntegers = input.get(1).split(" ");

    for (int i = 0; i < a.length; i++) {
      a[i] = Integer.parseInt(textIntegers[i]);
    }

    int passes = 0;
    int totalSwaps = 0;

doneHere:
    for (int i = 0; i < n - 1; i++) {
      int swaps = 0;
      int temp;

      for (int j = 0; j < n - 1 - i; j++) {
        if (a[j] > a[j + 1]) {
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;

          swaps++;
        }
      }

      passes++;
      totalSwaps += swaps;

      if (swaps == 0) {
        break doneHere;
      }
    }

    output.add(passes);
    output.add(totalSwaps);

    for (int i = 0; i < output.size(); i++) {
      System.out.print(output.get(i));

      if (i != output.size() - 1) {
        System.out.print(' ');
      }
    }

    System.out.println();
  }
}
