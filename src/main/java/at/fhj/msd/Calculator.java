package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private Logger logger = LogManager.getLogger();

    public Calculator() {

    }

    public double add(double number1, double number2) {
        number1 += number2;
        logger.debug("Values: " + number1 + ", " + number2);
        return number1;
    }

    public double minus(double number1, double number2) {
        double num;
        if(number1 > number2) {
            num = number1 - number2;
        }
        else {
            num = number2 - number1;
        }
        logger.debug("Values: " + number1 + ", " + number2);
        return num;
    }

    public double multiply(double number1, double number2) {
        number1 *= number2;
        logger.debug("Values: " + number1 + ", " + number2);
        return number1;
    }

    public double divide(double number1, double number2) {
        double num = 0;


        if((number1 != 0) && (number2 != 0)) {
            if(number1 > number2) {
                num = number1 / number2;
            }
            else {
                num = number2 / number1;
            }
        } else {
            try {
                Exception ArithmeticException = new Exception();
                if(number1 > number2) {
                    num = number1 / number2;
                    throw ArithmeticException;
                }
                else {
                    num = number2 / number1;
                    throw ArithmeticException;
                }
            } catch (Exception e) {
                logger.error("Division by 0");
                throw new ArithmeticException();

            }
        }
        logger.debug("Values: " + number1 + ", " + number2);
        return num;
    }

    public double faculty(double number) {
        if(number > 1) {
            number *= faculty(number - 1);
        }
        else if (number < 0){
            return 0;
        }
        else {
            return 1;
        }
        logger.debug("Value: " + number);
       return number;
    }
}
