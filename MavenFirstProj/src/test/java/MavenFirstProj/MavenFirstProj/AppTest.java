package MavenFirstProj.MavenFirstProj;

import junit.framework.TestSuite;

import org.testng.TestNG;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestNG
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( );
    }

    /**
     * @return the suite of tests being tested
     */
    public static TestSuite suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
 //   public void testApp()
 //   {
 //       assertTrue( true );
 //   }
}
