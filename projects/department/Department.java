package department;

import java.util.ArrayList;

import employee.Employee;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // private employee array field with capacity of 10
    private ArrayList<Employee> emps = new ArrayList<>(10);

    public void addEmployees(Employee e) {
        if (emps.size() >= 10) {
            System.out.println("Limit reached!");
            return;
        }
        emps.add(e);
    }

    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(emps);
    }

    public Employee checkEmp(int ID) {
        for (Employee emp : emps) {
            if (ID == emp.getID()) {
                return emp;
            }
        }
        return null;
    }

    public int numOfEmployees() {
        return emps.size();
    }

    public double totalSalary() {
        double total = 0.0;
        for (Employee e : emps) {
            total += e.getSalary();
        }
        return total;
    }

    public double meanSalary() {
        double average = 0.00;
        double total = totalSalary();
        int allEmps = numOfEmployees();
        if (total == 0 || allEmps == 0) {
            return average;
        }
        average = (total / allEmps);
        return average;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Employees: " + getEmployees();
    }
}