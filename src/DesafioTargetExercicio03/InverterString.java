package DesafioTargetExercicio03;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        String fraseInvertida = "";

        System.out.print("Escreva uma frase: ");
        frase = input.nextLine();

        for(int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }

        System.out.printf("Frase original: %s \n", frase);
        System.out.printf("Frase invertida: %s", fraseInvertida);
    }
}
