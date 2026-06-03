package Entrada_E_Saida;


import java.util.Scanner;

//leia a temperatura em Celsius e converta para Fahrenheit
public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Converta sua temperatura em Fahrenheit-----");

        System.out.print("Informe a temperatura atual em Celsius: ");
        double tc = scanner.nextDouble();

        double tf = (tc * 1.8) + 32;

        System.out.println("A temperatura informada: " + tc + "° " + "em Fahrenheit é de: " + tf + "°.");

    }
}
