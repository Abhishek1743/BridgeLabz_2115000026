import java.util.Scanner;
class UnitConvertor3{
    public static double convertFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Fahrenheit to convert to Celsius: ");
        double fahrenheit = input.nextDouble();
        
        System.out.print("Enter Celsius to convert to Fahrenheit: ");
        double celsius = input.nextDouble();
        
        System.out.print("Enter pounds to convert to kilograms: ");
        double pounds = input.nextDouble();
        
        System.out.print("Enter kilograms to convert to pounds: ");
        double kilograms = input.nextDouble();
        
        System.out.print("Enter gallons to convert to liters: ");
        double gallons = input.nextDouble();
        
        System.out.print("Enter liters to convert to gallons: ");
        double liters = input.nextDouble();
		
		
		System.out.println("\n" + fahrenheit + " Fahrenheit is " +convertFahrenheitToCelsius(fahrenheit) + " Celsius");
		System.out.println(celsius + " Celsius is " +convertCelsiusToFahrenheit(celsius) + " Fahrenheit");
		System.out.println(pounds + " pounds is " +convertPoundsToKilograms(pounds) + " kilograms");
		System.out.println(kilograms + " kilograms is " +convertKilogramsToPounds(kilograms) + " pounds");
		System.out.println(gallons + " gallons is " +convertGallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters is " +convertLitersToGallons(liters) + " gallons");

    }
}
