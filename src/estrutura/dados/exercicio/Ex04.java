package estrutura.dados.exercicio;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mesaEscolhida, numeroMesas;
        int[] mesas;
        int[] numeroCadeirasTotal = new int[1];

        System.out.print("Escolha quantas mesas serão usadas: ");
        numeroMesas = scan.nextInt();

        while (numeroMesas < 50 || numeroMesas > 200) {
            System.out.println("\n" + "Número de mesas inválido. O número de mesas deve ser maior ou igual a 50 e menor ou igual a 200");
            System.out.print("Insira outro valor: ");
            numeroMesas = scan.nextInt();
        }

        mesas = new int[numeroMesas];

        numeroCadeirasTotal[0] = numeroMesas * 6;

        for (int i = 0; i < numeroMesas; i++) {
            mesas[i] = 6;
        }

        do {
            mesaEscolhida = escolherMesa(scan, numeroMesas);

            if (realizarReservaMesa(scan, mesas, numeroCadeirasTotal, mesaEscolhida)) {
                System.out.println("\n" + "Reserva realizada com sucesso");
            } else {
                System.out.println("\n" + "O número de cadeiras da mesa é insuficiente para atender a reserva");
            }

            if (numeroCadeirasTotal[0] == 0) {
                System.out.println("\n" + "Todas as mesas estão lotadas. O programa será encerrado!!!");
                break;
            }

        } while (mesaEscolhida != 0);
    }

    public static int escolherMesa(Scanner scan, int numeroMesas) {
        int mesaEscolhida;

        System.out.println("\n" + "Escolha uma mesa para realizar uma reserva");
        System.out.println("A mesa deve possuir um código maior ou igual a 1 e menor ou igual a " + numeroMesas);
        System.out.print("Caso queira sair do programa insira o número zero: ");
        mesaEscolhida = scan.nextInt();

        if (mesaEscolhida == 0) {
            return mesaEscolhida;
        }

        while (mesaEscolhida < 0 || mesaEscolhida > numeroMesas) {
            System.out.println("\n" + "Código de mesa inválido. O código deve ser maior ou igual a 1 e menor ou igual a " + numeroMesas);
            System.out.print("Insira outro valor: ");
            mesaEscolhida = scan.nextInt();
        }

        return mesaEscolhida;
    }

    public static boolean realizarReservaMesa(Scanner scan, int[] mesas, int[] numeroCadeirasTotal, int numeroMesa) {
        int numeroCadeiras;

        System.out.print("\n" + "Escolha quantas cadeiras você deseja reservar na mesa " + numeroMesa + ": ");
        numeroCadeiras = scan.nextInt();

        while (numeroCadeiras < 1 || numeroCadeiras > 6) {
            System.out.println("\n" + "Número de cadeira inválido. Escolha um número maior ou igual a 1 e menor ou igual a 6");
            System.out.print("Insira outro valor: ");
            numeroCadeiras = scan.nextInt();
        }

        if (mesas[numeroMesa] - numeroCadeiras >= 0) {
            mesas[numeroMesa] -= numeroCadeiras;
            numeroCadeirasTotal[0] -= numeroCadeiras;
            return true;
        }

        return false;
    }


}
