package org.example.CodeWars.SixKyu;

import java.util.*;

public class SixKyuService {

    public String getBackspaceInString(String letter) {
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < letter.length(); i++) {
            if (letter.charAt(i) != '#') {
                characterStack.push(letter.charAt(i));
            } else {
                if (!characterStack.isEmpty()) {
                    characterStack.pop();
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (char newLetter : characterStack) {
            result.append(newLetter);
        }

        System.out.println(result);
        return result.toString();
    }

    // melakukan pemisahan terhadap string camel case
    public String getBreakCamelCase(String letter) {
        String temp = "";

        String[] letters = letter.split("");

        for (int i = 0; i < letter.length(); i++) {
            if (letters[i].equals(letters[i].toUpperCase())) {
                temp += " " + letters[i];
            } else {
                temp += letters[i];
            }
        }

        System.out.println(temp);

        System.out.println("========================alternatif==================");

        for (int i = 0; i < letter.length(); i++) {
            temp = Character.isUpperCase(letter.charAt(i))
                    ? temp + " " + letter.charAt(i)
                    : temp + letter.charAt(i);
        }

        System.out.println(temp);
        return temp;
    }

    public boolean getIsNumberPrime(int input) {
        if (input < 2) {
            System.out.println("Hasilnya = Ngak prima guys");
            return false;
        }

        int temp = 0;

        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                System.out.println("Hasilnya = Ngak prima guys");
                return false;
            }
        }

        double math = Math.sqrt(64);
        System.out.println(math);

        System.out.println("Hasilnya prima guys");
        return true;
    }

    //rekursif untuk fungsi penambahan angka
    public Integer getSumDigit(int number) {
        if (number < 10) {
            return number;
        }

        number = setValueUsingRecursive(number, 0);
        int result = getSumDigit(number);

        System.out.println(result);

        System.out.println("==================alternatif================");

        while (number > 9) {
            number = number / 10 + number % 10;
        }
        System.out.println(number);

        return result;
    }

    private int setValueUsingRecursive(int number, int i) {
        String[] numberArr = String.valueOf(number).split("");

        int result = 0;

        if (i < numberArr.length) {
            result = Integer.parseInt(numberArr[i]) + setValueUsingRecursive(number, i + 1);
        }

        return result;
    }

    public void setFallowTheSpy() {
        String[][] routes = new String[][]
                {{"MNL", "TAG"}, {"CEB", "TAC"}, {"TAG", "CEB"}, {"TAC", "BOR"}};

        Map<String, List<String>> mapRoutes = new HashMap<>();
        Set<String> setOriginRoutes = new LinkedHashSet<>();
        Set<String> setDestinationRoutes = new LinkedHashSet<>();

        for (String[] sl : routes) {
            String origin = sl[0];
            String destination = sl[1];

            setOriginRoutes.add(origin);
            setDestinationRoutes.add(destination);

            if (!mapRoutes.containsKey(origin)) {
                List<String> listDestination = new ArrayList<>();
                listDestination.add(destination);
                mapRoutes.put(origin, listDestination);
            } else {
                List<String> listDestination = mapRoutes.get(origin);
                listDestination.add(destination);
            }
        }

        String origin = null;
        for (String s : setOriginRoutes) {
            if (!setDestinationRoutes.contains(s)){
                origin = s;
            }
        }

        List<String> result = new ArrayList<>();
        result.add(origin);
        while (mapRoutes.containsKey(origin)) {
            List<String> item = mapRoutes.get(origin);

            if (origin != null && !origin.isEmpty()) {
                origin = item.get(0);
                result.add(origin);

            } else {
                break;
            }
        }

        String hasil = String.join(" ,", result);

        System.out.println(hasil);

        System.out.println("====================alternatif====================");

        Map<String, String> route_map = new HashMap();
        LinkedList<String> ordered = new LinkedList();

        for (int a = 0; a < routes.length; a++) {
            route_map.put(routes[a][0], routes[a][1]);
        }

        String start = "";
        for (int a = 0; a < routes.length; a++) {
            if (!route_map.containsValue(routes[a][0])) {
                start = routes[a][0];
                break;
            }
        }

        ordered.add(start);
        String current = start;
        for (int a = 0; a < route_map.size(); a++) {
            ordered.add(route_map.get(current));
            current = route_map.get(current);
        }

        System.out.println(String.join(", ", ordered));
    }
}
