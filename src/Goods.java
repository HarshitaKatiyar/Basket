package com.company;

/**
 * Created by Harshita on 2/9/15.
 */
public class Goods implements getDetailsOfObjects{

    public Double defaultPrice=0.0;


    @Override
    public Double getPrice() {
        return this.defaultPrice;
    }
    @Override
    public Double getDiscountByPercentage(Double percentage) {
        return defaultPrice-((defaultPrice*percentage)/100);
    }

}
