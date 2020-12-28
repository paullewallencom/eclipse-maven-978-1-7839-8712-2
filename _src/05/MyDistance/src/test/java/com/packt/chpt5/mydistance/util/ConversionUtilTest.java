package com.packt.chpt5.mydistance.util;



import com.packt.chpt5.mydistance.util.ConversionUtil;


//more info  on juint :http://junit.org/
import junit.framework.TestCase;


public class ConversionUtilTest extends TestCase{

	private ConversionUtil conversion;

	
@Override
	protected void setUp() throws Exception
 	{
	// TODO Auto-generated method stub

		super.setUp();

		 conversion= new ConversionUtil();

	}

	
	public void testConvertKmToMile() {

		double actual=conversion.convertKMToMile(4);

		assertEquals(2.48548,actual,0.001);

	}


	public void testConvertkmToYard() {

		double actual=conversion.convertkmToYard(4);

		assertEquals(4374.45,actual,0.10);

	}

	
	public void testConvertMToMile() {

		double actual=conversion.convertMToMile(4000);

		assertEquals(2.48548,actual,0.001);

	}

	
	public void testConvertMtoYard() {

		double actual=conversion.convertMtoYard(4000);

		assertEquals(4374.45,actual,0.10);

	}

	
	@Override
	protected void tearDown() throws Exception {

		// TODO Auto-generated method stub
		super.tearDown();

		conversion = null;

	}

}
