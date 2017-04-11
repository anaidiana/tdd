package tdd.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tdd.TestFail;

public class FailingTest {

	@Test
	public void failingTest(){
		TestFail t = new TestFail();
		assertTrue(t.testDivide2(3));
	}
}
