package br.com.senaigo.Atividade_N1;

import java.text.SimpleDateFormat;
import java.util.Date;

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
     */
    public void testApp()
    {
    	SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");
    	String time = d.format(new Date());
    	
    	App app = new App();
    	System.out.println(time);
    	assertEquals(app.getHorario(),time.toString());
    	
    }
}
