import Employee.Employee;

public class Department {
    private String name;
    private employee[] emp = new employee[10];
    
    private int index =  -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public employee[] getEmp() {
        return emp;
    }

    public void setEmp(employee[] emp) {
        this.emp = emp;
    }
    
    public void addEmployee(employee employee) {
        if (index < emp.length) {
            index++;
            emp[index] = employee;
        }
    }
    
    public employee[] getEmployee() {
        employee[] empDetail = new employee[index + 1];
        
        for (int i=0; i < empDetail.length; i++) {
            empDetail[i] = emp[i];
        }
        return empDetail;
    }
    
    public int employeeIndex() {
        return index;
    }
    
    public employee getEmployeeID(int empID) {
        employee detail = null;
        
        for (employee employees: emp) {
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