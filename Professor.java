package trabalho3poo;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Professor extends Geral {
    private String salario;
    private ArrayList<Professor> prof = new ArrayList();
    
    public Professor(String nome, String idade, String identificador, String salario) throws FileNotFoundException {
        super(nome, idade, identificador);
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public ArrayList<Professor> getProf() {
        return prof;
    }

    public void setProf(ArrayList<Professor> prof) {
        this.prof = prof;
    }
    
   
    
    
}
