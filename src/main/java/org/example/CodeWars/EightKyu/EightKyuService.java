package org.example.CodeWars.EightKyu;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EightKyuService {

    //mencari int terkecil
    public int smallestIntegerFinder(int[] arr) {
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        return arr[0];
    }

    //merubah angka dari plus ke minus begitu juga sebaliknya
    public int[] invertValues(int[] arr) {
        int[] interved = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            interved[i] = arr[i] * -1;
//            interved[i] = -arr[i];
        }
        return interved;
    }

    //besarkan dan singkatkan nama, contoh = Joko Widodo, maka = J.W
    public String abbreviateTwoWords(String name) {
        String nameUppercase = name.toUpperCase();
        String[] nameSplit = nameUppercase.split(" ");
        char[] nameArrOne = nameSplit[0].toCharArray();
        char[] nameArrTwo = nameSplit[1].toCharArray();
        char findFirstLetterOne = nameArrOne[0];
        char findFirstLetterTwo = nameArrTwo[0];

        String result = findFirstLetterOne + "." + findFirstLetterTwo;
        System.out.println("result = " + result);

        System.out.println("================================================");

        String alternatif = Arrays.stream(name.toUpperCase().split(" "))
                .map(s -> s.substring(0, 1))
                .collect(Collectors.joining("."));
        System.out.println("alternatif = " + alternatif);

        return alternatif;
    }

    //menambahkan array
    public int arrayPlusArray(int[] arr1, int[] arr2) {
        int resultArr1 = Arrays.stream(arr1).sum();
        int resultArr2 = Arrays.stream(arr2).sum();
        int result = resultArr1 + resultArr2;
        System.out.print(resultArr1 +resultArr2);

        System.out.println("================================================");

        int coba = Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
        System.out.println(coba);

        return result;
    }

    //ambil int terbesar dalam array
    public int getMaxInt(int[] arrInt) {

        int numArr1 = arrInt[0];
        int numArr2 = arrInt[1];

        return numArr1 > numArr2 ? numArr1 : numArr2;
    }

    //ambil int terbesar dalam array 2
    public int getBigNumber(int[] intArr) {
        Integer[] newArrInt = Arrays.stream(intArr)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(newArrInt, Collections.reverseOrder());
        int bigNumberIs = newArrInt[0];
        System.out.println(bigNumberIs);

        return bigNumberIs;
    }

    //menghitung jumlah kata dalam string sama
    public Map<Character, Integer> getLetterCount(String kata) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] letterArr = kata.toCharArray();

        for (char c : letterArr) {
            if (!String.valueOf(c).isBlank()) {
                if (charMap.containsKey(c)) {
                    charMap.put(c, charMap.get(c) + 1);
                    System.out.println(c);
                } else {
                    charMap.put(c, 1);
                }
            }
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }
        return charMap;
    }

    //mencari huruf terbanyaka dalam string sama
    public String getManyLetter(String letter) {
        Map<Character, Integer> charMap = new HashMap<>();
        char[] chars = letter.toCharArray();

        for (char c : chars) {
            if (!String.valueOf(c).isBlank()) {
                if (charMap.containsKey(c)) {
                    charMap.put(c, charMap.get(c) + 1);
                } else {
                    charMap.put(c, 1);
                }
            }
        }

        System.out.println(charMap);

        int sumLetter = 0;
        char carachterLetter = ' ';

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > sumLetter) {
                carachterLetter = entry.getKey();
                sumLetter = entry.getValue();
            }
        }

        System.out.println("Dari letter = " + letter);
        System.out.println("Letter " + carachterLetter + " muncul sebanyak = " + sumLetter + " kali" );
        return "ok";
    }

    //menghapus huruf yang double
    public String getRemoveDoubleLetter(String letter) {
        String[] strings = letter.split("");
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (String s : strings) {
            if(!stringArrayList.contains(s) && !String.valueOf(s).isBlank()) {
                stringArrayList.add(s);
            }
        }

        String newString = String.join("", stringArrayList);

        System.out.println(Arrays.toString(strings));
        System.out.println(newString);

        return letter;
    }

    //membuat palindromes
    public String getPalindromes(String letter) {
        String[] original = letter.split("");

        String[] reverse = letter.split("");
        List<String> arrayList = new ArrayList<>(Arrays.asList(reverse));
        Collections.reverse(arrayList);

//        StringBuilder sb = new StringBuilder(letter);
//        sb.reverse();

        System.out.println("hasil dari math max = " + Math.max(100, 2));

        boolean palindromes = false;
        for (int i = 0; i < original.length; i++) {
            if (original[i].equals(arrayList.get(i))) {
                palindromes = true;
            }
        }

        String resultOriginal = palindromes ? "Palindromes" : "Not Palindromes";
        System.out.println(resultOriginal);

        System.out.println("=========================alternatif====================");

        letter = letter.replace(" ", "");
        String reverseString = "";
        for (int i = letter.length() - 1; i >= 0; i--) {
            reverseString += letter.charAt(i);
        }

        boolean palindromesAlternatif = true;
        for (int i = 0; i < letter.length(); i++) {
            if (reverseString.charAt(i) != letter.charAt(i)) {
                palindromesAlternatif = false;
                break;
            }
        }

        String result = palindromesAlternatif ? "Palindromes" : "Not Palindromes";
        System.out.println(result);

        return result;
    }

    public void duplicate(String input) {
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            output = Character.isUpperCase(input.charAt(i))
                    ? output + " " + input.charAt(i)
                    : output + input.charAt(i);
        }

    }
}














