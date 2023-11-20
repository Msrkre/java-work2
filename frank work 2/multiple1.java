 public class multiple1{
     public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}
interface A {
    void methodA();
}

abstract class B {
    abstract void methodB();
}

class MyClass extends B implements A {
    @Override
    void methodB() {
        System.out.println("Method B");
    }

    @Override
    public void methodA() {
        System.out.println("Method A");
    }}