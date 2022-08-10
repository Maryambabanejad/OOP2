package Package;

public class Teacher extends Person {
    int TeacherCod;
    public Teacher(String name,String family,int age,int TeacherCod ){
        super(name,family,age);
        TeacherCod = TeacherCod;

    }

    @Override// دوباره نویسی متد abstract کلاس والد
    int sum(int a, int b) {
        return a+b+1000;
    }

    @Override
    void print() {
        System.out.println("TeacherCod Is : "+ TeacherCod);
    }
}
