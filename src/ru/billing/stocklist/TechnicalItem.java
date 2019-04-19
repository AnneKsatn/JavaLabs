package ru.billing.stocklist;



public class TechnicalItem extends GenericItem {
    private short warrantyTime; // гарантийный срок (суток)

    public short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    void printAll(){
  //      System.out.printf("ID: %d, Name: %s, Price: %5.2f, Category: %s \n", ID, name, price, category);
        System.out.printf("WarrantyTime: %d \n", warrantyTime);
    }
}
