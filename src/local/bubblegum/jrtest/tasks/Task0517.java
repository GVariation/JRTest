package local.bubblegum.jrtest.tasks;

import java.util.Arrays;

public class Task0517 {
    public int[][] result = new int[2][];
    public int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public void task0517() {
        //напишите тут ваш код
        int halfArray = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        result[0] = Arrays.copyOfRange(array, 0, halfArray);
        result[1] = Arrays.copyOfRange(array, halfArray, array.length);
        System.out.println(Arrays.deepToString(result));
    }
}