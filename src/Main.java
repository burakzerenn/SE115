import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double password;
        Long id;
        //To use admin's method we should an object, so we renew to SystemAdmin class.
        SystemAdmin systemAdmin = new SystemAdmin();
        //admin login id
        systemAdmin.setId(0);
        //admin login Password
        systemAdmin.setPassword(115511);
        long adminId = systemAdmin.getId();
        double adminPassword = systemAdmin.getPassword();
        double endUlisSystem;
        //To start program;
        System.out.println("--------------------------------------------");
        System.out.println("Please type 115,115 to start the ULIS:");
        System.out.println("(A comma should be used instead of a dot.)");
        System.out.println("--------------------------------------------\n");
        endUlisSystem = input.nextDouble();
        if (endUlisSystem == 115.115) {
            while (endUlisSystem != -115.115) {//infinite loop
                System.out.println("--------------------------------------------");
                System.out.println("Welcome to the University Library Information System (ULIS)");
                System.out.println("--------------------------------------------\n");
                System.out.println("--------------------------------------------");
                System.out.println("Type 1 for registration\n" +
                        "Type 2 for account transactions\n" +
                        "Type 3 for login transactions");
                System.out.println("--------------------------------------------\n");
                int startingOperations;
                startingOperations = input.nextInt();
                while (true) {
                    switch (startingOperations) {
                        case 1:
                            //We renewed the class because the object is needed to use the method.
                            LoginProcesses loginProcesses1 = new LoginProcesses();
                            loginProcesses1.registration(input);
                            break;
                        case 2:
                            //We renewed the class because the object is needed to use the method.
                            LoginProcesses loginProcesses2 = new LoginProcesses();
                            loginProcesses2.changePassword(input);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("--------------------------------------------");
                            System.out.println("You entered an unidentified number\n");
                            System.out.println("Type 1 for registration\nType 2 for account transactions\nType 3 for login transactions");
                            System.out.println("--------------------------------------------");
                            startingOperations = input.nextInt();
                    }
                    if (startingOperations == 1 || startingOperations == 2 || startingOperations == 3) {
                        break;
                    }
                }
                if (startingOperations==1 || startingOperations==2){
                    System.out.println("--------------------------------------------");
                    System.out.println("If you don't want to continue\n");
                    System.out.println("Please type -115,115 to close the program\n");
                    System.out.println("--------------------------------------------");
                    System.out.println("If you want to continue, type a number other than -115,115");
                    System.out.println("(A comma should be used instead of a dot.)");
                    System.out.println("--------------------------------------------");
                    endUlisSystem = input.nextDouble();
                    if (endUlisSystem == -115.115) {
                        break;
                    }
                }

                int total = 0;System.out.println("--------------------------------------------");
                System.out.println("Login");
                System.out.println("--------------------------------------------\n");
                System.out.println("--------------------------------------------");
                System.out.println("ID:");
                System.out.println("--------------------------------------------\n");
                id = input.nextLong();
                while (id != 0) {
                    id =id / 10;
                    ++total;
                }
                while (total % 11 != 0) { //infinite loop, but we don't want to use true instead of this.
                    System.out.println("--------------------------------------------");
                    System.out.println("You have entered your student number missing or too much\n");
                    System.out.println("Retype your student number:");
                    System.out.println("--------------------------------------------\n");
                    System.out.println("--------------------------------------------");
                    id = input.nextLong();
                    System.out.println("--------------------------------------------\n");
                    int total2 = 0;
                    while (id != 0) {
                        id = id / 10;
                        ++total2;
                    }
                    if (total2 % 11 == 0) {
                        break;
                    }
                }
                System.out.println("--------------------------------------------");
                System.out.println("Password: ");
                System.out.println("--------------------------------------------\n");
                input.nextLine();
                password = input.nextDouble();
                while (endUlisSystem!=-115.115) {
                    if (id == adminId && password == adminPassword) {
                        System.out.println("--------------------------------------------");
                        System.out.println("You are logged in as system administrator.");
                        System.out.println("--------------------------------------------\n");
                        //We renewed the class because the object is needed to use the method.
                        DeleteUser deleteUser = new DeleteUser();
                        deleteUser.userDeletingAndAdding(input);
                        //We renewed the class because the object is needed to use the method.
                        DeleteBook deleteBook = new DeleteBook();
                        deleteBook.bookDeleting(input);
                        System.out.println("--------------------------------------------");
                        System.out.println("If you don't want to continue\n");
                        System.out.println("Please type -115,115 to close the program\n");
                        System.out.println("--------------------------------------------");
                        System.out.println("If you want to continue, type a number other than -115,115");
                        System.out.println("(A comma should be used instead of a dot.)");
                        System.out.println("--------------------------------------------");
                        endUlisSystem = input.nextDouble();
                    }
                    else{
                        //We renewed the class because the object is needed to use the method.
                        UsersArea usersArea = new UsersArea();
                        usersArea.usersArea(input);
                        System.out.println("--------------------------------------------");
                        System.out.println("If you don't want to continue");
                        System.out.println("Please type -115,115 to close the program\n");
                        System.out.println("--------------------------------------------");
                        System.out.println("If you want to continue, type a number other than -115,115");
                        System.out.println("(A comma should be used instead of a dot.)");
                        System.out.println("--------------------------------------------\n");
                        endUlisSystem = input.nextDouble();
                    }
                }
            }
            System.out.println("--------------------------------------------");
            System.out.println("Have a nice day! :)");
            System.out.println("--------------------------------------------");
        }
        else {
            System.out.println("--------------------------------------------");
            System.out.println("You entered the wrong number, the program is closed.\n");
            System.out.println("Have a nice day! :)");
            System.out.println("--------------------------------------------");
        }
    }
}

