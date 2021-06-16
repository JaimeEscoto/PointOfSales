package com.company;

public class Product {

    private int id;
    private String name;
    private double unitPrice;
    private double unitCost;
    private int inventory;

    public Product()
    {
        id=0;
        name=null;
        unitPrice=0;
        unitCost=0;
        inventory=0;
    }
    public Product(int idParam, String nameParam, double unitPriceParam, double unitCostParam, int inventoryParam )
    {
        id=idParam;
        name=nameParam;
        unitPrice=unitPriceParam;
        unitCost=unitCostParam;
        inventory=inventoryParam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
