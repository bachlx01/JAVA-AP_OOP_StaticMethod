
public class StaticMethod {
    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Lê");
        Student s2 = new Student(222, "Xuân");
        Student s3 = new Student(333, "Bách");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

