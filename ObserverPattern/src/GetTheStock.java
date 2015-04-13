/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saurav
 */
public class GetTheStock {

   
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
	         
	        // Create an Observer that will be sent updates from Subject
	         
	        StockObserver observer1 = new StockObserver(stockGrabber);
	         
	        stockGrabber. setIbmPrice(197.00);
	        stockGrabber.setApplPrice(677.60);
	        stockGrabber.setGoogPrice(676.40);
	         
	        StockObserver observer2 = new StockObserver(stockGrabber);
	         
	        stockGrabber. setIbmPrice(197.00);
	        stockGrabber.setApplPrice(677.60);
	        stockGrabber.setGoogPrice(676.40);	         
	        // Delete one of the observers
	        
	        stockGrabber.unregister(observer2);
	         
	        stockGrabber.setIbmPrice(197.00);
	        stockGrabber.setApplPrice(677.60);
	        stockGrabber.setGoogPrice(676.40);
	         

    }
    
}
