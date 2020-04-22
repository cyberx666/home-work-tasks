package Lecture_12.HomeWork.Converters;

import Lecture_12.HomeWork.ConverterType;
import Lecture_12.HomeWork.Factories.*;

public class TypesFactories {
    public Object newConverterType(ConverterType converterType) {
        switch (converterType) {
            case KMTOMILES:
                return new FactoryKmToMiles();
            case MILESTOKM:
                return new FactoryMilesToKm();
            case INCHESTOMETERS:
                return new FactoryInchesToMeters();
            case METERSTOINCHES:
                return new FactoryMetersToInches();
            case CELSIUSTOFAHRENHEITS:
                return new FactoryCelsiusToFahrenheits();
            case FAHRENHEITSTOCELSIUS:
                return new FactoryFahrenheitsToCelsius();
            case KILOGRAMTOPOUND:
                return new FactoryKilogramToPound();
            case POUNDROKILOGRAM:
                return new FactoryPoundToKilogram();

            default:return null;
 }
    }
}
