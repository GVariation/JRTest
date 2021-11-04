package local.bubblegum.jrtest.tasks;

import java.util.Arrays;

public class Task0605 {
    public void task0605() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public void reverseArray(int[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length / 2; i++) {
            int el = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = el;
        }
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
