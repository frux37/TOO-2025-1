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
public class Bee2091 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        while (true) { 
            int N = entrada.nextInt();
            if (N == 0) {
                break;
            }

            long[] nums = new long[N];
            long resultado = 0;

            for (int i = 0; i < N; i++) {
                nums[i] = entrada.nextLong(); 
                resultado = resultado ^ nums[i]; 
            }

            System.out.println(resultado);
        }
    }
}

/*Scanner entrada = new Scanner(System.in);
        
        while (true) { 
            int N = entrada.nextInt();
            
            if (N == 0) {
                break;
            } 

            long[] nums = new long[N];

            for (int i = 0; i < N; i++) {
                nums[i] = entrada.nextLong();
            }

            for (int i = 0; i < N; i++) {
                int cont = 0;
                for (int j = 0; j < N; j++) {
                    if (nums[i] == nums[j]) {
                        cont++;
                    }
                }
                if (cont % 2 == 1) {
                    System.out.println(nums[i]);
                    break;
                }
            }
        }*/