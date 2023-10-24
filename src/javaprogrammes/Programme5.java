package javaprogrammes;

import java.util.Scanner;

    /**
     * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
     * salary
     * HRA = basic salary 10%
     * DA = Basic salary 8%
     * TA = Basic salary 9%
     * PF= Basic salary 20%
     * Gross salary = basic salary + HRA + TA + DA –PF
     * Print in following format
     * _______________________________
     * | Salary Slip |
     * |______________________________|
     * | Employee Id : 2564 |
     * | Employee Name : Jay |
     * |______________________________|
     * | Basic Salary : 25000.0 |
     * | HRA 10% : 2500.0 |
     * | TA 8% : 2250.0 |
     * | DA 9% : 2000.0 |
     * | PF - 20& : 5000.0 |
     * |______________________________|
     * | Gross Salary : 26750.0 |
     * |===========================|
     */

    public class Programme5 {

        public static void main(String[] args) { // main method
            Scanner scanner = new Scanner(System.in); // create scanner to read a data
            System.out.println("Enter Employee ID: "); // printing a statement
            String EmployeeID = scanner.nextLine(); // going to next line after entering a data
            System.out.println("Enter Employee Name: ");
            String Name = scanner.nextLine();
            System.out.println("Enter Basic Salary: ");
            double BasicSalary = scanner.nextInt();

            // calculation
            double HRA = 10 * BasicSalary / 100;
            double DA = 8 * BasicSalary / 100;
            double TA = 9 * BasicSalary / 100;
            double PF = 20 * BasicSalary / 100;

            // calculate gross salary
            double grossSalary = BasicSalary + HRA + DA + TA - PF;
            scanner.close(); // scanner closure

            // Print salary slip with using concatenation
            System.out.println(" __________________________________");
            System.out.println("|            Salary Slip           |");
            System.out.println("|__________________________________|");
            System.out.println("| Employee Id    :    " + EmployeeID + "           |");
            System.out.println("| Employee Name  :    " + Name + "       |");
            System.out.println("|__________________________________|");
            System.out.println("| Basic Salary  :    " + BasicSalary + "        |");
            System.out.println("| HRA 10%       :    " + HRA + "         |");
            System.out.println("| TA 8%         :    " + TA + "         |");
            System.out.println("| DA 9%         :    " + DA + "         |");
            System.out.println("| PF 20%        :    " + PF + "         |");
            System.out.println("|__________________________________|");
            System.out.println("| Gross Salary  :    " + grossSalary + "        |");
            System.out.println("|==================================|");

        }
    }

