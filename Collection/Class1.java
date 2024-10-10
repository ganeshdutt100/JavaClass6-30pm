package Collection;

import java.util.ArrayList;

public class Class1 {
    public static void main(String[] args) {
        ArrayList <String> obj1 = new ArrayList<String>();

        obj1.add("foo");
        obj1.add("bar");
        obj1.add("baz");
        obj1.add(2,"aman");

//        System.out.println(obj1.get(2)); // [foo, bar, baz]
//        for(String a : obj1){
//            System.out.println(a);
//        }
        System.out.println(obj1);

        System.out.println(   obj1.remove("foo"));
        System.out.println(obj1);

    }
}
