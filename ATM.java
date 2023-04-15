import java.util.Scanner;
import java.util.Arrays;

public class ATM {
    public static void main(String[] args) {
        String[] users = {"user1", "user2", "user3"};
        String[] pins = {"1111", "2222", "3333"};
        int[] amounts = {1000, 2000, 3000};
        int count = 0;
        String user;
        int n = 0;

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nENTER USER NAME:");
            user = input.nextLine().toLowerCase();
            if (Arrays.asList(users).contains(user)) {
                if (user.equals(users[0])) {
                    n = 0;
                } else if (user.equals(users[1])) {
                    n = 1;
                } else {
                    n = 2;
                }
                break;
            } else {
                System.out.println("------------------");
                System.out.println("************");
                System.out.println("INVALID USERNAME");
                System.out.println("************");
                System.out.println("-------------------");
            }
        }

        while (count < 3) {
    		System.out.println("------------------");
    		System.out.println("************");
    		String pin = new String(System.console().readPassword("PLEASE ENTER PIN: "));

    		System.out.println("************");
    		System.out.println("------------------");
   	 	     if (pin.length() > 0 && pin.equals("0")) {
                 if (user == "user1") {
                   if (pin == pins[0]) {
                      break;
            			} else {
                			count += 1;
                			System.out.println("------------------");
               				System.out.println("************");
                			System.out.println("INVALID PIN");
                			System.out.println("************");
                			System.out.println("------------------");
                			System.out.println();
            				}
        			}	
   	 	     
         if (user.equals("user2")) {
            if (pin.equals(pins[1])) {
                break;
            } else {
                count += 1;
                System.out.println("------------------");
                System.out.println("************");
                System.out.println("INVALID PIN");
                System.out.println("************");
                System.out.println("------------------");
                System.out.println();
            }
        }
        if (user.equals("user3")) {
            if (pin.equals(pins[2])) {
                break;
            } else {
                count += 1;
                System.out.println("------------------");
                System.out.println("************");
                System.out.println("INVALID PIN");
                System.out.println("************");
                System.out.println("------------------");
                System.out.println();
            }
        } else {
            System.out.println("------------------");
            System.out.println("************");
            System.out.println("PIN CONSISTS OF 4 DIGITS");
            System.out.println("************");
            System.out.println("------------------");
        }
    }


	if (count == 3) {
    	System.out.println("------------------");
    	System.out.println("************");
    	System.out.println("3 UNSUCCESFUL PIN ATTEMPTS, EXITING");
    	System.out.println("!!!YOUR CARD AS BEEN LOCKED!!!");
    	System.out.println("------------------");
    	System.out.println("************");
    	System.exit(0);
	}

	System.out.println("------------------");
	System.out.println("************");
	System.out.println("LOGIN SUCCESSFUL, CONTINUE");
	System.out.println("------------------");
	System.out.println();
	System.out.println("------------------");
	System.out.println("************");           
	System.out.println(users[n].substring(0,1).toUpperCase() + users[n].substring(1) + " welcome to ATM");

	System.out.println("------ATM SYSTEM-------");

while (true) {
    //os.system('clear')
   System.out.println("------------------");
    System.out.println("************");
    Scanner scanner = new Scanner(System.in);
    System.out.println("SELECT FROM FOLLOWING OPTIONS: \nStatement_(S) \nWithdraw_(W) \nDeposit_(D) \nTransfer_(T)\nQuit_(Q)\n: ");
    String response = scanner.nextLine().toLowerCase();
    System.out.println("------------------");
    System.out.println("************");
     String[] validResponses = {"s", "w", "d", "t", "q"};
    response=response.toLowerCase();
    if (response.equals("s")) {
        System.out.println("------------------");
        System.out.println("************");
        System.out.println(users[n].substring(0, 1).toUpperCase() + users[n].substring(1) + " YOU HAVE " + amounts[n] + " RUPEES ON YOUR ACCOUNT");
        System.out.println("------------------");
        System.out.println("************");
    } else if (response.equals("w")) {
        System.out.println("------------------");
        System.out.println("************");
        System.out.print("ENTER AMOUNT YOU WOULD LIKE TO WITHDRAW: ");
        int cashOut = scanner.nextInt();
        System.out.println("************");
        System.out.println("------------------");
        if (cashOut % 10 != 0) {
            System.out.println("------------------");
            System.out.println("************");
            System.out.println("AMOUNT YOU WANT TO WITHDRAW MUST TO MATCH 10 RUPEE NOTES");
            System.out.println("------------------");
            System.out.println("************");
        } else if (cashOut > amounts[n]) {
            System.out.println("------------------");
            System.out.println("************");
            System.out.println("YOU HAVE INSUFFICIENT BALANCE");
	    System.out.println("------------------");
            System.out.println("************");
       } else {
           amounts[n] = amounts[n] - cashOut;
           System.out.println("------------------");
           System.out.println("************");
           System.out.println("YOUR NEW BALANCE IS: " + amounts[n] + " RUPEES");
           System.out.println("------------------");
           System.out.println("************");
      }
}
else if (response.equals("d")) {
        System.out.println("------------------");
        System.out.println("************");
        System.out.print("ENTER AMOUNT YOU WANT TO DEPOSIT: ");
        int cash_in = scanner.nextInt();
        System.out.println("------------------");
        System.out.println("************");
        System.out.println();
        if (cash_in % 10 != 0) {
            System.out.println("------------------");
            System.out.println("************");
            System.out.println("AMOUNT YOU WANT TO LODGE MUST TO MATCH 10 RUPEES NOTES");
            System.out.println("------------------");
            System.out.println("************");
        } else {
            amounts[n] = amounts[n] + cash_in;
            System.out.println("------------------");
            System.out.println("************");
            System.out.println("YOUR NEW BALANCE IS: " + amounts[n] + " RUPEES");
            System.out.println("------------------");
            System.out.println("************");
        }
    }


else if (response.equals("t")) {
        System.out.println("------------------");
        System.out.println("************");
        System.out.println("Enter account to transfer: ");
        int acc = scanner.nextInt();
        System.out.println("Enter amount to transfer: ");
        int amt = scanner.nextInt();
        if (acc == 1) {
            amounts[0] = amounts[0] + amt;
            System.out.println(users[n].substring(0, 1).toUpperCase() + users[n].substring(1) + " YOU HAVE " + (amounts[n] - amt) + " RUPEES ON YOUR ACCOUNT");
            System.out.println("user1 have " + amounts[0] + " RUPEES ON YOUR ACCOUNT");
        } else if (acc == 2) {
            amounts[1] = amounts[1] + amt;
            System.out.println(users[n].substring(0, 1).toUpperCase() + users[n].substring(1) + " YOU HAVE " + (amounts[n] - amt) + " RUPEES ON YOUR ACCOUNT");
            System.out.println("user2 have " + amounts[1] + " RUPEES ON YOUR ACCOUNT");
        } else if (acc == 3) {
            amounts[2] = amounts[2] + amt;
            System.out.println(users[n].substring(0, 1).toUpperCase() + users[n].substring(1) + " YOU HAVE " + (amounts[n] - amt) + " RUPEES ON YOUR ACCOUNT");
            System.out.println("user3 have " + amounts[1] + " RUPEES ON YOUR ACCOUNT");
        } else {
            System.out.println("Invalid account");
        }
    }

else if (response.equals("q")) {
        System.exit(0);
    } else {
        System.out.println("------------------");
        System.out.println("************");
        System.out.println("RESPONSE NOT VALID");
        System.out.println("------------------");
        System.out.println("************");
    }
}
}
}
}
