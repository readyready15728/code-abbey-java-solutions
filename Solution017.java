import java.io.*;
import java.math.*;
import java.util.*;

public class Solution017 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data017.txt");

    input.remove(0);

    BigInteger checksum = new BigInteger(Integer.toString(0));
    BigInteger multiplicand = new BigInteger("113");
    BigInteger modulus = new BigInteger("10000007");

    for (String textInteger : input.get(0).split(" ")) {
      BigInteger converted = new BigInteger(textInteger);
      
      checksum = checksum.add(converted);
      checksum = checksum.multiply(multiplicand);
      checksum = checksum.mod(modulus);
    }

    System.out.println(checksum);
  }
}
