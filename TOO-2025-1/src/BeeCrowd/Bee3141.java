/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeeCrowd;
import java.util.Scanner;

/**
 *
 * @author CHARLES
 */
public class Bee3141 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nome = entrada.nextLine();
        String dataAtual = entrada.nextLine();
        String dataNascimento = entrada.nextLine();
        
        String[] partesDataAtual = dataAtual.split("/");
        int dia = Integer.parseInt(partesDataAtual[0]);
        int mes = Integer.parseInt(partesDataAtual[1]);
        int ano = Integer.parseInt(partesDataAtual[2]);
        
        String[] partesDataNascimento = dataNascimento.split("/");
        int diaNascimento = Integer.parseInt(partesDataNascimento[0]);
        int mesNascimento = Integer.parseInt(partesDataNascimento[1]);
        int anoNascimento = Integer.parseInt(partesDataNascimento[2]);
        
        int idade = ano - anoNascimento;
        
        if (mes < mesNascimento || (mes == mesNascimento && dia < diaNascimento)) {
            idade--;
        }
        
        if (dia == diaNascimento && mes == mesNascimento) {
            System.out.println("Feliz aniversario!");
        }
        
        System.out.println("Voce tem " + idade + " anos " + nome + ".");
    }
}
