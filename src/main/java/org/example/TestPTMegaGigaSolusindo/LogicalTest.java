package org.example.TestPTMegaGigaSolusindo;

import java.util.ArrayList;

public class LogicalTest {
    public String getReadText(String text) {
        String[] textArr = text.split(" ");
        String temp = "";

        for (int i = 0; i < textArr.length ; i++) {
            temp += reverseString(textArr[i]);
            if ( i < textArr.length - 1) {
                temp += " ";
            }
        }

        return temp;
    }

    private String reverseString(String text) {
        String temp = "";

        for (int i = text.length() - 1; i >= 0 ; i--) {
            temp += text.charAt(i);
        }

        return temp;
    }

    public ArrayList<String> getFizzAndBuzz() {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            if (i % 15 == 0) {
                result.add(i +" = FizzBuzz");
            } else if (i % 5 == 0) {
                result.add(i +" = Buzz");
            } else if (i % 3 == 0) {
                result.add(i +" = Fizz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }

    public ArrayList<Integer> getDeretanAngka(int number) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        int valueOne = 0;
        int valueTwo = 1;

        for (int i = 0; i < number; i++) {
            if (i == 0 || i == 1) {
                integerArrayList.add(i);
            } else {
                int tempValue = valueOne + valueTwo;
                integerArrayList.add(tempValue);
                valueOne = valueTwo;
                valueTwo = tempValue;
            }
        }

        System.out.println(integerArrayList);
        return integerArrayList;
    }

    public int getNilaiSaham(int[] numbers) {
        int minValue = numbers[0];
        int maxValue = 0;
        int selisih = 11;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= minValue) {
                minValue = numbers[i];
            } else {
                maxValue = numbers[i];
                int tempSelisih = maxValue - minValue;
                if (tempSelisih > selisih) {
                    selisih = tempSelisih;
                } else {
                    maxValue = numbers[i];
                    break;
                }
            }
        }
        String result = "Pembelian terbaik dengan harga = " + minValue + " ,sebelum kenaikan dengan harga = " + maxValue;
        System.out.println(result);
        return minValue;
    }

    public int getIntegerInList(String[] letters) {
        int temp = 0;
        for (String s : letters) {
            try {
                Integer.parseInt(s);
                temp += 1;
            } catch (NumberFormatException e){}
        }
        System.out.println(temp);
        return temp;
    }
}
