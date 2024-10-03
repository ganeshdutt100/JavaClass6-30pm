package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class code1 {
    public static void main(String[] args) {
//        File obj1  = new File("Shivang4.html");
//        if(obj1.exists()){
//            System.out.println("File already exists");
//        }
//        else{
//            System.out.println("File not exists");
//        }
        try{
            FileWriter writer = new FileWriter("shivang.html");
            writer.write("<html>\n" +
                    "    <head>\n" +
                    "        <title>Shivang's HTML File</title>\n" +
                    "    </head>\n" +
                    "    <body>\n" );
            writer.write("        <h1>Hello World!</h1>\n" +
                    "        <p>This is a simple HTML file.</p>\n" +
                    "    </body>\n" +
                    "</html>");
//            obj1.createNewFile();
//            System.out.println("File created");



        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
