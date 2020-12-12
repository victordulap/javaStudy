package com.step.data.menu;

import com.step.data.employee.EmployeeManager;
import com.step.data.employee.EmployeeShowInConsoleManager;

import java.util.Scanner;

public class Menu{
    private static Scanner sc = new Scanner(System.in);
    private static EmployeeShowInConsoleManager em = new EmployeeShowInConsoleManager();

    public static void showMenu() {
        int nav = -1;

        System.out.println("LOADING DATA...");
//        EmployeeDataManager.importCSV();
        EmployeeManager.importSerialized();
        System.out.println("DONE!");

        Utilities.clearScreen();

        do {
            System.out.println("EMPLOYEE MANAGEMENT");
            System.out.println();
            System.out.println("\t1. view");
            System.out.println("\t2. insert");
            System.out.println("\t3. update");
            System.out.println("\t4. delete");
            System.out.println("\t5. file");
            System.out.println();
            System.out.println("\t0. exit");

            System.out.print("\nenter submenu number: ");
            try {
                nav = sc.nextInt();
            } catch (Exception e) {
                System.out.println("\nInvalid format, try again (ex: 1)");
                Utilities.enterAnyValueToContinue();
            }
            finally {
                sc.nextLine();
            }

            switch (nav) {
                case 1:
                    EmployeeShowInConsoleManager.view();
                    break;
                case 2:
                    em.insert();
                    break;
                case 3:
                    em.update();
                    break;
                case 4:
                    em.delete();
                    break;
                case 5:
                    fileMenu();
                    break;
                case 0:
                    Utilities.clearScreen();

                    System.out.print("Type yes or 1 to save data: ");
                    String str = sc.nextLine();
                    boolean toSaveInCSV = str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1");

                    if(toSaveInCSV) {
                        System.out.println("SAVING DATA");
                        EmployeeManager.exportCSV();
                    }
                    EmployeeManager.exportSerialized();

                    System.out.println("Application exited");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nNo such submenu, try again (ex: 1)");
                    Utilities.enterAnyValueToContinue();
                    break;
            }

            Utilities.clearScreen();
        } while (nav != 0);
    }

    private static void fileMenu() {
        int nav = -1;

        do {
            Utilities.clearScreen();
            System.out.println("FILE IMPORT/EXPORT");
            System.out.println();
            System.out.println("\t1. import employees");
            System.out.println("\t2. export employees");
            System.out.println();
            System.out.println("\t0. exit");

            System.out.print("\nenter submenu number: ");
            try {
                nav = sc.nextInt();
            } catch (Exception e) {
                System.out.println("\nInvalid format, try again (ex: 1)");
                Utilities.enterAnyValueToContinue();
            }
            finally {
                sc.nextLine();
            }

            switch (nav) {
                case 1:
                    EmployeeManager.importCSV();
                    break;
                case 2:
                    EmployeeManager.exportCSV();
                    break;
                case 0:
                    break;


                default:
                    System.out.println("\nNo such submenu, try again (ex: 1)");
                    Utilities.enterAnyValueToContinue();
                    break;
            }

            Utilities.clearScreen();
        } while (nav != 0);
    }
}
