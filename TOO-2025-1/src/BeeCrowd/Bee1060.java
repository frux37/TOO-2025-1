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
public class Bee1060 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        int positivos = 0;
        
        for(int i = 0; i < 6; i++) {
            double valores = entrada.nextDouble();
            if(valores > 0) {
                positivos++;
            }
        }
        
        System.out.println(positivos + " valores positivos");
    }
}
