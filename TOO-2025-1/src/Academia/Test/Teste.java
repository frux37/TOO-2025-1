/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import Academia.Model.Aluno;
import Academia.Model.AvaliacaoFisica;
import Academia.Model.Professor;
import Academia.Model.Plano;
import Academia.Model.AlunoConvenio;
import Academia.Model.Convenio;

/**
 *
 * @author CHARLES
 */
public class Teste {

    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Plano pBasico = new Plano("Basico", "Acesso a academia", 100.00);
        Plano pPremium = new Plano("Premium", "Acesso total + aulas especiais", 200.00);
        
        Convenio convenioIF = new Convenio();
        convenioIF.setNome("IFSUL");
        convenioIF.setDesconto(5);
        
        //
        Aluno alunoBasico = new Aluno();
        alunoBasico.setNome("Basicao da Silva");
        alunoBasico.setDataMatricula(LocalDate.parse("15/03/2025", formato));
        alunoBasico.setPlano(pBasico);
        
        System.out.println("=== ALUNO NORMAL ===");
        System.out.println(alunoBasico.exibirDados());
        
        AlunoConvenio alunoPremium = new AlunoConvenio(convenioIF);
        alunoPremium.setNome("Premiumzao Ferreira");
        alunoPremium.setDataMatricula(LocalDate.parse("10/01/2025", formato));
        alunoPremium.setPlano(pPremium);
        
        System.out.println("\n=== ALUNO CONVENIADO ===");
        System.out.println(alunoPremium.exibirDados());
    }
}
