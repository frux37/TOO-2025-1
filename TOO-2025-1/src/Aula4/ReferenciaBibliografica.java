/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4;
import java.util.Scanner;
/**
 *
 * @author 20212PF.CC0012
 */
public class ReferenciaBibliografica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe seu nome completo");
        
        String nomeCompleto = entrada.nextLine();
        
        System.out.println(nomeCompleto);
        
        String[] parteNome = nomeCompleto.split(" ");
        System.out.print(parteNome[parteNome.length-1]+" ");
        for(int i = 0; i < parteNome.length-1; i ++) {
            System.out.print(parteNome[i].charAt(0)+".");
        }
        
        System.out.println(" ");
        
        String referencia = "";
        int indexUltimoNome = nomeCompleto.lastIndexOf(" ");
        String ultimoNome = nomeCompleto.substring(indexUltimoNome);
        referencia += ultimoNome+", ";
        referencia += nomeCompleto.charAt(0)+".";
        for(int i = 0; i < indexUltimoNome; i++) {
            if(nomeCompleto.charAt(i) == ' ') {
                referencia += nomeCompleto.charAt(i+1)+".";
            }
        }
        System.out.println(referencia);
    }
}