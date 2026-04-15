/*2. Core Java: The "SafeLog" Password Validator
Business Case: A cybersecurity firm needs a tool for their "Employee Portal" that forces employees to create strong passwords. Standard "if-else" isn't enough; they need a modular approach.
Problem Statement
Build a Password Strength Checker that validates a string against corporate security policies and provides specific feedback on why a password failed.


Student Tasks:
1.	The Policy: The password must be:
○	At least 8 characters long.
○	Contain at least one Uppercase letter.
○	Contain at least one Digit (0-9).
2.	Looping Logic: Use a for loop to iterate through the string and Character.isUpperCase() / Character.isDigit() to check requirements.
3.	Feedback System: Instead of just saying "Invalid," the program should print specifically: "Missing a digit" or "Too short."
4.	Retry Mechanism: Use a while loop to keep asking the user for a password until they enter a valid one.
Deliverable: A single PasswordValidator.java file that demonstrates string manipulation and loop control.
 */
import java.util.Scanner;
public class PasswordValidator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter Password : ");
            String pass = sc.next();
            int n = pass.length();
            boolean isUp=false;
        boolean isLo=false;
        boolean isL=false;
        boolean isD=false;
        boolean isSp=false;
        //length checking
        if(n>=8){
            isL=true;
        }
        for(int i=0;i<n;i++){
            char ch = pass.charAt(i);
            //Uppercase checking
            if(Character.isUpperCase(ch)){
                isUp=true;
            }
            //lowecase checking
            if(Character.isLowerCase(ch)){
                isLo=true;
            }
            //digit checking
            if(Character.isDigit(ch)){
                isD=true;
            }
            //extra feature (special character checking) for better security
            if(!Character.isLetterOrDigit(ch)){
                isSp=true;
            }
        }
        //error displaying
        if(!isL){
            System.out.println("Too Short");
        }
        if(!isUp){
            System.out.println("Missing UpperCase Letter");
        }
        if(!isLo){
            System.out.println("Missing LowerCase Letter");
        }
        if(!isD){
            System.out.println("Missing Digit");
        }
        if(!isSp){
            System.out.println("Missing Special Character");
        }
        //checking all checks are passed
        if(isL && isUp && isLo && isD && isSp){
            break;
        }
    }
    System.out.println("Valid");
        sc.close();
    }
}