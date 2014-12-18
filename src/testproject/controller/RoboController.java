package testproject.controller;

import lejos.nxt.Button;
import testproject.model.RoboDraw;

public class RoboController {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	private RoboDraw myBot;
	
	public RoboController()
	{
		myBot = new RoboDraw();

	}
	
	public void start() 
	{
		drawCircle();
	}
	public void drawCircle()
	{
		myBot.drawShape(1,0);
	}
}
