package DesafioTargetExercicio02;

import java.util.Scanner;

/**
 *
 * @author Gabriela Trombetta
 */

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3 = 0, number;

        System.out.print("Digite um número para verificar se ele faz parte da Sequência Fibonacci: ");
        number = input.nextInt();


        while (number > n3) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        if (number == 0) {
            System.out.printf("O número %d está na Sequência de Fibonacci.", number);
        } else if (number == n3) {
            System.out.printf("O numero %d faz parte da Sequência de Fibonacci.", number);
        } else {
            System.out.printf("O numero %d não faz parte da Sequência de Fibonacci.", number);
        }

    }

}
