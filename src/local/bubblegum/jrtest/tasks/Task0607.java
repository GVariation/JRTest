package local.bubblegum.jrtest.tasks;

public class Task0607 {

    public void task0607(String[] args) {
        signIn("User");
        signIn("user");
        signIn("Артём");
    }

    public void signIn(String username) {
        //напишите тут ваш код
        if ("user".equalsIgnoreCase(username)) {
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }


}
