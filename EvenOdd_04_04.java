/* This program wiil determin if supplied number is even or odd. 
 * Supplied number(s): numOne = 10 | numTwo = 9
 * I'm using a modulo function to determine if a number is od or even, specificaally n % 2 
 * Evens == 0 | Odds == 1  
 */

 public class EvenOdd_04_04 
 {
 public static void main(String[] args) 
 {
 // Intialization Phase 
 int MODULORATE = 2; 
 int numOne = 10; 
 int evenOddNumOne = 0; 
 int numTwo = 9; 
 int evenOddNumTwo = 0; 
 
 // Processing Phase
 evenOddNumOne = numOne % MODULORATE; 
 evenOddNumTwo = numTwo % MODULORATE; 
 
 // Finalization Phase 
 System.out.println("1 = odd, 0 = even"); 
 System.out.println("Is numOne odd or even?: " + evenOddNumOne); 
 System.out.println("Is numTwo odd or even?: " + evenOddNumTwo); 
 
 
 }    
 
 }
 