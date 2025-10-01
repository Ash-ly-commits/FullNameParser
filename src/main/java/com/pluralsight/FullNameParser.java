package com.pluralsight;
import java.util.*;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name (as first last or first middle last): ");
        String name = scanner.nextLine();
        name = name.trim();
        nameSplit(name);
    }

    public static void nameSplit(String name){
        String[] nameParts = name.split(" ");
        if ((nameParts.length) > 2){
            String first = nameParts[0];
            String mid = nameParts[1];
            String last = nameParts[2];

            System.out.printf("First name: %s\nMiddle name: %s\nLast name: %s",first,mid,last);
        }
        else {
            String first = nameParts[0];
            String last = nameParts[1];

            System.out.printf("First name: %s\nLast name: %s",first,last);
        }
    }
}
