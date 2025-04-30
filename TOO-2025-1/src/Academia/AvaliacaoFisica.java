/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author CHARLES
 */
public class AvaliacaoFisica {
    private Pessoa aluno;
    private LocalDate data;
    private double peso;
    private double altura;
    private int idade;
    private double imc;
    
    public AvaliacaoFisica(Pessoa aluno) {
        this.aluno = aluno;
        this.data = LocalDate.now();
    }
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public Pessoa getAluno() {
        return aluno;
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

    public double calcularIMC() {
        double imc = peso / (altura * altura);
        return imc;
    } 

    public int calcularIdade() {
        LocalDate nascimento = aluno.getDataNascimento();
        LocalDate hoje = LocalDate.now();

        int idade = hoje.getYear() - nascimento.getYear();

        if (hoje.getMonthValue() < nascimento.getMonthValue() || (hoje.getMonthValue() == nascimento.getMonthValue() && hoje.getDayOfMonth() < nascimento.getDayOfMonth())) {
            idade--;
        }
        return idade;
    } 

    public String exibirDados() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dados = "Avaliação Física:\n";
        dados += "Nome do aluno: " + aluno.getNome() + "\n";
        dados += "Idade: " + calcularIdade() + " anos\n";
        dados += "Data da avaliação: " + formato.format(data) + "\n";
        dados += String.format("IMC: %.2f\n", calcularIMC());
        return dados;
    }
}
