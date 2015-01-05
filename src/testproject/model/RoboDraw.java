package testproject.model;

import lejos.nxt.Motor;
import lejos.util.Delay;

public class RoboDraw 
{
	
	public void drawShape(int vertexCount, int length)
	{
		int angle = calculateAngle(vertexCount);
		
		for(int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			try
			{
				// Circle
				if(angle == 360)
				{
					Motor.A.forward();
					Motor.B.forward();
					Delay.msDelay(2000);
				}
				if(angle == 180)
				{
				
				}
				else
				{
					
				}
				
				
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
	
	public int calculateAngle(int vertexCount)
	{
		int currentAngle = 0;
		
		if(vertexCount != 0)
		{
			currentAngle = 360/vertexCount;
		}
		
		return currentAngle;
	}
}
