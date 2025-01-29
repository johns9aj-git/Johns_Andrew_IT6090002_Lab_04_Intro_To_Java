/*  This will calculate the total cost for yearly maintenance and display totals for each season. 
Look, I don't know if you want me to use a fixed rate for maintenace or ask the user to enter maintence costs for each season. 
For this I'm just going to assume maintenance costs are a fixed rate for each season. 
Decided to try phases in my code, feedback would be appretiated. 
*/

public class YearlyMaintenanceCost_04_02 {
    public static void main(String[] args) 
    {
    // Initialization && Variables Phase 
    double seasonOneTotal = 0.0; 
    double seasonTwoTotal = 0.0; 
    double seasonThreeTotal = 0.0; 
    double seasonFourTotal = 0.0; 
    double totalCost = 0.00; 
    double MAINTENANCERATE = 500.00; // Rate of cost for repairs. 
    
     // Processing Phase
    seasonOneTotal = MAINTENANCERATE; 
    seasonTwoTotal = MAINTENANCERATE; 
    seasonThreeTotal = MAINTENANCERATE; 
    seasonFourTotal =  MAINTENANCERATE; 
    totalCost = seasonOneTotal + seasonTwoTotal + seasonThreeTotal + seasonFourTotal; 
    
    
    // Finalization Phase  
    System.out.println("Cost after spring: $" + seasonOneTotal);
    System.out.println("Cost after summer: $" + seasonTwoTotal);
    System.out.println("Cost after autumn: $" + seasonThreeTotal);
    System.out.println("Cost after winter: $" + seasonFourTotal);
    System.out.println("Yearly Cost: $" + totalCost); 
    
    
    }
    }
    