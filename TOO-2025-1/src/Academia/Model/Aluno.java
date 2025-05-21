/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia.Model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;



/**
 *
 * @author CHARLES
 */
public class Aluno extends Pessoa{
    protected String matricula;
    protected List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
    protected Plano plano;
    protected LocalDate dataMatricula;
    protected double valorMensalidade;

    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
        if(plano != null){
            verificaDesconto();
        }
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
    
    public void adicionarAvaliacao(AvaliacaoFisica avaliacao){
        avaliacoes.add(avaliacao);
    }
    
    public String mostraAvaliacoes(){
        String aux = "Historico de Avaliacoes: \n";
        for(AvaliacaoFisica cadaAvaliacao: avaliacoes){
            aux += "-> " + cadaAvaliacao + "\n";
        }
        return aux;
    }
    
    public void verificaDesconto() {
        int anos = Period.between(dataMatricula, LocalDate.now()).getYears();
        int meses = Period.between(dataMatricula, LocalDate.now()).getMonths();

        meses += (anos * 12);

        if (plano != null) {
            valorMensalidade = plano.getValor();

            if (meses >= 3) {
                valorMensalidade -= (valorMensalidade * 0.1);
            } else {

                System.out.println("Aluno não possui tempo para desconto");
            }
        } else {
            System.out.println("Aluno não possui plano selecionado. Informe o plano do aluno");
        }
    }
    
    public List<AvaliacaoFisica> getAvaliacoes(){
        return avaliacoes;
    }

    @Override
    public String exibirDados() {
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String aux = super.exibirDados();
        
        aux += "\nMatricula: " + matricula;
        
        if(dataMatricula != null) {
            aux += "\nData de Matricula: " + formato.format(dataMatricula);
        }
        
        aux += "\nAvaliacoes Fisicas Realizadas: " + avaliacoes.size();
        
        if (plano != null) {
            aux += "\nPlano: " + plano.getNome();
            aux += "\nMensalidade: R$" + String.format("%.2f", valorMensalidade);
        }
        
        aux += "\n";
        
        return aux;
    }
}
