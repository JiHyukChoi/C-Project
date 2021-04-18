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
	 
	        // �����α�
	        logger.info("Info... log");
	        // �����α�
	        logger.warning("Warning... log");
	        // �����α�
	        logger.severe("Severe...  log");
	 
	        logger.info("---main() End---");
	   }
	        //le.addFileHandler(logger);
	    
	
	    private void addFileHandler(Logger logger) {
	        try {
	            // ��������
	            fileHandler = new FileHandler(CustomLogFormatter.class.getName() + ".txt");
	        } catch (IOException ex) {
	            logger.log(Level.SEVERE, null, ex);
	        } catch (SecurityException ex) {
	            logger.log(Level.SEVERE, null, ex);
	        }
	        logger.addHandler(fileHandler);
	        System.out.println("�α� ���� �Ϸ�");
	    }
	
}
