/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2;
import java.util.Scanner;
/**
 *
 * @author 20212pf.cc0012
 */
public class CalculoMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno: ");
        String nome = entrada.nextLine();
        
        System.out.println("Informe a 1a nota do aluno "+ nome);
        double n1 = entrada.nextInt();
        
        System.out.println("Informe a 2a nota do aluno "+ nome);
        double n2 = entrada.nextInt();
        
        System.out.println("Informe a 3a nota do aluno "+ nome);
        double n3 = entrada.nextInt();
        
        float media = (float)(n1+n2+n3) / 3; // Casting para conversão explicita
        
        System.out.println("A media do aluno " +nome+ ": " +media);
        System.out.printf("A media do aluno %s: %.2f\n", nome, media);
        
        /*if(media >= 6) {
            System.out.println("Aluno "+nome+ " foi aprovado");
        } else if(media >= 5) {
            System.out.println("Aluno "+nome+ " está em reprovado");
        } else {
            System.out.println("Aluno "+nome+ " está em reavaliacao");
        }
        */
        
        String resultado = media >= 6 ? "APROVADO" : "EM REAVALIACAO";
        
        System.out.println("Aluno(a)" +nome+ " "+resultado);
    }
}
