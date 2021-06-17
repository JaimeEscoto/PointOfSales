package com.company;

public class Customer {
    private int id;
    private String name;
    private String transactions;

    public Customer()
    {
        id=0;
        name=null;
        transactions="Customer Created";
    }
    public Customer(int idParam, String nameParam)
    {
        id=idParam;
        name=nameParam;
        transactions="Customer Created";
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

    public String getTransactions() {
        return transactions;
    }

    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }
}
