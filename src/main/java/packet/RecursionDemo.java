package packet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RecursionDemo {

    private static final Logger logger = LogManager.getLogger(RecursionDemo.class);

    public static void main(String[] args) {

        RecursionDemo recursionDemo = new RecursionDemo();

        try {
            factorial(6);
            factorial(-2);
            factorial(10);

        } catch (Exception e) {
            logger.error("Что-то пошло не так,подробнее {}",e.getMessage(),e);
        }


    }

    public void print(int n,String s){
        logger.info("{}{}",s,n);
        print(n,s + " ");
        if (n > 0){
            print(n - 3,s);
            print(n - 2,s);
            print(n / 2,s);
            print(n - 2,s);
        }
    }

    private static int factorial(int n){
        if (n < 0){
            throw new IllegalArgumentException("Передано отрицательное число");
        }
        logger.debug("Аргумент от n равно {}",n);
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }

        logger.info("Получили результат {}",result);
        return result;
    }

}

