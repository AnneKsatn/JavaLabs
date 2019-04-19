package ru.billing.client;

import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.ItemCatalog;
import ru.itmo.exceptions.ItemAlreadyExistsException;


public class Main {
    public static void main(String[] args) {
        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld = line.split(";");

        ItemCatalog itemCatalog = new ItemCatalog();

        FoodItem item = new FoodItem(item_fld[0],
                Float.valueOf(item_fld[1]),
                Short.valueOf(item_fld[2]));
        item.setID(0);

        try {
            itemCatalog.addItem(item);
            itemCatalog.addItem(item);

        } catch (ItemAlreadyExistsException e){
            e.printStackTrace();
        }

        item.printAll();
    }

}