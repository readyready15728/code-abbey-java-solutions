import java.io.*;
import java.util.*;

public class Solution012 {
  private static int secondsInADay = 60 * 60 * 24;
  private static int secondsInAnHour = 60 * 60;
  private static int secondsInAMinute = 60;

  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data012.txt");
    List<String> output = new ArrayList<>();

    input.remove(0);

    for (String row : input) {
      String[] textIntegers = row.split(" ");
      int day1 = Integer.parseInt(textIntegers[0]);
      int hour1 = Integer.parseInt(textIntegers[1]);
      int minute1 = Integer.parseInt(textIntegers[2]);
      int second1 = Integer.parseInt(textIntegers[3]);
      int day2 = Integer.parseInt(textIntegers[4]);
      int hour2 = Integer.parseInt(textIntegers[5]);
      int minute2 = Integer.parseInt(textIntegers[6]);
      int second2 = Integer.parseInt(textIntegers[7]);

      int totalSeconds1 = 0, totalSeconds2 = 0;

      totalSeconds1 += day1 * secondsInADay + hour1 * secondsInAnHour + minute1 * secondsInAMinute + second1;
      totalSeconds2 += day2 * secondsInADay + hour2 * secondsInAnHour + minute2 * secondsInAMinute + second2;

      int totalSecondsElapsed = totalSeconds2 - totalSeconds1;

      int daysElapsed = 0, hoursElapsed = 0, minutesElapsed = 0, secondsElapsed = 0;

      daysElapsed = totalSecondsElapsed / secondsInADay; totalSecondsElapsed %= secondsInADay;
      hoursElapsed = totalSecondsElapsed / secondsInAnHour; totalSecondsElapsed %= secondsInAnHour;
      minutesElapsed = totalSecondsElapsed / secondsInAMinute; totalSecondsElapsed %= secondsInAMinute;
      secondsElapsed = totalSecondsElapsed;

      output.add(String.format("(%d %d %d %d)", daysElapsed, hoursElapsed, minutesElapsed, secondsElapsed));
    }

    for (int i = 0; i < output.size(); i++) {
      System.out.print(output.get(i));

      if (i != output.size() - 1) {
        System.out.print(' ');
      }
    }

    System.out.println();
  }
}
