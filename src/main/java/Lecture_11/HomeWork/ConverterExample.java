package Lecture_11.HomeWork;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ConverterExample {

    public static void main(String[] args) {
        SpeedKmToMiles speedKmToMiles = new SpeedKmToMiles();
        System.out.println((speedKmToMiles.convert(100)) +" speedMi" );

        SpeedMiToKms speedMiToKms = new SpeedMiToKms();
        System.out.println((speedMiToKms.convert(62.139)) + " speedKm");

        DistanceMetersToInches distanceMetersToInches = new DistanceMetersToInches();
        System.out.println((distanceMetersToInches.convert(100)) + " Inches");

        DistanceInchesToMeters distanceInchesToMeters = new DistanceInchesToMeters();
        System.out.println((distanceInchesToMeters.convert(100)) + "   Meters ");

        CelsiusToFahrenheits celsiusToFahrenheits = new CelsiusToFahrenheits();
        System.out.println((celsiusToFahrenheits.convert(100)) + "Fahrenheits");

        FahrenheitsToCelsius fahrenheitsToCelsius = new FahrenheitsToCelsius();
        System.out.println((fahrenheitsToCelsius.convert(100))+ " celsius");


        KilogramToPound kilogramToPound = new KilogramToPound();
        System.out.println((kilogramToPound.convert(100))+ " Pounds");
        PoundToKilogram poundToKilogram = new PoundToKilogram();
        System.out.println(poundToKilogram.convert(100) + " Kilograms");



    }
}
