package SecondTask;

import SecondTask.Exceptions.WrongLoginException;
import SecondTask.Exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        try {
            boolean result = Info.Authorization("12345", "KKKr88", "KKKr88");
            System.out.println(result);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
