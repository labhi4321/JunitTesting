package sampletest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMyEvenOdd {
	
	@Test
	public void TestEvenOdd()
	{
		

		MyEvenOdd test=new MyEvenOdd();
		assertEquals(true,test.isEvenOdd(10));
	}
	
	

}
