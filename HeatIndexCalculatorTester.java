/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heatindexcalculatortester;

import java.util.Scanner;
//import class spanner

/**
 * 1/29/2020
 * @author Seth Medders
 */
public class HeatIndexCalculatorTester {
    
    //main method here
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        //create scanner, then use it to accept input from the user.
        System.out.println("Please enter the current temperature in degrees farenheit: ");
        int tempNow = input.nextInt();
        //prompt for humidity
        System.out.println("Please enter the current humidity as a percentage:");
        double humidityNow = input.nextDouble();
        
        HeatIndexCalculator heatIndexCalculatorObject = new HeatIndexCalculator(tempNow, humidityNow);
        
        input.close();
        
    }
    
}
