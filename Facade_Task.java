public class Facade_Task implements Facade_Interface {

    Task task = new Task(1,50,2);

    public void main_task(){
        System.out.println(task.task2(1,50,3));
        task.task3(1,20,13);
        task.task4(1,4,40);
    }
}