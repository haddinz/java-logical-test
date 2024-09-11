package org.example.HackerRank.JavaBasicTest;

import java.util.Arrays;
import java.util.Stack;

public class JavaBasicTestSer {

    //melakukan fizzbuzz
    public void fizzBuzz(int n) {
        int[] newIntegerArr = new int[n];

        for (int i = 0; i < n; i++) {
            newIntegerArr[i] = i + 1;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println(Arrays.toString(newIntegerArr));
    }

    //mencari apakah brance nya sama antara satu dengan lainnya
    //stack
    public String brancesIsBalanced(String s) {

        Stack<Character> characterStack = new Stack<>();

//      contoh = {[]}}
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                characterStack.push(s.charAt(i));
            } else {
                if (characterStack.isEmpty()) {
                    System.out.println("NO");
                    return "NO";
                } else {
                    char stack_value = characterStack.pop();
                    if (s.charAt(i) == ')' && stack_value != '(') {
                        System.out.println("NO");
                        return "NO";
                    } else if (s.charAt(i) == '}' && stack_value != '{') {
                        System.out.println("NO");
                        return "NO";
                    } else if (s.charAt(i) == ']' && stack_value != '[') {
                        System.out.println("NO");
                        return "NO";
                    }
                }
            }
        }

        if (characterStack.isEmpty()) {
            System.out.println("YES");
            return "YES";
        } else {
            System.out.println("NO");
            return "NO";
        }
    }

}
