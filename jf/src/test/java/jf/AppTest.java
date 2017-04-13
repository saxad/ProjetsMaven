package jf;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @return 
     */
    public void testApp()
    {
    	App a = new App();
    	assertEquals("max(4,5) vrai",5,a.max(4, 5));
    	assertEquals("max(5, 4) vrai",5,a.max(5, 4));
    	
    
     /*   assertTrue( true );*/
    }
}
