import java.util.Scanner;
public class incometaxcalc {
    public static void main(String[] args) {
        System.out.println("***** This program can calculate the income tax according to 2024 budget. *****");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Your income: ");
            double income =input.nextDouble();
            

            if (income < 300000) {
                System.out.println("You\'re exempted from paying tax");            
            }

            if ( 300000 <= income && income < 600000) {
                double taxedIncome = (income - 300000);
                double tax = 0.05*taxedIncome;
                System.out.println("You Need to Pay " + tax + " rupees as Tax");
                
            }

            if ( 600000 <= income && income < 900000) {
                double tax1 = (income - 600000)*0.1;
                double tax2 = (300000)*0.05;
                double totaltax = tax1 + tax2;
                System.out.println("You Need to Pay " + totaltax + " rupees as Tax");
                
            }

            if ( 900000 <= income && income < 1200000) {
                double tax1 = (income - 900000)*0.15;
                double tax2 = (300000)*0.05;
                double tax3 = (300000)*0.1;
                double totaltax = tax1 + tax2 + tax3;
                System.out.println("You Need to Pay " + totaltax + " rupees as Tax");
                
            }
            if ( 1200000 <= income && income < 1500000) {
                double tax1 = (income - 1200000)*0.2;
                double tax2 = (300000)*0.05;
                double tax3 = (300000)*0.1;
                double tax4 = (300000)*0.15;
                double totaltax = tax1 + tax2 + tax3 + tax4;
                System.out.println("You Need to Pay " + totaltax + " rupees as Tax");
                
            }

            if ( 1500000 <= income) {
                double tax1 = (income - 1500000)*0.3;
                double tax2 = (300000)*0.05;
                double tax3 = (300000)*0.1;
                double tax4 = (300000)*0.15;
                double tax5 = (300000)*0.2;
                double totaltax = tax1 + tax2 + tax3 + tax4 + tax5;
                System.out.println("You Need to Pay " + totaltax + " rupees as Tax");
                
            }
        }

    }
    
}
