package Exception;

public class Code2 {
    public static void main(String[] args) {
        try{
            Class.forName("Yash");

        }
        catch (ClassNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}