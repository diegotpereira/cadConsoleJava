import java.util.ArrayList;

public class Aluno {
    
    private int cpf;
    private String nome;

    ArrayList<Aluno> listaDeALunos;

    

    public Aluno() {
    }

    

    public Aluno(int cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno [cpf=" + cpf + ", nome=" + nome + "]";
    }
}
