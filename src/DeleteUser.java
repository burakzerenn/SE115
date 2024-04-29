import java.util.ArrayList;//To use arraylist
import java.util.Random;//To get random number
import java.util.Scanner;//For the user to enter
public class DeleteUser extends AddUser{//inheritance class AddUser because if we want to get truly results.(291)
    //we shouldn't renew a class.
    //Attributes,
    private long schoolNumber;
    //methods,
    public void setSchoolNumber(long _schoolNumber){//Method for setting school number.
        this.schoolNumber=_schoolNumber;
    }
    public void displayForSchoolNumber(){
        System.out.println("Student deleted!");
    }//Method for displaying Student deleted!

    ArrayList<String> nameOfJournals = new ArrayList<>();
    ArrayList<String> nameOfBooks = new ArrayList<>();
    public void userDeletingAndAdding(Scanner input) {//In this method, user added, user deleted, user's information
        //is obtained, and as a result of the operations, it is shown how many users are left in the library.
        //All existing book names, user names, and journal names were re-entered in each class.
        //All will give results with links for each class.
        nameOfUsers.add(" 0- Administrator");
        nameOfUsers.add(" 1- Burak Zeren");
        nameOfUsers.add(" 2- İsmail Furkan Susam");
        nameOfUsers.add(" 3- Abdelrhman Saed Mahmoude Ali");
        nameOfUsers.add(" 4- Eren Topçu");
        nameOfUsers.add(" 5- Ahmet Kulak");
        nameOfUsers.add(" 6- Salih Barış");
        nameOfUsers.add(" 7- Orhan Pulak");
        nameOfUsers.add(" 8- Fatih Eczane");
        nameOfUsers.add(" 9- Kazım Keçici");
        nameOfUsers.add(" 10- Cristiano Ronaldo");
        nameOfUsers.add(" 11- Marek Hamsik");
        nameOfUsers.add(" 12- Pele Quarti");
        nameOfUsers.add(" 13- Oğuzhan Özyakup");
        nameOfUsers.add(" 14- Mert Günok");
        nameOfUsers.add(" 15- Burak Yılmaz");
        nameOfUsers.add(" 16- Kerem AKtürkoğlu");
        nameOfUsers.add(" 17- Halil Dervişoğlu");
        nameOfUsers.add(" 18- Berat Özdemir");
        nameOfUsers.add(" 19- Hakan Çalhanogli");
        nameOfUsers.add(" 20- Merih Demiral");
        nameOfUsers.add(" 21- Orkun Kökçü");
        nameOfUsers.add(" 22- Barış Alper Yılmaz");
        nameOfUsers.add(" 23- Çağlar Söyüncü");
        nameOfUsers.add(" 24- Kenan Karaman");
        nameOfUsers.add(" 25- Cengiz Ünder");
        nameOfUsers.add(" 26- Uğurcan Çakır");
        nameOfUsers.add(" 27- Caner Erkin");
        nameOfUsers.add(" 28- Rıdvan Yılmaz");
        nameOfUsers.add(" 29- Berkan Kutlu");
        nameOfUsers.add(" 30- Ozan Tufan");
        nameOfUsers.add(" 31- Mert Müldür");
        nameOfUsers.add(" 32- Serdar Aziz");
        nameOfUsers.add(" 33- Yusuf Yazıcı");
        nameOfUsers.add(" 34- Ozan Kabak");
        nameOfUsers.add(" 35- Zeki Çelik");
        nameOfUsers.add(" 36- Cenk Tosun");
        nameOfUsers.add(" 37- Abldülkadir Ömür");
        nameOfUsers.add(" 38- İrfan Can Kahveci");
        nameOfUsers.add(" 39- Ersin Destanoğlu");
        nameOfUsers.add(" 40- Enis Destan");
        nameOfUsers.add(" 41- Enes Ünal");
        nameOfUsers.add(" 42- Okay Yokuşlu");
        nameOfUsers.add(" 43- Kenan Ayhan");
        nameOfUsers.add(" 44- Yusuf Sarı");
        nameOfUsers.add(" 45- Taylan Antalyalı");
        nameOfUsers.add(" 46- Nazım Sangare");
        nameOfUsers.add(" 47- Tolga Ciğerci");
        nameOfUsers.add(" 48- Umut Meraş");
        nameOfUsers.add(" 49- Dorukhan Toköz");
        nameOfUsers.add(" 50- Ömer Bayram");
        nameOfUsers.add(" 51- Alparslan Öztürk");
        nameOfUsers.add(" 52- Salih Uçan");
        nameOfUsers.add(" 53- Hasan Ali Kaldırım");
        nameOfUsers.add(" 54- Gökhan Akkan");
        nameOfUsers.add(" 55- Emre Kılınç");
        nameOfUsers.add(" 56- Halil Akbunar");
        nameOfUsers.add(" 57- Mert Hakan Yandaş");
        nameOfUsers.add(" 58- Deniz Türüç");
        nameOfUsers.add(" 59- Abdülkerim Bardakçı");
        nameOfUsers.add(" 60- Karim Benzema");
        nameOfUsers.add(" 61- Halis Özkaya");
        nameOfUsers.add(" 62- Mete Kalkavan");
        nameOfUsers.add(" 63- Ali Palabıyık");
        nameOfUsers.add(" 64- Tarık Ongun");
        nameOfUsers.add(" 65- Halil Umut Meler");
        nameOfUsers.add(" 66- Hüseyin Göçek");
        nameOfUsers.add(" 67- Fırat Aydunus");
        nameOfUsers.add(" 68- Arda Kardeşler");
        nameOfUsers.add(" 69- Cüneyit Çakır");
        nameOfUsers.add(" 70- Rüçtü Reçber");
        nameOfUsers.add(" 71- Metin Aktaş");
        nameOfUsers.add(" 72- Fevzi Tuncay");
        nameOfUsers.add(" 73- Ayhan Akman");
        nameOfUsers.add(" 74- Emre Belözoğlu");
        nameOfUsers.add(" 75- Volkan Demirel");
        nameOfUsers.add(" 76- Aykut Kocaman");
        nameOfUsers.add(" 77- Fatih Terim");
        nameOfUsers.add(" 78- Şenol Güneş");
        nameOfUsers.add(" 79- Mustafa Denizli");
        nameOfUsers.add(" 80- Arda Turan");
        nameOfUsers.add(" 81- Sergen Yalçın");
        nameOfUsers.add(" 82- Hakan Şükür");
        nameOfUsers.add(" 83- Okan Buruk");
        nameOfUsers.add(" 84- Ümit Karan");
        nameOfUsers.add(" 85- Tayfun Korkut");
        nameOfUsers.add(" 86- İbrahim Toraman");
        nameOfUsers.add(" 87- İsmail Köybaşı");
        nameOfUsers.add(" 88- Hakan Balta");
        nameOfUsers.add(" 89- Sabri Sarıoğlu");
        nameOfUsers.add(" 90- Selçuk Şahin");
        nameOfUsers.add(" 91- Hamit Altıntop");
        nameOfUsers.add(" 92- Özer Hurmacı");
        nameOfUsers.add(" 93- Gökhan Töre");
        nameOfUsers.add(" 94- Serdar Saatçi");
        nameOfUsers.add(" 95- Semih Şentürk");
        nameOfUsers.add(" 96- Umut Bulut");
        nameOfUsers.add(" 97- Nihat Kahveci");
        nameOfUsers.add(" 98- Mevlüt Erdinç");
        nameOfUsers.add(" 99- Ozan İpek");
        nameOfUsers.add(" 100- Tucany Şanlı");
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
        int endnumber3;
        int i = 0;
        System.out.println("--------------------------------------------");
        System.out.println("If you want to add user then type1\nIf you want to delete user then type2\nIf you want to continue then type3");
        System.out.println("--------------------------------------------");
        endnumber3 = input.nextInt();
        while (true) {

            if (endnumber3==3){
                break;
            }
            else if (endnumber3 == 2) {

                 //We renew DeleteUser class because to be able to use the method.(264)
                DeleteUser deleteUser = new DeleteUser();
                int endNumber;
                System.out.println("--------------------------------------------");
                System.out.println("Please type -1 when you finish deleting users.\n");
                System.out.println("Please enter a number other than -1 and continue:");
                System.out.println("--------------------------------------------");
                endNumber = input.nextInt();
                while (endNumber != -1) {
                    System.out.println(nameOfUsers);
                    System.out.println("--------------------------------------------");
                    System.out.println("What is the number given to the student?");
                    System.out.println("--------------------------------------------");
                    int name1;
                    input.nextLine();
                    name1 = input.nextInt();
                    nameOfUsers.remove(name1);
                    //This is why we renew DeleteUser.
                    deleteUser.displayForSchoolNumber();
                    counterOfUser = counterOfUser - 1;
                    System.out.println("--------------------------------------------");
                    System.out.println("if you want to continue deleting users, enter a number other than -1 and continue :");
                    System.out.println("--------------------------------------------");
                    endNumber = input.nextInt();
                    ++i;
                    System.out.println("--------------------------------------------");
                    System.out.println("Please delete " + i + " minus the number you want to delete");
                    System.out.println("--------------------------------------------\n");
                }
                System.out.println("--------------------------------------------");
                System.out.println("New list of users!");
                System.out.println("--------------------------------------------");
                System.out.println(nameOfUsers);
                System.out.println();
                System.out.println("--------------------------------------------");
                System.out.println("If you want to add user again then type1\nIf you want to delete user again then type2\nIf you want to continue then type3");
                System.out.println("--------------------------------------------\n");
                endnumber3 = input.nextInt();
            }
            else if (endnumber3 == 1) {
                System.out.println("--------------------------------------------");
                System.out.println("If there is a deleted user in the adding process,\nplease fill in their id first and add them.");
                System.out.println("--------------------------------------------\n");
                //This is why we use inheritance. If we renew UserAdding class all delete things will be disappeared.
                userAdding(input);
                System.out.println("--------------------------------------------");
                System.out.println("If you want to add user again then type1\nIf you want to delete user again then type2\nIf you want to continue then type3");
                System.out.println("--------------------------------------------\n");
                endnumber3 = input.nextInt();
            }

            else {
                System.out.println("--------------------------------------------");
                System.out.println("Unidentified number entered by admin!");
                System.out.println("--------------------------------------------\n");
                System.out.println("--------------------------------------------");
                System.out.println("If you want to add user then type1\nIf you want to delete user then type2\nIf you want to continue then type3");
                System.out.println("--------------------------------------------");
                endnumber3 = input.nextInt();
            }

        }
        int query;
        System.out.println("--------------------------------------------");
        System.out.println("If you want to know the amount of users you have, type 1");
        System.out.println("Please enter a number other than 1 to continue:");
        System.out.println("--------------------------------------------\n");
        query=input.nextInt();
        if (query==1) {
            System.out.println("--------------------------------------------");
            System.out.println("Total number of ULIS users with administrator = " + "\\\\" + counterOfUser + "//");
            System.out.println("--------------------------------------------\n");
        }
        int query1;
        System.out.println("--------------------------------------------");
        System.out.println("If you want to get information about a user, type 1");
        System.out.println("Please enter a number other than 1 to continue:");
        System.out.println("--------------------------------------------\n");
        query1=input.nextInt();
        if (query1 == 1) {
            int query3;
            System.out.println("--------------------------------------------");
            System.out.println("Which student's information would you like to know?");
            System.out.println("There are "+counterOfUser+" users in the library");
            System.out.println("Type -1 to stop receiving information");
            System.out.println("You should keep in mind the order you deleted,\nyou should write the number of the person you chose accordingly");
            System.out.println("If you are going to enter a number greater than the last number you deleted:");
            System.out.println("Please delete " + i + " minus the number for the person you want to call ");
            System.out.println("--------------------------------------------\n");
            query3=input.nextInt();
            while (query3!=-1){
            Random random = new Random();
            int numberrrr;
            numberrrr=random.nextInt(29)+2;//+2 because of the contents
                System.out.println("--------------------------------------------");
                System.out.println(nameOfUsers.get(query3)+": user has read "+numberrrr +" contents since registering in our library");
                switch (query3) {
                    case 11 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(32));
                        System.out.println("The book, whose name is " + nameOfBooks.get(32) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 15 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(46));
                        System.out.println("The book, whose name is " + nameOfBooks.get(46) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 5 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(19));
                        System.out.println("The journal, whose name is " + nameOfJournals.get(19) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 10 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(16));
                        System.out.println("The book, whose name is " + nameOfBooks.get(16) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 68 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(14));
                        System.out.println("The journal, whose name is " + nameOfJournals.get(14) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 31 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println(nameOfBooks.get(26));
                        System.out.println("The book, whose name is " + nameOfBooks.get(26) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 18 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(13));
                        System.out.println("The book, whose name is " + nameOfBooks.get(13) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 24 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(6));
                        System.out.println("The journal, whose name is " + nameOfJournals.get(6) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 13 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(31));
                        System.out.println("The journal, whose name is " + nameOfJournals.get(31) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 22 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(36));
                        System.out.println("The book, whose name is " + nameOfBooks.get(36) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 4 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(17));
                        System.out.println("The journal, whose name is " + nameOfJournals.get(17) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 41 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(29));
                        System.out.println("The journal, whose name is " + nameOfJournals.get(29) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 59 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(21));
                        System.out.println("The book, whose name is " + nameOfBooks.get(21) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 38 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(10));
                        System.out.println("The book, whose name is " + nameOfBooks.get(10) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 9 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(3));
                        System.out.println("The journal, whose name is " + nameOfJournals.get(3) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 45 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(36));
                        System.out.println("The journal, whose name is " + nameOfJournals.get(36) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 87 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(8));
                        System.out.println("The book, whose name is " + nameOfBooks.get(8) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 50 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(3));
                        System.out.println("The book, whose name is " + nameOfBooks.get(3) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 16 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(22));
                        System.out.println("The book, whose name is " + nameOfBooks.get(22) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 80 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(39));
                        System.out.println("The book, whose name is " + nameOfBooks.get(39) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 20 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(11));
                        System.out.println("The book, whose name is " + nameOfBooks.get(11) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 27 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(6));
                        System.out.println("The book, whose name is " + nameOfBooks.get(6) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 49 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(44));
                        System.out.println("The book, whose name is " + nameOfBooks.get(44) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 67 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfBooks.get(50));
                        System.out.println("The book, whose name is " + nameOfBooks.get(50) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 30 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println(nameOfJournals.get(41));
                        System.out.println("The journal, whose name is " + nameOfJournals.get(41) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 21 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(11));
                        System.out.println("The journal, whose name is " + nameOfJournals.get(11) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    case 75 -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("Content borrowed from library:");
                        System.out.println("--------------------------------------------\n");
                        System.out.println("--------------------------------------------");
                        System.out.println(nameOfJournals.get(40));
                        System.out.println("The journal, whose name is " + nameOfJournals.get(40) + ",\ncurrently loaned to " + (nameOfUsers.get(query3)));
                        System.out.println("--------------------------------------------\n");
                    }
                    default -> {
                        System.out.println("--------------------------------------------");
                        System.out.println("The member is not using any content at the moment.");
                        System.out.println("--------------------------------------------\n");
                    }
                }
                System.out.println("--------------------------------------------\n");
                System.out.println("--------------------------------------------");
                System.out.println("If you want to get another student's information, enter that student's queue.");
                System.out.println("Type -1 to stop receiving information");
                System.out.println("--------------------------------------------\n");
                query3=input.nextInt();
            }
        }

    }
}
