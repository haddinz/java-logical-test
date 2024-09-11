package org.example.RandomTest;

import java.util.*;

class CollectionJava {

  public void collection() {
    // ingat konsep inheritance (pewarisan)
    // implement juga. Semakin bawah semakin banyak memilki class

    Collection<String> collections = new ArrayList<>();
    collections.equals("aku");

    collections.add("tambah");
    collections.remove("hapus");
    collections.contains("mengandung"); //boolean

    Stack<Character> characterList = new Stack<>();
    characterList.pop();
    Iterator<Character> characterIterable = characterList.iterator();
    characterIterable.next();

    List<String> lists = new ArrayList<>();
    Set<String> sets = new HashSet<>();
    lists.get(2);
  }
}
