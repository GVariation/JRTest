package local.bubblegum.jrtest.tasks;

public class TasksFactory {
    public static TaskBase newTask(String taskName) {

//        if ("Task0605".equals(taskName)) {
//            return new Task0605();
//        } else if ("Task0609".equals(taskName)) {
//            return new Task0609();
//        }
        TaskBase tBase = null;

        switch (taskName) {
            case "Task0605":
                tBase = new Task0605();
                break;
//                return new Task0605();
            case "Task0609":
                tBase = new Task0609();
                break;
//                return new Task0609();
            default: return null;
        }
        return tBase;

//        return null;
    }
}
