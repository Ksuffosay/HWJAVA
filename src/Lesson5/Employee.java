package Lesson5;

public class Employee {

    String fullName;
    String position;
    String email;
    String telephon;
    int salary;
    int age;

    Employee() {
        System.out.println("This is constructor");
    }

    public Employee(String fullName, String position, String email, String telephon, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephon = telephon;
        this.salary = salary;
        this.age = age;
        workerInfo();
    }

    public void workerInfo() {
        System.out.println(fullName + " " + position + " " + email + " " + telephon + " " + salary + " " + age);
    }
}




