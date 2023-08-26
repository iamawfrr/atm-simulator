package bit.ayaulym;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Account number: ");
        String account = scanner.next();
        System.out.println("Pin: ");
        String pin = scanner.next();
        BankAccount ba = null;
        for (BankAccount a : Database.allAccounts) {
            if (
                    a.getAccountNumber().equalsIgnoreCase(account) &&
                            a.getPinCode().equalsIgnoreCase(pin)) {
                ba = a;
            }
        }
        if (ba instanceof CityBankAccount) {
            while (true) {
                System.out.println("""

                                       PRESS [1] TO CASH WITHDRAWAL

                                       PRESS [2] TO VIEW BALANCE

                                       PRESS [3] TO CHANGE PIN CODE

                                       PRESS [4] TO CASH IN ACCOUNT

                                       PRESS [5] TO VIEW ACCOUNT DATA

                                       PRESS [6] TO EXIT
                        """);
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("What amount?: ");
                    int s = scanner.nextInt();
                    if (s < ba.totalBalance()) {
                        ba.creditBalance(s);
                    } else System.out.println("Not enough cash");
                } else if (choice == 2) {
                    System.out.println(ba.totalBalance());
                } else if (choice == 3) {
                    System.out.println("enter your new pin: ");
                    String newpin = scanner.next();
                    ba.setPinCode(newpin);
                } else if (choice == 4) {
                    System.out.println("What amount?: ");
                    choice = scanner.nextInt();
                    ba.debitBalance(choice);
                } else if (choice == 5) {
                    System.out.println(ba.accountData());
                } else if (choice == 6) {
                    System.exit(0);
                }
            }
        } else {
            while (true) {
                System.out.println("""

                                       PRESS [1] TO CASH WITHDRAWAL

                                       PRESS [2] TO VIEW BALANCE

                                       PRESS [3] TO EXIT\
                        """);
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("What amount?: ");
                    int n = scanner.nextInt();
                    assert ba != null;
                    ba.creditBalance(n);
                } else if (choice == 2) {
                    assert ba != null;
                    System.out.println("\n" + ba.totalBalance());
                } else if (choice == 3) {
                    System.exit(0);
                }
            }
        }
    }
}
