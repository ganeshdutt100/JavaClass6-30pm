package Thread;
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() +  "Thread is running");
        }
    }
}
public class code3 {
    public static void main(String[] args) {
       MyThread myThread = new MyThread();
       MyThread myThread1 = new MyThread();
       MyThread myThread2 = new MyThread();

       myThread.start();
       myThread1.start();
       myThread2.start();
    }
}
