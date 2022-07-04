/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegonunez.examples;

import java.util.Scanner;

/**
 *
 * @author ddienu
 */
public class AgeValidity {

    public static void main(String[] args) {
        
        boolean drivingUnderAge = false;
        
        Scanner scAge = new Scanner (System.in);
        
        System.out.println("Introduzca su edad");

        int edad = scAge.nextInt();
        
        
        if( edad <= 18 ){
            drivingUnderAge = true;
        }
        
        System.out.println(drivingUnderAge);
       
    }
}
