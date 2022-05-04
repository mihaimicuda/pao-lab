package facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
    private static int  choice;
    public static void main(String args[]) throws NumberFormatException, IOException{
        do{
            System.out.print("========= Car Shop ============ \n");
            System.out.print("            1. Ford Mustang              \n");
            System.out.print("            2. Porsche 718 Cayman              \n");
            System.out.print("            3. Toyota Supra             \n");
            System.out.print("            4. Chevy Camaro              \n");
            System.out.print("            5. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            ShopKeeper sk = new ShopKeeper();

            switch (choice) {
                case 1:
                {
                    sk.FordSale();
                }
                break;
                case 2:
                {
                    sk.PorscheSale();
                }
                break;
                case 3:
                {
                    sk.ToyotaSale();
                }
                break;
                case 4:
                {
                    sk.ChevySale();
                }
                break;
                default:
                {
                    System.out.println("You have selected button EXIT!");
                }
                return;
            }

        }
        while(choice!=5);
    }
}