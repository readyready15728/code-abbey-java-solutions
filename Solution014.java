import java.io.*;
import java.util.*;

public class Solution014 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data014.txt");

    int initialValue = Integer.parseInt(input.get(0));

    List<Character> operators = new ArrayList<>();
    List<Integer> operands = new ArrayList<>();

    for (int i = 1; i < input.size() - 1; i++) {
      String[] operation = input.get(i).split(" ");
      
      operators.add(operation[0].charAt(0));
      operands.add(Integer.parseInt(operation[1]));
    }

    String[] moduloOperation = input.get(input.size() - 1).split(" ");
    int modulus = Integer.parseInt(moduloOperation[1]);

    int sum = initialValue;
    
    for (int i = 0; i < operators.size(); i++) {
      switch (operators.get(i)) {
        case '+':
          sum += operands.get(i);
          sum %= modulus;
          break;
        case '*':
          sum *= operands.get(i);
          sum %= modulus;
          break;
      }
    }

    System.out.println(sum);
  }
}
