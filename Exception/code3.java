package Exception;

public class code3 {
    public static void main(String[] args) {
        try{
            String a  =  null;
            System.out.println(a.length());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
}
