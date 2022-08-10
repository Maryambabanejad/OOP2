package Package;

import javax.jws.soap.SOAPBinding;

public class Student extends Person {
    int StudentId;
    public Student(String name, String family, int age, int StudentId) {
        super(name, family, age);
        StudentId = StudentId;
    }
    @Override
    int sum(int a, int b) {
        return a + b;
    }
@Override
    void print() {
        System.out.println("StudentId Is :" +StudentId );
    }
}
