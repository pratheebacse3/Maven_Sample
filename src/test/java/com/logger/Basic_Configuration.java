package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configuration {
	
	 static Logger Log= Logger.getLogger(Basic_Configuration.class);
	 
	public static void main(String[] args) {
		
		//Configuration:
		BasicConfigurator.configure();
	
		Log.debug("Debug");
		Log.info("info");
		Log.warn("Warning");
		Log.error("Error");
		Log.fatal("fatal");
		 
		
		
		
	}

}
