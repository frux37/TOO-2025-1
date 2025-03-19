/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author 20212PF.CC0012
 */
public class Iniciais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome completo: ");
        
        String nome = entrada.nextLine();
        nome = nome.trim(); // atualiza a variável nome removendo os espaços dela
        nome = nome.toUpperCase(); // Atualiza a variável nome, deixando todos os caracteres em maiúsculo
        
        System.out.println("Nome infomado: " +nome);
        System.out.println("Inicial: " +nome.charAt(0));
        
        if(nome.equals("fedorento da silva")) {
            System.out.println("Nome ja cadastrado");
        }
        
        ///vai pegar a string e retornar todos os caracteres até o delimitador que passei por parametro
        int indexEspaco = nome.indexOf(' ');
        String primeiroNome = nome.substring(0, indexEspaco);
        System.out.println("Primeiro nome: " + primeiroNome);
        
        //primeiro nome utilizando vetor
        String[] partesNome = nome.split(" ");
        System.out.println("Nome no vetor: " + Arrays.toString(partesNome));
        System.out.println("Primeiro nome no vetor: " + partesNome[0]);
        
        System.out.println("Iniciais do nome: ");
        for(String parte : partesNome) {
            System.out.print(""+parte.charAt(0));
        }
        System.out.println(" ");
    }
}