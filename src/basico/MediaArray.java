package basico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MediaArray {
    public static void main(String[] args) {

        int[] array = new int[7];
        array[0] = 1;
        array[1] = 4;
        array[2] = 17;
        array[3] = 7;
        array[4] = 25;
        array[5] = 3;
        array[6] = 100;

        double media = 0;

        //aq calculo de media
        for (int num : array){
            media += num;
        }
        media = media / array.length;

        System.out.println("Array original: ");
        System.out.println(Arrays.toString(array));

        System.out.println(String.format("A média do array é: %.2f" , media));

        System.out.println("Os numeros no array que são maiores que a média são: ");
        //aq ver os maiores que a media
        for (int num : array){
            if (num > media){
                System.out.println(num);
            }
        }

    }
}
