package org.example.RandomTest;


import java.util.*;

public class Identify {

  public void mathodeIndentify() {
    int[] numbers = new int[]{2, 5, 1, 3, 9};

    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] > numbers[j]) {
          int temp = numbers[i];
          numbers[i] = numbers[j];
          numbers[j] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(numbers));
  }

}
