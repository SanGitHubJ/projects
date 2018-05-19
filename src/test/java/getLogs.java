import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by Sanath on 5/18/2018.
 */
public class getLogs {

    public static void logCapture(){
  Logger logger =  Logger.getLogger("logsDemo");
    PropertyConfigurator.configure("log4j.properties");
        logger.info("broswer");
        logger.debug("beduge");
    }

}

