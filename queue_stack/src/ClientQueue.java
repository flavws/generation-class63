import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ClientQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        String client;
        Integer cod;

        Scanner read = new Scanner(System.in);

        do {
            System.out.println("***************************************");
            System.out.println("\n              Client Queue            ");
            System.out.println("\n**************************************");
            System.out.println("     (1) Adicionar cliente na Fila     ");
            System.out.println("     (2) Listar todos os Clientes      ");
            System.out.println("     (3) Retirar clientes da Fila      ");
            System.out.println("     (0) Sair      ");
            System.out.println("\n**************************************");
            System.out.println("Entre com a Opção desejada: ");

            cod = read.nextInt();

            switch (cod){
                case 1:
                    System.out.println("Digite o nome do cliente: \n");
                    read.nextLine();
                    client = read.nextLine();
                    queue.add(client);

                    break;
                case 2:
                    System.out.println("\nLista todos os clientes: \n" + queue);
                    break;
                case 3:
                    if (queue.isEmpty()){
                        System.out.println("\nFila vazia!\n");
                    } else {
                        System.out.println("Cliente " + queue.peek() + " vá até o caixa, por favor!\n");
                        queue.remove();
                    }
                    break;
                default:
                    System.out.println("Opção inválida, por favor, escolha novamente!\n");
            }
        }while (cod != 0);

    }
}
