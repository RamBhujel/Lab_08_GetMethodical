import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String socialSecurityNum = "";
        String mIdNumber = "";
        String menu = "";
        boolean done = false;

        socialSecurityNum = SafeInput.getRegExString(in,"Enter your SSN","^\\d{3}-\\d{2}-\\d{4}$");
        mIdNumber = SafeInput.getRegExString(in, "Enter your UC M number","^(M|m)\\d{8}$");

        do{
            System.out.println("\nSelect a menu option:\n    O: Open\n    S: Save\n    V: View\n    Q: Quit");
            menu = in.nextLine();
            if(menu.equalsIgnoreCase("O"))
            {
                done = true;

            }
            else if (menu.equalsIgnoreCase("S"))
            {
                done = true;

            }
            else if (menu.equalsIgnoreCase("V"))
            {
                done = true;
                ;
            }
            else if (menu.equalsIgnoreCase("Q"))
            {
                done = true;

            }
            else
            {
                System.out.println("You must select from provided menu option [O - S - V - Q ");

            }

        }while (!done);
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {

        String retValue = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " : " );
            retValue = pipe.nextLine();
            if (retValue.matches(regEx)) {
                done = true;
            } else {
                System.out.println("You must enter a string that matches the pattern; " + regEx);
            }
        } while (!done);
        return retValue;
    }
}
