
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saurav
 */
public class StockGrabber implements Subject {
    public double ibmPrice;
    public double applPrice;
    public double googPrice;

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
       noitfyObserver();
    }

    public void setApplPrice(double applPrice) {
        this.applPrice = applPrice;
        noitfyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        noitfyObserver();
    }
    private ArrayList<Observer> observers;

    public StockGrabber() {
        observers = new ArrayList<Observer>();   
    }
    

    @Override
    public void register(Observer newObserver) {
        
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1)+"deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void noitfyObserver() {
        
        for (Observer obs:observers){
        obs.update(ibmPrice, applPrice, googPrice);
        
        }
        
    }
    
    
}
