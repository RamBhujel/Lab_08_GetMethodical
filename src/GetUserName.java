import java.util.Scanner;

public class GetUserName {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString( in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString( in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" +prompt + ": ");
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }
}
