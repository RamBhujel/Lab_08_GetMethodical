import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0.0;
        boolean done = false;

        favInt = SafeInput.getInt(in, "Enter Your Favorite Integer Number ");
        favDouble = SafeInput.getDouble(in, "Enter Your Favorite Double Number ");
        System.out.println("\n Your Favorite Integer Number  is : " +favInt);
        System.out.println("\n Your Favorite Double Number is : " +favDouble);

    }
    public static int getInt(Scanner pipe, String prompt) {
        boolean done = false;
        int retValue = 0;
        String trash = "";

        do {
            System.out.print("\n" + prompt);
            if (pipe.hasNextInt())
            {
                retValue = pipe.nextInt();
                pipe.nextLine();
                done = true;

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int not: " + trash);
            }
        } while (!done);

        return retValue;
    }
    public static double getDouble(Scanner pipe, String prompt) {

        boolean done = false;
        double retValue = 0.0;
        String trash = "";

        do {
            System.out.print("\n" + prompt);
            if (pipe.hasNextDouble())
            {
                retValue = pipe.nextDouble();
                pipe.nextLine();
                done = true;

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int not: " + trash);
            }
        } while (!done);

        return retValue;
    }
}
