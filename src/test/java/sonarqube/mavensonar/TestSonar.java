package sonarqube.mavensonar;

import org.testng.annotations.Test;
import org.junit.Assert;


public class TestSonar {
		@Test
	public void test1() {
		//new CodeCoverage();
		Assert.assertEquals(DemoSonar.start(), "start");
		}
		
    @Test
    public void test2() 
    {
    	Assert.assertEquals(DemoSonar.stop(),"stop");
    }
}