import java.io.*;

public class Solution007 {
  public static void main(String[] args) throws IOException {
    String input = Common.getFileAsString("test-data007.txt");
    String[] textNumerals = input.split(" ");

    for (int i = 1; i < textNumerals.length; i++) {
      System.out.print((int) Math.round((((float) Integer.parseInt(textNumerals[i])) - 32) * 5.0 / 9.0));

      if (i != textNumerals.length - 1) {
        System.out.print(' ');
      }
    }

    System.out.println();
  }
}
