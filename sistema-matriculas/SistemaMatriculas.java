// Importação das bibliotecas necessárias
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaMatriculas {

    // Lista estática de alunos que armazena objetos do tipo Aluno
    static ArrayList<Aluno> alunos = new ArrayList<>();
    // Instância do Scanner para capturar entradas do usuário
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        // Laço de repetição para manter o menu ativo até a escolha de sair
        do {
            // Exibe o menu para o usuário
            System.out.println("\n=== Sistema de Matrículas ===");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Remover aluno");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();  // Captura a opção escolhida
            scanner.nextLine(); // Limpa o buffer de entrada

            // Switch para executar a ação de acordo com a opção escolhida
            switch (opcao) {
                case 1:
                    cadastrarAluno();  // Chama o método para cadastrar um aluno
                    break;
                case 2:
                    listarAlunos();    // Chama o método para listar os alunos cadastrados
                    break;
                case 3:
                    removerAluno();    // Chama o método para remover um aluno
                    break;
                case 4:
                    System.out.println("Saindo... Até logo!"); // Mensagem de saída
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4); // Repete até a opção ser 4 (Sair)
    }

    // Método para cadastrar um aluno
    static void cadastrarAluno() {
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();  // Captura o nome do aluno
        System.out.print("Idade do aluno: ");
        int idade = scanner.nextInt();    // Captura a idade do aluno
        scanner.nextLine(); // Limpa o buffer de entrada
        System.out.print("Curso do aluno: ");
        String curso = scanner.nextLine();  // Captura o curso do aluno

        // Cria um novo objeto Aluno e o adiciona à lista
        alunos.add(new Aluno(nome, idade, curso));
        System.out.println("Aluno cadastrado com sucesso!");
    }

    // Método para listar todos os alunos cadastrados
    static void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("\n--- Lista de Alunos ---");
            // Itera pela lista de alunos e exibe seus dados
            for (Aluno aluno : alunos) {
                System.out.println(aluno);  // Chama o método toString da classe Aluno
            }
        }
    }

    // Método para remover um aluno
    static void removerAluno() {
        System.out.print("Digite o nome do aluno a remover: ");
        String nome = scanner.nextLine();  // Captura o nome do aluno a ser removido
        Aluno alunoParaRemover = null;

        // Percorre a lista de alunos e encontra o aluno com o nome correspondente
        for (Aluno aluno : alunos) {
            if (aluno.nome.equalsIgnoreCase(nome)) {
                alunoParaRemover = aluno;  // Armazena o aluno encontrado
                break;
            }
        }

        // Remove o aluno da lista se encontrado
        if (alunoParaRemover != null) {
            alunos.remove(alunoParaRemover);
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
