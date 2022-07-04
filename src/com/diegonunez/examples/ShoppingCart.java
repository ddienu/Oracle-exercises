
package com.diegonunez.examples;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Jean";

	// numeric fields
        double price = 21.99;
        int quantity = 5;
        double tax = 1.04;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        
        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;
        
        
        // Test quantity and modify message if quantity > 1.  
        
        if ( quantity > 1){
            
            message = custName+" wants to purchase "+quantity+" "+itemDesc+"s";
            System.out.println(message);
        }else{
            System.out.println(message);
        }
         
        
        // Test outOfStock and notify user in either case.  
        
        if ( outOfStock == true){
            System.out.println("The item is not available");
        }else{
            System.out.println("The item is available");
            System.out.println("The total price is: "+total);
        }
        
    }
    
}


