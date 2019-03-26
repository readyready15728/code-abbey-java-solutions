import java.util.*;

public class Solution002 {
  public static void main(String[] args) {
    List<String> input = Common.getFileAsLines("test-data002.txt");
    int sum = 0;

    for (String str : input.get(1).split(" ")) {
      sum += Integer.parseInt(str.strip());
    }

    System.out.println(sum);
  }
}
