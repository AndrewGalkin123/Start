package lesson6.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Converting {
    public static float degree;
    public static void main(String[] args) {
        Scanner inputParams = new Scanner(System.in);
        String actionMessage ="Choose action: \n1.Choose \n2.Exit,press any key for exit.";
        System.out.println(actionMessage);
        String input = inputParams.nextLine();
        while("choose".equals(input.toLowerCase(Locale.ROOT).trim())) {
            try {
                ConvertItem convertItem = createTemperatureObject();
                assert convertItem != null;
                convertItem.convert(degree);
                System.out.println(actionMessage);
                input = inputParams.nextLine();
            }catch (Exception e){
                System.out.println("Try smth else " + e);
            }
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
                    degree = inputParams.nextFloat();
                    return new Fahrenheit();
                case "kelvin":
                    System.out.println("Enter degree in Celsius format");
                    degree = inputParams.nextFloat();
                    return new Kelvin();
            }
            System.out.println("Incorrect choice type " + choice + ". Try again");
        }catch (Exception e){
            System.out.println("Try smth else " + e);
        }
        return  null;
    }
}
