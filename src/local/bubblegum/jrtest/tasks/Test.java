package local.bubblegum.jrtest.tasks;

import java.util.Arrays;

public class Test {
    public int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void test() {
        Arrays.fill(x, 0, 3, 999);
        String str = Arrays.toString(x);
        System.out.println(str);
    }
}