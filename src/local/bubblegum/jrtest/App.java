package local.bubblegum.jrtest;

import local.bubblegum.jrtest.tasks.TaskBase;
import local.bubblegum.jrtest.tasks.TasksFactory;

public class App {


    public static void main(String[] args) {

//        Task0602 task0602 = new Task0602();
//        task0602.task0602();

//        Task0607_StaticExt_PlusJavaDoc task0607StaticExtPlusJavaDoc = new Task0607_StaticExt_PlusJavaDoc();
//        task0607StaticExtPlusJavaDoc.task0607(args);

//        TaskBase qwe = new Task0609();
//        qwe.run(args);
//        qwe.print();

        TaskBase task = TasksFactory.newTask("Task0605");
        if (task != null) {
            task.run(args);
            task.print();
            System.out.println(task);
        }
    }


}
