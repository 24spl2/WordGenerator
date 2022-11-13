import structure5.*;
import java.util.Scanner;
import structure5.Association;
import structure5.Assert;
import java.util.Random;

public class Wordgen {

  public final static int n = 5;

  //add
  private static void add(String str, Table table) {
    for (int i = 0; i < str.length() - n; i ++) {

      String a = Character.toString(str.charAt(i));
      String b = str.substring(i + 1, i + n);

      table.add(a, b);
    }
  }

  //get
  private static String get(String str, Table build) {
    return build.findRandomLetter(str);
  }


  public static void main(String args[]) {
    Table t = new Table();

    Scanner in = new Scanner(System.in);
    StringBuffer textBuffer = new StringBuffer();
    while (in.hasNextLine()) {
      String line = in.nextLine();
      textBuffer.append(line);
      textBuffer.append("\n");
    }
    String text = textBuffer.toString();

    add(text, t);

    String txt = "";
    String first = get(" ", t);
    int size = 500;
    for (int i = 0; i < size; i ++) {
      txt += Character.toString(first.charAt(0));
      first = get(Character.toString(first.charAt(0)), t);
    }
    System.out.print(txt);

  }
}
