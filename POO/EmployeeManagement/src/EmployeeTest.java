import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Luiz", "luiz@gmail.com", 5000.00, "Mid-level Developer", "Street");
        firstEmployee.view();
        Employee secondEmployee = new Employee("Marisa", "marisa@gmail.com", 25000.00, "TechLeader", "Avenue");
        secondEmployee.view();
    }
}
