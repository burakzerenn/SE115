import java.util.Scanner;//For the user to enter

public class LoginProcesses {//It is a class created to show a panel for login operations to the user.

    public void registration(Scanner input) {//method for registration.
        System.out.println("--------------------------------------------");
        System.out.println("Type 1 to create account, type 2 to continue");
        System.out.println("--------------------------------------------\n");
        int createAccountQuestion;
        createAccountQuestion = input.nextInt();
        while (true) {
            if (createAccountQuestion == 1) {
                String email;
                System.out.println("--------------------------------------------");
                System.out.println("Type your e-mail account:");
                System.out.println("--------------------------------------------\n");
                input.nextLine();
                email = input.nextLine();
                System.out.println("--------------------------------------------");
                System.out.println("Type your student number:");
                System.out.println("--------------------------------------------\n");
                long studentNumberForAccount;
                studentNumberForAccount = input.nextLong();
                int total = 0;
                while (studentNumberForAccount != 0) {
                    studentNumberForAccount = studentNumberForAccount/ 10;
                    ++total;
                }
                while (total % 11 != 0) { //infinite loop
                    System.out.println("--------------------------------------------");
                    System.out.println("You have entered your student number missing or too much\n");
                    System.out.println("Retype your student number:");
                    System.out.println("--------------------------------------------\n");
                    studentNumberForAccount = input.nextLong();
                    int total2 = 0;
                    while (studentNumberForAccount != 0) {
                        studentNumberForAccount = studentNumberForAccount/ 10;
                        ++total2;
                    }
                    if (total2 % 11 == 0) {
                        break;
                    }

                }
                System.out.println("--------------------------------------------");
                System.out.println("Application received!\n");
                System.out.println("After the necessary checks are made, " +
                        "your password will be sent to your e-mail within 5 working days.");
                System.out.println("--------------------------------------------\n");
                break;
            } else if (createAccountQuestion == 2) {
                break;
            } else {
                System.out.println("--------------------------------------------");
                System.out.println("Entered an unidentified number please enter 1 or 2:");
                System.out.println("--------------------------------------------\n");
                createAccountQuestion = input.nextInt();
            }
        }
    }


    public void changePassword(Scanner input) {//Method for change password.
        System.out.println("--------------------------------------------");
        System.out.println("If you want to change your password, type 1 or type 2 to continue");
        System.out.println("--------------------------------------------\n");
        int changePassword;
        changePassword = input.nextInt();
        while (true) {
            if (changePassword == 1) {
                long type1;
                int type2;
                System.out.println("--------------------------------------------");
                System.out.println("Please enter your school number:");
                System.out.println("--------------------------------------------\n");
                type1 = input.nextLong();
                int total = 0;
                while (type1 != 0) {
                    type1 =type1 / 10;
                    ++total;
                }
                //School number must be 11 digits.
                while (total % 11 != 0) { //infinite loop
                    System.out.println("--------------------------------------------");
                    System.out.println("You have entered your student number missing or too much\n");
                    System.out.println("Retype your student number:");
                    System.out.println("--------------------------------------------\n");
                    type1 = input.nextLong();
                    int total2 = 0;
                    while (type1 != 0) {
                        type1 = type1 / 10;
                        ++total2;
                    }
                    if (total2 % 11 == 0) {
                        break;
                    }
                }
                System.out.println("--------------------------------------------");
                System.out.println("You can only change your password once!\n");
                System.out.println("Please do not forget your password!\n");
                System.out.println("The password given to all students and academics by the system admin is 2021.\n");
                System.out.println("Please enter your password given by the system admin:");
                System.out.println("--------------------------------------------\n");
                int passwordGivenFromSystemAdmin = 2021;
                type2 = input.nextInt();
                while (type2 != passwordGivenFromSystemAdmin) {
                    System.out.println("--------------------------------------------");
                    System.out.println("There was a small mistake, this is not the password that the admin gave\t");
                    System.out.println("'2021'\n");
                    System.out.println("Re-enter the password:");
                    System.out.println("--------------------------------------------\n");
                    type2 = input.nextInt();
                }
                System.out.println("--------------------------------------------");
                System.out.println("According to the ULIS system, your password should only consist of numbers!");
                System.out.println("--------------------------------------------\n");
                System.out.println("--------------------------------------------");
                System.out.println("Type the password you want to create:");
                System.out.println("--------------------------------------------\n");
                double type3;
                type3 = input.nextDouble();
                System.out.println("Retype the password you created:");
                System.out.println("--------------------------------------------");
                double type4;
                type4 = input.nextDouble();
                if (type3 == type4) {
                    System.out.println("--------------------------------------------");
                    System.out.println("Your password has been successfully changed!");
                    System.out.println("--------------------------------------------\n");
                    break;
                }
                while (type3 != type4) {
                    System.out.println("--------------------------------------------");
                    System.out.println("The passwords you entered do not match, please re-create\n");
                    System.out.println("Type the password you want to create:");
                    System.out.println("--------------------------------------------\n");
                    System.out.println("--------------------------------------------");
                    type3 = input.nextDouble();
                    System.out.println("--------------------------------------------");
                    System.out.println("Retype the password you created:");
                    System.out.println("--------------------------------------------\n");
                    type4 = input.nextDouble();
                }
                System.out.println("--------------------------------------------");
                System.out.println("Your password has been successfully changed!");
                System.out.println("--------------------------------------------\n");
                break;
            } else if (changePassword == 2) {
                break;
            } else {
                System.out.println("--------------------------------------------");
                System.out.println("Entered an unidentified number please enter 1 or 2");
                System.out.println("--------------------------------------------\n");
                changePassword = input.nextInt();
            }
        }
    }
}
