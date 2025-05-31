import java.util.Scanner;

import department.Department;
import employee.Employee;

public class HRApp {
    public static void main(String[] args) {
        int id = 0;
        System.out.println("Starting HR App...");

        Department ICT = new Department("ICT");
        System.out.println("Department: " + ICT.getName());

        Employee emp1 = new Employee(1, "John", 25000.00);
        Employee emp2 = new Employee(2, "Alice", 30000.00);
        Employee emp3 = new Employee(3, "Bob", 28000.00);
        Employee emp4 = new Employee(4, "Diana", 35000.00);
        Employee emp5 = new Employee(5, "Charles", 27000.00);
        Employee emp6 = new Employee(6, "Eve", 32000.00);
        Employee emp7 = new Employee(7, "Frank", 31000.00);
        Employee emp8 = new Employee(8, "Grace", 295040.00);
        Employee emp9 = new Employee(9, "Hank", 330020.00);
        Employee emp10 = new Employee(10, "Ivy", 26000.00);

        // limit reached
        Employee emp11 = new Employee(11, "Ivy2", 26000.00);

        emp1.setid(40);
        emp1.getid();

        ICT.addEmployees(emp1);
        ICT.addEmployees(emp2);
        ICT.addEmployees(emp3);
        ICT.addEmployees(emp4);
        ICT.addEmployees(emp5);
        ICT.addEmployees(emp6);
        ICT.addEmployees(emp7);
        ICT.addEmployees(emp8);
        ICT.addEmployees(emp9);
        ICT.addEmployees(emp10);
        ICT.addEmployees(emp11);

        // System.out.println("Department details: " + ICT.toString());
        System.out.println("Employee: " + ICT.getEmployees());

        System.out.println("Total emps: " + ICT.numOfEmployees());
        // System.out.println(IC T.checkEmp(001));
        System.out.println("Total Salary: " + ICT.totalSalary());
        System.out.println("Average Salary: " + ICT.meanSalary() + "\n");

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Find an employee using an ID: ");
            id = scanner.nextInt();
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error occured: " + e.toString());
            return;
        }
        Employee emp = ICT.checkEmp(id);
        if (emp == null) {
            System.out.println("Employee with ID: " + id + " not found");
            return;
        }
        System.out.println("Employee found " + emp);
    }
}
