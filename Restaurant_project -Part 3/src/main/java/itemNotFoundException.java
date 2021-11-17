public class itemNotFoundException extends Throwable {
    public itemNotFoundException() {
    }

    public itemNotFoundException(String itemName) {
        super(itemName);
    }

    public itemNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public itemNotFoundException(Throwable cause) {
        super(cause);
    }

    public itemNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
