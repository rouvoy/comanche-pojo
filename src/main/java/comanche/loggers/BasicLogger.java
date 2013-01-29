package comanche.loggers;

import java.io.PrintStream;

import comanche.api.Logger;

/** Logs to System.err */
public class BasicLogger implements Logger {
	private PrintStream out = System.err ;
	
	/* (non-Javadoc)
	 * @see comanche.loggers.Logger#log(java.lang.String)
	 */
	public void log(String msg) {
		out.println(msg);
	}
}
