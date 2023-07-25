package lab5.task1;

public class OutTask implements  Task{

    public String mes = "";
    public OutTask(String message) {
        mes = message;
    }
    public void execute(){
        System.out.println(mes);
    };

}
