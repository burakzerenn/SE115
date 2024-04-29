import java.util.ArrayList;//To use arraylist
import java.util.Scanner;

public class AddBook {//Classes created for adding products.
    //Attributes,
    int counterOfBooks = 50;
    int counterOfJournal = 50;
    //methods,

    ArrayList<String> nameOfBooks = new ArrayList<>();


    ArrayList<String> nameOfJournals = new ArrayList<>();

    public void bookAdding(Scanner input) {//Method for adding new products in to the library.
        System.out.println("--------------------------------------------");
        System.out.println("If you want to add books then type1\nIf you want to add journals then type2\nIf you want to continue then type3");
        System.out.println("--------------------------------------------\n");
        int answerForSecondQuestion;
        answerForSecondQuestion = input.nextInt();
        while (true) {

            if (answerForSecondQuestion == 3) {
                break;
            }
            if (answerForSecondQuestion == 1) {
                String bookName;
                int endNumber1;
                System.out.println("--------------------------------------------");
                System.out.println("Please type -1 when you finish adding books.\n");
                System.out.println("Please enter a number other than -1 and continue:");
                System.out.println("--------------------------------------------\n");
                endNumber1 = input.nextInt();
                while (endNumber1 != -1) {
                    System.out.println("--------------------------------------------");
                    System.out.println("What is the name of the book?");
                    System.out.println("Enter like this:\n number- the name of the book");
                    System.out.println("--------------------------------------------\n");
                    input.nextLine();
                    bookName = input.nextLine();
                    System.out.println("--------------------------------------------");
                    System.out.println("Book added!");
                    System.out.println("--------------------------------------------\n");
                    nameOfBooks.add(bookName);
                    counterOfBooks = counterOfBooks + 1;
                    System.out.println("--------------------------------------------");
                    System.out.println("if you want to continue adding books, enter a number other than -1 and continue :");
                    System.out.println("--------------------------------------------\n");
                    endNumber1 = input.nextInt();
                }
                System.out.println("--------------------------------------------");
                System.out.println("New list of books!");
                System.out.println("--------------------------------------------\n");
                System.out.println(nameOfBooks);
                System.out.println();
                System.out.println("--------------------------------------------");
                System.out.println("If you want to add books again then type1\nIf you want to add journals again then type2\nIf you want to continue then type3");
                System.out.println("--------------------------------------------\n");
                answerForSecondQuestion = input.nextInt();
            } else if (answerForSecondQuestion == 2) {
                int endNumber2;
                String journalName;
                System.out.println("--------------------------------------------");
                System.out.println("Please type -1 when you finish adding journals.\n");
                System.out.println("Please enter a number other than -1 and continue:");
                System.out.println("--------------------------------------------\n");
                endNumber2 = input.nextInt();
                while (endNumber2 != -1) {
                    System.out.println("--------------------------------------------");
                    System.out.println("What is the name of the journal?");
                    System.out.println("Enter like this:\n number- the name of the journal");
                    System.out.println("--------------------------------------------\n");
                    input.nextLine();
                    journalName = input.nextLine();
                    System.out.println("--------------------------------------------");
                    System.out.println("Journal added!");
                    System.out.println("--------------------------------------------\n");
                    nameOfJournals.add(journalName);
                    counterOfJournal = counterOfJournal + 1;
                    System.out.println("--------------------------------------------");
                    System.out.println("if you want to continue adding books, enter a number other than -1 and continue :");
                    System.out.println("--------------------------------------------\n");
                    endNumber2 = input.nextInt();
                    System.out.println("--------------------------------------------");
                    System.out.println("--------------------------------------------\n");
                }
                System.out.println("--------------------------------------------");
                System.out.println("New list of journals!");
                System.out.println("--------------------------------------------\n");
                System.out.println(nameOfJournals);
                System.out.println();
                System.out.println("--------------------------------------------");
                System.out.println("If you want to add books again then type1\nIf you want to add journals again then type2\nIf you want to continue then type3");
                System.out.println("--------------------------------------------\n");
                answerForSecondQuestion = input.nextInt();
            }
            else {
                System.out.println("--------------------------------------------");
                System.out.println("Unidentified number entered by admin!");
                System.out.println("--------------------------------------------\n");
                System.out.println("--------------------------------------------");
                System.out.println("If you want to add books then type1\nIf you want to add journals then type2\nIf you want to continue then type3");
                System.out.println("--------------------------------------------");
                answerForSecondQuestion = input.nextInt();
            }
        }
    }
}


