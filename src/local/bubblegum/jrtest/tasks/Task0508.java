package local.bubblegum.jrtest.tasks;

import java.util.Scanner;

public class Task0508 {
    public String[] strings;

    public void task0508() {
        int n = 6;
        strings = new String[n];
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            strings[i] = console.nextLine();
        }
//        String[] strings = new String[]{"Hello", "Hello", "Java", "World", "Tasks", "World"};
        Boolean setinull = false;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[j] != null) {
                        if (strings[i].contentEquals(strings[j])) {
                            strings[j] = null;
                            setinull = true;
                        }
                    }
                }
                if (setinull) strings[i] = null;
                setinull = false;
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
        System.out.println();
    }
}
