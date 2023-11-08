package packet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadTalk extends Thread {

    private static final Logger logger = LogManager.getLogger(ThreadTalk.class);



    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e);
        }
        logger.info("I'm talking {}",i);
    }
   }
}
