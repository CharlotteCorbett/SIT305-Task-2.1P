package com.example.week1play;

import java.util.Objects;

public class Conversion {
    // Case statement constants

    // Length





    // Conversion factors
    static final double CENTIMETERS_PER_INCH = 2.54;
    static final double METERS_PER_INCH = 39.37;
    static final double KILOMETERS_PER_INCH = 39370.1;
    static final double CENTIMETERS_PER_FEET = 30.48;
    static final double METERS_PER_FEET = 0.3048;
    static final double KILOMETERS_PER_FEET = 3280.84;
    static final double CENTIMETERS_PER_YARD = 91.44;
    static final double METERS_PER_YARD = 0.9144;
    static final double KILOMETERS_PER_YARD = 1093.61;
    static final double CENTIMETERS_PER_MILE = 160934.4;
    static final double METERS_PER_MILE = 1609.34;
    static final double GRAMS_PER_POUND = 453.592;
    static final double KILOGRAMS_PER_POUND = 2.20462;
    static final double GRAMS_PER_OUNCE = 28.35;
    static final double GRAMS_PER_TON = 1000000;
    static final double KILOGRAMS_PER_TON = 1000;
    static final double CENTIMETERS_PER_METER = 100;
    static final double CENTIMETERS_PER_KILOMETER = 100000;
    static final double METERS_PER_KILOMETER = 1000;
    static final double INCH_PER_FEET = 12;
    static final double INCH_PER_YARD = 36;
    static final double INCH_PER_MILE = 63360;
    static final double FEET_PER_MILE = 5280;
    static final double FEET_PER_YARD = 3;
    static final double MILES_PER_YARD = 1760;
    static final double OUNCE_PER_POUND = 16;
    static final double OUNCE_PER_KILOGRAM  = 35.274;
    static final double OUNCE_PER_TON  = 35274;
    static final double POUND_PER_TON = 2204.62;
    static final double GRAMS_PER_KILOGRAM = 1000;



    public String selectedUnits;

    public Double inputValue;
    public Double outputValue;



    public Conversion() {
        selectedUnits = "INCH_TO_CENTIMETER";
        inputValue = 0.0;
        outputValue = 0.0;

    }

    public String getSelectedUnits(String sourceUnit, String destinationUnit ) {
        selectedUnits = (sourceUnit.toUpperCase() + "_TO_" + destinationUnit.toUpperCase());

        return selectedUnits;
    }


