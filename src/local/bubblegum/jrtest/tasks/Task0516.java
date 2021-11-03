package local.bubblegum.jrtest.tasks;

import java.util.Arrays;

public class Task0516 {

    public int[] array = new int[21];
    public int valueStart = 10;
    public int valueEnd = 13;

    public void task0516() {
        //напишите тут ваш код
        int halfarray = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;

            Arrays.fill(array, 0, halfarray, valueStart);
            Arrays.fill(array, halfarray, array.length, valueEnd);

        System.out.println(Arrays.toString(array));

    }
}
