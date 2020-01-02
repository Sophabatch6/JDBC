package Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class CompanyDiretory implements Employee {

    private List<Employee> employeeList = new ArrayList();

    @Override
    public void showInfo() {
        for (Employee emp : employeeList){
            emp.showInfo();
        }
    }
    public void addEmployee(Employee emp ){
        employeeList.add(emp);
    }
    public void removeEmployee(Employee emp ){}
}
