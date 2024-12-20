<<<<<<< HEAD
import Employee.Employee;

public class Department {
    private String name;
    private employee[] emp = new employee[10];
    
    private int index =  -1;

=======
public class Department {
    private String name;
    private Employee[] emp = new Employee[10];
    
    private int index =  -1;

>>>>>>> fc20c9a55fa779f03007bbd552ba0fe988170eef
    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public employee[] getEmp() {
        return emp;
    }

    public void setEmp(employee[] emp) {
        this.emp = emp;
    }
    
    public void addEmployee(employee employee) {
=======
    public Employee[] getEmp() {
        return emp;
    }

    public void setEmp(Employee[] emp) {
        this.emp = emp;
    }
    
    public void addEmployee(Employee employee) {
>>>>>>> fc20c9a55fa779f03007bbd552ba0fe988170eef
        if (index < emp.length) {
            index++;
            emp[index] = employee;
        }
    }
    
<<<<<<< HEAD
    public employee[] getEmployee() {
        employee[] empDetail = new employee[index + 1];
=======
    public Employee[] getEmployee() {
        Employee[] empDetail = new Employee[index + 1];
>>>>>>> fc20c9a55fa779f03007bbd552ba0fe988170eef
        
        for (int i=0; i < empDetail.length; i++) {
            empDetail[i] = emp[i];
        }
        return empDetail;
    }
    
    public int employeeIndex() {
        return index;
    }
    
<<<<<<< HEAD
    public employee getEmployeeID(int empID) {
        employee detail = null;
        
        for (employee employees: emp) {
=======
    public Employee getEmployeeID(int empID) {
        Employee detail = null;
        
        for (Employee employees: emp) {
>>>>>>> fc20c9a55fa779f03007bbd552ba0fe988170eef
            if (employees.getId() == empID) {
                detail = employees;
                break;
            }
        }
        return detail;
    }
    
    public double totalSalary() {
        double salary = 0;
        for (int i = 0; i < index; i++) {
            salary = salary + emp[i].getSalary();
        }
        return salary;
    }
    
    public double averageSalary() {
        if (index > -1)  {
            return totalSalary() / (index + 1);
        }
        return 0;
    }
}