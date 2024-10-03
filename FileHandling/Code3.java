package FileHandling;

import java.io.File;

public class Code3 {
    public static void main(String[] args) {
        File file1 = new File("Shivang.html");
        if(file1.delete()) {
            System.out.println("file deleted");
        }
        else{
            System.out.println("file not Delete");
        }
    }
}
