package at.fhj.msd;

public class Calculator {

    public Calculator() {

    }

    public double add(double number1, double number2) {
        number1 += number2;
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
        return num;
    }

    public double multiply(double number1, double number2) {
        number1 *= number2;
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
        }
        return num;
    }

    public double faculty(double number) {
        if(number > 1) {
            number *= faculty(number - 1);
        }
       return 0;
    }
}
