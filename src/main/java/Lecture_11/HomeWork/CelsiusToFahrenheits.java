package Lecture_11.HomeWork;

public class CelsiusToFahrenheits implements Converter {
    @Override
    public double convert(double celsius) {
        double result = (celsius * 9) / 5 + 32;
        return result;
    }
}
