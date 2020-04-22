package Lecture_12.HomeWork.Factories;

import Lecture_12.HomeWork.Converter;
import Lecture_12.HomeWork.ConverterException;

public class FactoryMilesToKm {
    public Converter converter(String operation) throws ConverterException {
        switch (operation){
            case("milesToKm"):
                if (!operation.equals("milesToKm"))throw new ConverterException();
            default:return null;

        }
    }
}
