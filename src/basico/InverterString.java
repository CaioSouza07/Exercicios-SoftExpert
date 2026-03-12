package basico;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = leitor.nextLine();

        String fraseInvertida = "";

        for (int i = frase.length() - 1; i >=0 ; i--) {
            fraseInvertida += String.valueOf(frase.charAt(i));
        }

        System.out.println("String reversa: " + fraseInvertida);

    }
}
