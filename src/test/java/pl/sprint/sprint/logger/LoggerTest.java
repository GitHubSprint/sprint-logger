/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sprint.sprint.logger;

import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Sławomir Kostrzewa
 */
public class LoggerTest {
    
    private final static String LOGFILE = "loggertest";
    
    @BeforeAll
    static void initAll() {
        Logger.getInstance().setLogger(LOGFILE,LoggerTest.class);
        
        //full init example
        //Logger.getInstance().setLogger(1, "C:/Logs/", "LOGFILE", 10000000, LoggerTest.class);  
    }        
    
    @Test
    void loggerTest() {
        
        File f = new File("logs/" + LOGFILE + ".log");
        f.delete();         
        Logger.getInstance().WriteToLog("Test log message");        
        assertTrue(f.exists()); 
        
    }
       
    
    
}
