package com.joy.builder;

import com.joy.builder.Pizza.Topping;
import com.joy.builder.NyPizza.Size;

public class PizzaTest {

    public static void main(String[] args) {

        Pizza pizza = new NyPizza.Builder(Size.SMALL)
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.ONION)
                .build();

        Pizza calzone = new Calzone.Builder()
                .addTopping(Topping.HAM)
                .addTopping(Topping.PEPPER)
                .sauceInside()
                .build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}
