import java.io.*;

public class Solution015 {
  public static void main(String[] args) throws IOException {
    String input = Common.getFileAsString("test-data015.txt");
    String[] textIntegers = input.split(" ");

    int maximum = Integer.MIN_VALUE;
    int minimum = Integer.MAX_VALUE;

    for (String textNumber : textIntegers) {
      int converted = Integer.parseInt(textNumber);

      if (converted > maximum) {
        maximum = converted;
      }

      if (converted < minimum) {
        minimum = converted;
      }
    }

    System.out.printf("%d %d\n", maximum, minimum);
  }
}
