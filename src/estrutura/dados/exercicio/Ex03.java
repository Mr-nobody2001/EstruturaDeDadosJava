package estrutura.dados.exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dA, dB, flag;
        int[] A;
        int[] B;
        int[] uniao;
        int[] intersecao;

        do {
            System.out.print("Insira qual o tamanho do vetor A: ");
            dA = scan.nextInt();
            System.out.print("Insira qual o tamanho do vetor B: ");
            dB = scan.nextInt();

            A = new int[dA];
            B = new int[dB];
            uniao = new int[dA + dA];

            intersecao = new int[Math.min(dA, dB)];

            System.out.println("Insira os valores do vetor A");

            for (int i = 0; i < A.length; i++) {
                System.out.print("Insira o valor do " + (1 + i) + " elemento: ");
                A[i] = scan.nextInt();
            }

            System.out.println("Insira os valores do vetor B");

            for (int i = 0; i < B.length; i++) {
                System.out.print("Insira o valor do " + (1 + i) + " elemento: ");
                B[i] = scan.nextInt();
            }

            int j, contadorI = 0;

            for (int i = 0; i < dA; i++) {
                for (j = 0; j < dB && A[i] != B[j]; j++);

                if (j < dB) {
                    intersecao[contadorI] = A[i];
                    contadorI++;
                }
            }

            int contadorU = 0;

            for (int i = 0; i < dA; i++) {
                for (j = 0; j < contadorI && A[i] != intersecao[j]; j++);

                if (j == contadorI) {
                    uniao[contadorU] = A[i];
                    contadorU++;
                }
            }

            for (int i = 0; i < dB; i++) {
                for (j = 0; j < contadorI && B[i] != intersecao[j]; j++);

                if (j == contadorI) {
                    uniao[contadorU] = B[i];
                    contadorU++;
                }
            }

            for (int temp : intersecao) {
                uniao[contadorU] = temp;
                contadorU++;
            }

            Arrays.sort(uniao);

            System.out.print("Vetor A: ");

            for (int temp : A) {
                System.out.print(temp + " ");
            }

            System.out.print("\n" + "Vetor B: ");

            for (int temp : B) {
                System.out.print(temp+ " ");
            }

            System.out.print("\n" + "Vetor União: ");

            for (int temp : uniao) {
                if (temp != 0) {
                    System.out.print(temp + " ");
                }
            }

            System.out.print("\n" + "Vetor Interseção: ");

            for (int temp : intersecao) {
                if (temp != 0) {
                    System.out.print(temp + " ");
                }
            }

            do {
                System.out.print("\n" + "Deseja executar o programa novamente? (1 - Sim) (2 - Não): ");
                flag = scan.nextInt();
            } while (flag != 1 && flag != 2);

        } while (flag != 2);
    }
}
