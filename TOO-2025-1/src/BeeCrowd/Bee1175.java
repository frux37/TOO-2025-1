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
public class Bee1175 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int N[] = new int[20];
        
        for(int i = 0; i < N.length; i++) {
            N[i] = entrada.nextInt();
        }
        
        for(int i = 0; i < N.length / 2; i++) {
            int aux = N[i];
            N[i] = N[N.length - 1 - i];
            N[N.length - 1 - i] = aux;
        }
        
        for(int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}
