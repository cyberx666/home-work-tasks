package Lecture_11.HomeWork;

public class SpeedKmToMiles implements Converter{

    @Override
    public double convert(double speedKm) {
        double result = speedKm * 0.62140;
        return result;
    }
}
