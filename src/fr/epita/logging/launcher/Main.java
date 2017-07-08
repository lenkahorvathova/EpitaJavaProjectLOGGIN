package fr.epita.logging.launcher;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import fr.epita.logging.LogConfiguration;
import fr.epita.logging.Logger;

/**
 * Main class as an example of Logger usage.
 * 
 * @author Lenka Horvathova
 */
public class Main {

	/**
	 * This main method makes "application.log" file containing technical traces of a running program
	 * 	and prints out the current date.
	 * 
	 * @param args							arguments from command line, unused
	 * @throws IOException 					the exception that can be thrown when an input or output operation fails
	 */
	public static void main(String[] args) throws IOException {
		
		LogConfiguration conf = new LogConfiguration("/temp/application.log");
		Logger logger = new Logger(conf);
		
		logger.log("First log message");
		logger.log("Second log message", "INFO");
		
		Date date = new Date(); 
		SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss.");
		
		System.out.println("File '" + conf.getFilePath() + "' was succesfully created on " + simpleFormat.format(date));
	}
}
