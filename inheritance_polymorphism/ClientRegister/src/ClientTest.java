public class ClientTest {
    public static void main(String[] args) {

        NaturalPerson firstPerson = new NaturalPerson("Lais", 68903781L, "lais@gmail.com", "(xx) xx xxxx xxxx", "Avenida Aturiá", "63884304062");
        firstPerson.view();
        NaturalPerson secondPerson = new NaturalPerson("Marilia", 88060165L, "marilia@gmail.com", "(xx) xx xxxx xxxx", "Servidão Dona Rita", "39856702003");
        secondPerson.view();

        JuridicalPerson thirdPerson = new JuridicalPerson("ABCD LTDA.", 26495250L, "abcd@mail.com", "(xx) xx xxxx xxxx", "Avenida Vilar dos Teles", "39775757000192");
        thirdPerson.view();
        JuridicalPerson fourthPerson = new JuridicalPerson("EFGH LTDA.", 64207335L, "efgh@mail.com", "(xx) xx xxxx xxxx", "Planalto de Monteserra The", "64839949000162");
        fourthPerson.view();
    }
}
