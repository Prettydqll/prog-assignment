import java.util.Scanner;

public class Main {
    
   

    public static boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;

    }

         public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Registration
        
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        
        System.out.print("Enter username: ");
        String username = input.nextLine();
        
        //Username

        

        
        // Check username conditions
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username successfully captured");
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }


        
        
        
        System.out.print("Enter password: ");
        String password = input.nextLine();
        
        
        // Password
       

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
            System.out.println("Password successfully added");
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number and a special character.");
        }
        
        
        
        System.out.print("Enter cell phone number: ");
        String cellNumber = input.nextLine();
        
         // Must start with + and have ≤10 digits after the country code

        if (cellNumber.startsWith("+") && cellNumber.substring(3).length() <= 10) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }
    
        
        
        
        
        
        
        //login user
        
         Login userLogin = new Login(); 
        System.out.print("Enter username to login: ");
        String loginUser = input.nextLine();
        System.out.print("Enter password to login: ");
        String loginPass = input.nextLine();

        if (userLogin.checkLogin(loginUser, loginPass, username, password)) {
            System.out.println("Welcome " + firstName + ", " + lastName + " it is great to see you again.");
        } else {
            System.out.println("Username or password incorrect, please try again.");
            
}


    
    
       

       
       
       
        //Phone number 
        
       

        // Checking cell number conditions
        boolean cellNumberValid = false;

        if(cellNumber.length() == 12 && cellNumber.startsWith("+27")) {
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

class Login {
    public boolean checkLogin(String loginUser, String loginPass, String username, String password) {
        return loginUser.equals(username) && loginPass.equals(password);
    }
}