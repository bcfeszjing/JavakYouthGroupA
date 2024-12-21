import Department.Department;
import Employee.Employee;

public class HRApp_CaseStudy {

    public static void main(String[] args) {
        System.out.println("HR App Starts");
        
        Employee emp1 = new Employee(101, "Ann", 1234.56);
        Employee emp2 = new Employee(102, "Bob", 1200.34);
        Employee emp3 = new Employee(103, "Ray", 1122.33);
        
        Department dept = new Department("Department Education");

        System.out.println(dept.toString());
        
        dept.addEmployee(emp1);
        dept.addEmployee(emp2);
        dept.addEmployee(emp3);
        
        Employee[] emp = dept.getEmployee();
        
        for (Employee employees : emp) {
            System.out.println(employees);
        }
        
        System.out.println("Total Salary: " + dept.totalSalary());
        System.out.println("Average Salary: " + dept.averageSalary());

    }
    
}
