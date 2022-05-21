package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Logger logger = LogManager.getLogger();

        double x = 10;
        double y = 2;
        calc.add(x, y);
        calc.minus(x, y);
        calc.multiply(x, y);
        logger.info("this is an info-logger");
        logger.error("this is an error-logger");
        calc.divide((int)x, (int)y);
        calc.faculty(y);


    }
}
