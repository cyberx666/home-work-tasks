package Lecture_11.HomeWork;

public class PoundToKilogram implements Converter {
    @Override
    public double convert(double pounds) {
        double result = pounds/2.2046;
        return result;
    }
}
