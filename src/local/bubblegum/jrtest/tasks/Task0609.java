package local.bubblegum.jrtest.tasks;

import local.bubblegum.jrtest.exceptions.NotImplementedException;

public class Task0609 extends TaskBase {
    long nineD;

    @Override
    public void run(String[] args) {
        nineD = ninthDegree(2);
    }

    @Override
    protected String getPrintData() {
        return "ninthDegree(zn): " + nineD;
    }

    public long cube(long a) {
        return a*a*a;
    }

    //напишите тут ваш код
    public long ninthDegree(long zn) {
        return cube(cube(zn));
    }
}