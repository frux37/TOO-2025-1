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
public class TesteVetor {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int[5];
        
        for(int i = 0; i<numeros.length; i++) {
            
            System.out.println("Informe o " + (i+1) + " numero");
            
            numeros[i] = entrada.nextInt();
        }
        
        /*System.out.println("Números informado: { ");
        for(int valor : numeros) {
            System.out.println(valor+, " ");
        }
        System.out.println("}");*/
        
        System.out.print("Numeros informado: {");
        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]); 
        }
        System.out.println("}");
        
        int soma = 0;
         
        for(int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }
        
        double media = (double) soma / numeros.length;
        
        System.out.println("A soma dos numeros eh: " + soma);
        System.out.println("A media dos numeros eh: " + media);
        
        //int maior = Integer.MAX_VALUE;
        //int maior = Integer.MIN_VALUE;
        
        int maior = numeros[0];
        int menor = maior;
        
        for(int i = 0; i <numeros.length; i++) {
            if(numeros[i] < maior) {
                maior = numeros[i];
            }
            
            if(numeros[i] > menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("O menor valor eh: " + maior);
        System.out.println("O maior valor eh: " + menor);
    }
}

