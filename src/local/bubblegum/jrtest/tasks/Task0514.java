package local.bubblegum.jrtest.tasks;

import java.util.Arrays;

public class Task0514 {
    public String[][] strings = new String[][]{{"π", "π", "π", "π"}, {"π", "π", "π", "π"}, {"π", "π", "π", "π"}, {"π", "π", "π", "π"}};
    public int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public void task0514() {
        //Π½Π°ΠΏΠΈΡΠΈΡΠ΅ ΡΡΡ Π²Π°Ρ ΠΊΠΎΠ΄
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));

    }
}

