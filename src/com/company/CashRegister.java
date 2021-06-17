package com.company;

public class CashRegister {
    public Product[] products;
    private int productsCreated;


    public CashRegister(int productsQtyParam)
    {
        products = new Product[productsQtyParam];
        productsCreated=0;
    }
    public boolean createProduct(Product productParam)
    {
        if(productsCreated<products.length)
        {
            productParam.setId(productsCreated);
            products[productsCreated]=productParam;
            productsCreated++;
            return true;
        }

        return false;

    }
}
