package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
//        Account davesAccount = new Account(123456789, 50.00, "David Green", "davesaccount@bigdavesaccounts.com", 123456);                                                         // New Account which calls
//        //Account davesAccount = new Account();                                                                                                                                       // the Account class overloaded
//        System.out.println("Customers account number is " + davesAccount.getNumber());                                                                                              // constructor with the arguments that are
//        System.out.println("Customers opening balance is " + davesAccount.getBalance());                                                                                            // set within the parenthesis,
//        System.out.println("Customers name is " + davesAccount.getCustomerName());                                                                                                  // if there are no arguments set then
//        System.out.println("Customers contact email address is " + davesAccount.getCustomerEmail());                                                                                // the default values will be used that
//        System.out.println("Customers contact phone numbers is " + davesAccount.getContactNumber());                                                                                // are set within the 'this' function
//                                                                                                                                                                                    // of the original Account constructor.
//        davesAccount.deposit(200.00);                                                                                                                                 // this can be seen in the two different
//        davesAccount.withdrawal(100.00);                                                                                                                           // ways that the new Account() is called.
//        davesAccount.withdrawal(150.00);
//
//        davesAccount.deposit(150.00);
//        davesAccount.withdrawal(299.00);
//
//        Account davidsAccount = new Account("David G", "davesaccount@bigdavesaccounts.com", 123456);
//        System.out.println(davidsAccount.getNumber() + " Name " + davidsAccount.getCustomerName());

        VipCustomer david = new VipCustomer();
        System.out.println(david.getName() + david.getCreditLimit() + david.getCustomerEmail());

        VipCustomer morag = new VipCustomer("Morag", 20000.00);
        System.out.println(morag.getName() + " your credit limit is " + morag.getCreditLimit() + " and your email is " + morag.getCustomerEmail());

        VipCustomer stacy = new VipCustomer("Stacy", 10000, "stacy@stacyemail.com");
        System.out.println(stacy.getName() + " your credit limit is " + stacy.getCreditLimit() + " and your email is " + stacy.getCustomerEmail());

    }
}
