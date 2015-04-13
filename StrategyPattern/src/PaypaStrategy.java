/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saurav
 */
public class PaypaStrategy implements PaymentStrategy {

    private String emailID;
    private String password;

    public PaypaStrategy(String emailID, String password) {
        this.emailID = emailID;
        this.password = password;
    }

    public void pay(int amount) {
        System.out.println(amount + "paid with paypal");
    }

}
