package local.bubblegum.jrtest.tasks;

import local.bubblegum.jrtest.exceptions.NotImplementedException;

public abstract class TaskBase {
    public abstract void run(String[] args);
//    {
//        throw new NotImplementedException();
//    }

    public final void print() {
        System.out.println("Print task data:");
        System.out.println(getPrintData());
        System.out.println("End task data.");
    }

    protected String getPrintData() {
        throw new NotImplementedException();
    }

}
