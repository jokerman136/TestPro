package testproject.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import testproject.model.RoboDraw;

public class RoboDrawTester {
	
	private RoboDraw myRobotTester;

	@Before
	public void setUp() throws Exception 
	{
		myRobotTester = new RoboDraw();
	}

	@After
	public void tearDown() throws Exception 
	{
	}

	@Test
	public void testRobotExists()
	{
		assertNotNull(myRobotTester);
	}
	
	
	@Test
	public void testCalculateAngle() 
	{
		assertEquals(90, myRobotTester.calculateAngle(4));
	}

}
