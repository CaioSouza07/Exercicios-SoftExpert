package basico;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();

        if (numero % 2 == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
