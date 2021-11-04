package local.bubblegum.jrtest.tasks;

import java.util.Arrays;

public class Task0605 extends TaskBase {
    String[] strOut = new String[2];

    @Override
    protected String getPrintData() {
        StringBuilder res = new StringBuilder();
        res.append("Source: " + strOut[0] + "\n");
        res.append("Reverse: " + strOut[1]);
        return res.toString();
    }

    @Override
    public void run(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        printArrayS(array, 0);
        reverseArray(array);
        printArray(array);
        printArrayS(array, 1);
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

    public void printArrayS(int[] array, int idx) {
        if (strOut[idx] == null) {
            strOut[idx] = "";
        }
        for (int i : array) {
            if (strOut[idx].length() > 0) {
                strOut[idx] += ", ";
            }
            strOut[idx] += i;
        }
    }
}
