package com.nokia.smp.smallcells.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        logger.debug("test");
        logger.debug("test");
        
        logger.trace("Miguel");
    }
}
