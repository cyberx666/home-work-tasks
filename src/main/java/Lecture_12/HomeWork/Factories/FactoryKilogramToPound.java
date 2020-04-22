package Lecture_12.HomeWork.Factories;

import Lecture_12.HomeWork.Converter;
import Lecture_12.HomeWork.ConverterException;

public class FactoryKilogramToPound {

    public Converter converter(String operation) throws ConverterException {
        switch (operation){
            case "kilogramToPound":
                if (!operation.equals("kilogramToPound")) throw new ConverterException();
            default:return null;

        }

    }
}
