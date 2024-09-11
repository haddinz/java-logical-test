package org.example.SixKyu;

import org.example.CodeWars.SixKyu.SixKyuService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SixKyuServiceTest {

    private SixKyuService sixKyuService;

    @BeforeEach
    void setUp() {
        this.sixKyuService = new SixKyuService();
    }

    @Test
    void testGetBackspaceInString() {
        String result = sixKyuService.getBackspaceInString("abc##d######" );

        assertNotNull(result);
    }

    @Test
    void testGetBreakCamelCase() {
        String result = sixKyuService.getBreakCamelCase("wangiSakura");

        assertNotNull(result);
    }

    @Test
    void testGetIsNumPrime() {
        boolean result = sixKyuService.getIsNumberPrime(7);

        assertNotNull(result);
    }

    @Test
    void testGetSumDigit() {
        Integer result = sixKyuService.getSumDigit(493193);

        assertNotNull(result);
    }

    @Test
    void testSetFallowTheSpy() {
        sixKyuService.setFallowTheSpy();
    }
}