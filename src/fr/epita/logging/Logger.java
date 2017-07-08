package fr.epita.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class outputs messages giving precise information on what is currently happening in the program.
 * 
 * @author Lenka Horvahova
 */
public class Logger {

	private LogConfiguration configuration;
	private PrintWriter writer;

	/**
	 * This is a Constructor for the Logger class.
	 * It sets a configuration and opens a writer.
	 * 
	 * @param configuration					the configuration with the file's path
	 * @throws IOException 					the exception that can be thrown when an input or output operation fails
	 */
	public Logger(LogConfiguration configuration) throws IOException {
		
		this.configuration = configuration;
		this.writer = new PrintWriter(new FileWriter(new File(this.configuration.getFilePath()), true));
	}

	/**
	 * This method outputs a log message.
	 * 
	 * @param message		the message of the log
	 */
	public void log(String message) {
		
		if (this.writer != null) {
			
			Date date = new Date();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
			
			this.writer.println(simpleFormat.format(date) + " : " + message);
			this.writer.flush();
			
		} else {
			
			System.out.println("Error while opening a writer!");
		}
	}

	/**
	 * This method outputs a log message with a given level.
	 * 
	 * @param message		the message of the log
	 * @param level			the level of the log.
	 */
	public void log(String message, String level) {
		
		this.log(level + " : " + message);
	}
}
