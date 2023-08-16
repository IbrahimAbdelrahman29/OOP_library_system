/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Books b[] = new Books[6];
        b[0] = new Kids_Books(5, "kidsbook1", "Hema", 18);
        b[1] = new Kids_Books(7, "kidsbook2", "miDO", 15);
        b[2] = new Kids_Books(9, "kidsbook3", "Hany", 10);
        b[3] = new Scientific("ScientificBOoks1", "Hema", 12, "Programming");
        b[4] = new Scientific("ScientificBOoks2", "Hema", 13, "Ai");
        b[5] = new Scientific("Special_BOoks", "MIdo", 99, "Vip");
        Library L = new Library();
        String list_of_scientific[] = new String[5];
        L.BOOks_sc(list_of_scientific);
        String k[] = new String[3];
        L.BOOks_KIDS(k);
        int u[] = new int[3];
        int x[] = new int[2];
        while (true) {
            System.out.println("Choose");
            System.out.println("1-maIN project");
            System.out.println("2-Bouns");
            System.out.println("press (-1) to end the program");
            int main = e.nextInt();
            if (main == 1) {
                L.type_of_user();
                int choose = e.nextInt();
                if (choose == 1) {
                    L.type_of_subsciption_for_Kids();
                    int choose1 = e.nextInt();
                    if (choose1 == 1) {
                        System.out.println("please enter your name");
                        String name_user = e.next();
                        System.out.println("please enter your age");
                        int age_user = e.nextInt();
                        System.out.println("your ID is 1");
                        Borrower B = new Borrower(name_user, 1, age_user);
                        System.out.println("CHOOSE ");
                        System.out.println("1-Borrow");
                        System.out.println("2-Return");
                        int option = e.nextInt();
                        if (option == 1) {
                            System.out.println("YOur avaliable Books");
                            L.books_of_kids(k);
                            int choose2 = e.nextInt();
                            if (choose2 == 1) {
                                if (u[0] == 0) {
                                    u[0] = 18;
                                    L.borrow(B, b[0], u, x);
                                } else if (u[1] == 0) {
                                    u[1] = 18;
                                    L.borrow(B, b[0], u, x);
                                } else if (u[2] == 0) {
                                    u[2] = 18;
                                    L.borrow(B, b[0], u, x);
                                } else {
                                    System.out.println("u can't borrow any more books");
                                }

                            } else if (choose2 == 2) {
                                if (u[0] == 0) {
                                    u[0] = 15;
                                    L.borrow(B, b[1], u, x);
                                } else if (u[1] == 0) {
                                    u[1] = 15;
                                    L.borrow(B, b[1], u, x);
                                } else if (u[2] == 0) {
                                    u[2] = 15;
                                    L.borrow(B, b[1], u, x);
                                } else {
                                    System.out.println("u can't borrow any more books");
                                }

                            } else if (choose2 == 3) {
                                if (u[0] == 0) {
                                    u[0] = 10;
                                    L.borrow(B, b[2], u, x);
                                } else if (u[1] == 0) {
                                    u[1] = 10;
                                    L.borrow(B, b[2], u, x);
                                } else if (u[2] == 0) {
                                    u[2] = 10;
                                    L.borrow(B, b[2], u, x);
                                } else {
                                    System.out.println("u can't borrow any more books");
                                }

                            } else {
                                System.out.println("incorrect ans");
                            }

                        } else if (option == 2) {
                            L.books_of_kids(k);
                            int choose3 = e.nextInt();
                            if (choose3 == 1) {
                                L.Return(B, b[0]);
                            } else if (choose3 == 2) {
                                L.Return(B, b[1]);
                            } else if (choose3 == 3) {
                                L.Return(B, b[2]);
                            } else {
                                System.out.println("incorrect ans");
                            }
                        } else {
                            System.out.println("invaild option");
                        }
                        try{
                            System.out.println("if u want ur list enter ur id");
                        
                        int y = e.nextInt();
                         if (y == 1) {
                            B.your_list();}
                        
                        }
                        catch(java.lang.NullPointerException o){
                            System.out.println(o);
                        }
                        System.out.println("List of books is empty or full");
                        

                    }
                } else if (choose == 2) {
                    L.type_of_subsciption_for_Scientific();
                    int op = e.nextInt();
                    if (op == 1) {
                        System.out.println("please enter your name");
                        String name_user = e.next();
                        System.out.println("please enter your age");
                        int age_user = e.nextInt();
                        System.out.println("your ID is 2");
                        Borrower B2 = new Borrower(name_user, 1, age_user);
                        System.out.println("CHOOSE ");
                        System.out.println("1-Borrow");
                        System.out.println("2-Return");
                        int opt = e.nextInt();
                        if (opt == 1) {
                            System.out.println("YOur avaliable Books");
                            L.books_of_scientific(list_of_scientific);
                            int choose2 = e.nextInt();
                            if (choose2 == 1) {
                                if (x[0] == 0) {
                                    x[0] = 18;
                                    L.borrow(B2, b[0], u, x);
                                } else if (x[1] == 0) {
                                    x[1] = 18;
                                    L.borrow(B2, b[0], u, x);
                                } else {
                                    System.out.println("u can't borrow any more books");
                                }
                            } else if (choose2 == 2) {
                                if (x[0] == 0) {
                                    x[0] = 15;
                                    L.borrow(B2, b[1], u, x);
                                } else if (x[1] == 0) {
                                    x[1] = 15;
                                    L.borrow(B2, b[1], u, x);
                                } else {
                                    System.out.println("u can't borrow any more books");
                                }

                            } else if (choose2 == 3) {
                                if (x[0] == 0) {
                                    x[0] = 10;
                                    L.borrow(B2, b[2], u, x);
                                } else if (x[1] == 0) {
                                    x[1] = 10;
                                    L.borrow(B2, b[2], u, x);
                                } else {
                                    System.out.println("u can't borrow any more books");
                                }
                            } else if (choose2 == 4) {
                                if (x[0] == 0) {
                                    x[0] = 12;
                                    L.borrow(B2, b[3], u, x);
                                } else if (x[1] == 0) {
                                    x[1] = 12;
                                    L.borrow(B2, b[3], u, x);
                                } else {
                                    System.out.println("u can't borrow any more books");
                                }

                            } else if (choose2 == 5) {
                                if (x[0] == 0) {
                                    x[0] = 12;
                                    L.borrow(B2, b[4], u, x);
                                } else if (x[1] == 0) {
                                    x[1] = 12;
                                    L.borrow(B2, b[4], u, x);
                                } else {
                                    System.out.println("u can't borrow any more books");
                                }

                            } else {
                                System.out.println("incorrect ans");
                            }
                        } else if (opt == 2) {
                            L.books_of_scientific(list_of_scientific);
                            int choose3 = e.nextInt();
                            if (choose3 == 1) {
                                L.Return(B2, b[0]);
                            } else if (choose3 == 2) {
                                L.Return(B2, b[1]);
                            } else if (choose3 == 3) {
                                L.Return(B2, b[2]);
                            } else if (choose3 == 4) {
                                L.Return(B2, b[3]);
                            } else if (choose3 == 5) {
                                L.Return(B2, b[4]);
                            } else {
                                System.out.println("incorrect ans");
                            }
                        } else {
                            System.out.println("Invaild option");
                        }
                    } else if (op == 2) {
                        System.out.println("YOU are aVIP cleint now");
                        System.out.println(b[5].toString());
                    }
                } else {
                    System.out.println("invaild option");
                }
            } else if (main == 2) {
            } else if (main == -1) {
                break;
            } else {
                System.out.println("invaild option");
            }
        }
    }

}
