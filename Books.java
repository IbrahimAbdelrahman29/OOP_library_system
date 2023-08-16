/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.pkg2;

/**
 *
 * @author 20155
 */
public abstract class Books {

    private String name_book;
    private String Author;
    private int Serial_Number;

    public Books() {
    }

    public Books(String name_book, String Author, int Serial_Number) {
        this.name_book = name_book;
        this.Author = Author;
        this.Serial_Number = Serial_Number;
    }

    public String getName_book() {
        return name_book;
    }

    public String getAuthor() {
        return Author;
    }

    public int getSerial_Number() {
        return Serial_Number;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setSerial_Number(int Serial_Number) {
        this.Serial_Number = Serial_Number;
    }

    public abstract String toString();
}
