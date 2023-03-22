package HT5;

public class Employee {
    private String name;
    private char sex;
    private int age;
    private int salary;

    public Employee(String name, char sex, int age, int salary) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean isSameName(Employee employee){
        // if (this.name == name);
     return name.equals(employee.getName());

    }
//
//    public Boolean isSameName(Employee employee){
//       // if (this.name == name);
//        if (name.equals(employee.name))
//            return true;
//        else
//            return false;
//    }
}
