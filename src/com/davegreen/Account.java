package com.davegreen;

/**
 * Created by daveg on 06/06/2017.
 */
public class Account
{
    private int number;                                                                                                     // These are class variables more commonly known as fields.
    private double balance;                                                                                                 // The access modifier is always to be private, something to do with encapsulation.
    private String customerName;
    private String customerEmail;
    private int contactNumber;

    public Account()
    {
        this(000000000, 0.00, "Default", "Default", 000000);        // This calls the overloaded constructor with the parameters, before the sout below it,
        System.out.println("Default constructor called");                                                                   // as can be seen in the printed out results, you would use this if you wanted an object
    }                                                                                                                       // to still be created but with a set of default values.

    public Account(int number, double balance, String customerName, String customerEmail, int contactNumber)                // This is an overloaded constructor, much like overloaded methods, same name but have parameters
    {                                                                                                                       // defined within their parenthesis.
        System.out.println("Account constructor with all the parameters called");

        this.number = number;                                                                                               // As can be seen the (this) keyword is used to define that we are talking about the Account
        this.balance = balance;                                                                                             // classes fields and not something else with the same name we are then setting each field to each respective
        this.customerName = customerName;                                                                                   // parameter in the constructors parenthesis.
        this.customerEmail = customerEmail;
        this.contactNumber = contactNumber;
    }

    public Account(String customerName, String customerEmail, int contactNumber)                                            // This is a mix of the two constructors above in that it is another overloaded constructor
    {                                                                                                                       // however only has three of the five parameters called, the first two are set to the default values.
        this(987654321, 12.00, customerName, customerEmail, contactNumber);
    }

    public void deposit(double depositAmount)                                                                               // A method to control the deposited amounts.
    {
        this.balance += depositAmount;
        System.out.println("Thank you for your deposit of " + depositAmount + " your balance is now " + this.balance);
    }

    public void withdrawal(double withdrawalAmount)                                                                         // A method to control the withdrawal amounts.
    {
        if (this.balance - withdrawalAmount < 0)
        {
            System.out.println("You have insufficient funds available balance remains at " + this.balance);
        }
        else
        {
            this.balance -= withdrawalAmount;
            System.out.println("After your withdrawal of " + withdrawalAmount + " Your new balance is now " + this.balance);
        }
    }

    public int getNumber()                                                                                                  // Getters and Setter for all the other fields.
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
    }

    public int getContactNumber()
    {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber)
    {
        this.contactNumber = contactNumber;
    }
}
