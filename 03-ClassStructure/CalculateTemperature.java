/**
14.Create a library of methods for converting temperatures between Celsius, Kelvin, and Fahrenheit.
You can name the methods e.g. CelsiusToKelvin(), KelvinToCelsius(), ect.
Then create a program that calculates and displays the temperature:
a.25 degrees Celsius in Kelvin and Fahrenheit
b.100 degrees Fahrenheit in Kelvin and Celsius
c.0 degrees Kelvin in Celsius and Fahrenheit
 */
public class CalculateTemperature{
public static void main(String args[]) {
    System.out.println("25 Celsius is: " + TemperatureConverter.CelsiusToKelvin(25) + " Kelvin");
    System.out.println("25 Celsius is: " + TemperatureConverter.CelsiusToFahrenheit(25) + " Fahrenheit");
    System.out.println("100 Fahrenheit is: " + TemperatureConverter.FahrenheitToKelvin(100) + " Kelvin");
    System.out.println("100 Fahrenheit is: " + TemperatureConverter.FahrenheitToCelsius(100) + " Celsius");
    System.out.println("0 Kelvin is: " + TemperatureConverter.KelvinToCelsius(0) + " Celsius");
    System.out.println("0 Kelvin is: " + TemperatureConverter.KelvinToFahrenheit(0) + " Fahrenheit");
}}
