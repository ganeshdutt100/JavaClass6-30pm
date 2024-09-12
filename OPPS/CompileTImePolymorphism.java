package OPPS;
class Calculator{
    public int add(int val1 , int val2){
        return val1 + val2;
    }
    public int add(int val1 , int val2,int val3){
        return val1 + val2 + val3;
    }
}
class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2,3)); // Output: 5
        System.out.println(calc.add(2,3,4)); // Output: 9
    }
}
