package engtelecom.poo;

public class Aluno {

    // Atributos

    private String nome;
    private int idade;
    private String email;
    private int matricula;
    
    // Metodo construtor

    public Aluno(String nome, int idade, String email, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", email=" + email + ", matricula=" + matricula + "]";
    }

    
    
    
}
