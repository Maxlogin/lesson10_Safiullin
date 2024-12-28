package zad2;

class MortgageAmountValidationRule extends ValidationRule {
    public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
    }

    @Override
    public boolean isValid() {
        int amount = (Integer) value;
        return amount >= 1000000 && amount <= 10000000;
    }
}