package estrutura.dados.exercicio;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dA, dB, flag;
        double[] A;
        double[] B;
        double[] C;

        do {
            System.out.print("Insira qual o tamanho do vetor A: ");
            dA = scan.nextInt();
            System.out.print("Insira qual o tamanho do vetor B: ");
            dB = scan.nextInt();

            A = new double[dA];
            B = new double[dB];
            C = new double[dA];

            System.out.println("Insira os valores do vetor A");

            for (int i = 0; i < A.length; i++) {
                System.out.print("Insira o valor do " + (1 + i) + " elemento: ");
                A[i] = scan.nextDouble();
            }

            System.out.println("Insira os valores do vetor B");

            for (int i = 0; i < B.length; i++) {
                System.out.print("Insira o valor do " + (1 + i) + " elemento: ");
                B[i] = scan.nextDouble();
            }

            if (dA == dB) {
                for (int i = 0; i < A.length; i++) {
                    C[i] = A[i] + B[i];
                }
            }

            System.out.print("Vetor A: ");

            for (double temp : A) {
                System.out.print(temp + " ");
            }

            System.out.print("\n" + "Vetor B: ");

            for (double temp : B) {
                System.out.print(temp+ " ");
            }

            System.out.print("\n" + "Vetor C: ");

            for (double temp : C) {
                System.out.print(temp + " ");
            }

            do {
                System.out.print("\n" + "Deseja executar o programa novamente? (1 - Sim) (2 - Não): ");
                flag = scan.nextInt();
            } while (flag != 1 && flag != 2);

        } while (flag != 2);
    }
}

