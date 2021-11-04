package local.bubblegum.jrtest.tasks;

/**
 * Класс пример.
 * На основе задачи Task0607 добавили метод "Static" + контекст + Javadoc
 */
public class Task0607_StaticExt_PlusJavaDoc {
    public void task0607(String[] args) {
        this.signIn("qwe");
        Task0607_StaticExt_PlusJavaDoc.signIn("ert", "10");

    }

    /**
     * Проверка имени пользователя.
     * Если имя "user", прерываем выполнение метода, используя ключевое слово return.
     * @param username - Имя пользователя.
     */
    public void signIn(String username){
        //напишите тут ваш код

        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
    /**
     * Статичная проверка имени пользователя.
     * Если имя "user", прерываем выполнение метода, используя ключевое слово return.
     * @param username - Имя пользователя.
     */
    private static void signIn(String username, String context){
        //напишите тут ваш код

        System.out.println("Добро пожаловать " + username + " Ваш уровень: " + context);
        System.out.println("Очень скучали по Вам, " + username + " Ваш уровень: " + context);
    }
}
