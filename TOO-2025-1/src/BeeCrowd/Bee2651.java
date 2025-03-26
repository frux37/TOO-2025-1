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
public class Bee2651 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String carta = entrada.nextLine().toLowerCase();
        
        if(carta.contains("zelda")) {
            System.out.println("Link Bolado");
        } else {
            System.out.println("Link Tranquilo");
        }
    }
}