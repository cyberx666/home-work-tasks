package Lecture_12.HomeWork.Factories;

import Lecture_12.HomeWork.Converter;
import Lecture_12.HomeWork.ConverterException;

public class FactoryMetersToInches {

    public Converter converter(String operation) throws ConverterException {
        switch (operation){
            case "metersToInches":
                if (!operation.equals("metersToInches")) throw new ConverterException();
            default:return null;
        }
    }
}
