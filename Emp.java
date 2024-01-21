import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee {
    private String employeeId;
    private String name;
    private String position;

    // Constructors, getters, and setters

    public Employee(String employeeId, String name, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
    }

    // Additional methods if needed
}

class EmployeeManagementSystem {
    private ArrayList<Employee> employees;

    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void updateEmployee(String employeeId, String newName, String newPosition) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                employee.setName(newName);
                employee.setPosition(newPosition);
                break;
            }
        }
    }

    public void deleteEmployee(String employeeId) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmployeeId().equals(employeeId)) {
                iterator.remove();
                break;
            }
        }
    }

    public void displayEmployees() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Position: " + employee.getPosition());
            System.out.println("-------------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Code to add an employee
                    break;
                case 2:
                    // Code to update an employee
                    break;
                case 3:
                    // Code to delete an employee
                    break;
                case 4:
                    employeeManagementSystem.displayEmployees();
                    break;
                case 5:
                    System.out.println("Exiting the Employee Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
