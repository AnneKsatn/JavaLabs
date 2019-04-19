package ru.itmo.exceptions;

public class ItemAlreadyExistsException extends Exception {
    public ItemAlreadyExistsException(){
        super("Товар уже существует!");
    }
}
