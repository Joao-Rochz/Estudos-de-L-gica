package LogicaIntermediaria;

//Fatorial
//Leia um número inteiro positivo
//calcule o fatorial dele

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número e descubra o fatorial dele: ");
        int num = teclado.nextInt();

        long fatorial = 1;

        for (int i = num; i > 1 ; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}
