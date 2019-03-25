import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Common {
  public static String getFileAsString(String filename) throws IOException {
    return new String(Files.readAllBytes(Paths.get(filename)));
  }

  public static List<String> getFileAsLines(String filename) throws IOException {
    return Files.readAllLines(Paths.get(filename));
  }
}
