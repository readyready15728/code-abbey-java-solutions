import java.io.*;
import java.nio.file.*;
import java.util.*;

class Common {
  public static String getFileAsString(String filename) throws IOException {
    return new String(Files.readAllBytes(Paths.get(filename))).strip();
  }

  public static List<String> getFileAsLines(String filename) throws IOException {
    return Files.readAllLines(Paths.get(filename));
  }
}
