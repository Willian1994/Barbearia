package Model;

import java.util.Date;

public class Usuario {
    
    private int id;
    private String nome;
    private String senha;
    private String nevelAcesso;
    private char sexo;
    private Date dateNascimento;
    private String telefone;
    private String email;
    private String rg;

    public Usuario(int id, String nome, String senha, String nevelAcesso, char sexo, Date dateNascimento, String telefone, String email, String rg) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.nevelAcesso = nevelAcesso;
        this.sexo = sexo;
        this.dateNascimento = dateNascimento;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }

    public Usuario(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNevelAcesso() {
        return nevelAcesso;
    }

    public void setNevelAcesso(String nevelAcesso) {
        this.nevelAcesso = nevelAcesso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDateNascimento() {
        return dateNascimento;
    }

    public void setDateNascimento(Date dateNascimento) {
        this.dateNascimento = dateNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    

    
}
