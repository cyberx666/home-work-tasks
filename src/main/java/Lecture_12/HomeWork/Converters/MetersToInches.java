package Lecture_12.HomeWork.Converters;

import Lecture_12.HomeWork.Converter;
import Lecture_12.HomeWork.ConverterCalculationException;

public class MetersToInches implements Converter {


    @Override
    public double convert(double value) throws ConverterCalculationException {
        if (value<0) throw new ConverterCalculationException(value);
        return value * 39.37;

    }




}
