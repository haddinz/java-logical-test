package org.example.RandomTest;

import java.util.*;

public class YouTube {

    public int getGanjilDanGenap(int angka) {
        ArrayList<Integer> bilanganGanjil = new ArrayList<Integer>();
        ArrayList<Integer> bilanganGenap = new ArrayList<Integer>();

        for (int i = 0; i < angka; i++) {
            if (i % 2 == 0) {
                bilanganGenap.add(i);
            } else {
                bilanganGanjil.add(i);
            }
        }

        System.out.println("Bilangan genap = " + bilanganGenap);
        System.out.println("Bilangan ganjil = " + bilanganGanjil);
        return angka;
    }

    public ArrayList<Integer> getBilanganPrima(int angka) {
        ArrayList<Integer> bilanganPrima = new ArrayList<>();

        for (int i = 1; i <= angka; i++) {
            int temp = 0;

            for (int a = 1; a <= i; a++) {
                if (i % a == 0) {
                    temp += 1;
                }
            }

            if (temp == 2) {
                bilanganPrima.add(i);
            }

        }

        System.out.println("ini ialah bilangan prima = " + bilanganPrima);
        return bilanganPrima;
    }

    public ArrayList<Integer> getBilanganFibonacci() {
        ArrayList<Integer> bilanganFibonacci = new ArrayList<>();

        int nilai1 = 0;
        int nilai2 = 1;

        for (int i = 0; i <= 10; i++) {
            if (i == 0 || i == 1) {
                bilanganFibonacci.add(i);
            } else {
                int total = nilai1 + nilai2;
                bilanganFibonacci.add(total);
                nilai1 = nilai2;
                nilai2 = total;
            }
        }

        System.out.println("Bilangan fibonacci = " + bilanganFibonacci);
        return bilanganFibonacci;
    }

    public double getTotalTabunganAndi(int tabunganCuy) {
        double tabungan = 750000;
        String nota = new String();

        for (int i = 1; i <= 12; i++) {
            double bunga = 0;
            double sisihkan = 0;

            if (i > 1) {
                bunga = tabungan * 6.0 / 100.0;

                if (tabungan + bunga > 800000) {
                    sisihkan = (tabungan + bunga) * 3.0 / 100.0;
                } else {
                    sisihkan = tabungan * 3.0 / 100.0;
                }
            }

            nota = "Tabungan bulan " + i + " adalah = " + tabungan + "\n" +
                    "Bunga = " + bunga + "\n" +
                    "Sisihan = " + sisihkan + "\n" +
                    "Total tabungan = " + ((tabungan + bunga) - sisihkan) + "\n" +
                    "==========================================";
            System.out.println(nota);

            tabungan = (tabungan + bunga) - sisihkan;
        }

        return tabungan;
    }

    public int getNumorTunggal(int[] arrayNomor) {
        Map<Integer, Integer> mapNomorTunggal = new HashMap<>();

        for (int key : arrayNomor) {
            if (mapNomorTunggal.containsKey(key)) {
                mapNomorTunggal.put(key, mapNomorTunggal.get(key) + 1);
            } else {
                mapNomorTunggal.put(key, 1);
            }
        }

        int totalNomTunggal = 0;
        int palingBanyak = 0;
        String notaDua = "";
        ArrayList<String> nota = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : mapNomorTunggal.entrySet()) {
            totalNomTunggal += entry.getKey();
            if (entry.getValue() > palingBanyak) {
                palingBanyak = entry.getKey();
            }
            notaDua = notaDua + "Angka " + entry.getKey() + " sebanyak " + entry.getValue() + "\n";
            nota.add("Angka " + entry.getKey() + " sebanyak " + entry.getValue() + "\n");
        }

        System.out.println(mapNomorTunggal.entrySet());
        System.out.println("Total Nomor Tunggal = " + mapNomorTunggal.size());
        System.out.println("Total Hasil Tunggal = " + totalNomTunggal);
        System.out.println("Nomor Tunggal Terbanyak = " + palingBanyak);

        System.out.println(notaDua);

        return 0;
    }

    public int getNumberYangHasilnyaDiTentukan(int[] number) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        int expected = 8;

        for (int num : number) {
            int complete = expected - num;
            if (integerMap.containsKey(complete)) {
                System.out.println("Angka pertama " + complete + " dan kedua " + num);
                break;
            }

            integerMap.put(num, 1);
        }

        return 8;
    }

    //nanti
    public void getArrayUrutanYangDiTentukan() {

//        epetasi arraynya [1, *, 3, 4, *, 6, *, 8, 9, *, 11, *, 13, 14, *, 16, *, 18, 19, *]

        ArrayList<Object> integerArrayList = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {  // Angka genap
                if ((i - 1) % 2 == 1) {  // Sebelum angka genap
                    integerArrayList.add('*');
                }
                integerArrayList.add(i);
            } else {  // Angka ganjil
                integerArrayList.add(i);
            }
        }

        System.out.println(integerArrayList);
    }

    public String getTryningMode(String letter) {
        ArrayList<Character> vocal = new ArrayList<>();

        for (int i = 0; i < letter.length(); i++) {
            char ch = letter.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                vocal.add(ch);
            }
        }

        System.out.println(vocal);

        return letter;
    }

}
