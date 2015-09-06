package com.company;

/**
 * Created by Harshita on 2/9/15.
 */
public class Milk extends Goods {
    private Double pricePerBottle=1.30;

    //Important Property
    Double defaultPrice=pricePerBottle;

    @Override
    public Double getPrice() {
        return this.defaultPrice;
    }
    @Override
    public Double getDiscountByPercentage(Double percentage) {
        return defaultPrice-((defaultPrice*percentage)/100);
    }



}
