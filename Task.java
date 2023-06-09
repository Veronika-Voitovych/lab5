public class Task implements Task_Interface {
    private int num1;
    private int num2;
    private int num3;
    public Task(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    public int task2(int numb1, int num2, int num3) {
        if (num1>num2 && num3>num2) {
            return num2;
        }
        else if (num1>num3 && num2>num3) {
            return num3;
        }
        else  {
            return num1;
        }
    }
    public void task3(int num1, int num3, int num2){
        int [] arr = {num1,num2,num3};
        System.out.println("["+arr[0]+","+arr[1]+","+arr[2]+"]");
    }
    public void task4(int num1, int num3, int num2) {
        int[] arr = new int[3];
        arr[0] = num1;
        arr[1] = num2;
        arr[2] = num3;
        int numberResult = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (numberResult<arr[i]){
                numberResult = arr[i];
            }
        }
        System.out.println(numberResult);
    }
}
