package trabalho3poo;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Aluno extends Geral {
    private String nota;
    private String matricula;
    private ArrayList<Aluno> aluno = new ArrayList();
    

    
    
    public Aluno(String nome, String idade, String identificador, String nota, String matricula) throws FileNotFoundException {
        super(nome, idade, identificador);
        this.nota = nota;
        this.matricula = matricula;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }
    
    
}
