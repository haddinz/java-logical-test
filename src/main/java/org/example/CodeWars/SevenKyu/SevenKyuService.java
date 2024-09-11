package org.example.CodeWars.SevenKyu;

import jdk.jfr.Category;

import java.util.*;

public class SevenKyuService {

    public static String highAndLow(String numbers) {
        Integer stringToNumber = Integer.parseInt(numbers);
        System.out.println(stringToNumber);
        return stringToNumber.toString();
    }

    //mengurutkan angka dari besar ke kecil
    public int descendingOrder(int number) {
        String numberString = String.valueOf(number);
        Object[] resultCuy = Arrays.stream(numberString.split(""))
                .sorted((a, b) -> b.compareTo(a))
                .toArray();

        StringBuilder sb = new StringBuilder();
        for (var num : resultCuy) {
            sb.append(num);
        }

        int parserInt = Integer.parseInt(String.valueOf(sb));

        System.out.println(parserInt);

        System.out.println("==================================");

        String[] arrayString = String.valueOf(number).split("");
        Arrays.sort(arrayString, Collections.reverseOrder());
        Integer alternatif = Integer.valueOf(String.join("", arrayString));

        System.out.println(alternatif);
        return parserInt;
    }

    //menghitung rentang bilangan bulat, contoh 4 dan 6 maka 4 + 5 + 6 = 15
    public int getSum(int a, int b) {
        int c = 0;

        if (a == b) {
            return a;
        }

        if (a < b) {
            for (int i = a; i <= b; i++) {
                c += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                c += i;
            }
        }

        System.out.println("var c = " + c);

        System.out.println("==================================");

        int alternatif = (a + b) * (Math.abs(a - b) + 1) / 2;

        System.out.println(alternatif);

        return alternatif;
    }

    //boolean tentang apakah kata akhirnya sama
    public boolean stringEndsWith(String str, String ending) {
        return str.endsWith(ending);
    }

    //boolaen apakah X dan O jumlahnya sama dalam string
    public boolean getXO(String str) {
        String strs = str.toUpperCase();
        String[] strArr = strs.split("");

        ArrayList<String> sumHasO = new ArrayList<>();
        ArrayList<String> sumHasX = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("O")){
                sumHasO.add(strArr[i]);
            }

            if (strArr[i].equals("X")){
                sumHasX.add(strArr[i]);
            }
        }

        Boolean result = sumHasO.size() == sumHasX.size();
        System.out.println("hasil dari get XO nya = " + result);

        if(result){
            return true;
        }

        System.out.println("=========================================");

        int O = 0, X = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toUpperCase().charAt(i) == 'O') O++;
            if (str.toUpperCase().charAt(i) == 'X') X++;
        }

        return X == O;

//        return false;
    }

    //menghitung jumlah seluruh kata dalam string
    public int getJumlahKata(String kata) {
        String[] kataArr = kata.split(" ");
        return kataArr.length;
    }

    //mencari value index
    public int solusionIndex(Object[] numArr, Object value) {

        List<Object> newArr = new ArrayList<>();

        for (int i = 0; i < numArr.length; i++) {
            newArr.add(numArr[i]);
        }

        return newArr.indexOf(value) == 0 ? -1 : newArr.indexOf(value);

    }

    //apakah string memiliki spacing yang bener atau tidak?
    public boolean getSpacing(String letter) {
        if (letter.isEmpty()) {
            System.out.println("hasilnya ialah true");
            return true;
        }

        if (letter.startsWith(" ") || letter.endsWith(" ")) {
            System.out.println("hasilnya ialah false");
            return false;
        }

        for (int i = 0; i < letter.length() - 1; i++) {
            if (letter.charAt(i) == ' ' && letter.charAt(i + 1) == ' ') {
                System.out.println("hasilnya ialah false");
                return false;
            }
        }

        System.out.println("========================alternatif========================");

        return letter.trim().replace("  ", "").equals(letter);

//        Kasus logika yang bisa di pelajari pada kasus ini ialah =
//                jika terdapat suatu perbandingan value akan lebih baik di bandingkan versi baiknya dan versi asalnya
//                kalau seudah sesuai dengan versi baiknya maka true
//                kalau belum maka false

//        System.out.println("hasilnya ialah true");
//        return true;
    }
}
