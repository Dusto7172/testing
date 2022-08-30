package junitcase1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMyUnit {
	
	MyUnit mu = new MyUnit();
	
	
	@Test
	public void testStringConcat() {
		assertEquals("tomcat", mu.stringConcat("tom", "cat"));
	}

}
