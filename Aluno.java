// Definindo a classe Aluno
public class Aluno {
    // Atributos da classe Aluno
    String nome; 
    int idade;    
    String curso; 

    // Construtor da classe Aluno que inicializa os atributos
    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;    // Atribui o valor do parâmetro 'nome' ao atributo 'nome'
        this.idade = idade;  // Atribui o valor do parâmetro 'idade' ao atributo 'idade'
        this.curso = curso;  // Atribui o valor do parâmetro 'curso' ao atributo 'curso'
    }

    // Sobrescrevendo o método toString para fornecer uma representação personalizada do objeto
    @Override
    public String toString() {
        // Retorna uma string formatada com as informações do aluno
        return "Nome: " + nome + ", Idade: " + idade + ", Curso: " + curso;
    }
}
