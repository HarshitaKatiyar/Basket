package com.company;

/**
 * Created by Harshita on 2/9/15.
 */
public class Soup extends Goods {
    private Double pricePerTin=0.65;

    //Important Property
    Double defaultPrice=pricePerTin;

    @Override
    public Double getPrice() {
        return this.defaultPrice;
    }
    @Override
    public Double getDiscountByPercentage(Double percentage) {
        return defaultPrice-((defaultPrice*percentage)/100);
    }
}
