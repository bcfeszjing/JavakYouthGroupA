import Employee.Employee;
import Department.Department;

public class HRApp_CaseStudy {

    public static void main(String[] args) {
        System.out.println("HR App Starts");
        
        employee emp1 = new employee(101, "Ann", 1234.56);
        employee emp2 = new employee(102, "Bob", 1200.34);
        employee emp3 = new employee(103, "Ray", 1122.33);
        
        Department dept = new Department("Department Education");

        System.out.println(dept.toString());
        
        dept.addEmployee(emp1);
        dept.addEmployee(emp2);
        dept.addEmployee(emp3);
        
        employee[] emp = dept.getEmployee();
        
        for (employee employees : emp) {
            System.out.println(employees);
        }
        
        System.out.println("Total Salary: " + dept.totalSalary());
        System.out.println("Average Salary: " + dept.averageSalary());

    }
    
}
