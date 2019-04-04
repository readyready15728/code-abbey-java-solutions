import java.io.*;
import java.util.*;

public class Solution019 {
  public static void main(String[] args) throws IOException {
    List<String> input = Common.getFileAsLines("test-data019.txt");
    List<Integer> output = new ArrayList<Integer>();

    input.remove(0);
    
    for (String expression : input) {
      Deque<Character> stack = new ArrayDeque<Character>();
      boolean expressionIsLegitimate = true;

doneHere:
      for (int i = 0; i < expression.length(); i++) {
        char currentCharacter = expression.charAt(i);

        switch (currentCharacter) {
          case '(':
            stack.push(currentCharacter);
            break;
          case '[':
            stack.push(currentCharacter);
            break;
          case '{':
            stack.push(currentCharacter);
            break;
          case '<':
            stack.push(currentCharacter);
            break;
          case ')':
            try {
              if (stack.peek() != '(') {
                break doneHere;
              }

              stack.pop();
            } catch (NullPointerException e) {
                expressionIsLegitimate = false;
                break doneHere;
            }

            break;
          case ']':
            try {
              if (stack.peek() != '[') {
                break doneHere;
              }

              stack.pop();
            } catch (NullPointerException e) {
              expressionIsLegitimate = false;
              break doneHere;
            }

            break;
          case '}':
            try {
              if (stack.peek() != '{') {
                break doneHere;
              }

              stack.pop();
            } catch (NullPointerException e) {
              expressionIsLegitimate = false;
              break doneHere;
            }

            break;
          case '>':
            try {
              if (stack.peek() != '<') {
                break doneHere;
              }

              stack.pop();
            } catch (NullPointerException e) {
              expressionIsLegitimate = false;
              break doneHere;
            }

            break;
        }
      }

      if (!expressionIsLegitimate) {
        output.add(0);
      } else {
        if (stack.isEmpty()) {
          output.add(1);
        } else {
          output.add(0);
        }
      }
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
