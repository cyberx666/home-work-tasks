package Lecture_12.HomeWork.Factories;

import Lecture_12.HomeWork.Converter;
import Lecture_12.HomeWork.ConverterException;

public class FactoryFahrenheitsToCelsius  {

    public Converter converter(String operation) throws ConverterException {
       switch (operation){
           case "fahrenheitsToCelsius":
               if (!operation.equals("fahrenheitsToCelsius")) throw new ConverterException();
           default:return null;
       }
    }
}
