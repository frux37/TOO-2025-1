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
public class Bee2815 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String linha = entrada.nextLine();
        String[] palavras = linha.split(" "); 

        for (int i = 0; i < palavras.length; i++) {
            String palavra = palavras[i];

            if (palavra.length() >= 4 && palavra.substring(0, 2).equals(palavra.substring(2, 4))) {
                palavra = palavra.substring(2);
            }
            
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(palavra);
        }
        System.out.println();
    }
}
