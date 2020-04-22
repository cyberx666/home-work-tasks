package Lecture_12.HomeWork.Factories;

import Lecture_12.HomeWork.Converter;
import Lecture_12.HomeWork.ConverterException;

public class FactoryPoundToKilogram {
    public Converter converter(String operation) throws ConverterException {
        switch (operation){
            case "poundToKilogram":
            if(!operation.equals("poundToKilogram")) throw new ConverterException();
            default:return null;

        }
    }
}
