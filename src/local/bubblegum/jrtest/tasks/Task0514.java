package local.bubblegum.jrtest.tasks;

import java.util.Arrays;

public class Task0514 {
    public String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public void task0514() {
        //напишите тут ваш код
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));

    }
}

