/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegonunez.examples;

/**
 *
 * @author ddienu
 */

import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {
 
    String name;
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter your name");
    
    name = sc.next();
    
    if ( name.equals( "Moe")){
        System.out.println("You are the king of rock and roll");
    }else{
        System.out.println("You are not the king");
    }
   
  }
}

