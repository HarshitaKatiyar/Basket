package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Harshita on 3/9/15.
 */
public class DiscountModel {
    public Double CalculateDiscount(String [] goods,Double sumWithoutDiscount)
    {
        Double discountedPrice=0.0;
        Map<String,Integer> map=new HashMap<>();
        for(String good:goods)
        {
            if(!map.containsKey(good))
            {
                map.put(good,1);
            }
            else
            {
                Integer value=map.get(good);
                map.put(good,value+1);
            }
        }

        //Apple Discount
        if(map.containsKey("Apple")) {
            Integer applecount = map.get("Apple");
            Double appleDiscount = new Apple().getDiscountByPercentage(10.0);
            Double appleRealPrice=new Apple().getPrice();
            sumWithoutDiscount=sumWithoutDiscount-(appleRealPrice*applecount);
            sumWithoutDiscount=sumWithoutDiscount+(appleDiscount*applecount);
        }
        if(map.containsKey("Bread")&&map.containsKey("Soup"))
        {
            if (map.get("Soup")>=2)
            {
                int soupCount=map.get("Soup");
                int breadCount=map.get("Bread");
                int count=0;
                while(breadCount>0&&soupCount>=2)
                {
                    count++;
                    soupCount=soupCount-2;
                    breadCount--;
                }
                Double BreadRealPrice=new Bread().getPrice();
                sumWithoutDiscount=sumWithoutDiscount-((BreadRealPrice/2)*count);
            }
        }
        discountedPrice=sumWithoutDiscount;
        return discountedPrice;
    }
}
