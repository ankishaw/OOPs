//Anonymous Classes
abstract class Greeting{
    abstract void sayHello();
}
public class InnerClasses {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            void sayHello() {
                System.out.println("Hello World");
            }
        };
        greeting.sayHello();
    }
}

//Local Inner Classes
/*class OuterClass{
    void OuterMethod(){
        int localVar = 10;

        class LocalInnerClass{
            void display(){
                System.out.println("Local variable: " + localVar);
            }
        }
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }
}
public class InnerClasses {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.OuterMethod();
    }
}*/

//2. Non-Static Inner Classes
/*class OuterClass{
    int var = 10;

    class InnerClass{
        void display(){
            System.out.println("Instance var: " + var);
        }
    }
}
public class InnerClasses {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass obj = out.new InnerClass();
        obj.display();
    }
}*/

//1. Static Nested Classes
/*class OuterClass{
    static int var = 100;

    static class StaticNestedClass{
        void display(){
            System.out.println("Static Variables: " +var);
        }
    }
}
public class InnerClasses {
    public static void main(String[] args){
        System.out.println("Static Variables: " +OuterClass.var);
        OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
        obj.display();
    }
}*/
