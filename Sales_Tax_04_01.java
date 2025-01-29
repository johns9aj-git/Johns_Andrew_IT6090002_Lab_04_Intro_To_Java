// SalesTax Displays 5% of the item's price. 
class SalesTax_04_01 {

    public static void main(String[] args) 
    {
        // Intialization Phase

        double SALESTAX = 0.05;  
        double itemPrice = 100; 
        double itemTax = 0.00; 
        double totalPrice = 0.00; 
        
        // Processing Phase 
        itemTax = itemPrice * SALESTAX; 
        totalPrice = itemPrice + itemTax; 

        // Finalization Phase 

        System.out.println("Item Price: $ " + itemPrice);
        System.out.println("Item Price * Sales Tax: $ " + totalPrice);



    }
    
}
