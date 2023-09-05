package pro.sky.gohl.skyprogohlexceptions;

import java.util.regex.Pattern;

public class AuthenticationValidator {
    private static Pattern regex = Pattern.compile("^[A-Za-z1-9_]{1,20}$");
    public static void checkInformationPerson(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException{
        checkLogin(login);
        checkPassword(password);
        checkEqualsPassword(password, confirmPassword);

    }
    private static void checkLogin(String login) {
        if (!login.matches(regex.pattern())) {
            throw new WrongLoginException("Логин должен быть не более 20 символов, содержать латинские буквы, цифры и знак подчеркивания!");

        }
    }
    private static void checkPassword(String password) throws WrongPasswordException {
        if (!password.matches(regex.pattern())) {
            throw new WrongPasswordException("Пароль должен быть не более 20 символов, содержать латинские буквы, цифры и знак подчеркивания!");

        }
    }
    private static void checkEqualsPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и повторный пароль должны совпадать!");

        }
    }

}
