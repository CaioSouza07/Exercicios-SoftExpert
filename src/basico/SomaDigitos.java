package basico;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {

        Scanner leitor =  new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();
        String numTexto = numero + "";

        int soma = 0;
        for (int i = 0; i < numTexto.length(); i++){
            soma += Integer.parseInt(String.valueOf(numTexto.charAt(i)));
        }

        System.out.println("A soma dos algarismos é: " + soma);

    }
}
