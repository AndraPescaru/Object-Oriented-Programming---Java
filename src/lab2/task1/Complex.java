package lab2.task1;

public class Complex {

    private int real;
    private int imaginary;

    public Complex (int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }

    public Complex () {
        this.real = 0;
        this.imaginary = 0;

        // this(0,0);

    }

    public Complex (Complex number) {
        this.real = number.real;
        this.imaginary = number.imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex (Complex number) {
        this.real += number.real;
        this.imaginary += number.imaginary;
    }

    public void showNumber() {

        char s = '+';
        int i = this.imaginary;

        if (this.imaginary < 0) {
            i *= (-1);
            s = '-';
        }

        System.out.printf("The complex number is: %d%c%di\n", this.real, s, i);
    }


}
