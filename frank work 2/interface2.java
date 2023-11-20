 public class interface2{
        public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        employee.eat();
    }
}
interface Worker {
    void work();
}

interface Eater {
    void eat();
}

class Employee implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }}
