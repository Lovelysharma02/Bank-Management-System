import java.util.Scanner;

public class BankManagementSystem {
    static int main_exit;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String password = "Lovely";
        int i = 0;
        System.out.println("\n\n\t\tEnter the password to login:");
        String pass = scanner.nextLine();

        if (pass.equals(password)) {
            System.out.println("\n\nPassword Match!\nLOADING");
            for (i = 0; i <= 6; i++) {
                fordelay(100000000);
                System.out.print(".");
            }
            System.out.println();
            menu();
        } else {
            System.out.println("\n\nWrong password!!");
            loginTry();
        }
    }

    static void menu() {
        int choice;
        do {
            System.out.println("\n\n\t\t\tCUSTOMER ACCOUNT BANKING MANAGEMENT SYSTEM");
            System.out.println("\n\n\n\t\t\t WELCOME TO THE MAIN MENU ");
            System.out.println("\n\n\t\t1.Create new account\n\t\t2.Update information of existing account\n\t\t3.For transactions\n\t\t4.Check the details of existing account\n\t\t5.Removing existing account\n\t\t6.View customer's list\n\t\t7.Exit\n\n\n\n\n\t\t Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    newAcc();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    transact();
                    break;
                case 4:
                    see();
                    break;
                case 5:
                    erase();
                    break;
                case 6:
                    viewList();
                    break;
                case 7:
                    close();
                    break;
            }
        } while (choice != 7);
    }

    static void newAcc() {
        // Implement your new account creation logic here
    }

    static void viewList() {
        // Implement your view list logic here
    }

    static void edit() {
        // Implement your edit logic here
    }

    static void transact() {
        // Implement your transaction logic here
    }

    static void erase() {
        // Implement your erase logic here
    }

    static void see() {
        // Implement your see logic here
    }

    static void close() {
        System.out.println("\n\n\n\nThis C Mini Project is developed by Code With C team!");
    }

    static void loginTry() {
        System.out.println("\nEnter 1 to try again and 0 to exit:");
        main_exit = scanner.nextInt();
        if (main_exit == 1) {
            main(new String[]{});
        } else if (main_exit == 0) {
            close();
        } else {
            System.out.println("\nInvalid!");
            fordelay(1000000000);
            loginTry();
        }
    }

    static void fordelay(int j) {
        int k;
        for (int i = 0; i < j; i++)
            k = i;
    }
}