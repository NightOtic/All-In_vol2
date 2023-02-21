package Metody;

public class TestCalcultor {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double x = 10 , y = 50;
        System.out.println(calculator.addTwoNumber(x,y));
        calculator.divideTwoNumbers(x,y);
        calculator.multiplyTwoNumbvers(x,y);
        calculator.subtractTwoNumbers(x,y);
    }

}

