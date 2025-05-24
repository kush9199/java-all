import java.util.Scanner;

import shared.Pair;

public class App {
    public static Scanner in = new Scanner(System.in);
    private static Pair limit = new Pair(1, 3);

    public static void main(String[] args) throws Exception {
        
        boolean isValid = false;

        while (isValid == false) {
            // home screen banana
            System.out.println("FedralWich Bank");
            System.out.println("ORLANDO");
            System.out.println("choose your options");
            System.out.println("[1.] Open New Account");
            System.out.println("[2.] Deposite Money from Account");
            System.out.println("[3.] Withdraw Money from Account");
            System.out.print("Enter your choice : ");

            // input lena h choice ka or wo choice 1,2,3 m se hi honi chaiye
            // vrna screen dikhe
            try {
                int choice = in.nextInt();
                if (choice >= limit.getFirst() && choice <= limit.getSecond()) {
                    isValid = true;
                }
            } catch (Exception ex) {
                System.out.println("enter integer value");
                in.nextLine();
            }
            
            if(isValid == false){
                System.out.println("enter valid value: from 1 to 3");
            }
        }

    }
}
