
/**
14.Create a library of methods for converting temperatures between Celsius, Kelvin, and Fahrenheit.
You can name the methods e.g. CelsiusToKelvin(), KelvinToCelsius(), ect.
Then create a program that calculates and displays the temperature:
a.25 degrees Celsius in Kelvin and Fahrenheit
b.100 degrees Fahrenheit in Kelvin and Celsius
c.0 degrees Kelvin in Celsius and Fahrenheit
 */
public class TemperatureConverter
{
    public static double CelsiusToKelvin(double degree){
        double result = Math.round((degree + 273.15) * 100) / 100.00;
        return result;
    }
    static double KelvinToCelsius(double degree){
        double result = Math.round((degree - 273.15) * 100) / 100.00;
        return result;
    }
    static double FahrenheitToCelsius(double degree){
        double result = Math.round(((degree - 32) / 1.8) * 100) / 100.00;
        return result;
    }
    static double CelsiusToFahrenheit(double degree){
        double result = Math.round(((degree * 1.8) + 32) * 100) / 100.00;
        return result;
    }
    static double KelvinToFahrenheit(double degree){
        double result = Math.round(((degree - 273.15) * 1.8 + 32) * 100) / 100.00;
        return result;
    }
    static double FahrenheitToKelvin(double degree){
        double result = Math.round((5/9 * (degree - 32) + 273) * 100) / 100.00;
        return result;
    }
}
