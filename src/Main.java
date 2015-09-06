package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
    Basket newBasket=new Basket();
        Scanner sc=new Scanner(System.in);
        Double sumWithoutDiscount=0.0;
        String goodsString=sc.nextLine();
        String[] goodsList=goodsString.split(" ");
        for(String good:goodsList)
        {
            Class c= Class.forName("com.company." + good.trim());
            Object obj =c.newInstance();
            Field field=obj.getClass().getDeclaredField("defaultPrice");
            sumWithoutDiscount+=(Double)field.get(obj);
        }
        //Discount Model
        Double disCountPrice=new DiscountModel().CalculateDiscount(goodsList, sumWithoutDiscount);
        System.out.print(disCountPrice);
    }
}
