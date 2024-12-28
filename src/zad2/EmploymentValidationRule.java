package zad2;

class EmploymentValidationRule extends ValidationRule {
    public EmploymentValidationRule(Boolean value) {
        super(value, "Ипотека выдается только трудоустроенным");
    }

    @Override
    public boolean isValid() {
        return (Boolean) value;
    }
}
