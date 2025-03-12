/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula3;
import java.util.Scanner;

/**
 *
 * @author 20212pf.cc0012
 */
public class TesteMatriz {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][] = new int[2][2];
        
        for(int i = 0; i < 2; i++) {
            
            for(int j = 0; j< 2; j++) {
                
                System.out.printf("[%d, %d]: " , i, j);
                
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("Matriz com o dobro do valor para os elementos: ");
        for(int i = 0; i < 2; i++) {           
            for(int j = 0; j< 2; j++) {
                System.out.print((matriz[i][j]*2)+ " ");  
            }
            System.out.println();
        }
    }
}
