package library.pkg2;

public class Kids_Books extends Books {

    private int suitable_age;

    public Kids_Books() {
    }

    public Kids_Books(int suitable_age, String name_book, String Author, int Serial_Number) {
        super(name_book, Author, Serial_Number);
        this.suitable_age = suitable_age;
    }

    public int getSuitable_age() {
        return suitable_age;
    }

    @Override
    public String toString() {
        return "the name of book: " + getName_book() + " name of author: " + getAuthor() + " the serial number: " + getSerial_Number();
    }

   }
