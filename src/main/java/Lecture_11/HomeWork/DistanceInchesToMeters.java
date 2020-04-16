package Lecture_11.HomeWork;

public class DistanceInchesToMeters implements Converter {
    @Override
    public double convert(double inches) {
        double result = inches/39.37;
        return result;
    }
}
