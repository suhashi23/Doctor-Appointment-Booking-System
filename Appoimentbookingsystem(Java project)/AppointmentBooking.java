import sun.security.util.Password;

import java.util.*;
import java.io.*;
class AppointmentBooking
{
    ArrayList<String> DoctorName = new ArrayList<String>();
    ArrayList<String> DoctorQualification = new ArrayList<String>();
    ArrayList<String> DoctorGender = new ArrayList<String>();
    ArrayList<String> DoctorPassword = new ArrayList<String>();
    ArrayList<Integer> DoctorAge = new ArrayList<Integer>();
    ArrayList<Long> DoctorMobileNumber = new ArrayList<Long>();
    ArrayList<String> DoctorCity = new ArrayList<String>();

    ArrayList<String> PatientName = new ArrayList<String>();
    ArrayList<String> PatientGender = new ArrayList<String>();
    ArrayList<String> PatientPassword = new ArrayList<String>();
    ArrayList<String> PatientConfirmPassword = new ArrayList<String>();
    ArrayList<Integer> PatientAge = new ArrayList<Integer>();
    ArrayList<String> PatientCity = new ArrayList<String>();
    ArrayList<Long> PatientMobileNumber = new ArrayList<Long>();

    ArrayList<Integer> PatientAgeBooking = new ArrayList<Integer>();
    ArrayList<String> PatientNameBooking = new ArrayList<String>();
    ArrayList<String> PatientGenderBooking = new ArrayList<String>();
    ArrayList<Byte> DoctorID = new ArrayList<Byte>();

    void dataAdd() // default doctor list
    {
        DoctorName.add("Surya Kumar");
        DoctorName.add("Anuj Dokania");
        DoctorName.add("Avasthi Kumar");
        DoctorName.add("Shyam Kedia");
        DoctorName.add("Dilip Bhagat");
        DoctorName.add("Sanjay Shukla");
        DoctorName.add("Niranjan Shukla");

        DoctorQualification.add("MBBS");
        DoctorQualification.add("ER, MBBS");
        DoctorQualification.add("MBBS,MD");
        DoctorQualification.add("MBBS,MD");
        DoctorQualification.add("BAMS");
        DoctorQualification.add("MBBS,MD,Surgeon");
        DoctorQualification.add("BAMS");

        DoctorGender.add("M");
        DoctorGender.add("M");
        DoctorGender.add("M");
        DoctorGender.add("M");
        DoctorGender.add("M");
        DoctorGender.add("M");
        DoctorGender.add("M");

        DoctorPassword.add("Surya123");
        DoctorPassword.add("Anuj123");
        DoctorPassword.add("Avasthi123");
        DoctorPassword.add("Shyam123");
        DoctorPassword.add("Dilip123");
        DoctorPassword.add("Sanjay123");
        DoctorPassword.add("Niranjan123");

        DoctorAge.add(30);
        DoctorAge.add(28);
        DoctorAge.add(29);
        DoctorAge.add(27);
        DoctorAge.add(26);
        DoctorAge.add(31);
        DoctorAge.add(29);

        DoctorMobileNumber.add(8666474442l);
        DoctorMobileNumber.add(6736474442l);
        DoctorMobileNumber.add(8777474442l);
        DoctorMobileNumber.add(9738474442l);
        DoctorMobileNumber.add(7736474442l);
        DoctorMobileNumber.add(9736474442l);
        DoctorMobileNumber.add(8736474242l);

        DoctorCity.add("Kolkata");
        DoctorCity.add("Deoghar");
        DoctorCity.add("Durgapur");
        DoctorCity.add("Rampurhat");
        DoctorCity.add("Hydrabaad");
        DoctorCity.add("Delhi");
        DoctorCity.add("Mumbai");
    }

    void admin() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        byte choice;
        boolean flag = true;

