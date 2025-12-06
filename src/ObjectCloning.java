//Deep Cloning
class Pass implements Cloneable{
    String passportNumber;
    Pass(String passportNumber){
        this.passportNumber = passportNumber;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class Stu implements Cloneable{
    String name;
    Pass passport;

    Stu(String name, Pass passport){
        this.name = name;
        this.passport = passport;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Stu student = (Stu) super.clone();// Shallow copy
        student.passport = (Pass) passport.clone();// Cloning nested object for Deep Cloning
        return student;
    }
}
public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException{
        Pass passport = new Pass("9876543210");
        Stu student = new Stu("Ankit", passport);

        Stu cloneStudent = (Stu) student.clone();// Deep Cloning
        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(cloneStudent.name);
        System.out.println(cloneStudent.passport.passportNumber);

        System.out.println();
        cloneStudent.name = "Hello";
        cloneStudent.passport.passportNumber = "World";
        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(cloneStudent.name);
        System.out.println(cloneStudent.passport.passportNumber);
    }
}


//Shallow Cloning
/*
class Pass{
    String passportNumber;
    Pass(String passportNumber){
        this.passportNumber = passportNumber;
    }
}
class Stu implements Cloneable{
    String name;
    Pass passport;

    Stu(String name, Pass passport){
        this.name = name;
        this.passport = passport;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException{
        Pass passport = new Pass("9876543210");
        Stu student = new Stu("Ankit", passport);

        Stu cloneStudent = (Stu) student.clone();
        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(cloneStudent.name);
        System.out.println(cloneStudent.passport.passportNumber);

        System.out.println();
        cloneStudent.name = "Hello";
        cloneStudent.passport.passportNumber = "World";
        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(cloneStudent.name);
        System.out.println(cloneStudent.passport.passportNumber);
    }
}
*/
