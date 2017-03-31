package jenkins.morse;



import org.junit.Test;

import junit.framework.Assert;



public class TraductionTest {
	
	@Test
	public void test1() {
		
		Assert.assertEquals("SOS", Traduction.translate( "... --- ...", "2"));
		
	}
	
	@Test
	public void test2() {
		
		Assert.assertEquals("... --- ... ", Traduction.translate("SOS", "1"));
		
	}
}
