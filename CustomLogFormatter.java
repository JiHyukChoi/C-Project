package cproject;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
 

public class CustomLogFormatter {

	   private final static Logger logger = Logger.getLogger(CustomLogFormatter.class.getName());
	   private FileHandler fileHandler;
	  
	   public CustomLogFormatter() {};
	   
	   public void logTest() {
	        addFileHandler(logger);
	    }
	 
	   public void logPrint() {
	        logger.info("---main() Start---");
	 
	        // 정보로그
	        logger.info("Info... log");
	        // 오류로그
	        logger.warning("Warning... log");
	        // 에러로그
	        logger.severe("Severe...  log");
	 
	        logger.info("---main() End---");
	   }
	        //le.addFileHandler(logger);
	    
	
	    private void addFileHandler(Logger logger) {
	        try {
	            // 파일저장
	            fileHandler = new FileHandler(CustomLogFormatter.class.getName() + ".txt");
	        } catch (IOException ex) {
	            logger.log(Level.SEVERE, null, ex);
	        } catch (SecurityException ex) {
	            logger.log(Level.SEVERE, null, ex);
	        }
	        logger.addHandler(fileHandler);
	        System.out.println("로그 저장 완료");
	    }
	
}
