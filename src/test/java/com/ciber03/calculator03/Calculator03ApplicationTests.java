package com.ciber03.calculator03;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals ;

@SpringBootTest
class Calculator03ApplicationTests {

	private Calculator calculator = new Calculator() ;

	@Test
	void contextLoads() {
	}

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2,3)) ;
	}

	//@Test
	//public void testSumIncorrecto() {
	//		assertEquals(7, calculator.sum(2,3)) ;
	//}

}
