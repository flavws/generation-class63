
public class ClientTest {

    public static void main(String[] args) {

        Client firstClient = new Client("Flávia Maria", 11111111111L,"flavia@gmail.com", "(xx) 11 1111 1111", "Acesso");
        firstClient.view();
        Client secondClient = new Client("Thaiane", 22222222222L, "thaiane@gmail.com", "(xx) 22 2222 2222", "Rua");
        secondClient.view();

    }


}
