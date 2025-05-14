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

/**
 *
 * @author CHARLES
 */
public class Teste {

    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Plano p1 = new Plano("Premium", "Acesso total", 150.00);

        // Com direito a desconto
        Aluno a1 = new Aluno();
        a1.setNome("Fulano de Tal");
        a1.setDataMatricula(LocalDate.parse("02/01/2025", formato));
        a1.setPlano(p1);
        a1.verificaDesconto();
        System.out.println(a1.exibirDados());

        System.out.println("--------");

        // Sem direito a desconto
        Aluno a2 = new Aluno();
        a2.setNome("Urubulina da Silva");
        a2.setDataMatricula(LocalDate.parse("07/05/2025", formato));
        a2.setPlano(p1);
        a2.verificaDesconto();
        System.out.println(a2.exibirDados());
    }
}
