package lesson6.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Converting {


    public static void main(String[] args) {
        Scanner inputParams = new Scanner(System.in);
        List<ConvertItem> convertItems = new ArrayList<>();
        String actionMessage ="Choose action: \n1.Choose \n2.Exit,press any key for exit.";
        System.out.println(actionMessage);
        String input = inputParams.nextLine();
        while("choose".equals(input.toLowerCase(Locale.ROOT).trim())) {
           ConvertItem convertItem = createTemperatureObject();
            if (convertItem != null) {
               convertItems.add(convertItem);
            }

            System.out.println(actionMessage);
            input = inputParams.nextLine();
        }
        for (ConvertItem convertItem : convertItems) {
            convertItem.convert();
        }
    }
    public static ConvertItem createTemperatureObject() {
        try {
            Scanner inputParams = new Scanner(System.in);
            System.out.println("Choose the type you want to convert : \n1. From Celsius to Fahrenheit. \n2. From Celsius to Kelvin.");
            String choice = inputParams.nextLine();
            switch (choice.toLowerCase(Locale.ROOT).trim()) {
                case "fahrenheit":
                    System.out.println("Enter degree in Celsius format");
                    ConvertItem.degreeForFahrenheit = inputParams.nextFloat();
                    return new Fahrenheit();
                case "kelvin":
                    System.out.println("Enter degree in Celsius format");
                    ConvertItem.getDegreeForKelvin = inputParams.nextFloat();
                    return new Kelvin();
            }
            System.out.println("Incorrect choice type " + choice + ". Try again");
        }catch (Exception e){
            System.out.println("Try smth else " + e);
        }
        return  null;
    }
}
