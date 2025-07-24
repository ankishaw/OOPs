//Interaction Between Static and Non-Static Members
class Exam{
    int ins = 1;

    static void method(){
        Exam obj = new Exam();
        System.out.println("Instance Variable: " + obj.ins);
    }
}
public class StaticKeyword {
    public static void main(String[] args){
        Exam.method();
    }
}

//Static Block
/*class Example{
    static int val;

    static {
        val = 10;
        System.out.println("Static Block Executed");
    }
}
public class StaticKeyword {
    public static void main(String[] args){
        System.out.println("Value: "+ Example.val);
    }
}*/

//Static Method
/*class MathUtils{
    static int add(int a, int b){
        return a+b;
    }
}
public class StaticKeyword {
    public static void main(String[] args){
        int res = MathUtils.add(1,2);
        System.out.println("Res: " +res);
    }
}*/

//Static Variables
/*class Counter{
    static int count;

    Counter(){
        count++;
    }
    static void displayCount(){
        System.out.println("Count: " + count);
    }
}
public class StaticKeyword {
    public static void main(String[] args){
        Counter.displayCount();
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter.displayCount();
    }
}*/
