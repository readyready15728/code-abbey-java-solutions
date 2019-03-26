import java.io.*;

public class Solution001 {
  public static void main(String[] args) throws IOException {
    String input = Common.getFileAsString("test-data001.txt");
    int sum = 0;

    for (String str : input.split(" ")) {
      sum += Integer.parseInt(str.strip());
    }

    System.out.println(sum);
  }
}
