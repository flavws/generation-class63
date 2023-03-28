public class JuridicalPerson extends Client{
    private String cnpj;

    public JuridicalPerson(String name, Long zipcode, String email, String phone, String address, String cnpj) {
        super(name, zipcode, email, phone, address);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void view() {
        super.view();

        System.out.println("\nCNPJ: \n" + cnpj + "\n");
    }
}
