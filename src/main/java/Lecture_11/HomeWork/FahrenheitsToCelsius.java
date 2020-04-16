package Lecture_11.HomeWork;

public class FahrenheitsToCelsius implements Converter {
    @Override
    public double convert(double fahrenheit) {
        double result = ((fahrenheit - 32) * 5)/9;
        return result;
    }
}
