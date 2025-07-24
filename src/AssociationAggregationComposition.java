//Composition
class Passport{
    private String name;
    Passport(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Student{
    private String name;
    private Passport passport; //Class within another Class and owns it
    Student(String name, String passportNumber){
        this.name = name;
        this.passport= new Passport(passportNumber);
    }
    public void displayDetails(){
        System.out.println("Student name: " + name);
        System.out.println("Passport Number: " + passport.getName());
    }
}
public class AssociationAggregationComposition {
    public static void main(String[] args){
        Student student = new Student("Ankit", "passport");
        student.displayDetails();
    }
}

//Aggregation
/*class Passport{
    private String passportNumber;
    Passport(String passportNumber){
        this.passportNumber = passportNumber;
    }
    public String getPassportNumber(){
        return passportNumber;
    }
}
class Student{
    private String name;
    private Passport passport; //Class within another Class but does not owns it
    Student(String name, Passport passport){
        this.name = name;
        this.passport = passport;
    }
    public void displayDetails(){
        System.out.println("Student name: " + name);
        System.out.println("Passport Number: " + passport.getPassportNumber());
    }
}
public class AssociationAggregationComposition {
    public static void main(String[] args){
        Passport passport = new Passport("1234567890");
        Student student = new Student("Ankit", passport);
        student.displayDetails();
    }
}*/

//Association : many-to-many
/*import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private List<Course> courses;

    Student(String name){
        this.name = name;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    public String getName(){
        return name;
    }
    public void printAllCourses(){
        for (Course course: courses) {
            System.out.println("Name: " + course.getName());
        }
    }
}
class Course{
    private String name;
    private List<Student> students;

    Course(String name){
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudents(Student student){
        students.add(student);
    }
    public String getName(){
        return name;
    }
    public void printAllStudents(){
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
        }
    }
}
public class AssociationAggregationComposition {
    public static void main(String[] args){
        Student student1 = new Student("Ankit");
        Student student2 = new Student("Kumar");
        Student student3 = new Student("Shaw");

        Course math = new Course("Maths");
        Course cs = new Course("CS");

        cs.addStudents(student1);
        cs.addStudents(student2);
        math.addStudents(student3);

        student1.addCourse(cs);
        student2.addCourse(cs);
        student3.addCourse(math);

        System.out.println("Courses");
        math.printAllStudents();
        cs.printAllStudents();

        System.out.println("Students");
        student1.printAllCourses();
        student2.printAllCourses();
        student3.printAllCourses();
    }
}*/

//Association : one-to-many
/*import java.util.*;
class Student{
    private String name;
    private String id;
    Student(String name, String id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
}

class College{
    private String name;
    private List<Student> studentList;
    College(String name){
        this.name = name;
        studentList = new ArrayList<>();
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void printAllStudents(){
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + " ,id: " + student.getId());
        }
    }
}
public class AssociationAggregationComposition {
    public static void main(String[] args){
        Student student1 = new Student("Ankit", "1");
        Student student2 = new Student("Shaw", "2");

        College college = new College("ABC");
        college.addStudent(student1);
        college.addStudent(student2);
        college.printAllStudents();
    }
}*/

//Association : one-to-one
/*class Passport{
    private String passportNumber;
    Passport(String passportNumber){
        this.passportNumber = passportNumber;
    }
    public String getPassportNumber(){
        return passportNumber;
    }
}

class Student{
    private String name;
    private Passport passport;
    Student(String name, Passport passport){
        this.name = name;
        this.passport = passport;
    }
    public void displayDetails(){
        System.out.println("Student name: " + name);
        System.out.println("Passport Number: " + passport.getPassportNumber());
    }
}
public class AssociationAggregationComposition {
    public static void main(String[] args){
        Passport passport = new Passport("1234567890");
        Student student = new Student("Ankit", passport);
        student.displayDetails();
    }
}*/
