package Condicionais;


import java.util.Scanner;

//leia duas notas e informe se o aluno foi aprovado (média = 7)
public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Veja se você foi aprovado, reprovado ou está em recuperaçaõ-----");

        System.out.print("Informe sua nota da prova mensal: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Informe sua nota da prova bimestral: ");
        double nota2 = scanner.nextDouble();

        double soma = (nota1 + nota2) / 2;

        if (soma >= 7){
            System.out.println("Sua nota foi: " + soma);
            System.out.println("Você está APROVADO");
        } else if (soma >=5 ) {
            System.out.println("Sua nota foi: " + soma);
            System.out.println("Você está em RECUPERAÇÃO");
        } else {
            System.out.println("Sua nota foi: " + soma);
            System.out.println("Você está REPROVADO");
        }


    }
}
