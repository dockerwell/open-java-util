package org.dockerwell.util.strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DStringUtilUnitTests {
	
	DStringUtil d = new DStringUtil();
	
	@Test
	public void compareTestBothNull() {
		
		assertTrue(d.compare(null, null));
	}
	
	@Test
	public void compareWithNullSecondArg() {
		assertFalse(d.compare("s", null));
	}
	
	@Test
	public void compareWithNullFirstArg() {
		assertFalse(d.compare(null, "s"));
	}
	
	@Test
	public void compareDiffContent() {
		assertFalse(d.compare("r", "s"));
	}
	
	@Test
	public void compareEQContent() {
		assertTrue(d.compare("", ""));
	}
	
	
	//Second method
	
	@Test
	public void compareIgnoreTestBothNull() {
		assertTrue(d.compareIgnoreCase(null, null));
	}
	
	@Test
	public void compareIgnoreWithNullSecondArg() {
		assertFalse(d.compareIgnoreCase("s", null));
	}
	
	@Test
	public void compareIgnoreWithNullFirstArg() {
		assertFalse(d.compareIgnoreCase(null, "s"));
	}
	
	@Test
	public void compareIgnoreDiffContent() {
		assertFalse(d.compareIgnoreCase("r", "s"));
	}
	
	@Test
	public void compareIgnoreEQContent() {
		assertTrue(d.compareIgnoreCase("s", "S"));
	}
}
