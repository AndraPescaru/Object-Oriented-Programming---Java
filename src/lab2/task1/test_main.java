package lab2.task1;

public class test_main {
    public static void main (String[] args) {

        Complex number = new Complex(10, 15);

        System.out.println(number.getReal());
        System.out.println(number.getImaginary());

        Complex number2 = new Complex();

        System.out.println(number2.getReal());
        System.out.println(number2.getImaginary());

        number.addWithComplex(number);
        number.showNumber();

        number2.setReal(34);
        number2.setImaginary(-23);
        number2.showNumber();
    }

}
