package Telliant_timesheet.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j {

		static Logger log = LogManager.getLogger(Log4j.class);

		public static void main(String[] args) {
			
			System.out.println("Log 4j session");
			
		log.info("This is a information level log");
		log.error("This is a error level log");
		log.warn("This is a warning level log");
		log.fatal("This is a fatal level log");
		
		System.out.println("Completed");
		

	}

}
