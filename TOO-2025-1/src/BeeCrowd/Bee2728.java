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
public class Bee2728 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNextLine()) {
            String linha = entrada.nextLine();
            String[] palavras = linha.split("-");

            char[] letras = {'c', 'o', 'b', 'o', 'l'};
            boolean cobol = true;

            for (int i = 0; i < 5; i++) {
                String palavra = palavras[i].toLowerCase();
                char primeiraLetra = palavra.charAt(0);
                char ultimaLetra = palavra.charAt(palavra.length() - 1);
                char letraEsperada = letras[i];

                if (!(primeiraLetra == letraEsperada || ultimaLetra == letraEsperada)) {
                    cobol = false;
                    break;
                }
            }

            if(cobol == true) {
                System.out.println("GRACE HOPPER");
            } else {
                System.out.println("BUG");
            }
        }
    }
}
