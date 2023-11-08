package packet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadWalk extends Thread{

    private static final Logger logger = LogManager.getLogger(ThreadTalk.class);

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.error(e);
        }

        System.out.println("I'm walking");
    }
}
