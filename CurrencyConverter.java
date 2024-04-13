import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Available currencies:");
        System.out.println("1. USD - US Dollar");
        System.out.println("2. EUR - Euro");
        System.out.println("3. GBP - British Pound");
        System.out.print("Choose the base currency (enter currency code): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Choose the target currency (enter currency code): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        
        double convertedAmount = amount * exchangeRate;

        
        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
    }

    
    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        
        return 1.0; 
    }
}