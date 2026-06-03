package LacosDeRepeticao;



//Tabuada
// Leia um número.
// Mostrar a tabuada dele de 1 até 10


import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número e descubra a tabuada dele de 1 até 10!!!...");

        System.out.print("Digite um número: ");
        int num = teclado.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}
