package lab5.task3;

public class Operation implements Div, Minus, Plus, Mult{

    private float value = 0;

    Operation(float value1) {
        this.value = value1;
    }

    public float getValue() {
        return this.value;
    }

    @Override
    public void div(float value) {

        if ( value == 0 ){
            System.out.println("Division by zero is not possible");

        }

        this.value /= value;

    }

    @Override
    public void minus(float value) {
        this.value -= value;
    }

    @Override
    public void mult(float value) {
        this.value *= value;
    }

    @Override
    public void plus(float value) {
        this.value += value;

    }
}
