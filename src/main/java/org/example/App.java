/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        int length;
        int width;
        int area;

        /*Creating constant*/
        final double gallon = 350;

        /*Prompting for length of room in feet*/
        System.out.println("What is the length of the room in feet?");
        length = scan.nextInt();

        /*Prompting for width of room in feet*/
        System.out.println("What is the width of the room in feet?");
        width = scan.nextInt();

        /*Calculating area*/
        area = length * width;

        /*Calculating amount of gallons needed*/
        double amountGallons = Math.ceil(area / gallon);

        /*Displaying amount of gallons of paint needed per square feet*/
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %d square feet.", amountGallons, +area);
    }
}