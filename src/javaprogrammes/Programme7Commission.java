package javaprogrammes;
/**
 * 7. Write a java program input sales id, seller's name, sales amount,
 * and salary basic and then fined this sales
 * Commission:
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */


import java.util.Scanner;

public class Programme7Commission {
    public static void main(String[] args) {
        commission();
    }

        public static void commission () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Sales ID: ");
            int salesId = scanner.nextInt();
            System.out.print("Enter Seller's Name: ");
            scanner.nextLine();  // Consume the newline character
            String sellerName = scanner.nextLine();
            System.out.print("Enter Sales Amount: ");
            double salesAmount = scanner.nextDouble();
            System.out.print("Enter Salary Basic: ");
            double basicSalary = scanner.nextDouble();
            // Calculate sales commission
            double commission = 0.0;
            if (salesAmount >= 50000) {
                commission = 0.35 * salesAmount;
            } else if (salesAmount >= 30000) {
                commission = 0.20 * salesAmount;
            } else if (salesAmount >= 20000) {
                commission = 0.10 * salesAmount;
            } else if (salesAmount >= 10000) {
                commission = 0.05 * salesAmount;
            } else {
                commission = 0.02 * salesAmount;
            }
            // Calculate total earnings
            double totalEarnings = basicSalary + commission;
            // Display the results
            System.out.println("\nSales ID: " + salesId);
            System.out.println("Seller's Name: " + sellerName);
            System.out.println("Sales Amount: £" + salesAmount);
            System.out.println("Salary Basic: £" + basicSalary);
            System.out.println("Sales Commission: £" + commission);
            System.out.println("Gross Earnings: £" + totalEarnings);

            // Close the scanner to release resources
            scanner.close();
        }
    }

