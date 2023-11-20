 public class multiple2{
         public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}
interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class MyClass implements B {
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }}
