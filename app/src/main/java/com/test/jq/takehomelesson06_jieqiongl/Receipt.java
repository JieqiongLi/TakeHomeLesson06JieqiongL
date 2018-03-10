package com.test.jq.takehomelesson06_jieqiongl;

import java.io.Serializable;
import java.text.NumberFormat;

/**
 * Created by IBM on 6/03/2018.
 */

public class Receipt implements Serializable {
    private double amount;
    private double taxPercentage;
    private double tipPercentage;
    private double totalPrice = amount * (1 + taxPercentage + tipPercentage);

    public Receipt(double amount, double taxPercentage, double tipPercentage, double totalPrice) {
        this.amount = amount;
        this.taxPercentage = taxPercentage;
        this.tipPercentage = tipPercentage;
        this.totalPrice = totalPrice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(double tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Total: " + NumberFormat.getCurrencyInstance().format(amount) +
                "\nSales Tax: " + NumberFormat.getCurrencyInstance().format(taxPercentage * amount) +
                "\nTip: " + NumberFormat.getCurrencyInstance().format(tipPercentage * amount) +
                "\nGrand Total: " + NumberFormat.getCurrencyInstance().format(totalPrice);
    }
}