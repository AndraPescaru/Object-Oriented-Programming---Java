package lab5.task1;

public class CounterOutTask implements  Task{


    public void execute(){
        ++Global.gloval_value;
        System.out.println(Global.gloval_value);
    };

}
