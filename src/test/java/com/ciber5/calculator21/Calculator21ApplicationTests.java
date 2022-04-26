package com.ciber5.calculator21;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

@SpringBootTest
class Calculator21ApplicationTests {

  private Calculator calculator = new Calculator();
	@Test
	void contextLoads() {
	}
  
  @Test
  public void testSum() {
    assertEquals(5,calculator.sum(2,3));
  }
}
