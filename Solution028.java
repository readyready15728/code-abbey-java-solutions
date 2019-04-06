import java.io.*;
import java.util.*;

public class Solution028 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data028.txt");
    List<String> output = new ArrayList<String>();

    input.remove(0);

    for (String row : input) {
      String[] textNumbers = row.split(" ");
      int weight = Integer.parseInt(textNumbers[0]);
      float height = Float.parseFloat(textNumbers[1]);
      float bmi = weight / (float) Math.pow(height, 2);
      String category;

      if (bmi < 18.5) {
        category = "under";
      } else if (bmi < 25) {
        category = "normal";
      } else if (bmi < 30) {
        category = "over";
      } else {
        category = "obese";
      }

      output.add(category);
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
