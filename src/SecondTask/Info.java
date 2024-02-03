package SecondTask;

import SecondTask.Exceptions.WrongLoginException;
import SecondTask.Exceptions.WrongPasswordException;

public class Info {

    public static boolean Authorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginException("The login contains spaces or longer than 20 symbols!");
        }

        if (password.length() > 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("The password contains spaces or longer than 20 symbols or does not contain at least one digit!");
        }

        if (password.equals(confirmPassword)) {
            return true;
        }

        return false;
    }
}
