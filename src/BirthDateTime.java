import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int year = 0;
        int month = 0;
        int hour = 0;
        int minute = 0;
        int daysInMonth = 0;

        year = SafeInput.getRangedInt(in, "Enter your birth Year  ", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter your month ", 1, 12);


        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;

            case 2:
                daysInMonth = 28;
                break;

            default:
                daysInMonth = 0;
                break;


        }
        day = SafeInput.getRangedInt(in, "Enter your day  ", 1, daysInMonth);
        hour = SafeInput.getRangedInt(in, "Enter the hour  ", 1, 24);
        minute = SafeInput.getRangedInt(in, "Enter the minute  ", 1, 59);
        System.out.printf("\nYou were born on %d/%d/%d at %d:%d.\n", month, day, year, hour, minute);
    }




    public static int getRangedInt(Scanner pipe, String prompt, int lo, int hi)
    {
        int result = 0;
        boolean done = false;
        String trash = "";
        do
        {

            System.out.print(prompt + "[" + lo + " - " + hi + "]: ");
            if(pipe.hasNextInt())
            {
                result = pipe.nextInt();
                pipe.nextLine();
                if(result >= lo && result <= hi)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value in range [" + lo + " - " + hi + "]: " + result);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an valid input [" + lo + " - " + hi + "]: " + trash);
            }


        }while(!done);

        return result;
    }

}
