
import structure5.*;
import java.util.Random;
//import java.util.*;

public class FrequencyList {

  private Vector<Association<String, Integer>> frequencyList;
  private int numOfStrings = 0;

  public FrequencyList() {
    frequencyList = new Vector<Association<String, Integer>>();
  }

  public void add(String str) {
    numOfStrings++;
    Association<String, Integer> temp = new Association<String, Integer> (str, 1);
    int index = frequencyList.indexOf(temp);

    if (index == -1) {
      frequencyList.add(temp);
    } else {
      temp = frequencyList.get(index);
      temp.setValue(temp.getValue() + 1);
    }
  }

  public String getRandom() {
    Random rng = new Random();
    int pick = rng.nextInt(numOfStrings);
    for (int i = 0; i < frequencyList.size(); i++) {
      Association<String, Integer> current = frequencyList.get(i);
      pick = pick - current.getValue();
      if (pick < 1) {
        return current.getKey();
      }
    }
    return "";
  }

//This class works.
  public static void main(String args[]) {

    FrequencyList t = new FrequencyList();
    t.add("o");
    t.add("t");
    t.add("t");
    t.add("t");
    t.add("t");

    t.add("p");
    t.add("a");
    t.add("s");
    t.add("s");
    t.add("s");


    System.out.println(t.getRandom());
    System.out.println(t.getRandom());
    System.out.println(t.getRandom());
    System.out.println(t.getRandom());
    System.out.println(t.getRandom());
    System.out.println(t.getRandom());
    System.out.println(t.getRandom());
    System.out.println(t.getRandom());

  }

  /*

  only need 2 methods. give "string" updates automatically.
  give me a letter. make sure the frequency is relative.

  Word gen should not have to use frequencylist.

  Table should also be simple:
  give it a "aa" and char that follows. and add it.
  and make frequency list pair.
  method to give a letter back in the case of a 2 letter string.
  Add and get.

  Word gen just needs table. passes the info. uses get method to get letters.

  word gen should not even know associations. just tables.

  The code should be rather simple.
  read string, break string, ask table for letters.
  construct itself, add, get (toString Methods)
  construct, add, get.


  */

}
