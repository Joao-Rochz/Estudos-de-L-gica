package Condicionais;


import java.util.Scanner;

//leia um numero e informe se é positivo, negativo ou zero.
public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Descubra se o número é positivo, negativo ou zero-----");
        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();

        if (n1 > 0){
            System.out.println("O número " + n1 + " é positivo");
        } else if (n1 < 0) {
            System.out.println("O número " + n1 + " é negativo");
        } else {
            System.out.println("O número " + n1 + " é zero");
        }





    }
}
