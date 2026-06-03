package Entrada_E_Saida;


import java.util.Scanner;

//Leia um número e mostre o dobro dele
public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número e descubra o dobro dele: ");
        int numero = scanner.nextInt();

        numero = numero * 2;

        System.out.println(numero);
    }
}
