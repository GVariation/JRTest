package local.bubblegum.jrtest.tasks;

public class Task0509 {
    public int[][] MULTIPLICATION_TABLE;

    public void task0509() {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                MULTIPLICATION_TABLE[x][y] = (x + 1) * (y + 1);
                System.out.print(MULTIPLICATION_TABLE[x][y] + " ");
            }
            System.out.println();
        }
    }
}
