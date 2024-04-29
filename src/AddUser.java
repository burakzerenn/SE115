import java.util.ArrayList;//To use arraylist
import java.util.Scanner;//For the user to enter
public class AddUser {//Classes created for adding users.
    //Attributes,
    int counterOfUser = 101;
    private long schoolNumber;
    private int password;
    //methods,
    ArrayList<String> nameOfUsers = new ArrayList<>();

    public void setSchoolNumber(long _schoolNumber) {
        this.schoolNumber = _schoolNumber;
    }//Method for setting school number.


    public void setPassword(int _password) {//Method for setting password.
        this.password = _password;
    }


    public void displayForSchoolNumber() {//Method for displaying Student ID added!
        System.out.println("Student ID added!\n");
    }

    public void displayForPassword() {//Method for displaying Student password added\nNew user successfully added!
        System.out.println("Student password added \nNew user successfully added!");
    }


    public void userAdding(Scanner input) {//Method for adding new users in to the library.
        AddUser addUser = new AddUser();
        long schoolNumberOfAdd;
        int passwordOfAdd;
        int endNumber;
        System.out.println("--------------------------------------------");
        System.out.println("Please type -1 when you finish adding users.\n");
        System.out.println("Please enter a number other than -1 and continue:");
        System.out.println("--------------------------------------------\n");
        endNumber = input.nextInt();
        while (endNumber != -1) {
            System.out.println("--------------------------------------------");
            System.out.println("What is the student's school number?");
            System.out.println("--------------------------------------------\n");
            schoolNumberOfAdd = input.nextLong();
            int _total = 0;
            while (schoolNumberOfAdd != 0) {
                schoolNumberOfAdd = schoolNumberOfAdd / 10;
                ++_total;
            }
            while (_total % 11 != 0) {   //infinite loop
                System.out.println("--------------------------------------------");
                System.out.println("Missing or extra school number entered by system admin\n");
                System.out.println("Retype student number:");
                System.out.println("--------------------------------------------\n");
                int _total2 = 0;
                schoolNumberOfAdd = input.nextLong();
                while (_total2 % 11 != 0) {
                    schoolNumberOfAdd = schoolNumberOfAdd / 10;
                    ++_total2;
                }
                if (_total2 % 11 == 0) {
                    break;
                }
            }
            addUser.setSchoolNumber(schoolNumberOfAdd);
            addUser.displayForSchoolNumber();
            System.out.println("--------------------------------------------");
            System.out.println("What is the student's first and last name?");
            System.out.println("Enter like this:\n number- first and last name");
            System.out.println("--------------------------------------------");
            System.out.println("");
            String name1;
            input.nextLine();
            name1 = input.nextLine();
            nameOfUsers.add(name1);
            System.out.println("--------------------------------------------");
            System.out.println("what will be the password?");
            System.out.println("--------------------------------------------");
            passwordOfAdd = input.nextInt();
            while (passwordOfAdd != 2021)
                if (passwordOfAdd != 2021) {
                    System.out.println("--------------------------------------------");
                    System.out.println("The password to be given must be 2021");
                    System.out.println("Re-enter password");
                    System.out.println("--------------------------------------------\n");
                    passwordOfAdd = input.nextInt();
                } else {
                    break;
                }
            addUser.setPassword(passwordOfAdd);
            System.out.println("--------------------------------------------");
            addUser.displayForPassword();
            System.out.println("--------------------------------------------\n");
            counterOfUser = counterOfUser + 1;
            System.out.println("--------------------------------------------");
            System.out.println("if you want to continue adding users, enter a number other than -1 and continue :");
            System.out.println("--------------------------------------------\n");
            endNumber = input.nextInt();

        }
        System.out.println("--------------------------------------------");
        System.out.println("New list of users!");
        System.out.println("--------------------------------------------\n");
        System.out.println(nameOfUsers);
        System.out.println();
    }

}

