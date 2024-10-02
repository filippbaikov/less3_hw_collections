
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employees = new ArrayList<>();
    Employee employee;

    public void addToList(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return Arrays.asList(this.employees).toString();
    }

    public Employee findEmpByName(String name) {
        return this.employees.stream().filter(entry -> entry.getName().equals(name)).findFirst().get();
    }

    public Employee findEmpByPhone(String phone) {
        return this.employees.stream().filter(entry -> entry.getPhone().equals(phone)).findFirst().get();
    }

    public Employee findEmpByID(int ID) {
        String str=Integer.toString(ID);
        return this.employees.stream().filter(entry -> entry.getID().equals(str)).findFirst().get();
    }
}
