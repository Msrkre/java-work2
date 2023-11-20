 public class interface1{
     public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

interface C extends B {
    void methodC();
}

class MyClass implements C {
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }

    @Override
    public void methodC() {
        System.out.println("Method C");
    }}
