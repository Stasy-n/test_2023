package HT5;

public class Salary {

    public double getSum(Employee[] employeeArray){
        double sum = 0;
        for (Employee employee:employeeArray) {
             sum += employee.getSalary();
        }
        return sum;
    }
}
