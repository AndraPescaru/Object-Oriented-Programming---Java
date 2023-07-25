package lab5.task2;

import lab5.task1.Task;

public abstract class Queue extends Stack implements Task {

    public Task pop() {
        Task task1 = list.get(0);

        list.remove(0);

        return task1;
    }

}
