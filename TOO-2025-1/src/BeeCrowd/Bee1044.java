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
public class Bee1044 { 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }
    }
}
