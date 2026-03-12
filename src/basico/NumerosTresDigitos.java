package basico;

import java.util.ArrayList;
import java.util.List;

public class NumerosTresDigitos {
    public static void main(String[] args) {


        int[] numerosUnicos = new int[4];
        numerosUnicos[0] = 1;
        numerosUnicos[1] = 2;
        numerosUnicos[2] = 3;
        numerosUnicos[3] = 4;

        int soma = 0;

        for (int algarismo : numerosUnicos){
            List<Integer> numero = new ArrayList<>();
            numero.add(algarismo);

            for (int segAlgarismo : numerosUnicos){

                if (verificador(numero, segAlgarismo)){
                    numero.add(segAlgarismo);

                    for (int terAlgarismo : numerosUnicos){

                        if (verificador(numero, terAlgarismo)){
                            numero.add(terAlgarismo);
                            String numeroCerto = "" + numero.get(0) + numero.get(1) + numero.get(2);
                            int numeroInt = Integer.parseInt(numeroCerto);
                            System.out.println(numeroInt);
                            soma += 1;
                            numero.remove(2);
                        }

                    }
                    numero.remove(1);
                }
            }

        }

        System.out.println("O número total de números de três dígitos é " + soma);


    }
    public static boolean verificador(List<Integer> algarismos, int numero){
        for (int i = 0; i < algarismos.size(); i++) {
            if (algarismos.get(i) == numero){
                return false;
            }
        }
        return true;
    }

}
