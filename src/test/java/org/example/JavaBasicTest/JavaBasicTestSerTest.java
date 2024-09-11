package org.example.JavaBasicTest;

import org.example.HackerRank.JavaBasicTest.JavaBasicTestSer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class JavaBasicTestSerTest {

    private JavaBasicTestSer javaBasicTestSer;

    @BeforeEach
    void setUp() {
        this.javaBasicTestSer = new JavaBasicTestSer();
    }

    @Test
    void testFizzBuzz() {
        javaBasicTestSer.fizzBuzz(15);
    }

    @Test
    void testBrancesIsBalances() {
        String result = javaBasicTestSer.brancesIsBalanced("");

        assertNotNull(result);
    }

}