    public void compute(String selectedUnits) {
        // Length

        // Metric -> Imperial
        if (Objects.equals(selectedUnits, "INCH_TO_CENTIMETER")) {
            outputValue = inputValue * CENTIMETERS_PER_INCH;
        }
        else if (Objects.equals(selectedUnits, "CENTIMETER_TO_INCH")) {
            outputValue = inputValue / CENTIMETERS_PER_INCH;
        }
        else if (Objects.equals(selectedUnits, "METER_TO_INCH")) {
            outputValue = inputValue * METERS_PER_INCH;
        }
        else if (Objects.equals(selectedUnits, "INCH_TO_METER")) {
            outputValue = inputValue / METERS_PER_INCH;
        }
        else if (Objects.equals(selectedUnits, "KILOMETER_TO_INCH")) {
            outputValue = inputValue * KILOMETERS_PER_INCH;
        }
        else if (Objects.equals(selectedUnits, "INCH_TO_KILOMETER")) {
            outputValue = inputValue / KILOMETERS_PER_INCH;
        }
        else if (Objects.equals(selectedUnits, "FEET_TO_CENTIMETER")) {
                outputValue = inputValue * CENTIMETERS_PER_INCH;
        }
        else if (Objects.equals(selectedUnits, "CENTIMETER_TO_FEET")) {
            outputValue = inputValue / CENTIMETERS_PER_FEET;
        }
        else if (Objects.equals(selectedUnits, "FEET_TO_METER")) {
            outputValue = inputValue / CENTIMETERS_PER_FEET;
        }
        else if (Objects.equals(selectedUnits, "METER_TO_FEET")) {
            outputValue = inputValue * METERS_PER_FEET;
        }
        else if (Objects.equals(selectedUnits, "FEET_TO_KILOMETER")) {
            outputValue = inputValue / KILOMETERS_PER_FEET;
        }
        else if (Objects.equals(selectedUnits, "KILOMETER_TO_FEET")) {
            outputValue = inputValue * KILOMETERS_PER_FEET;
        }
        else if (Objects.equals(selectedUnits, "YARD_TO_CENTIMETER")) {
            outputValue = inputValue * CENTIMETERS_PER_YARD;
        }
        else if (Objects.equals(selectedUnits, "CENTIMETER_TO_YARD")) {
            outputValue = inputValue / CENTIMETERS_PER_YARD;
        }
        else if (Objects.equals(selectedUnits, "YARD_TO_METER")) {
            outputValue = inputValue * METERS_PER_YARD;
        }
        else if (Objects.equals(selectedUnits, "METER_TO_YARD")) {
            outputValue = inputValue / METERS_PER_YARD;
        }
        else if (Objects.equals(selectedUnits, "YARD_TO_KILOMETER")) {
            outputValue = inputValue / KILOMETERS_PER_YARD;
        }
        else if (Objects.equals(selectedUnits, "KILOMETER_TO_YARD")) {
            outputValue = inputValue * KILOMETERS_PER_YARD;
        }
        else if (Objects.equals(selectedUnits, "MILE_TO_CENTIMETER")) {
            outputValue = inputValue / CENTIMETERS_PER_MILE;
        }
        else if (Objects.equals(selectedUnits, "CENTIMETER_TO_MILE")) {
            outputValue = inputValue * CENTIMETERS_PER_MILE;
        }
        else if (Objects.equals(selectedUnits, "MILE_TO_METER")) {
            outputValue = inputValue * METERS_PER_MILE;
        }
        else if (Objects.equals(selectedUnits, "METER_TO_MILE")) {
            outputValue = inputValue / METERS_PER_MILE;
        }
        else if (Objects.equals(selectedUnits, "METER_TO_MILE")) {
            outputValue = inputValue / METERS_PER_MILE;
        }

        // Metric -> Metric
        else if (Objects.equals(selectedUnits, "CENTIMETER_TO_METER")) {
            outputValue = inputValue / CENTIMETERS_PER_METER;
        }
        else if (Objects.equals(selectedUnits, "METER_TO_CENTIMETER")) {
            outputValue = inputValue * CENTIMETERS_PER_METER;
        }
        else if (Objects.equals(selectedUnits, "CENTIMETER_TO_KILOMETER")) {
            outputValue = inputValue / CENTIMETERS_PER_KILOMETER;
        }
        else if (Objects.equals(selectedUnits, "KILOMETER_TO_CENTIMETER")) {
            outputValue = inputValue * CENTIMETERS_PER_KILOMETER;
        }
        else if (Objects.equals(selectedUnits, "METER_TO_KILOMETER")) {
            outputValue = inputValue / METERS_PER_KILOMETER;
        }
        else if (Objects.equals(selectedUnits, "KILOMETER_TO_METER")) {
            outputValue = inputValue * CENTIMETERS_PER_METER;
        }

        // Imperial -> Imperial
        else if (Objects.equals(selectedUnits, "INCH_TO_FEET")) {
            outputValue = inputValue / INCH_PER_FEET;
        }
        else if (Objects.equals(selectedUnits, "INCH_TO_MILE")) {
            outputValue = inputValue / INCH_PER_MILE;
        }
        else if (Objects.equals(selectedUnits, "INCH_TO_YARD")) {
            outputValue = inputValue / INCH_PER_YARD;
        }
        else if (Objects.equals(selectedUnits, "FEET_TO_INCH")) {
            outputValue = inputValue * INCH_PER_FEET;
        }
        else if (Objects.equals(selectedUnits, "FEET_TO_MILE")) {
            outputValue = inputValue / FEET_PER_MILE;
        }
        else if (Objects.equals(selectedUnits, "FEET_TO_YARD")) {
            outputValue = inputValue / FEET_PER_YARD;
        }

        else if (Objects.equals(selectedUnits, "MILE_TO_INCH")) {
            outputValue = inputValue * INCH_PER_MILE;
        }
        else if (Objects.equals(selectedUnits, "MILE_TO_FEET")) {
            outputValue = inputValue * FEET_PER_MILE;
        }
        else if (Objects.equals(selectedUnits, "MILE_TO_YARD")) {
            outputValue = inputValue * MILES_PER_YARD;
        }
        else if (Objects.equals(selectedUnits, "YARD_TO_INCH")) {
            outputValue = inputValue * INCH_PER_YARD;
        }
        else if (Objects.equals(selectedUnits, "YARD_TO_FEET")) {
            outputValue = inputValue * FEET_PER_YARD;
        }else if (Objects.equals(selectedUnits, "YARD_TO_MILE")) {
            outputValue = inputValue / MILES_PER_YARD;
        }



        // Weight
        else if (Objects.equals(selectedUnits, "OUNCE_TO_GRAM")) {
            outputValue = inputValue * GRAMS_PER_OUNCE;
        }
        else if (Objects.equals(selectedUnits, "OUNCE_TO_POUND")) {
            outputValue = inputValue / OUNCE_PER_POUND;
        }
        else if (Objects.equals(selectedUnits, "OUNCE_TO_KILOGRAM")) {
            outputValue = inputValue / OUNCE_PER_KILOGRAM;
        }
        else if (Objects.equals(selectedUnits, "OUNCE_TO_TON")) {
            outputValue = inputValue / OUNCE_PER_TON;
        }

        // done
        else if (Objects.equals(selectedUnits, "POUND_TO_OUNCE")) {
            outputValue = inputValue * OUNCE_PER_POUND;
        }
        else if (Objects.equals(selectedUnits, "POUND_TO_GRAM")) {
            outputValue = inputValue * GRAMS_PER_POUND;
        }
        else if (Objects.equals(selectedUnits, "POUND_TO_KILOGRAM")) {
            outputValue = inputValue / KILOGRAMS_PER_POUND;
        }
        else if (Objects.equals(selectedUnits, "POUND_TO_TON")) {
            outputValue = inputValue / POUND_PER_TON;
        }

        else if (Objects.equals(selectedUnits, "GRAM_TO_POUND")) {
            outputValue = inputValue / GRAMS_PER_POUND;
        }
        else if (Objects.equals(selectedUnits, "GRAM_TO_OUNCE")) {
            outputValue = inputValue * GRAMS_PER_OUNCE;
        }
        else if (Objects.equals(selectedUnits, "GRAM_TO_KILOGRAM")) {
            outputValue = inputValue / GRAMS_PER_KILOGRAM;
        }
        else if (Objects.equals(selectedUnits, "GRAM_TO_TON")) {
            outputValue = inputValue / GRAMS_PER_TON;
        }


        else if (Objects.equals(selectedUnits, "KILOGRAM_TO_POUND")) {
            outputValue = inputValue * KILOGRAMS_PER_POUND;
        }
        else if (Objects.equals(selectedUnits, "KILOGRAM_TO_GRAM")) {
            outputValue = inputValue * GRAMS_PER_KILOGRAM;
        }
        else if (Objects.equals(selectedUnits, "KILOGRAM_TO_OUNCE")) {
            outputValue = inputValue * OUNCE_PER_KILOGRAM;
        }
        else if (Objects.equals(selectedUnits, "KILOGRAM_TO_TON")) {
            outputValue = inputValue / KILOGRAMS_PER_TON;
        }



        else if (Objects.equals(selectedUnits, "TON_TO_GRAM")) {
            outputValue = inputValue * GRAMS_PER_TON;
        }
        else if (Objects.equals(selectedUnits, "TON_TO_KILOGRAM")) {
            outputValue = inputValue * KILOGRAMS_PER_TON;
        }
        else if (Objects.equals(selectedUnits, "TON_TO_POUND")) {
            outputValue = inputValue / POUND_PER_TON;
        }
        else if (Objects.equals(selectedUnits, "TON_TO_OUNCE")) {
            outputValue = inputValue / OUNCE_PER_TON;
        }

        // Temperature
        else if (Objects.equals(selectedUnits, "CELSIUS_TO_FAHRENHEIT")) {
            outputValue = (inputValue * 1.8) + 32;
        }
        else if (Objects.equals(selectedUnits, "FAHRENHEIT_TO_CELSIUS")) {
            outputValue = (inputValue - 32) / 1.8;
        }
        else if (Objects.equals(selectedUnits, "FAHRENHEIT_TO_KELVIN")) {
            outputValue = ((inputValue -32) / 1.8) / 273.15;
        }
        else if (Objects.equals(selectedUnits, "KELVIN_TO_FAHRENHEIT")) {
            outputValue = ((inputValue -32) / 1.8) * 273.15;
        }
        else if (Objects.equals(selectedUnits, "KELVIN_TO_CELSIUS")) {
            outputValue = inputValue - 273.15;
        }
        else if (Objects.equals(selectedUnits, "CELSIUS_TO_KELVIN")) {
            outputValue = inputValue + 273.15;
        }

    }
        }



