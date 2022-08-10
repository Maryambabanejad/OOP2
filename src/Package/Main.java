package Package;

public class Main {
    public static void main(String[] args) {

        Person t1 = new Teacher("Ali", "Mohamadi", 35, 1006);
        Person t2 = new Teacher("Maryam", "Bagheri", 38, 1008);
        Person S1 = new Student("Hamidreza", "Kamani", 23, 25);
        Person s2 = new Student("Arezo", "kabiri", 33, 26);
        //درکلاس های abstract اجازه تعریف new object را نداریم پس آبجکت زیل خلاف قواعد بوده و میباید غیرفعال گردد
        //Person p1 = new Person("Mehdi", "Abasi", 45);
        S1.printPersonInfo();
        S1.print();
        t1.printPersonInfo();
        t1.print();
    }
}
