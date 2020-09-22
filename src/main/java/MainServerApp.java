import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static utils.MessageUtils.START_SERVER;

public class MainServerApp {

    public static void main(String[] args) {

        final Logger logger = LogManager.getLogger(MainServerApp.class);

        logger.info(START_SERVER);

    }

}
