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
public class Bee2729 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        entrada.nextLine();
        
        for(int i = 0; i < N; i++) {
            String linha = entrada.nextLine();
            String[] lista = linha.split(" ");
            
            int tam = lista.length;
            for(int j = 0; j < tam - 1; j++) {
                for(int k = 0; k < tam - j - 1; k++) {
                    if(lista[k].compareTo(lista[k + 1]) > 0) {
                        String aux = lista[k];
                        lista[k] = lista[k + 1];
                        lista[k + 1] = aux;
                    }
                }
            }
            
            System.out.print(lista[0]);
            for(int j = 1; j < tam; j++) {
                if(!lista[j].equals(lista[j - 1])) {
                    System.out.print(" " + lista[j]);
                }
            }
            System.out.println();
        }
    }
}
