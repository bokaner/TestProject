package Acedemy;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.base;

public class HomePage extends base{
	
	@Test
	public void basePageNavigation() throws IOException
	{
		driver=initalization();
		driver.get("http://qaclickacademy.com");
	}

}
