package zad2;

class AgeValidationRule extends ValidationRule {
    public AgeValidationRule(Byte age) {
        super(age, "Возраст для подачи на ипотеку должен быть старше 18 лет");
    }

    @Override
    public boolean isValid() {
        return (Byte) value >= 18;
    }
}