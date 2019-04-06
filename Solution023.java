import java.io.*;
import java.math.*;
import java.util.*;

public class Solution023 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data023.txt");
    List<Integer> integers = new ArrayList<>();
    List<Integer> output = new ArrayList<>();
    int swaps = 0;

    for (String textInteger : input.get(0).split(" ")) {
      integers.add(Integer.parseInt(textInteger));
    }

    for (int i = 0; i < integers.size() - 2; i++) {
      if (integers.get(i + 1) < integers.get(i)) {
        int temp = integers.get(i + 1);
        
        integers.set(i + 1, integers.get(i));
        integers.set(i, temp);

        swaps++;
      }
    }

    output.add(swaps);
    
    BigInteger checksum = new BigInteger(Integer.toString(0));
    BigInteger multiplicand = new BigInteger("113");
    BigInteger modulus = new BigInteger("10000007");

    for (int i = 0; i < integers.size() - 1; i++) {
      BigInteger converted = new BigInteger(String.valueOf(integers.get(i)));
      
      checksum = checksum.add(converted);
      checksum = checksum.multiply(multiplicand);
      checksum = checksum.mod(modulus);
    }

    output.add(checksum.intValue());

    for (int i = 0; i < output.size(); i++) {
      System.out.print(output.get(i));

      if (i != output.size() - 1) {
        System.out.print(' ');
      }
    }

    System.out.println();
  }
}
