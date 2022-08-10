package Package;

public abstract class Person {
    String Name;
    String Family;
    int Age;
//final float = 3.1425f;
    public Person(String name, String family, int age) {
        Name = name;
        Family = family;
        Age = age;
    }

    void printPersonInfo() {
        System.out.println("Name Is:" + Name +"\t" +"Family Is :" + "\t" +Family +"\t"+ "Age Is :" + Age);
    }

    abstract int sum(int a, int b);
    // متد های abstract  بدنه ندارند
    //return a+b;

        abstract void print ();
    static int mul(int a,int b) {
        return a*b;
    }
}

