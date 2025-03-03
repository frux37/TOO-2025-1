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
public class Bee1151 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        
        int a = 0;
        int b = 1;
        int c;
        
        
        for(int i = 1; i < n + 1; i++) {
            
            if(i == n) {
                System.out.print(a);
            } else {
                System.out.print(a + " ");
                c = a + b;
                a = b;
                b = c;
            }
        }
        System.out.println();
    }
}
