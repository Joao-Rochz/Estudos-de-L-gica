package Entrada_E_Saida;

import java.util.Scanner;

//leia a idade de uma pessoa e informe quantos anos ela tem daqui a 10 anos
public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Descubra sua idade daqui a 10 anos-----");

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        int somaIdade = idade + 10;
        System.out.println("Sua idade daqui a 10 anos é: " + somaIdade + " anos");



    }
}
