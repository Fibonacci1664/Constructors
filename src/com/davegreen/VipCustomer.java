package com.davegreen;

/**
 * Created by daveg on 07/06/2017.
 */
public class VipCustomer
{
    private String name;
    private double creditLimit;
    private String customerEmail;

    public VipCustomer()
    {
        this("Default name", 0, "defaultemail@default.com");
    }

    public VipCustomer(String name, double creditLimit)
    {
        this(name, creditLimit, "defaultemail@default.com");
    }

    public VipCustomer(String name, double creditLimit, String customerEmail)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public String getName()
    {
        return name;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }
}
