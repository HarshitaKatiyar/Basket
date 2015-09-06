package com.company;

/**
 * Created by Harshita on 2/9/15.
 */
public class Apple extends Goods{
    private Double pricePerBag=1.00;

    //Important Property
    Double defaultPrice=pricePerBag;

    @Override
    public Double getPrice() {
        return this.defaultPrice;
    }
    @Override
    public Double getDiscountByPercentage(Double percentage) {
        return defaultPrice-((defaultPrice*percentage)/100);
    }
}
