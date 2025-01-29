/* This is used to calculate credit card balance for 3 months.  
 * Interest Rate = 17% == .17 
 * Intial Balance = $5000.00
 */


 public class MonthlyCCBalance_04_03 
 {
 public static void main(String[] args) 
 {
 // Intialization && Varibles Phase 
 double MONTHLYINTRESTRATE = .17; 
 double initialBalance = 5000.00; 
 double monthOneInterest = 0.00; 
 double monthOneInterestTotal = 0.00; 
 double monthTwoInterest = 0.00; 
 double monthTwoInterestTotal = 0.00; 
 double monthThreeInterest = 0.00; 
 double monthThreeIntrestTotal = 0.00; 
 
 
 // Processing Phase 
 
 monthOneInterest = initialBalance * MONTHLYINTRESTRATE;
 monthOneInterestTotal = initialBalance + monthOneInterest; 
 monthTwoInterest = monthOneInterestTotal * MONTHLYINTRESTRATE; 
 monthTwoInterestTotal = monthTwoInterest + monthOneInterestTotal; 
 monthThreeInterest = monthTwoInterestTotal * MONTHLYINTRESTRATE; 
 monthThreeIntrestTotal = monthTwoInterestTotal + monthThreeInterest; 
 
 // Finalization Phase 
 
 System.out.println("Intial Balance: $" + initialBalance);
 System.out.println("Month One Intrest: $" + monthOneInterest); 
 System.out.println("Month One Total: $" + monthOneInterestTotal);
 System.out.println("Month Two Intrest: $" + monthTwoInterest); 
 System.out.println("Month Two Total: $" + monthTwoInterestTotal); 
 System.out.println("Month Three Intrest: $" + monthThreeInterest);
 System.out.println("Month Three Total: $" + monthThreeIntrestTotal); 
  
 
 }
 
 }
 