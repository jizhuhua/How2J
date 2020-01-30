package how2j.ExceptionDemo;

public class OverdraftException extends Exception {
    double deficit;

    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }


}
