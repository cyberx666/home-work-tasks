package Lecture_12.HomeWork.Factories;

import Lecture_12.HomeWork.Converter;
import Lecture_12.HomeWork.ConverterException;

public class FactoryKmToMiles {
    public Converter converter(String operation) throws ConverterException {
        switch (operation){
            case "kmToMiles":
                if (!operation.equals("kmToMiles")) throw new ConverterException();
            default:return null;
        }
    }
}
