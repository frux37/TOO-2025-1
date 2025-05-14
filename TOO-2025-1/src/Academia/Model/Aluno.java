/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia.Model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


/**
 *
 * @author CHARLES
 */
public class Aluno extends Pessoa{
    private String matricula;
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
    private Plano plano;
    private LocalDate dataMatricula;
    private double valorMensalidade;

    
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
        if (plano == null || dataMatricula == null) return;

        LocalDate hoje = LocalDate.now();
        
        int meses = hoje.getMonthValue() - dataMatricula.getMonthValue() + (12 * (hoje.getYear() - dataMatricula.getYear()));

        if (meses >= 3) {
            valorMensalidade = plano.getValor() * 0.9;
        } else {
            valorMensalidade = plano.getValor();
        }
    }
    
    @Override
    public String exibirDados() {
        String aux = super.exibirDados();
        aux += "\nMatricula: " + matricula;

        if (plano != null) {
            aux += "\nPlano: " + plano.getNome();
            aux += "\nMensalidade: R$" + String.format("%.2f", valorMensalidade);
        }

        aux += "\nAvaliacoes Fisicas Realizadas: " + avaliacoes.size() + "\n";
        return aux;
    }
}
