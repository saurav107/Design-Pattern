/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saurav
 */
public class CreditCardStrategy implements PaymentStrategy{

  private String name;
  private String CreditCardNumber;
  private String CVV;
  private String dateOfExpiry;
  
  public CreditCardStrategy(String nm,String ccNum, String cvv,String expiryDate){
     this.name = nm;
     this.CreditCardNumber=ccNum;
     this.dateOfExpiry = expiryDate;
     this.CVV = cvv;
  
  }
    
    
    
    
    
    public void pay(int amount) {
        System.out.println(amount + "paid with debit/credit");
    }
    
}
