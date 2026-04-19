import java.util.Scanner;

public class Main {
    

    public static boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;

    }

         public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    

   

        System.out.println("=== Create Account ===");

        // Username
        System.out.print("Enter username: ");
        String username = input.nextLine();

        // Check username conditions
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username successfully captured");
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }


       
        // Password
        System.out.print("Enter password: ");
        String password = input.nextLine();

        // flags
        boolean isLongEnough = false;
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpecialCase = false;

        // flag1
        isLongEnough = password.length() >= 8; 

        // other flags
        for (int i = 0; i < password.length(); i++) { 
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(ch)) {
                hasNumber = true;
            }
            if (!Character.isLetterOrDigit(ch)) { 
                 hasSpecialCase = true;
            }
        }

        if (isLongEnough && hasNumber && hasUpperCase && hasSpecialCase) {
            System.out.println("Password successfully captured");
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number and a special character.");
        }

       
       
        //Phone number 
        
        System.out.print("Enter South African cell phone number: ");
        String cellNumber = input.nextLine();

        // Checking cell number conditions
        boolean cellNumberValid = false;

        if(cellNumber.length() == 12 && cellNumber.startsWith("+27")) { // FIX 2: add ()
            cellNumberValid = true;

            for (int i = 3; i < 12; i++) {
                if(!Character.isDigit(cellNumber.charAt(i))) {
                    cellNumberValid = false;
                    break;
                }
            }
        }

        if (cellNumberValid) {
            System.out.println("Cell number successfully captured.");
        } else {
            System.out.println("Cell number is not correctly formatted; please ensure that the cell number starts with +27 followed by 9 digits.");
        }
    


        input.close();
    }
}