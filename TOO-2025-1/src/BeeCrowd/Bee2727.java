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
public class Bee2727 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        while (entrada.hasNextInt()) {
            int N = entrada.nextInt();
            entrada.nextLine();
            
            for (int i = 0; i < N; i++) {
                String linha = entrada.nextLine().trim(); 
                String[] grupos = linha.split(" +"); 
                
                if (grupos.length == 0 || grupos[0].isEmpty()) {
                    System.out.println('a');
                    continue;
                }
                
                int numConjuntos = grupos.length;
                int tamanhoConjunto = grupos[0].length();
                char letra = (char) ('a' + (numConjuntos - 1) * 3 + (tamanhoConjunto - 1));
                System.out.println(letra);
            }
        }
    }
}