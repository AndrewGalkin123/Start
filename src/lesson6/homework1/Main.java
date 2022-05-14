package lesson6.homework1;

import lesson6.ChessItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final Scanner INPUTPARAMS = new Scanner(System.in);

    public static void main(String[] args) {
        List<Bodyguard> bodyguards = new ArrayList<>();
        String actionMessage = "Choose action : \n1.create bodyguard \n2.exit ,press any key for exit";
        System.out.println(actionMessage);
        String input = INPUTPARAMS.nextLine();
        while ("create".equals(input.toLowerCase(Locale.ROOT).trim())) {
            Bodyguard bodyguard = createBodyGuard();
            if (bodyguard != null) {
                bodyguards.add(bodyguard);
            }
            System.out.println(actionMessage);
            input = INPUTPARAMS.nextLine();
        }
        try {
            System.out.println("Gun attacker?");
            String attackType = INPUTPARAMS.nextLine();
            if ("yes".equals(attackType.toLowerCase(Locale.ROOT).trim())) {
                for (Bodyguard bodyguard : bodyguards) {
                    System.out.println(bodyguard.toString() + " defends you using weapon");
                }
            }
            if ("no".equals(attackType.toLowerCase(Locale.ROOT).trim())) {
                for (Bodyguard bodyguard : bodyguards) {
                    bodyguard.defend();
                }
            }
        } catch (Exception e) {
            System.out.println("Choose correct format" + e);
        }


    }

    public static Bodyguard createBodyGuard() {
        try {
            System.out.println("input bodyguard type : \n1.Karateka \n2.Boxer \n3.Juugist");
            String bodyGuardType = INPUTPARAMS.nextLine();
            switch (bodyGuardType.toLowerCase(Locale.ROOT).trim()) {
                case "karateka":
                    return new Karateka();
                case "boxer":
                    return new Boxer();
                case "juugist":
                    return new Juugist();
            }
            System.out.println("Incorrect Bodyguard type " + bodyGuardType + ". Try again");
        } catch (Exception e) {
            System.out.println("Try smth else " + e);
        }
        return null;
    }
}
