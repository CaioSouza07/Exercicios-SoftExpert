package poo.interface_sort;

import java.util.Arrays;

public class TestarBubbleSort {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();

        int[] array = new int[5];
        array[0] = 3;
        array[1] = 5;
        array[2] = 4;
        array[3] = 10;
        array[4] = 1;

        System.out.println(Arrays.toString(array));
        bubbleSort.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
