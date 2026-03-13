package poo.interface_sort;

public class BubbleSort implements Sortable {

    private boolean troca = true;

    @Override
    public void sort(int[] array) {

       while (troca){
           troca = false;

           for (int i = 0; i < array.length -1; i++) {
               if (array[i] > array[i+1]){
                   int aux = array[i];
                   array[i] = array[i+1];
                   array[i+1] = aux;
                   troca = true;
               }
           }

       }

    }
}
