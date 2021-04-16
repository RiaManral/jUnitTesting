package jUnitTestingPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class testAddNumbers {

	@Test
	public void test() {
		 jUnitFunction junit = new jUnitFunction();
	        int result = junit.addNum(500, 460);
	        assertEquals (960, result);
	}

}
