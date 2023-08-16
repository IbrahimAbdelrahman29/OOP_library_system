/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.pkg2;

public class Library  {

    Kids_Books k[] = new Kids_Books[3];

    public Library() {
        k[0]=new Kids_Books(5, "kidsbook1", "Hema",18);
        k[1] = new Kids_Books(7, "kidsbook2", "miDO", 15);
        k[2] = new Kids_Books(9, "kidsbook3", "Hany", 10);}

    public void borrow(Borrower z,Books B,int x[],int u[]) {
        if (z.getAge_User() > k[2].getSuitable_age()) {
            if (B.getSerial_Number() == 12) {
                System.out.println(z.getName_User() + " borrow " + B.getName_book() + "\n sreial number: " +B.getSerial_Number() + "\n the Author: " +B.getAuthor());
                B.setName_book(null);
                z.setList_books(x);
            } else if (B.getSerial_Number() == 13) {
                System.out.println(z.getName_User() + " borrow " + B.getName_book() + "\n sreial number: " + B.getSerial_Number() + "\n the Author: " + B.getAuthor());
                B.setName_book(null);
                z.setList_books(x);
            } else if (B.getSerial_Number() == 18) {
                System.out.println(z.getName_User() + " borrow " + B.getName_book() + "\n sreial number: " + B.getSerial_Number() + "\n the Author: " + B.getAuthor());
                B.setName_book(null);
                z.setList_books(x);
            } else if (B.getSerial_Number() == 15) {
                System.out.println(z.getName_User() + " borrow " + B.getName_book() + "\n sreial number: " + B.getSerial_Number() + "\n the Author: " + B.getAuthor());
              B.setName_book(null);
              z.setList_books(x);
            } else if (B.getSerial_Number() == 10) {
                System.out.println(z.getName_User() + " borrow " + B.getName_book() + "\n sreial number: " + B.getSerial_Number() + "\n the Author: " + B.getAuthor());
               B.setName_book(null);
               z.setList_books(x);
            } else {
                System.out.println("this serial number is incorrect");
            }
        } else if(z.getAge_User() <= k[2].getSuitable_age()){
            if (B.getSerial_Number() == 18) {
                if (k[0].getSuitable_age() <= z.getAge_User()) {
                    System.out.println(z.getName_User() + " borrow " + B.getName_book() + "\n sreial number: " +B.getSerial_Number() + "\n the Author: " + B.getAuthor());
                    B.setName_book(null);
                    z.setList_books(u);
                } else {
                    System.out.println("this book isn't Available");
                }
            } else if (B.getSerial_Number() == 15) {
                if (k[1].getSuitable_age() <= z.getAge_User()) {
                    System.out.println(z.getName_User() + " borrow " + B.getName_book() + "\n sreial number: " + B.getSerial_Number() + "\n the Author: " + B.getAuthor());
                    B.setName_book(null);
                 z.setList_books(u);
                } else {
                    System.out.println("this book isn't Available");
                }
            } else if (B.getSerial_Number() == 10) {
                if (k[2].getSuitable_age() <= z.getAge_User()) {
                    System.out.println(z.getName_User() + " borrow " + B.getName_book() + "\n sreial number: " + B.getSerial_Number() + "\n the Author: " + B.getAuthor());
                    B.setName_book(null);
                 z.setList_books(u);
                } else {
                    System.out.println("this book isn't Available");
                }
            } else {
                System.out.println("this serial number is incorrect");
            }
        }
    }

    public void Return(Borrower z,Books B) {
        if (k[2].getSuitable_age() < z.getAge_User()) {
            if (B.getSerial_Number() == 12) {
                if (B.getName_book() == null) {
                    B.setName_book("ScientificBook1");
                    System.out.println("U return :" + B.getName_book());      
                    }
                 else {
                    System.out.println("this book already exist");
                }}
             else if (B.getSerial_Number() == 13) {
                if (B.getName_book() == null) {
                    B.setName_book("ScientificBook2");
                    System.out.println("U return :" + B.getName_book());
                        
                    }
                 else {
                    System.out.println("this book already exist");
                }}
             else if (B.getSerial_Number() == 18) {
                if (B.getName_book() == null) {
                            B.setName_book("KidsBook1");
                    System.out.println("U return :" + B.getName_book());}
                    
                 else {
                    System.out.println("this book already exist");
                }
            } else if (B.getSerial_Number() == 15) {
                if (B.getName_book() == null) {
                            B.setName_book("KidsBook2");
                    System.out.println("U return :" + B.getName_book());
                     
                }
                    
                 else {
                    System.out.println("this book already exist");
                
            }} else if (B.getSerial_Number() == 10) {
                if (B.getName_book() == null) {
                            B.setName_book("KidsBook3");
                    System.out.println("U return :" + B.getName_book());
                     
                    }
                     else {System.out.println("this book already exist");}}
                     
                     
             else {System.out.println("this serial number is incorrect");}
        }
             else {
                 if (B.getSerial_Number() == 18) {
                 if (B.getName_book() == null) {
                  B.setName_book("KidsBook1");
                  System.out.println("U return : " + B.getName_book());}
                 else {System.out.println("this book already exist");}
                 }
                 
             else if (B.getSerial_Number() == 15) {
                if (B.getName_book() == null) {
                 B.setName_book("KidsBook2");
                  System.out.println("U return : " + B.getName_book());}
                 else {System.out.println("this book already exist");}
                 }
                 
                 
             else if (B.getSerial_Number() == 10) {
                if (B.getName_book() == null) {
                            B.setName_book("KidsBook3");
                       System.out.println("U return : " + B.getName_book());}
                    else {System.out.println("this book already exist");}}
                    else if (B.getSerial_Number() == 12) {
                     System.out.println("this is not available");}
                    else if (B.getSerial_Number() == 13) {
                     System.out.println("this is not available");}
                 else { System.out.println("this serial number is incorrect");}
        }}
    
    public void type_of_user() {
        System.out.println("1-for kids");
        System.out.println("2-for scientific");
    }

    public void type_of_subsciption_for_Scientific() {
        System.out.println("1-10$ to borrow twice");
        System.out.println("2-spcial order for you");
    }

    public void type_of_subsciption_for_Kids() {
        System.out.println("1-15$ to borrow 3 times");
    }

    public void BOOks_sc(String x[]) {
        x[0] = "KidsBook1";
        x[1] = "KidsBook2";
        x[2] = "KidsBook3";
        x[3] = "ScientificBook1";
        x[4] = "ScientificBook2";
    }

    public void BOOks_KIDS(String y[]) {
        y[0] = "KidsBook1";
        y[1] = "KidsBook2";
        y[2] = "KidsBook3";
    }

    public void books_of_scientific(String S[]) {
        for (int i = 0; i < S.length; i++) {
            System.out.println((i + 1) + "-" + S[i]);
        }
    }

    public void books_of_kids(String k[]) {
        for (int i = 0; i < k.length; i++) {
            System.out.println((i + 1) + "-" + k[i]);
        }
    }

}