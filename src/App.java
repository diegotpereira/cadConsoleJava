import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Olá seja bem vindo, Continue!");

        dados();
    }

    public static void dados() {

        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        Aluno aluno;

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("----Menu----");

            System.out.println("Escolha uma opção: ");

            System.out.println("1 - Inserir Aluno"); 
            System.out.println("2 - Listar Aluno");
            System.out.println("3 - Sair");

            

            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(teclado.nextLine());

            if (opcao == 1) {
                
                // criar objeto
                aluno = new Aluno();

                System.out.println("Digite seu cpf: ");
                aluno.setCpf(Integer.parseInt(teclado.nextLine()));

                System.out.println("Digite seu nome: ");
                aluno.setNome(teclado.nextLine());

                listaAlunos.add(aluno);

            } else if (opcao == 2) {
                
                if (listaAlunos.isEmpty()) {
                    
                    System.out.println("Ainda não existem pessoas cadastradas.");
                    teclado.nextLine();

                } else {

                    System.out.println(listaAlunos.toString());

                    System.out.println("Pressione uma tecla para prosseguir.");
                    teclado.nextLine();
                }
            }
        } while (opcao != 0);

        teclado.close();
    }
}
