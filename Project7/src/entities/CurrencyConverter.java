package entities;

public class CurrencyConverter {
    public static double convertedValue(double dollar, double quantity) {
        double result = dollar * quantity;
        return result + result * 6.0/100.0;
    }
}