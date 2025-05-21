/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author CHARLES
 */
public abstract class Pessoa implements Exibivel{
    private String nome;
    private LocalDate dataNascimento;
    private String CPF;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String getCpf() {
        return CPF;
    }
    public void setCpf(String cpf){
        if (cpf != null) {
            cpf = cpf.replace(".", "").replace("-", "").trim();
            if (cpf.length() == 11) {
                CPF = cpf.substring(0, 3) + "." +
                    cpf.substring(3, 6) + "." +
                    cpf.substring(6, 9) + "-" +
                    cpf.substring(9, 11);
            } else {
                System.out.println("CPF inválido!");
            }
        }
    }
   
    @Override
    public String exibirDados(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String aux = "Dados da Pessoa cadastrada: \n";
        aux += "Nome: " + nome + "\n";
        if(CPF != null)
            aux += "CPF: " + CPF +"\n";
        if(dataNascimento != null)
            aux += "Data de Nascimento: "+ formato.format(dataNascimento);
        return aux;
    }

    @Override
    public String toString() {
        return nome;
    }
}
