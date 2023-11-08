package packet;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class LoggerDemo {

    private static final Logger logger = LogManager.getLogger(LogManager.class);

    public static void main(String[] args) {

        logger.trace("This is a trace message ");
        logger.debug("This is a debug message");
        logger.info("This is a info message");
        logger.warn("This is a warn message");
        logger.error("This is a erroe message");
        logger.fatal("This is a fatal message");

        Thread thread = new ThreadTalk();
        thread.setName("talker");
        thread.setDaemon(true);

        Thread thread2 = new ThreadWalk();
        thread2.setName("talker2");
        thread2.setDaemon(true);

        Thread thread3 = new ThreadTalk();
        thread3.setName("walker");


        thread.start();
        thread2.start();
        thread3.start();
    }
}
