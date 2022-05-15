package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double x = 10;
        double y = 2;
        calc.add(x, y);
        calc.minus(x, y);
        calc.multiply(x, y);
        calc.divide(x, y);
        calc.faculty(y);
    }
}
