package Lecture_11.HomeWork;

public class SpeedMiToKms implements Converter {

    @Override
    public double convert(double speedMi) {
        double result = speedMi/0.62140;
        return result;
    }
}
