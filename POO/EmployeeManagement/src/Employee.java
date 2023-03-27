public class Employee {

    private String name;
    private String email;
    private Double salary;
    private String role;
    private String address;

    public Employee(String name, String email, Double salary, String role, String address) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.role = role;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void view(){
        System.out.println("Dados do funcionário: \n" + name + "\n" + email + "\n" + salary + "\n" + role + "\n" + address );
    }
}
