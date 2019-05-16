
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robson de Jesus
 */
public class Livros {
     
    //atributos da aplicação
    private int codigo;
    private String nome;
    private String autor;
    private Date ano;

    //construtor vazio
    public Livros() {
    }

    //contrutor com seus atributos para ter acesso
    public Livros(int codigo, String nome, String autor, Date ano) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
    }
    
    
    //gets e sets

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livros{" + "codigo=" + codigo + ", nome=" + nome + ", autor=" + autor + ", ano=" + ano + '}';
    }
    
}
