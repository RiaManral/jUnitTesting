package jUnitTestingPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitstr = new jUnitFunction();
        String result = junitstr.addString("hello", "world");
        assertEquals("helloworld", result);
	}

}
