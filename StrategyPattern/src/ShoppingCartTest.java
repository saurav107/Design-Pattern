/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saurav
 */
public class ShoppingCartTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ShoppingCart cart = new ShoppingCart();
       Item item1= new Item("1234",10);
       Item item2= new Item("5467",40);
       cart.addItem(item1);
       cart.addItem(item2);
       
       PaypaStrategy pal = new PaypaStrategy("myemail@example.com", "mypwd");
       cart.pay(pal);
       cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15") );
       
    }
    
    
}
