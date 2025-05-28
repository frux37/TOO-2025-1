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
public class AvaliacaoFisica implements Exibivel {
    private Aluno aluno;
    private LocalDate data;
    private double peso;
    private double altura;
    private int idade;
    private double imc;
    private Professor professor;
    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyy");
    
    public AvaliacaoFisica(Aluno aluno) {
        this.aluno = aluno;
        data = LocalDate.now();
    }
    
    public Aluno getAluno() {
        return aluno;
    }
    
    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso inválido!");
        }
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida!");
        }
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getImc(){
        return imc;
    }
    
    public void setImc(double imc){
        this.imc = imc;
    }
    
    public Professor getProfessor(){
        return professor;
    }
    
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    
    public double calcularIMC() {
        imc = peso / (altura * altura);
        return imc;
    } 

    public int calcularIdade() {
        LocalDate nascimento = aluno.getDataNascimento();
        LocalDate hoje = LocalDate.now();

        idade = hoje.getYear() - nascimento.getYear();

        if (hoje.getMonthValue() < nascimento.getMonthValue() || (hoje.getMonthValue() == nascimento.getMonthValue() && hoje.getDayOfMonth() < nascimento.getDayOfMonth())) {
            idade--;
        }
        return idade;
    } 

    @Override
    public String exibirDados() {
        String dados = "Dados da Avaliacao Fisica:\n";
        dados += "Nome do aluno: " + aluno.getNome() + "\n";
        calcularIdade();
        if(idade != 0){
            dados += "Idade: " + idade + "\n";
        }
        if(data != null){
            dados += "Data da Avaliacao: " + formato.format(data) + "\n";
        }
        imc = calcularIMC();
        if(imc > 0){
            dados += "IMC: %.2f" + imc + "\n";
        }
        if(professor != null){
            dados += "Professor: " + professor;
        }
        return dados;
    }
    
    @Override
    public String toString() {
        return formato.format(data) + "- IMC " + imc;
    }
}
