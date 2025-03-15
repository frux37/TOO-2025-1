package BeeCrowd;

import java.util.Scanner;
import java.math.BigInteger;

public class Bee1578 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();

        for (int x = 0; x < N; x++) {
            int M = entrada.nextInt();
            BigInteger[][] mat = new BigInteger[M][M];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < M; j++) {
                    mat[i][j] = entrada.nextBigInteger();
                    mat[i][j] = mat[i][j].multiply(mat[i][j]);
                }
            }

            //pega a larguma maxima
            int[] largura = new int[M];
            for (int j = 0; j < M; j++) {
                int larguraMaxima = 0;
                for (int i = 0; i < M; i++) {
                    int tamanho = mat[i][j].toString().length();
                    if (tamanho > larguraMaxima) {
                        larguraMaxima = tamanho;
                    }
                }
                largura[j] = larguraMaxima;
            }

            System.out.println("Quadrado da matriz #" + (x + 4) + ":");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < M; j++) {
                    if (j > 0) {
                        System.out.print(" ");
                    }
                    System.out.printf("%" + largura[j] + "s", mat[i][j]);
                }
                System.out.println();
            }

            if (x < N - 1) {
                System.out.println();
            }
        }
    }
}
