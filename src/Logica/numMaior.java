package Logica;
import java.util.Scanner;

//Maior de três números
//Leia três números inteiros.
//Mostre qual é o maior.

public class numMaior {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 3 número e veja qual número é maior!!!...");

        System.out.println("Digite o primeiro número: ");
        int n1 = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = teclado.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = teclado.nextInt();

        if (n1 > n2 && n1 > n3){
                System.out.println("O primeiro número " + n1 + " é maior que " + n2 + " e " + n3 + ".");
        } else if (n2 > n1 && n2 > n3) {
                System.out.println("O segundo número " + n2 + " é maior que " + n1 + " e " + n3 + ".");
        } else {
                System.out.println("O terceiro número " + n3 + " é maior que " + n1 + " e " + n2 + ".");
        }
    }
}
