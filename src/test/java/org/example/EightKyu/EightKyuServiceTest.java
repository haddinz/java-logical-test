package org.example.EightKyu;

import org.example.CodeWars.EightKyu.EightKyuService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EightKyuServiceTest {

    private EightKyuService eightKyuService;

    public EightKyuServiceTest() {
    }

    @BeforeEach
    public void setUp() {
        eightKyuService = new EightKyuService();
    }

    @Test
    public void testSmallestIntegerFinder() {
        int exepted = 11;

        int result = eightKyuService.smallestIntegerFinder(new int[]{78,56,232,12,11,43});
        assertEquals(exepted, result);
    }

    @Test
    public void testInvertValues() {
        int[] array = new int[]{2, 4, -1, 4, 5};
        int[] result = eightKyuService.invertValues(array);
        System.out.print("result nya " + Arrays.toString(result));
        assertNotNull(result);
    }

    @Test
    void testAbbreviateTwoWords() {
        String result = eightKyuService.abbreviateTwoWords("udin por");
        assertNotNull(result);
    }

    @Test
    void testArrayPlusArray() {
        int exepted = 21;

        int result = eightKyuService.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6});
        assertNotNull(result);
        assertEquals(exepted, result);
    }

    @Test
    void testgetMaxInt() {
        int[] arrayNum = new int[]{4, 2, 5, 1, 3};
        int result = eightKyuService.getMaxInt(arrayNum);

        assertNotNull(result);
    }

    @Test
    void getBigNumber() {
        int result = eightKyuService.getBigNumber(new int[]{190, 5, 3, 7, 200});

        assertNotNull(result);
    }

    @Test
    void tesGetLetterCount() {
        Map<Character, Integer> result = eightKyuService.getLetterCount("hello world");

        assertNotNull(result);
    }

    @Test
    void tesGetLetterCount1() {
        String result = eightKyuService.getManyLetter("Process finished");

        assertNotNull(result);
    }

    @Test
    void testGetRemoveDoubleLetter() {
        String result = eightKyuService.getRemoveDoubleLetter("apakah ada kabar hari ini");
        assertNotNull(result);
    }

    @Test
    void testPalindromes() {
        String result = eightKyuService.getPalindromes("dude");
        assertNotNull(result);
    }

//    @Test
//    void testReverseString() {
//        String result = identify.reverseString("reverse");
//        String expected = "esrever";
//
//        assertEquals(expected, result);
//    }

}