package ru.billing.stocklist;

import ru.billing.stocklist.GenericItem;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog  {

    private HashMap<Integer, GenericItem> catalog = new HashMap<Integer,GenericItem>();
    private ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();

    public HashMap<Integer, GenericItem> getCatalog() {
        return catalog;
    }

    public ArrayList<GenericItem> getALCatalog() {
        return ALCatalog;
    }


    public void addItem(GenericItem item) throws ItemAlreadyExistsException {

        if (catalog.containsKey(item.getID())) {
            throw new ItemAlreadyExistsException();
        }

            catalog.put(item.getID(), item);
            ALCatalog.add(item);
    }

    public void printItems() {
        for (GenericItem i: ALCatalog) {
            System.out.println(i.toString());
        }
    }

    public GenericItem findItemByID(int id) {
        if (!catalog.containsKey(id)) {
            return null;
        } else {
            return catalog.get(id);
        }
    }

    public GenericItem findItemByIDAL(int id) {
        for(GenericItem i: ALCatalog){
            if (i.getID() == id) return i;
        }
        return null;
    }
}