        while(flag)
        {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();  // used to clear the screen
            System.out.println("\t\t  ____________________");
            System.out.println("\t\t |    WELCOME ADMIN   |");
            System.out.println("\t\t  ____________________");
            System.out.println("\n\n1. Doctor list \t2. Registered Patients \t3. Patient with Appointment \n4. Main Menu \n\nExit");
            choice = sc.nextByte();
            switch(choice)
            {
                case 1:
                    for(int i=0; i<=DoctorName.size()-1; i++)
                    {
                        System.out.println("Name: \t " + DoctorName.get(i));
                    }
                    byte MenuChoice;
                    System.out.println("\n\n1. Main Menu\t 2. Previous Menu");
                    MenuChoice = sc.nextByte();
                    if(MenuChoice == 1){
                        flag = false;
                    }
                    else{
                        break;
                    }
                    break;
                case 2:
                    if(PatientName.isEmpty()){
                        System.out.println("No Registered Patients yet.");
                        Thread.sleep(3000);
                        break;
                    }
                    else{
                        for(int i=0; i<=PatientName.size()-1; i++)
                        {
                            System.out.println("Name: \t " + PatientName.get(i));
                        }
                        System.out.println("\n\n1. Main Menu\t 2. Previous Menu");
                        MenuChoice = sc.nextByte();
                        if(MenuChoice == 1){
                            flag = false;
                        }
                        else{
                            break;
                        }
                    }
                    break;
                case 3:
                    if(PatientNameBooking.isEmpty()){
                        System.out.println("\nNo Appointments yet.");
                        Thread.sleep(3000);
                        break;
                    }
                    else{
                        for(int i=0; i<=PatientNameBooking.size()-1; i++)
                        {
                            System.out.println(i+". " + PatientName.get(i));
                        }
                        System.out.println("\n\n1. Main Menu\t 2. Previous Menu");
                        MenuChoice = sc.nextByte();
                        if(MenuChoice == 1){
                            flag = false;
                        }
                        else{
                            break;
                        }
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong Choice");
                    Thread.sleep(1000);
                    flag = true;
            }
        }
    }

