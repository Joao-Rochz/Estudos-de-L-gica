package Entrada_E_Saida;


import java.util.Scanner;

// Leia dois números e mostre a soma
public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;
        System.out.println("A soma do número " + n1 + " e " + n2 + " é de: " + soma);
    }
}
