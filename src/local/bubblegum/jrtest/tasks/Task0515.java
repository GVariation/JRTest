package local.bubblegum.jrtest.tasks;

import java.util.Arrays;

public class Task0515 {
    public int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public void task0515() {
        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
    }
}

