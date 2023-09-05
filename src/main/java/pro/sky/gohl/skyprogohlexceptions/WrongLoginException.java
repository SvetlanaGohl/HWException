package pro.sky.gohl.skyprogohlexceptions;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException(String message) {
        super(message);
    }
}
