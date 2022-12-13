package lab2.Task1;

public class TestMain {
    public static void main(String[] args){
        Complex number1 = new Complex();
        number1.showNumber();

        Complex number2 = new Complex(12, 15);
        number2.showNumber();

        Complex number3 = new Complex(45, -16);
        number3.showNumber();

        Complex number4 = new Complex(92, 0);
        number4.showNumber();

        number1.addWithComplex(number2);
        number1.showNumber();

    }
}
