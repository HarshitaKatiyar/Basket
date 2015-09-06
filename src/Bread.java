package com.company;

/**
 * Created by Harshita on 2/9/15.
 */
public class Bread extends Goods{
    private Double pricePerLoaf=0.80;

    //Important Property
    Double defaultPrice=pricePerLoaf;

    @Override
    public Double getPrice() {
        return this.defaultPrice;
    }
    @Override
    public Double getDiscountByPercentage(Double percentage) {
        return defaultPrice-((defaultPrice*percentage)/100);
    }
}
