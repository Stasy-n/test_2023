package HT5;

public class Main {
    public static void main(String[] args) {
//        Person nastia = new Person("Stasy", 'F', 1997);
//        System.out.println(nastia.getName());
//        System.out.println(nastia.getAge());
//        Person mom = new Person("Lyda", 'F', 1976);
//        // nastia.s
//        System.out.println(nastia.getFullInfo());
        Employee employee1 = new Employee("Oleg", 'M', 30,1000);
        Employee employee2 = new Employee("Kate", 'F', 26, 500);
        System.out.println(employee2.isSameName(employee1));
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("John", 'M', 44, 40);
        employees[1] = new Employee("Mary", 'F',66,60000);
        employees[2] = new Employee("Bob", 'M',3,70000);
        // create a Salary object
        Salary salary = new Salary();
        // call the getSum method
        double totalSalary = salary.getSum(employees);
        System.out.println("Total salary: " + totalSalary);

        
    }
//    public static void sum(int firstName, int second){
//        int sum = firstName + second;
//        System.out.println("sum = " +sum);
//    }
//    public static void sumpf3(int first, int second, int third){
//        int sum = first + second + third;
//        System.out.println("sum3 = " +sum);
//    }


}