
import java.util.ArrayList;

/**
 * File: Package.java
 * Author: Anthony Francis
 * Date: Mar 16, 2020
 * Purpose:
 */


public class Package {
    private ArrayList<Gift> gifts;
    
    public Package() {
       this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        if (!gifts.contains(gift.getName())) {
            gifts.add(gift);
        }
    }
    
    public int totalWeight() {
        if (gifts.isEmpty()) {
            return -1;
        }
        
        int totalWeight = 0;
        for (Gift presents : gifts) {
            totalWeight += presents.getWeight();
        }
        return totalWeight;
    }

}
