package Lecture_12.HomeWork.Factories;

import Lecture_12.HomeWork.Converter;
import Lecture_12.HomeWork.ConverterException;

public class FactoryInchesToMeters {

    public Converter converter(String operation) throws ConverterException {
        switch (operation){
            case "distanceInchesToMeters":
                if (!operation.equals("distanceInchesToMeters")) throw new ConverterException();
            default:return null;
        }



    }
}
