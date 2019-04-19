package ru.itmo.exceptions;

public class CatalogLoadException extends Exception {

    public CatalogLoadException(Exception e){
        super(e);
    }

    public CatalogLoadException(){
        super();
    }
}
