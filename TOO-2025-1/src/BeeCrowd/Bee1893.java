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
public class Bee1893 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        
        if(b >= 0 && b <= 2) {
            System.out.println("nova");
        } else if (b >= 3 && b <= 96) {
            if(b > a) {
                System.out.println("crescente");
            } else {
                System.out.println("minguante");
            }
        } else {
            System.out.println("cheia");
        }
    }
}
