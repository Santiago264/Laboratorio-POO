// Exception class for exceeding overdraft limit
public class OverdraftLimitExceededException extends Exception {
    public OverdraftLimitExceededException(String message) {
        super(message);
    }
}
