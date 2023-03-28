public class NaturalPerson extends Client{

    private String cpf;

    public NaturalPerson(String name, Long zipcode, String email, String phone, String address, String cpf) {
        super(name, zipcode, email, phone, address);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("\nCPF: \n" + cpf + "\n");
    }
}
