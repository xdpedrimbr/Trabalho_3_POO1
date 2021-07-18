package trabalho3poo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;



public abstract class Geral {
    private String nome;
    private String idade;
    private String identificador;
    private ArrayList<Geral> lista = new ArrayList<Geral>();
    private static PrintWriter pw;
    private static File f;
    private static String dados = "";
    private static String dadosa = "";
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public ArrayList<Geral> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Geral> lista) {
        this.lista = lista;
    }

    public Geral(String nome, String idade, String identificador) throws FileNotFoundException {
        this.nome = nome;
        this.idade = idade;
        this.identificador = identificador;
        
        f = new File("C:/Users/rober/Desktop/saida.txt");        
        pw = new PrintWriter(f);
        
    }
    
    public static void print() throws Exception{
        try{
        pw.append(getDados());
        pw.append(getDadosa());
        pw.close();
        }
        
        catch(Exception e){
            throw new Exception(e);
        }
    }

    public static String getDados() {
        return dados;
    }

    public static void setDados(String dados) {
        Geral.dados ="Professor;" + Geral.getDados() + dados + "\n";
        
    }
    
    public static void adiciona(){
        
    }

    public static String getDadosa() {
        return dadosa;
    }

    public static void setDadosa(String aDadosa) {
        Geral.dadosa ="Aluno;" + Geral.getDadosa() + aDadosa + "\n";;
    }
    
    
    
}
