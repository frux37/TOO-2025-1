/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author CHARLES
 */
public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String CPF;
    //private double altura;
    //private double peso; 
    private ArrayList<AvaliacaoFisica> avaliacoes;
    
    public Pessoa(String nome){
        this.nome = nome;
        this.avaliacoes = new ArrayList<>();
    }
    
    public Pessoa(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
        this.avaliacoes = new ArrayList<>();
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
        CPF = cpf.replace(".", "").replace("-", "").trim();
        
        if(cpf != null && cpf.length() == 11) {
            CPF = cpf;
        } else {
            System.out.println("CPF inválido!");
        }
    }
    
    /*public double getAltura() {
        return altura;
    }
    void setAltura(double altura){
        if(altura > 0){
            this.altura = altura;
        } else {
            System.out.println("Altura inválida!");
        }
    }*/
    
    /*public double getPeso(){
        return peso;
    }
    void setPeso(double peso){
        if(peso > 0){
            this.peso = peso;
        } else {
            System.out.println("Peso inválido!");
        }
    }*/
    
    public ArrayList<AvaliacaoFisica> getAvaliacoes() {
        return avaliacoes;
    }

    public void adicionarAvaliacao(AvaliacaoFisica avaliacao) {
        avaliacoes.add(avaliacao);
    }
    
    public String exibirDados(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String aux = "Dados da Pessoa cadastrada: \n";
        aux += "Nome: "+nome+"\n";
        if(CPF!=null)
            aux += "CPF: "+CPF+"\n";
        if(dataNascimento != null)
            aux += "Data de Nascimento: "+ formato.format(dataNascimento) + "\n";
        aux += "Quantidade de Avaliacoes: " + avaliacoes.size();
        return aux;
    }
    
    /*public double calcularIMC() {
        double imc = peso / (altura * altura);
        return imc;
    } 
    
    public String grauDeObesidade(){
        double imc = calcularIMC();
        
        if (imc < 18.5) {
            return "Voce esta abaixo do peso ideal";
        } else if (imc >= 18.5 && imc < 25.0) {
            return "Parabens - Voce esta em seu peso ideal";
        } else if (imc >= 25.0 && imc < 30.0) {
            return "Voce esta acima de seu peso (sobrepeso)";
        } else if (imc >= 30.0 && imc < 35.0) {
            return "Obesidade Grau 1";
        } else if (imc >= 35.0 && imc < 40.0) {
            return "Obesidade Grau 2";
        } else {
            return "Obesidade Grau 3";
        }
    }
    
    public String exibirDados2(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String aux = "Dados da Pessoa cadastrada: \n";
        aux += "Nome: " + nome + "\n";
        if(CPF != null)
            aux += "CPF: " + CPF + "\n";
        if(dataNascimento != null)
            aux += "Data de Nascimento: " + formato.format(dataNascimento) + "\n";
        
        //double imc = calcularIMC();
        //aux += String.format("IMC: %.2f\n", imc);
        aux += grauDeObesidade();

        return aux;
    }*/
}
