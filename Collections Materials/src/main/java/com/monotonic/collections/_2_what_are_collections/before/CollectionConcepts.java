package com.monotonic.collections._2_what_are_collections.before;

import com.monotonic.collections.common.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionConcepts {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        List<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        System.out.println(products);

        System.out.println("Before Remove");
        for (Product prd : products) {
            System.out.println(prd);
        }

        Iterator<Product> iProds = products.iterator();
        while (iProds.hasNext()) {
            Product it = iProds.next();
            if (it.getWeight() > 20) {
                iProds.remove();
            }
        }
        System.out.println("After Remove");
        for (Product prd : products) {
            System.out.println(prd);
        }
        System.out.println(products.get(0));
        System.out.println(products.size());

    }
}
