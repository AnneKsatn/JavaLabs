package ru.billing.stocklist;

public class GenericItem {

    private int ID;
    private String name;
    private float price;
    private Category category = Category.GENERAL;

    private static int currentID = 0;

    public GenericItem() {
        this.ID = GenericItem.currentID++;
    }

    public GenericItem(String name, float price, Category category) {
        this.ID = GenericItem.currentID++;
    }
    public GenericItem(String name, float price, GenericItem analog) {
        this.ID = GenericItem.currentID++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
    }

    void printAll(){
        System.out.printf("ID: %d, Name: %s, Price: %5.2f, Category: %s \n", ID, name, price, category);
    }

}
