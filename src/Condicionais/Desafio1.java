package Condicionais;
import java.util.Scanner;


//Par ou ímpar
//Leia um número inteiro
//gitInforme se ele é par ou ímpar.


public class Desafio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número e veja se é par ou impar: ");
        int num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é Par");
        } else {
            System.out.println("O número " + num + " é Impar");
        }
        teclado.close();
    }
}
