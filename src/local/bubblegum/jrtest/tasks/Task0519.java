package local.bubblegum.jrtest.tasks;

import java.util.Arrays;

public class Task0519 {
    public int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public int element = 1;

    public void task0519() {
        //напишите тут ваш код
        int[] arraySort = Arrays.copyOfRange(array, 0, array.length);
        Arrays.sort(arraySort);
        System.out.println(Arrays.binarySearch(arraySort, element) >= 0);
        System.out.println(Arrays.toString(array));
    }
}