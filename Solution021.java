import java.io.*;
import java.util.*;

public class Solution021 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data021.txt");
    int maxValue = Integer.parseInt(input.get(0).split(" ")[1]);
    int[] count = new int[maxValue + 1];

    input.remove(0);
    
    for (String textInteger : input.get(0).split(" ")) {
      int converted = Integer.parseInt(textInteger);

      count[converted]++;
    }

    for (int i = 1; i < count.length; i++) {
      System.out.print(count[i]);

      if (i != count.length - 1) {
        System.out.print(' ');
      }
    }

    System.out.println();
  }
}
