package com.monotonic.collections._6_operations.before;

import com.monotonic.collections.common.Product;

import java.util.ArrayList;
import java.util.List;

public class ShipmentsBreaker
{
    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 25);
    public static Product window = new Product("Glass Window", 10);

    public static void main(String[] args)
    {
        Shipment shipment = new Shipment();

        shipment.add(door);
        shipment.add(window);
        shipment.add(door);
        shipment.add(window);
        shipment.add(floorPanel);

        shipment.prepare();

        List<Product> lightVanProducts = shipment.getLightVanProducts();
        System.out.println("lightVanProducts = " + lightVanProducts);

        lightVanProducts.remove(window);

        System.out.println("shipment = " + shipment.getLightVanProducts());
        shipment.forEach(prod -> System.out.println(prod));
    }
}
