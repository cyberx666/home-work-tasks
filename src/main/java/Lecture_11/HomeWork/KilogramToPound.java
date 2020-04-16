package Lecture_11.HomeWork;

public class KilogramToPound implements Converter {
    @Override
    public double convert(double kilograms) {
        double result = kilograms*2.20462;
        return result;
    }
}
