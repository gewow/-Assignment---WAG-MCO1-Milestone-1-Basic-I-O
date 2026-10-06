/*********************
Last names: Guanzon, Meija, Quebrado
Language: Java
Paradigm(s): Procedural
*********************/

import java.util.Scanner;

public class MCO1_BasicIO_WAG_Java {
    static final String ERROR_MSG = "\nERROR: Please choose a valid input.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainMenu(sc);
        registerAccount(sc);
        depositAmount(sc);
        withdrawAmount(sc);
        recordExchangeRate(sc);
        exchangeRate(sc);
        sc.close();
    }

    static void mainMenu(Scanner sc) {
        int choice = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println("""
                    Select Transaction:
                    [1] Register Account Name
                    [2] Deposit Amount
                    [3] Withdraw Amount
                    [4] Currency Exchange
                    [5] Record Exchange Rates
                    [6] Show Interest Amount
                    """);
            System.out.print("Choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
                if (choice >= 1 && choice <= 6) {
                    valid = true;
                } else {
                    System.out.println(ERROR_MSG);
                }
            } catch (NumberFormatException e) {
                System.out.println(ERROR_MSG);
            }
        }
        System.out.println("\n***");
        System.out.println("Choice = " + choice);
    }

    static void registerAccount(Scanner sc) {
        System.out.println("\nRegister Account Name");
        String userAccountName = readAccountName(sc);

        System.out.println("""
                \n***
                Account Name = %s
                """.formatted(userAccountName));
    }

    static void depositAmount(Scanner sc) {
        double amount = 0.00;
        boolean valid = false;

        System.out.println("Deposit Amount");
        String userAccountName = readAccountName(sc);
        System.out.println("Current Balance: %.2f".formatted(1000.00));
        System.out.println("Currency: %s".formatted("PHP"));

        while (!valid) {
            System.out.print("\nDeposit Amount: ");
            try {
                amount = Double.parseDouble(sc.nextLine().trim());
                if (amount >= 0) {
                    valid = true;
                } else {
                    System.out.println(ERROR_MSG);
                }
            } catch (NumberFormatException e) {
                System.out.println(ERROR_MSG);
            }
        }

        System.out.println("\n***");
        System.out.println("Account Name = %s".formatted(userAccountName));
        System.out.println("Deposit Amount = %.2f".formatted(amount));
    }

    static void withdrawAmount(Scanner sc) {
        double amount = 0.00;
        boolean valid = false;

        System.out.println("\nWithdraw Amount");
        String userAccountName = readAccountName(sc);
        System.out.println("Current Balance: %.2f".formatted(1000.00));
        System.out.println("Currency: %s".formatted("PHP"));

        while (!valid) {
            System.out.print("\nWithdraw Amount: ");
            try {
                amount = Double.parseDouble(sc.nextLine().trim());
                if (amount >= 0) {
                    valid = true;
                } else {
                    System.out.println(ERROR_MSG);
                }
            } catch (NumberFormatException e) {
                System.out.println(ERROR_MSG);
            }
        }

        System.out.println("\n***");
        System.out.println("Account Name = %s".formatted(userAccountName));
        System.out.println("Withdraw Amount = %.2f".formatted(amount));
    }

    static void recordExchangeRate(Scanner sc) {
        int choice = 0;
        double rate = 0.00;
        boolean validChoice = false;
        boolean validRate = false;

        System.out.println();
        System.out.print("""
                Record Exchange Rate

                [1] Philippine Peso (PHP)
                [2] United States Dollar (USD)
                [3] Japanese Yen (JPY)
                [4] British Pound Sterling (GBP)
                [5] Euro (EUR)
                [6] Chinese Yuan Renminni (CNY)

                """);

        while (!validChoice) {
            System.out.print("Select Foreign Currency: ");
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
                if (choice >= 1 && choice <= 6) {
                    validChoice = true;
                } else {
                    System.out.println(ERROR_MSG);
                }
            } catch (NumberFormatException e) {
                System.out.println(ERROR_MSG);
            }
        }

        while (!validRate) {
            System.out.print("Exchange Rate: ");
            try {
                rate = Double.parseDouble(sc.nextLine().trim());
                if (rate >= 0) {
                    validRate = true;
                } else {
                    System.out.println(ERROR_MSG);
                }
            } catch (NumberFormatException e) {
                System.out.println(ERROR_MSG);
            }
        }

        System.out.println("\n***");
        System.out.println("Select Foreign Currency = [%d]".formatted(choice));
        System.out.println("Exchange Rate = %.2f".formatted(rate));
    }

    static void exchangeRate(Scanner sc) {
        double amount = 0.00;
        boolean valid = false;

        System.out.println();
        System.out.println("Foreign Currency Exchange");

        while (!valid) {
            System.out.print("Source Amount (PHP): ");
            try {
                amount = Double.parseDouble(sc.nextLine().trim());
                if (amount >= 0) {
                    valid = true;
                } else {
                    System.out.println(ERROR_MSG);
                }
            } catch (NumberFormatException e) {
                System.out.println(ERROR_MSG);
            }
        }

        System.out.println();
        System.out.print("""
                Exchanged Currency
                [1] Philippine Peso (PHP) = %.2f
                [2] United States Dollar (USD) = %.2f
                [3] Japanese Yen (JPY) = %.2f
                [4] British Pound Sterling (GBP) = %.2f
                [5] Euro (EUR) = %.2f
                [6] Chinese Yuan Renminni (CNY) = %.2f
                """.formatted(converted(amount, "PHP"),
                              converted(amount, "USD"),
                              converted(amount, "JPY"),
                              converted(amount, "GBP"),
                              converted(amount, "EUR"),
                              converted(amount, "CNY")));

        System.out.println("\n***");
        System.out.println("Source Currency = Philippine Peso (PHP)");
        System.out.println("Source Amount (PHP) = %.2f".formatted(amount));
    }

    static double converted(double amount, String currency) {
        double result = 0.00;
        if ("USD".equals(currency)) {
            result = amount * 62.00;
        } else if ("JPY".equals(currency)) {
            result = amount * 0.40;
        } else if ("GBP".equals(currency)) {
            result = amount * 84.00;
        } else if ("EUR".equals(currency)) {
            result = amount * 72.00;
        } else if ("CNY".equals(currency)) {
            result = amount * 9.00;
        } else {
            result = amount;
        }
        return result;
    }

    static String readAccountName(Scanner sc) {
        String name = "";
        boolean valid = false;

        while (!valid) {
            System.out.print("Account Name: ");
            name = sc.nextLine().trim();
            if (name.contains(",")) {
                valid = true;
            } else {
                System.out.println(ERROR_MSG);
            }
        }
        return name;
    }
}