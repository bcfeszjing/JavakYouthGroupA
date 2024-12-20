public class Department {
    private String name;
    private Employee[] emp = new Employee[10];
    
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

    public Employee[] getEmp() {
        return emp;
    }

    public void setEmp(Employee[] emp) {
        this.emp = emp;
    }
    
    public void addEmployee(Employee employee) {
        if (index < emp.length) {
            index++;
            emp[index] = employee;
        }
    }
    
    public Employee[] getEmployee() {
        Employee[] empDetail = new Employee[index + 1];
        
        for (int i=0; i < empDetail.length; i++) {
            empDetail[i] = emp[i];
        }
        return empDetail;
    }
    
    public int employeeIndex() {
        return index;
    }
    
    public Employee getEmployeeID(int empID) {
        Employee detail = null;
        
        for (Employee employees: emp) {
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