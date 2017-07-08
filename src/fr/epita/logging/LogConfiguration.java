package fr.epita.logging;

/**
 * This class is a configuration class for Logger class 
 * 	and contains a path of a file used for storing log information.
 * 
 * @author Lenka Horvathova
 */
public class LogConfiguration {
	private String filePath;
	
	/**
	 * This is a Constructor for the LogConfiguration class.
	 * It sets a file's path.
	 * 
	 * @param filePath		a path of a file used for storing log information
	 */
	public LogConfiguration(String filePath) {
		this.filePath = filePath;
	}	

	/**
	 * FilePath Getter : This method returns the file's path.
	 * 
	 * @return 				the path of the file
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * FilePath Setter : This method sets the file's path.
	 * 
	 * @param filePath		the path of the file to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
