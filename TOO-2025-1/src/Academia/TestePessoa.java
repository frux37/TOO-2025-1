/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia;

import java.time.LocalDate;

/**
 *
 * @author CHARLES
 */
public class TestePessoa {
    public static void main(String[] args) {
        
        Pessoa aluno = new Pessoa("Charles", "123.123.123-00");
        
        aluno.setDataNascimento(LocalDate.of(2001, 9, 5));

        AvaliacaoFisica av1 = new AvaliacaoFisica(aluno);
        av1.setPeso(70);
        av1.setAltura(1.82);
        aluno.adicionarAvaliacao(av1);

        AvaliacaoFisica av2 = new AvaliacaoFisica(aluno);
        av2.setPeso(75);
        av2.setAltura(1.82);
        aluno.adicionarAvaliacao(av2);

        System.out.println(aluno.exibirDados());
        
    }
}
