package library.pkg2;

public class Scientific extends Books {

    String Scientific_Section;

    public Scientific() {
    }

    public Scientific(String name_book, String Author, int Serial_Number, String Scientific_Section) {
        super(name_book, Author, Serial_Number);
        this.Scientific_Section = Scientific_Section;
    }

    @Override
    public String toString() {
        return "the name of book: " + getName_book() + " name of author: " + getAuthor() + " the serial number: " + getSerial_Number() + " the scientific section: " + Scientific_Section;
    }
}
