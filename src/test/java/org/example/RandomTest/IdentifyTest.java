package org.example.RandomTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IdentifyTest {

  private Identify identify;

  @BeforeEach
  void setUp() {
    this.identify = new Identify();
  }

  @Test
  void testMathodeIndentify() {
    identify.mathodeIndentify();
  }

}