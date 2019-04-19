package ru.billing.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome; // дата производства
    private short expires; // срок годности

    public FoodItem(String name) {
        this(name, 0.0f, (short)0);
    }

    public FoodItem(String name, float price, short expires){
        this(name, price, null, null, expires);
    }

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires){
        this.setName(name);
        this.setPrice(price);
        this.dateOfIncome = date;
        this.expires = expires;
    }

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    public short getExpires() {
        return expires;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }

    public void printAll(){
        System.out.printf("ID: %d, Name: %s, Price: %5.2f, Category: %s \n", getID(), getName(),
                getPrice(), getCategory());
        System.out.printf("DateOfIncome: %tD, Expires: %d \n", dateOfIncome, expires);
    }
}
