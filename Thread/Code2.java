package Thread;
class shivang implements Runnable{
    public void run() {
        for(int i = 0; i <= 5; i++){
            System.out.println("I am Thread "+i);
            System.out.println("I am Shivang");

            try { Thread.sleep(1000); } // Pause for 1 second
            catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
public class Code2 {
    public static void main(String[] args) {
   shivang obj1 = new shivang();
   Thread t1 = new Thread(obj1);
   t1.start();
    }
}
