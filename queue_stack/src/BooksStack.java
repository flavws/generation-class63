import java.util.Scanner;
import java.util.Stack;

public class BooksStack {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        String bookName;
        Integer cod;

        Scanner read = new Scanner(System.in);

        do {
            System.out.println("***********************************************");
            System.out.println("\n              BooksStack                      ");
            System.out.println("\n**********************************************");
            System.out.println("     (1) Adicionar um novo Livro na Pilha     ");
            System.out.println("     (2) Listar todos os Livros da Pilha      ");
            System.out.println("     (3) Retirar um Livro da Pilha            ");
            System.out.println("     (0) Sair                                 ");
            System.out.println("\n**************************************");
            System.out.println("Entre com a Opção desejada: ");

            cod = read.nextInt();

            switch (cod){
                case 1:
                    System.out.println("Digite o nome do livro: \n");
                    read.nextLine();
                    bookName = read.nextLine();
                    books.push(bookName);
                    System.out.println("\nLivro salvo com sucesso!");

                    break;
                case 2:
                    System.out.println("\nLista de todos os livros: \n" + books);
                    break;
                case 3:
                    if (books.isEmpty()){
                        System.out.println("\nPilha vazia!\n");
                    } else {
                        books.pop();
                        System.out.println("\nLivro retirado com sucesso! " + books);
                    }
                    break;
                default:
                    System.out.println("Opção inválida, por favor, escolha novamente!\n");
            }
        }while (cod != 0);
    }
}
