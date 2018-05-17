/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemp;

import java.util.Scanner;

/**
 *
 * @author winte
 */
public class ConvertTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //converting celsius to fahrenheit, and allowing the user to input the value in celsius. 
	
			float c, f;
			
			Scanner input = new Scanner(System.in);  
				//input temp
                                System.out.println("This program converts Celsius to Fahrenheit.");
                                System.out.println("Please input the temperature in Celsius: ");
				c = input.nextFloat();
				
				//calculate fahrenhoet temp
				f = c * 9.0f / 5.0f + 32;
				
					//output result
					
					System.out.printf("Celsius = %.2f, Fahrenheit = %.2f\n", c, f); 
					
					
		}
		
		

    }
    

