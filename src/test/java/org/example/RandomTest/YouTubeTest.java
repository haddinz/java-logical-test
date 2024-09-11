package org.example.RandomTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class YouTubeTest {

    private YouTube youTube;

    @BeforeEach
    void setUp() {
        this.youTube = new YouTube();
    }

    @Test
    void testGetGanjilDanGenap() {
        int result = youTube.getGanjilDanGenap(78);

        assertNotNull(result);
    }

    @Test
    void testGetBilanganPrima() {
        ArrayList<Integer> result = youTube.getBilanganPrima(100);

        assertNotNull(result);
    }

    @Test
    void testGetBilanganFibonacci() {
        ArrayList<Integer> result = youTube.getBilanganFibonacci();

        assertNotNull(result);
    }

    @Test
    void testGetTotalTabunganAndi() {
        double result = youTube.getTotalTabunganAndi(750000);

        assertNotNull(result);
    }

    @Test
    void testGetNumorTunggal() {
        int[] arrayNumber = new int[]{1,4,5,3,2,5,3,4,8,5,4,3,6,0,4,3,2,1,5,9,9,4,3,1,3,0,2,2,4,6,2,4,7,4};
        double result = youTube.getNumorTunggal(arrayNumber);

        assertNotNull(result);
    }

    @Test
    void testGetNumberYangHasilnyaDiTentukan() {
        int result = youTube.getNumberYangHasilnyaDiTentukan(new int[]{1, 5, 2, 1, 4, 2, 6});

        assertNotNull(result);
    }

    @Test
    void testGetArrayUrutanYangDiTentukan() {
        youTube.getArrayUrutanYangDiTentukan();
    }

    @Test
    void testGetTryningMode() {
        String result = youTube.getTryningMode("formulatrix");

        assertNotNull(result);
    }
}