package local.bubblegum.jrtest.tasks;

public class Task0510 {
    public int[][] result = new int[10][];

    public void task0510() {
        for (int i = 0; i < 10; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
