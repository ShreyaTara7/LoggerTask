package com.epam.TASK;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainTestSimpleAndCompound
{
	private static final Logger LOGGER=LogManager.getLogger(MainTestSimpleAndCompound.class);
	public static void main(String[] args)
	{
		LOGGER.info("This is an info logger");	
		LOGGER.debug("This is a debug logger");
		LOGGER.warn("This is a warn logger");
		LOGGER.error("This is a error logger");
		LOGGER.fatal("This is a fatal logger");
		SimpleAndCompundInterest sci=new SimpleAndCompundInterest();
				
				
     }
}
