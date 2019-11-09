package com.derniercri.service.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DerniercriLogger {
	private Logger logger;

	private DerniercriLogger(Class<?> clazz) {
		logger=LogManager.getLogger(clazz);
	}
	
	public static DerniercriLogger getLogger(Class<?> clazz) {
		return new DerniercriLogger(clazz);
	}

	public void debug(String debugMessage) {
		logger.debug(debugMessage);
	}
}
