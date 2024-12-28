package zad2;

abstract class ValidationRule {
    protected final Object value;
    private final String errorMessage;

    protected ValidationRule(Object value, String errorMessage) {
        this.value = value;
        this.errorMessage = errorMessage;
    }

    public abstract boolean isValid();

    public String getErrorMessage() {
        return errorMessage;
    }
}
