import structure5.*;
import java.util.Random;

public class Table {

  /*
  Table should also be simple:
  give it a "aa" and char that follows. and add it.
  and make frequency list pair.
  method to give a letter back in the case of a 2 letter string.
  Add and get.
  */

  private Vector<Association<String, FrequencyList>> duos;

  public Table() {
    duos = new Vector<Association<String, FrequencyList>>();
  }

  public void add(String add, String follows) {
    Association<String, FrequencyList> toAdd =
        new Association<String, FrequencyList> (add, null);
    int index = duos.indexOf(toAdd);
    if (index == -1) {
      FrequencyList beginner = new FrequencyList();
      beginner.add(follows);
      toAdd.setValue(beginner);
      duos.add(toAdd);
      return;
    }

    duos.get(index).getValue().add(follows);
  }

  //Uses randomized number and the frequency list to return a random string.
  public String findRandomLetter(String called) {
    Association<String, FrequencyList> temp =
      new Association<String, FrequencyList> (called, null);
    int index = duos.indexOf(temp);

    if (index == -1) return "";

    return duos.get(index).getValue().getRandom();
  }

  public static void main(String args[]) {

    Table table = new Table();
    String s = "abcdefghi ac ad af af ";
    String q = "bcd";

    for (int i = 0; i < s.length() - 1; i ++) {
      char p = s.charAt(i);
      String a = Character.toString(p);
      String b = Character.toString(s.charAt(i + 1));
      table.add(a, b);
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(table.findRandomLetter(" "));
        System.out.println(table.findRandomLetter("f"));
    }

  }

}
