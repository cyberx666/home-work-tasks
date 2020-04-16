package Lecture_11.HomeWork;

public class DistanceMetersToInches implements Converter {


    @Override
    public double convert(double meters) {
        double result = meters * 39.37;
        return result;
    }




}
