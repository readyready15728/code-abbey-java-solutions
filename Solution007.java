import java.io.*;

public class Solution007 {
  public static void main(String[] args) throws IOException {
    String input = Common.getFileAsString("test-data007.txt");
    String[] textIntegers = input.split(" ");

    for (int i = 1; i < textIntegers.length; i++) {
      System.out.print((int) Math.round((((float) Integer.parseInt(textIntegers[i])) - 32) * 5.0 / 9.0));

      if (i != textIntegers.length - 1) {
        System.out.print(' ');
      }
    }

    System.out.println();
  }
}
