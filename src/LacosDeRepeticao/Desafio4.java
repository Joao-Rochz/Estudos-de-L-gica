package LacosDeRepeticao;


// conte quantos números pares existem etre 1 a 100
public class Desafio4 {
    public static void main(String[] args) {

        int conta = 0;
        for (int i = 0; i < 100; i++) {
             if (i % 2 == 0){
                 conta++;
             }
        }

        System.out.println(conta);
    }
}
