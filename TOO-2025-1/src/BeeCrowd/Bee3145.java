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
public class Bee3145 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        //System.out.println("Informe a quantidade de anoes: ");
        int N = entrada.nextInt();
        
        //System.out.println("Informe a distancia ate a montanha: ");
        int X = entrada.nextInt();
        
        double dias = (double) X /(N + 2);
        
        System.out.printf("%.2f\n", dias);
    }
}
