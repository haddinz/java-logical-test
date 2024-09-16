package org.example.SevenKyu;

import org.example.CodeWars.SevenKyu.SevenKyuService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenKyuServiceTest {

    private SevenKyuService sevenKyuService;

    @BeforeEach
    void setUp() {
        this.sevenKyuService = new SevenKyuService();
    }

    @Test
    void testHighAndLow() {
        String numbers = "1242";
        String result = sevenKyuService.highAndLow(numbers);
        assertNotNull(result);
    }

    @Test
    void testAbbreviateTwoWords() {
        int exepted = 983221111;

        int result = sevenKyuService.descendingOrder(982111321);
        assertNotNull(result);
        assertEquals(exepted, result);
    }

    @Test
    void testGetSum() {
        int exepted = 3;
        int result = sevenKyuService.getSum(4, 6);

        assertNotNull(result);
    }

    @Test
    void testStringEndsWith() {
        boolean result = sevenKyuService.stringEndsWith("hallo", "llo");
        assertTrue(result);
        assertNotNull(result);
    }

    @Test
    void testGetXO() {
        boolean result = sevenKyuService.getXO("oo2x");
        assertFalse(result);
        assertNotNull(result);
    }

    @Test
    void testGetJumlahKata() {
        int expected = 4;
        int result = sevenKyuService.getJumlahKata("Halo, saya joko widodo");

        assertEquals(expected, result);
    }

    @Test
    void testSolusionIndex() {
        Object value = "rui";
        Object[] numArr = new Object[]{3, 3, 4, 5, 2, "rui"};

        int result = sevenKyuService.solusionIndex(numArr, value);

        assertEquals(5, result);
        assertNotNull(result);
    }

    @Test
    void getSpacingTest() {
        boolean result = sevenKyuService.getSpacing("  ");

        assertNotNull(result);
    }

    @Test
    void getMissingInt() {
        int[] numArr = new int[]{9, 2, 4, 5, 7, 0, 8, 6, 1};
        int result = sevenKyuService.getMissingInt(numArr);

        assertNotNull(result);
    }
}