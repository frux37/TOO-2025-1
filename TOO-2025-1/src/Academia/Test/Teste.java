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
import Academia.Model.Impressora;

/**
 *
 * @author CHARLES
 */
public class Teste {

    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Professor p = new Professor();
        p.setNome("Juka");
        p.setCpf("123.123.123-67");
        p.setEspecializacao("Musculação");
        
        System.out.println(p.exibirDados());
        
        Plano plano1 = new Plano();
        plano1.setNome("Básico");
        plano1.setDescricao("Acesso a musculação liberada");
        plano1.setValor(100);
        
        Convenio c = new Convenio();
        c.setNome("IFSUL");
        c.setDesconto(5);
        
        AlunoConvenio a = new AlunoConvenio(c);
        a.setNome("Vivente");
        a.setMatricula("123");
        
        a.setDataNascimento(LocalDate.parse("10/01/2008", formato));
        
        a.setDataMatricula(LocalDate.parse("10/04/2024", formato));
        
        a.setPlano(plano1);
        
        
        AvaliacaoFisica av1 = new AvaliacaoFisica(a);
        a.adicionarAvaliacao(av1);
        av1.setProfessor(p);
        
        System.out.println(a.exibirDados());
        
        System.out.println("---- ");
        System.out.println(av1.exibirDados());
        
        Impressora.imprimirDados(e);
    }
}
