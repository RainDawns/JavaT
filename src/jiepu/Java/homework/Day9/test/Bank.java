package jiepu.Java.homework.Day9.test;

import java.util.Arrays;

public class Bank {
    private  Customer[] customers;
    private int custNum;

    public Bank() {
        customers=new Customer[100];
    }
    public void addCustomer(Customer customer){
        if (custNum>=customers.length){
            customers=Arrays.copyOf(customers,customers.length*2);
        }
       customers[custNum]=customer;
        custNum++;
    }

    public Customer getCustomer(int index) {
        if (index>=customers.length){
            return null;
        }
        Customer customer=customers[index];
        return customer;
    }

    public int getCustNum() {
        return custNum;
    }
}
