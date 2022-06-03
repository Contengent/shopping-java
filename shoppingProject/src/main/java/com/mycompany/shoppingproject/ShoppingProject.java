package com.mycompany.shoppingproject;

import java.util.Scanner;

/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 */
public class ShoppingProject {

    public static void main(String[] args) {
        //imported
        Scanner intInput = new Scanner(System.in);
        
        //variables
        final double usbPrice = 19.99;
        final double keyboardPrice = 49.99;
        final double mousePrice = 25.99;
        
        int usbResponse;
        int keyboardResponse;
        int mouseResponse;
        
        double finalPrice;
        
        //main
        System.out.println("Enter the amount of USB storage devices you would like:");
        usbResponse = intInput.nextInt();
        
        System.out.println("Enter the amount of Keyboards you would like:");
        keyboardResponse = intInput.nextInt();
        
        System.out.println("Enter the amount of Computer Mouses you would like:");
        mouseResponse = intInput.nextInt();
        
        finalPrice = (usbPrice * usbResponse)+(keyboardPrice*keyboardResponse)+(mousePrice*mouseResponse);
        
        System.out.println("It costs $" + finalPrice + " to buy all of those!");
    }
}
