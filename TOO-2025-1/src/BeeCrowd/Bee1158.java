/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeeCrowd;

import java.util.Scanner;
/**
 *
 * @author 20212pf.cc0012
 */
public class Bee1158 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int N = entrada.nextInt();
         
        for(int i = 0; i < N; i++) {
            
            int X = entrada.nextInt();
            int Y = entrada.nextInt();
            
            int soma = 0;
            
            if(X % 2 == 0) {
                X++;
            }
            
            for(int j = 0; j < Y; j++) {
                soma = soma + X;
                X = X + 2;
            }
            
            System.out.println(soma);
        }
        
    }
}
