import java.util.Scanner;//For the user to enter
public class UsersArea extends DeleteBook {//Inheritance class DeleteBook because to be able to use arraylist.
    //We shouldn't renew this class when a user is added or deleted, so we use inheritance.
    public void usersArea(Scanner input) {//This method shows what options the user has in the library.
        //All existing book names, user names, and journal names were re-entered in each class.
        //All will give results with links for each class.
        nameOfBooks.add(" 0- Administrator's book");
        nameOfBooks.add(" 1- Pride and Prejudice");
        nameOfBooks.add(" 2- To Kill a Mockingbird");
        nameOfBooks.add(" 3- The Great Gatsbyby");
        nameOfBooks.add(" 4- One Hundred Years of Solitude");
        nameOfBooks.add(" 5- In Cold Blood");
        nameOfBooks.add(" 6- Wide Sargasso Sea");
        nameOfBooks.add(" 7- Brave New World");
        nameOfBooks.add(" 8- I Capture The Castle");
        nameOfBooks.add(" 9- Jane Eyre");
        nameOfBooks.add(" 10- Crime and Punishment");
        nameOfBooks.add(" 11- The Secret History");
        nameOfBooks.add(" 12- The Call of the Wild");
        nameOfBooks.add(" 13- The Chrysalids");
        nameOfBooks.add(" 14- Persuasion");
        nameOfBooks.add(" 15- Moby-Dick");
        nameOfBooks.add(" 16- The Lion, the Witch and the Wardrobe");
        nameOfBooks.add(" 17- To the Lighthouse");
        nameOfBooks.add(" 18- The Death of the Heart");
        nameOfBooks.add(" 19- Tess of the d'Urbervilles");
        nameOfBooks.add(" 20- Frankenstein");
        nameOfBooks.add(" 21- The Master and Margarita");
        nameOfBooks.add(" 22- One Flew Over the Cuckoo's Nest");
        nameOfBooks.add(" 23- Nineteen Eighty-Four");
        nameOfBooks.add(" 24- The Art of War");
        nameOfBooks.add(" 25- Buddenbrooks");
        nameOfBooks.add(" 26- The Grapes of Wrath");
        nameOfBooks.add(" 27- Beloved");
        nameOfBooks.add(" 28- The Code of the Woosters");
        nameOfBooks.add(" 29- Dracula");
        nameOfBooks.add(" 30- The Lord of the Rings");
        nameOfBooks.add(" 31- The Adventures of Huckleberry Finn");
        nameOfBooks.add(" 32- Great Expectations");
        nameOfBooks.add(" 33- Catch-22");
        nameOfBooks.add(" 34- The Age of Innocence");
        nameOfBooks.add(" 35- Things Fall Apart");
        nameOfBooks.add(" 36- Middlemarch");
        nameOfBooks.add(" 37- Midnight's Children");
        nameOfBooks.add(" 38- The Iliad");
        nameOfBooks.add(" 39- Vanity Fair");
        nameOfBooks.add(" 40- Brideshead Revisited");
        nameOfBooks.add(" 41- The Catcher in the Rye");
        nameOfBooks.add(" 42- Alice’s Adventures in Wonderland");
        nameOfBooks.add(" 43- The Mill on the Floss");
        nameOfBooks.add(" 44- Barchester Towers");
        nameOfBooks.add(" 45- Another Country");
        nameOfBooks.add(" 46- Les Miserables");
        nameOfBooks.add(" 47- Charlie and the Chocolate Factory");
        nameOfBooks.add(" 48- The Outsiders");
        nameOfBooks.add(" 49- The Count of Monte Cristo");
        nameOfBooks.add(" 50- Ulysses");
        nameOfJournals.add(" 0- Administrator's journal");
        nameOfJournals.add(" 1- Ca-A Cancer Journal for Clinicians");
        nameOfJournals.add(" 2- MMWR Recommendations and Reports");
        nameOfJournals.add(" 3- Nature Reviews Molecular Cell Biology");
        nameOfJournals.add(" 4- Quarterly Journal of Economics");
        nameOfJournals.add(" 5- Nature Reviews Materials");
        nameOfJournals.add(" 6- Cell");
        nameOfJournals.add(" 7- Nature Reviews Genetics");
        nameOfJournals.add(" 8- Reviews of Modern Physics");
        nameOfJournals.add(" 9-Journal of Political Economy");
        nameOfJournals.add(" 10- National vital statistics reports");
        nameOfJournals.add(" 11- Nature Reviews Immunology");
        nameOfJournals.add(" 12- Chemical Reviews");
        nameOfJournals.add(" 13- MMWR Surveillance summaries");
        nameOfJournals.add(" 14- New England Journal of Medicine");
        nameOfJournals.add(" 15- Nature Energy");
        nameOfJournals.add(" 16- Nature Reviews Cancer");
        nameOfJournals.add(" 17- Nature Medicine");
        nameOfJournals.add(" 18- Nature Methods");
        nameOfJournals.add(" 19- Nature Genetics");
        nameOfJournals.add(" 20- Academy of Management Annals");
        nameOfJournals.add(" 21- Annual Review of Immunology");
        nameOfJournals.add(" 22- Journal of Finance");
        nameOfJournals.add(" 23- American Economic Review");
        nameOfJournals.add(" 24- Annual Review of Biochemistry");
        nameOfJournals.add(" 25- Econometrica");
        nameOfJournals.add(" 26- Nature Reviews Chemistry");
        nameOfJournals.add(" 27- Nature");
        nameOfJournals.add(" 28- Review of Economic Studies");
        nameOfJournals.add(" 29- Annual Review of Astronomy and Astrophysics");
        nameOfJournals.add(" 30- Chemical Society Reviews");
        nameOfJournals.add(" 31- World Psychiatry");
        nameOfJournals.add(" 32- Nature Biotechnology");
        nameOfJournals.add(" 33- Administrative Science Quarterly");
        nameOfJournals.add(" 34- Energy and Environmental Science");
        nameOfJournals.add(" 35- Nature Materials");
        nameOfJournals.add(" 36- Nature Catalysis");
        nameOfJournals.add(" 37- Nature Nanotechnology");
        nameOfJournals.add(" 38- Immunity");
        nameOfJournals.add(" 39- Physiological Reviews");
        nameOfJournals.add(" 40- Nature Photonics");
        nameOfJournals.add(" 41- Lancet Oncology, The");
        nameOfJournals.add(" 42- Nature Neuroscience");
        nameOfJournals.add(" 43- Lancet, The");
        nameOfJournals.add(" 44- Cancer Cell");
        nameOfJournals.add(" 45- American Economic Journal: Applied Economics");
        nameOfJournals.add(" 46- Review of Financial Studies");
        nameOfJournals.add(" 47- Lancet Neurology, The");
        nameOfJournals.add(" 48- Molecular Cell");
        nameOfJournals.add(" 49- Science");
        nameOfJournals.add(" 50- Joule");
         int i=0;
         int j =0;
        System.out.println("--------------------------------------------");
        System.out.println("Welcome back to the UlIS System!\n");
        System.out.println("Type 1 to benefit from books\nType 2 to benefit from journals");
        System.out.println("Type 3 to donate books to the library\nType 4 to donate journals to the library");
        System.out.println("Type 5 to continue to exit from system");
        System.out.println("--------------------------------------------\n");
        int questionf;
        questionf = input.nextInt();
        while (true) {
            if (questionf == 1) {
                int endPoint;
                System.out.println("--------------------------------------------");
                System.out.println("Please type -1 when you're done borrowing a book.\n");
                System.out.println("Please enter a number other than -1 and continue:");
                System.out.println("--------------------------------------------\n");
                endPoint = input.nextInt();
                while (endPoint != -1) {
                    System.out.println("--------------------------------------------");
                    System.out.println("----List of all our books in our library----");
                    System.out.println("--------------------------------------------\n");
                    System.out.println(nameOfBooks);
                    System.out.println("--------------------------------------------");
                    System.out.println("Which book's information would you like to know?");
                    System.out.println("--------------------------------------------\n");
                    int numberr;
                    numberr = input.nextInt();
                    if (numberr == 32) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr == 16) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr == 26) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr == 13) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr == 36) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr == 21) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr == 10) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr == 46) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr == 8) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr == 3) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr == 1) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr == 22) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr == 39) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr == 11) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr == 6) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr == 44) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr == 50) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + " currently loaned to a member.\n")
                        ;System.out.println("You cannot use this book until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(numberr) + "  available in the library.");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println("If you want to borrow the book, type 1,\nIf you want to inquire about another book enter any number other than 1");
                        System.out.println("--------------------------------------------\n");
                        int cot;
                        cot=input.nextInt();
                        if (cot==1){
                            String nameee;
                            System.out.println("--------------------------------------------");
                            System.out.println("Enter your name and surname:");
                            System.out.println("--------------------------------------------\n");
                            input.nextLine();
                            nameee=input.nextLine();
                            System.out.println("--------------------------------------------");
                            System.out.print("The book was borrowed by "+nameee +" = ");
                            System.out.println(nameOfBooks.get(numberr));
                            System.out.println("--------------------------------------------\n");

                            nameOfBooks.remove(numberr);
                            ++i;
                            System.out.println("--------------------------------------------");
                            System.out.println("Type 1 for borrowing rules\nType a number other than 1 to continue");
                            System.out.println("--------------------------------------------\n");
                            int asd;
                            asd=input.nextInt();
                            if (asd==1){
                                //Our library's own rules.
                                System.out.println("--------------------------------------------");
                                System.out.println("'Borrowing rules'\n");
                                System.out.println("--------------------------------------------\n");
                                System.out.println("--------------------------------------------");
                                System.out.println("Rule 1 :\n");
                                System.out.println("The borrowed book must be returned to the library within 2 months at the latest.");
                                System.out.println("--------------------------------------------\n");
                                System.out.println("--------------------------------------------");
                                System.out.println("Rule 2:\n");
                                System.out.println("If you do not deliver the book within 2 months, the book will be taken from you by the admin.");
                                System.out.println("--------------------------------------------\n");
                                System.out.println("--------------------------------------------");
                                System.out.println("Rule 3 :\n");
                                System.out.println("If a book is taken back due to the library's rules,\nThe next book is automatically given to the user.");
                                System.out.println("--------------------------------------------\n");
                                System.out.println("--------------------------------------------");
                                System.out.println("Rule 4 :\n");
                                System.out.println("You have the right to use 6 content (3 books and 3 journals) for a week.");
                                System.out.println("The first 3 books or journals you choose will be loaned to you by the admin.");
                                System.out.println("--------------------------------------------\n");
                            }
                        }
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("Please type -1 when you're done borrowing a book.\n");
                    System.out.println("Please enter a number other than -1 and continue:");
                    System.out.println("--------------------------------------------\n");
                    endPoint = input.nextInt();
                    if (endPoint!=-1) {
                        System.out.println("--------------------------------------------");
                        System.out.println("If you have borrowed a book, please consider the following information:");
                        System.out.println("You should keep in mind the order you chose,\nYou should type the number of the book you chose accordingly");
                        System.out.println("If you are going to enter a number greater than the last number you chose:");
                        System.out.println("Please delete " + i + " minus the number you want to delete.");
                        System.out.println("--------------------------------------------\n");
                    }
                }
                System.out.println("--------------------------------------------");
                System.out.println("Type 1 to benefit from books\nType 2 to benefit from journals");
                System.out.println("Type 3 to donate books to the library\nType 4 to donate journals to the library");
                System.out.println("Type 5 to continue to exit from system");
                System.out.println("--------------------------------------------\n");
                questionf = input.nextInt();
            }


            else if (questionf == 2) {
                int endPoint1;
                System.out.println("--------------------------------------------");
                System.out.println("Please type -1 when you're done borrowing a journal.\n");
                System.out.println("Please enter a number other than -1 and continue:");
                System.out.println("--------------------------------------------\n");
                endPoint1 = input.nextInt();
                while (endPoint1 != -1) {
                    System.out.println("----List of all our books in our library----");
                    System.out.println(nameOfJournals);
                    System.out.println("--------------------------------------------");
                    System.out.println("Which journal's information would you like to know?");
                    System.out.println("--------------------------------------------\n");
                    int numberr1;
                    numberr1 = input.nextInt();
                    if (numberr1 == 14) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr1 == 6) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr1 == 31) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr1 == 17) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr1 == 29) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr1 == 3) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr1 == 36) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr1 == 41) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    } else if (numberr1 == 11) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr1 == 40) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr1 == 19) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr1 == 30) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr1 == 28) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");

                    }
                    else if (numberr1 == 1) {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + " currently loaned to a member.\n");
                        System.out.println("You cannot use this journal until the borrower returns it.");
                        System.out.println("--------------------------------------------\n");


                    }
                    else {
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(numberr1) + "  available in the library.");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println("If you want to borrow the journal, type 1,\nIf you want to inquire about another book enter any number other than 1");
                        System.out.println("--------------------------------------------\n");
                        int bot;
                        bot=input.nextInt();
                        if (bot==1){
                            String namee;
                            System.out.println("--------------------------------------------");
                            System.out.println("Enter your name and surname:");
                            System.out.println("--------------------------------------------\n");
                            input.nextLine();
                            namee=input.nextLine();
                            System.out.println("--------------------------------------------");
                            System.out.print("The book was borrowed by "+namee +" = ");
                            System.out.println(nameOfJournals.get(numberr1));
                            System.out.println("--------------------------------------------\n");

                            nameOfJournals.remove(numberr1);
                            ++j;
                            System.out.println("--------------------------------------------");
                            System.out.println("Type 1 for borrowing rules\nType a number other than 1 to continue");
                            System.out.println("--------------------------------------------\n");
                            int dsa;
                            dsa=input.nextInt();
                            if (dsa==1){
                                System.out.println("--------------------------------------------");
                                System.out.println("'Borrowing rules'\n");
                                System.out.println("--------------------------------------------\n");
                                System.out.println("--------------------------------------------");
                                System.out.println("Rule 1 :\n");
                                System.out.println("The borrowed journal must be returned to the library within 2 months at the latest.");
                                System.out.println("--------------------------------------------\n");
                                System.out.println("--------------------------------------------");
                                System.out.println("Rule 2:\n");
                                System.out.println("If you do not deliver the book within 2 months, the book will be taken from you by the manager.");
                                System.out.println("--------------------------------------------\n");
                                System.out.println("--------------------------------------------");
                                System.out.println("Rule 3 :\n");
                                System.out.println("If a book is taken back due to the library's rules,\nThe next book is automatically given to the user.");
                                System.out.println("--------------------------------------------\n");
                                System.out.println("--------------------------------------------");
                                System.out.println("Rule 4 :\n");
                                System.out.println("You have the right to use 6 content (3 books and 3 journals) for a week.");
                                System.out.println("The first 3 books or journals you choose will be loaned to you by the admin.");
                                System.out.println("--------------------------------------------\n");
                            }
                        }
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("Please type -1 when you're done borrowing a journal..\n");
                    System.out.println("Please enter a number other than -1 and continue:");
                    System.out.println("--------------------------------------------\n");
                    endPoint1 = input.nextInt();
                    if (endPoint1!=-1) {
                        System.out.println("--------------------------------------------");
                        System.out.println("If you have borrowed a book, please consider the following information:");
                        System.out.println("You should keep in mind the order you chose,\nYou should type the number of the book you chose accordingly");
                        System.out.println("If you are going to enter a number greater than the last number you chose:");
                        System.out.println("Please delete " + j + " minus the number you want to delete.");
                        System.out.println("--------------------------------------------\n");
                    }
                }
                System.out.println("--------------------------------------------");
                System.out.println("Type 1 to benefit from books\nType 2 to benefit from journals");
                System.out.println("Type 3 to donate books to the library\nType 4 to donate journals to the library");
                System.out.println("Type 5 to continue to exit from system");
                System.out.println("--------------------------------------------\n");
                questionf = input.nextInt();
            }
            else if (questionf==3){
                int endPoint3;
                System.out.println("--------------------------------------------");
                System.out.println("Please type -1 when you're done donating a book.\n");
                System.out.println("Please enter a number other than -1 and continue:");
                System.out.println("--------------------------------------------\n");
                endPoint3 = input.nextInt();
                while (endPoint3 != -1) {
                    int a=50;
                    String nameBook;
                    System.out.println("--------------------------------------------");
                    System.out.println("Enter the name of the book you want to donate to our library:");
                    System.out.println("--------------------------------------------\n");
                    input.nextLine();
                    nameBook=input.nextLine();
                    System.out.println("--------------------------------------------");
                    System.out.println("Thank you, your donation has been successfully received!");
                    System.out.println("--------------------------------------------\n");
                    ++a;
                    nameOfBooks.add(""+a+"- "+nameBook);
                    System.out.println(nameOfBooks);
                    System.out.println("--------------------------------------------");
                    System.out.println("You can see your book in our library\nThe number of your book is = "+a);
                    System.out.println("It will be available to use when the admin adds it to the library.");
                    System.out.println("--------------------------------------------\n");
                    System.out.println("--------------------------------------------");
                    System.out.println("Please type -1 when you're done donating a book.\n");
                    System.out.println("Please enter a number other than -1 and continue:");
                    System.out.println("--------------------------------------------\n");
                    endPoint3 = input.nextInt();
                }
                System.out.println("--------------------------------------------");
                System.out.println("Type 1 to benefit from books\nType 2 to benefit from journals");
                System.out.println("Type 3 to donate books to the library\nType 4 to donate journals to the library");
                System.out.println("Type 5 to continue to exit from system");
                System.out.println("--------------------------------------------\n");
                questionf = input.nextInt();
            }
            else if (questionf==4){
                int endPoint4;
                System.out.println("--------------------------------------------");
                System.out.println("Please type -1 when you're done donating a journal.\n");
                System.out.println("Please enter a number other than -1 and continue:");
                System.out.println("--------------------------------------------\n");
                endPoint4 = input.nextInt();
                while (endPoint4 != -1) {
                    int b=50;
                    String nameBook;
                    System.out.println("--------------------------------------------");
                    System.out.println("Enter the name of the journal you want to donate to our library:");
                    System.out.println("--------------------------------------------\n");
                    input.nextLine();
                    nameBook=input.nextLine();
                    System.out.println("--------------------------------------------");
                    System.out.println("Thank you, your donation has been successfully received!");
                    System.out.println("--------------------------------------------\n");
                    ++b;
                    nameOfJournals.add(""+b+"- "+nameBook);
                    System.out.println(nameOfJournals);
                    System.out.println("You can see your journal in our library\nThe number of your journal is = "+b);
                    System.out.println("It will be available to use when the admin adds it to the library.");
                    System.out.println("--------------------------------------------");
                    System.out.println("Please type -1 when you're done donating a journal.\n");
                    System.out.println("Please enter a number other than -1 and continue:");
                    System.out.println("--------------------------------------------\n");
                    endPoint4 = input.nextInt();
                }
                System.out.println("--------------------------------------------");
                System.out.println("Type 1 to benefit from books\nType 2 to benefit from journals");
                System.out.println("Type 3 to donate books to the library\nType 4 to donate journals to the library");
                System.out.println("Type 5 to continue to exit from system");
                System.out.println("--------------------------------------------\n");
                questionf = input.nextInt();
            }
            else if (questionf == 5) {
                break;
            }
            else {
                System.out.println("--------------------------------------------");
                System.out.println("You entered an unidentified number\n");
                System.out.println("Type 1 to benefit from books\nType 2 to benefit from journals");
                System.out.println("Type 3 to donate books to the library\nType 4 to donate journals to the library");
                System.out.println("Type 5 to continue to exit from system");
                System.out.println("--------------------------------------------");
                questionf = input.nextInt();
            }
        }
    }
}