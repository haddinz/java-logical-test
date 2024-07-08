package org.example.TestPTMegaGigaSolusindo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LogicalTestTest {

    private LogicalTest logicalTest;

    @BeforeEach
    void setUp() {
        this.logicalTest = new LogicalTest();
    }

    @Test
    void testGetReadText() {
        String resultOne = logicalTest.getReadText("italem irad irigayaj");
        String resultTwo = logicalTest.getReadText("iadab itsap ulalreb");
        String resultThree = logicalTest.getReadText("nalub kusutret gnalali");

        assertNotNull(resultOne);
        assertEquals("melati dari jayagiri", resultOne);
        assertEquals("badai pasti berlalu", resultTwo);
        assertEquals("bulan tertusuk ilalang", resultThree);
    }

    @Test
    void testGetFizzAndBuzz() {
        String expected = "0 = FizzBuzz, 1, 2, 3 = Fizz, 4, 5 = Buzz, 6 = Fizz, 7, 8, 9 = Fizz, 10 = Buzz, 11, 12 = Fizz, 13, 14, 15 = FizzBuzz, 16, 17, 18 = Fizz, 19, 20 = Buzz, 21 = Fizz, 22, 23, 24 = Fizz, 25 = Buzz, 26, 27 = Fizz, 28, 29, 30 = FizzBuzz, 31, 32, 33 = Fizz, 34, 35 = Buzz, 36 = Fizz, 37, 38, 39 = Fizz, 40 = Buzz, 41, 42 = Fizz, 43, 44, 45 = FizzBuzz, 46, 47, 48 = Fizz, 49, 50 = Buzz, 51 = Fizz, 52, 53, 54 = Fizz, 55 = Buzz, 56, 57 = Fizz, 58, 59, 60 = FizzBuzz, 61, 62, 63 = Fizz, 64, 65 = Buzz, 66 = Fizz, 67, 68, 69 = Fizz, 70 = Buzz, 71, 72 = Fizz, 73, 74, 75 = FizzBuzz, 76, 77, 78 = Fizz, 79, 80 = Buzz, 81 = Fizz, 82, 83, 84 = Fizz, 85 = Buzz, 86, 87 = Fizz, 88, 89, 90 = FizzBuzz, 91, 92, 93 = Fizz, 94, 95 = Buzz, 96 = Fizz, 97, 98, 99 = Fizz, 100 = Buzz";
        ArrayList<String> expectedList = new ArrayList<>();
        for (String s : expected.split(", ")) {
            expectedList.add(s);
        }

        ArrayList<String> result = logicalTest.getFizzAndBuzz();

        assertEquals(expectedList, result);
        assertNotNull(logicalTest.getFizzAndBuzz());
    }

    @Test
    void testGetDeretanAngka() {
        int[] numberArr = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        ArrayList<Integer> expected = new ArrayList<>();
        for (Integer num : numberArr) {
            expected.add(num);
        }

        ArrayList<Integer> result = logicalTest.getDeretanAngka(10);

        assertEquals(expected, result);
        assertNotNull(result);
    }

    @Test
    void testGetNilaiSaham() {
        int expected = 7;
        int[] numArr = new int[]{7,18,27,10,29};
        int result = logicalTest.getNilaiSaham(numArr);

        assertEquals(expected, result);
        assertNotNull(result);
    }

    @Test
    void testGetIntegerInList() {
        String[] objectArr = new String[]{"b", "7", "h", "6", "h", "k", "i", "5", "g", "7", "8"};
        int result = logicalTest.getIntegerInList(objectArr);

        assertEquals(5, result);
        assertNotNull(result);
    }
}