    void Patient() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  // used to clear the screen
            System.out.println("\t\t  ____________________");
            System.out.println("\t\t |    WELCOME PATIENT PAGE   |");
            System.out.println("\t\t  ____________________");
            System.out.println("1. Login \t2. Registration\n");
            int choice = sc.nextByte();
            switch (choice) {
                case 1:
                    if (PatientMobileNumber.isEmpty()) {
                        System.out.println("First register yourself then login...");
                        Thread.sleep(500);
                        break;
                    }
                    else {
                        PatientLogin();
                        flag = false;
                    }
                case 2:
                    PatientRegistration();
                    flag = false;
                    break;

                default:
                    System.out.println("Wrong Choice. Enter your choice again!");
                    flag = true;
                    Thread.sleep(1000);
                    break;
            }
        }
    }

    void Doctor() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean flag = true;
        while (flag) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  // used to clear the screen
            System.out.println("\t\t  ____________________");
            System.out.println("\t\t |    WELCOME DOCTOR PAGE   |");
            System.out.println("\t\t  ____________________");
            System.out.println("1. Login \t2. Registration\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (DoctorMobileNumber.isEmpty()) {
                        System.out.println("Register first!");
                        flag = false;
                        Thread.sleep(500);
                        break;
                    }
                    else {
                        DoctorLogin();
                        flag = false;
                    }
                    break;
                case 2:
                    DoctorRegistration();
                    flag = false;
                    break;

                default:
                    System.out.println("Wrong Choice.");
                    flag = true;
            }
        }
    }
    void PatientLogin() throws  Exception
    {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        long mobileNumber;
        byte choice;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  // used to clear the screen
        System.out.println("\t\t  ____________________");
        System.out.println("\t\t |    LOGIN          |");
        System.out.println("\t\t  ___________________");
        System.out.println("Enter your Username(mobilenumber)");
        mobileNumber = sc.nextLong();
        System.out.println("Enter your Password");
        String password = sc.next();
        boolean flag1 = false;
        int j;
        for(j=0; j<=PatientMobileNumber.size()-1; j++)
        {
            if((PatientMobileNumber.get(j)).equals(mobileNumber) && (PatientPassword.get(j)).equals(password))
            {
                flag1 = true;
                break;
            }
        }
        if(flag1 == true)
        {
            Thread.sleep(1000);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  // used to clear the screen
            System.out.println("\t\t  ____________________");
            System.out.println("\t\t |    Book Appointment |");
            System.out.println("\t\t  _____________________");
            System.out.println("\n Welcome "+ PatientName.get(j) +", to book appointment, choose your doctor..");
            for(int i=0; i<=DoctorName.size()-1; i++)
            {
                System.out.println((i+1)+". "+DoctorName.get(i));
            }
            choice = sc.nextByte();
            DoctorID.add(choice);
            while(flag)
            {
                Thread.sleep(1000);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  // used to clear the screen
                System.out.println("\t\t  ____________________");
                System.out.println("\t\t |    Book Appointment |");
                System.out.println("\t\t  _____________________");
                if(choice<=DoctorName.size() && choice>0)
                {
                    System.out.println("\n\nName: \t"+ DoctorName.get(choice-1)+ "\nAge: \t" + DoctorAge.get(choice-1)+ "");
                    System.out.println("\n Enter your name: \t");
                    sc.nextLine();
                    PatientNameBooking.add(sc.nextLine());
                    System.out.println("Enter your Age");
                    PatientNameBooking.add(sc.next());
                    System.out.println("Enter your Gender");
                    PatientNameBooking.add(sc.next());
                    System.out.println("Booking Successful");
                    Thread.sleep(1000);
                    flag = false;
                    break;
                }
                else{
                    System.out.println("\n enter correct input!");
                    flag = true;
                    Thread.sleep(1000);
                }
            }
        }
        else{
            System.out.println("Login unsuccessfull");
            Thread.sleep(900);
            flag = false;
        }
    }
    void PatientRegistration() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int  i = 0;
        long mobieNumber;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  // used to clear the screen
        System.out.println("\n");
        System.out.println("\t\t |  Welcome to Patient Registration Page! |");
        System.out.println("\n");
        System.out.println("Please enter your name");
        PatientName.add(sc.nextLine());
        System.out.println("Enter your age: ");
        PatientAge.add(sc.nextInt());
        System.out.println("Please enter your Mobile number");
        mobieNumber = sc.nextLong();
        long mno;
        boolean flag = true, flag1 = true;
        if(PatientMobileNumber.isEmpty())
        {
            PatientMobileNumber.add((mobieNumber));
            System.out.println("Enter password");
            PatientPassword.add(sc.next());
            System.out.println("Registration is Successfull");
            Thread.sleep(1000);
            flag1 = false;
        }
        else
        {
            for(i=0; i<=PatientMobileNumber.size()-1; i++) {
                mno = PatientMobileNumber.get(i);
                if (mno == mobieNumber) {
                    flag1 = false;
                    break;
                }
            }
            if(flag1==true)
            {
                PatientMobileNumber.add(mobieNumber);
                System.out.println("Enter age: ");
                PatientAge.add(sc.nextInt());
                System.out.println("Enter City: ");
                PatientCity.add(sc.next());
                System.out.println("Registration is Successful");
                System.out.println("Details: Name: " + PatientName + "number:" + PatientMobileNumber);
                Thread.sleep(900);
            }
            else
            {
                System.out.println("Same mobile number is not allowed\n");
                Thread.sleep(500);
            }
        }
    }
    void DoctorRegistration() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int  i = 0;
        long mobieNumber;
        boolean flag = true, flag1 = true;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  // used to clear the screen
        System.out.println("\t\t_______________________________________");
        System.out.println("\t\t |  This is doctor registration Page! |");
        System.out.println("\t\t_______________________________________");
        System.out.println("\n");
        System.out.println("Please enter your name");
        DoctorName.add(sc.nextLine());
        System.out.println("Please enter your Mobile number");
        mobieNumber = sc.nextLong();
        long mno;
        if(DoctorMobileNumber.isEmpty())
        {
            DoctorMobileNumber.add((mobieNumber));
            System.out.println("Enter password");
            DoctorPassword.add(sc.next());
            System.out.println("Registration is Successfull");
            Thread.sleep(900);
            flag1 = false;
        }
        else
        {
            for(i=0; i <= DoctorMobileNumber.size()-1; i++)
            {
                mno = DoctorMobileNumber.get(i);
                if(mno == mobieNumber)
                {
                    flag1 = false;
                    break;
                }
            }
            if(flag1==true)
            {
                DoctorMobileNumber.add(mobieNumber);
                System.out.println("Enter age: ");
                DoctorAge.add(sc.nextInt());
                System.out.println("Enter City: ");
                DoctorCity.add(sc.next());
                System.out.println("Registration is Successful");
                System.out.println("Details: Name: " + DoctorName + "number:" + DoctorMobileNumber);
                Thread.sleep(900);
            }
            else
            {
                System.out.println("Same mobile number is not allowed");
                int index = DoctorName.size();
                DoctorName.remove(index);
                Thread.sleep(500);
            }
        }
    }
    void DoctorLogin() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        long mobileNumber;
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  // used to clear the screen
        System.out.println("\t\t  _______________________________");
        System.out.println("\t\t |    DOCTOR LOGIN PAGE          |");
        System.out.println("\t\t  _______________________________");
        System.out.println("Enter your Username(mobilenumber)");
        mobileNumber = sc.nextLong();
        System.out.println("Enter your Password");
        String password = sc.next();
        boolean flag11 = true;
        boolean flag = false;
        byte choice;
        int i = 0;
        for(i=0; i<=DoctorMobileNumber.size()-1; i++)
        {
            if((DoctorMobileNumber.get(i)).equals(mobileNumber) && (DoctorPassword.get(i)).equals(password))
            {
                flag = true;
                break;
            }
        }
        if(flag == true)
        {
            while (flag11){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  // used to clear the screen
                System.out.println("\t\t  ________________________________________");
                System.out.println("\t\t| Welcome Doctor "+ DoctorName.get(i) +" |");
                System.out.println("\t\t  ________________________________________");
                System.out.println("\n\n1. Appointments. \n2. Logout");
                choice = sc.nextByte();
                byte j = 0;
                switch(choice)
                {
                    case 1:
                        if((DoctorID.isEmpty() != true)){
                            while(j<=DoctorID.size()-1){
                                if((i-1) == DoctorID.get(j)){
                                    System.out.println("Patient name: "+ PatientNameBooking.get(j));
                                    j++;
                                }
                            }
                            Thread.sleep(4000);
                        }
                        else{
                            System.out.println("No Appointments!");
                            Thread.sleep(3000);
                            flag11 = true;
                        }
                        break;
                    case 2:
                        flag11 = false;
                        break;
                }
            }
        }
    }
}
class Java
{
    public static void main(String[] args) throws Exception{
        AppointmentBooking ap = new AppointmentBooking();
        Scanner sc = new Scanner(System.in);
        ap.dataAdd();
        boolean flag = true;
        while(flag = true){
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            System.out.println("__________________________________________________");
            System.out.println("\t\t |    WELCOME TO DOCTOR APPOINTMENT BOOKING   |");
            System.out.println("__________________________________________________");
            System.out.println("\n1. Doctor \t 2. Patient \t 3. Admin \t 4. Exit");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    ap.Doctor();
                    flag = true;
                    break;
                case 2:
                    ap.Patient();
                    flag = true;
                    break;
                case 3:
                    ap.admin();
                    flag = true;
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}



