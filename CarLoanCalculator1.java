import java.util.Scanner;
 
 public class CarLoanCalculator1 {
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   double carprice=0,downpayment=-1,loanperiod=0,interestrate=0,monthlyrepayment=0;
   
   while (carprice<30000){
   System.out.println("Enter car price (RM)");
   carprice=sc.nextDouble();
   } 
  
   while (downpayment<0){
   System.out.println("Enter down payment (RM)");
   downpayment=sc.nextDouble();
   } 
   
   while (loanperiod<5||loanperiod>9){
   System.out.println("Enter loan period (years)");
   loanperiod=sc.nextDouble();
   }

   while (interestrate<3||interestrate>7){
   System.out.println("Enter interest rate (%)");
   interestrate=sc.nextDouble();
   }
   
   monthlyrepayment=((carprice-downpayment)*interestrate/100/12)+(carprice-downpayment)/(loanperiod*12);
       System.out.printf("monthly repayment=RM %.2f", +monthlyrepayment);       
       System.out.printf("\n\n%-8s%15s%20s%20s\n", "YEARS", "PRINCIPAL", "INTEREST", "BALANCE");
       for(double n=1;n<=loanperiod;n++){
            System.out.printf("%-8.0f", n);
            System.out.printf("%15.2f",(monthlyrepayment*12*n));
            System.out.printf("%20.2f",(carprice-downpayment)*interestrate/100*n);
            System.out.printf("%20.2f\n",(monthlyrepayment*12)*(loanperiod-n));
            
       }
     }
   }