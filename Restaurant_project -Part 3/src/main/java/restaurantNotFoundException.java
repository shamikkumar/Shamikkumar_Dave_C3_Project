public class restaurantNotFoundException extends Throwable {
    public restaurantNotFoundException() {
    }

    public restaurantNotFoundException(String restaurantName) {
        super(restaurantName);
    }

    public restaurantNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public restaurantNotFoundException(Throwable cause) {
        super(cause);
    }

    public restaurantNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
