package com.larrykim;

import static com.larrykim.NyPizza.Size.LARGE;
import static com.larrykim.Pizza.Topping.*;

public class Main {
    public static void main(String[] args) {
        NyPizza newyorkPizza =
                new NyPizza.Builder(LARGE)
                        .addTopping(HAM)
                        .addTopping(ONION).build();
        Calzone calzonePizza =
                new Calzone.Builder()
                        .addTopping(HAM)
                        .sauceInside().build();

        System.out.println("주문하신 피자");
        System.out.println(newyorkPizza.toString());
        System.out.println(calzonePizza.toString());
    }
}
