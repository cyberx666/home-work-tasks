package Lecture_12.HomeWork.Factories;

import Lecture_12.HomeWork.Converter;
import Lecture_12.HomeWork.ConverterException;

public class FactoryCelsiusToFahrenheits {

    public Converter converter(String operation) throws ConverterException {
        switch (operation){
            case "CelsiusToFahrenheits":
                if (!operation.equals("CelsiusToFahrenheits")) throw new ConverterException();
            default:return null;
        }
    }
}
