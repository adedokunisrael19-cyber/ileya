import java.util.Scanner;

public class CheckoutApp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String[] productName = new String[100];
        int[] quantities = new int[100];
        double[] unitPrices = new double[100];
        double[] itemTotals = new double[100];       
    
        int count =0;

        System.out.print("What is your name");
        String customerName = input.nextLine();


    while(true){
         System.out.print("What is product name");
         productName[count] = input.nextLine();
    
         System.out.print("What is product name");
         unitPrices[count] = input.nextInt();
        
         System.out.print("What is product name");
         quantities[count] = input.nextInt();

         System.out.print("What is product name");
         itemTotals[count] = input.nextDouble();

        input.nextLine();
    
        count++;
        
        System.out.print("add more items? for yes press 1, for no press 2: ");
        int response = input.nextInt();
    
        if(response == 0){
            break;            
            }
          
         }
                   
        System.out.println();
        System.out.println("==============================================");
        System.out.println("                SEMICOLON STORE               ");
        System.out.println("==============================================");
        System.out.println("Customer Name: " + customerName);
        System.out.println();
        
           System.out.printf("%-15s%-10s%-12s%-12s%n",
                "ITEM", "QTY", "PRICE", "TOTAL");

        System.out.println("------------------------------------------------");

        double subTotal = 0;

        
        for (int i = 0; i < count; i++) {

            System.out.printf("%-15s%-10d%-12.2f%-12.2f%n",
                    productNames[i],
                    quantities[i],
                    unitPrices[i],
                    itemTotals[i]);

            subTotal += itemTotals[i];
        }
         System.out.println("------------------------------------------------");

        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * subTotal;

        double vat = 0.075 * subTotal;

        double billTotal = subTotal - discount + vat;

        System.out.printf("Sub Total: %.2f%n", subTotal);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("VAT (7.5%%): %.2f%n", vat);
        System.out.println("================================================");
        System.out.printf("Bill Total: %.2f%n", billTotal);
        System.out.println("================================================");

       
    }
}


