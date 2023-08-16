/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.pkg2;

/**
 *
 * @author 20155
 */
public class Borrower {
    private String Name_User;
    private int ID;
    private int Age_User;
    private int List_books[];
    public Borrower(){}
    public Borrower(String Name_User,int ID,int Age_User){
    this.Age_User=Age_User;
    this.ID=ID;
    this.Name_User=Name_User;
    }

    public String getName_User() {
        return Name_User;
    }

    public int getID() {
        return ID;
    }

    public int getAge_User() {
        return Age_User;
    }

    public int[] getList_books() {
        return List_books;
    }

    public void setName_User(String Name_User) {
        this.Name_User = Name_User;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAge_User(int Age_User) {
        this.Age_User = Age_User;
    }

    public void setList_books(int[] List_books) {
        this.List_books = List_books;
    }
    public void your_list(){
    for(int i=0;i<List_books.length;i++){ 
        System.out.println(List_books[i]);
    }
    }
}

