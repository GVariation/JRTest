package local.bubblegum.jrtest.tasks;

import java.util.Scanner;

public class Task0511 {
    public int[][] multiArray;

    public void task0511() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            multiArray = new int[n][];
            for (int i = 0; i < n; i++) {
                int k = in.nextInt();
                if (k > 0) {
                    multiArray[i] = new int[k];
                }
            }
        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print((multiArray[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
