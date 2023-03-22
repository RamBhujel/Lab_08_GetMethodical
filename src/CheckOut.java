import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double itemsPrice = 0.0;
        boolean addItem;




        do {
            itemsPrice += SafeInput.getRangeDouble(in, "Enter the price of your item ", 0.50, 10.0);
            addItem = SafeInput.getYNConfirm(in, "Do you want to add item ");
        }while (addItem);

        System.out.printf("\nThe total cost: %.02f\n", itemsPrice);
    }

    public static double getRangeDouble(Scanner pipe, String prompt , double low , double high)
    {

        double retDouble = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ":  ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                if(retDouble >= low && retDouble <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + retDouble);
                }

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }
        } while (!done);

        return retDouble;

    }

    public static boolean getYNConfirm(Scanner pipe , String prompt)
    {
        boolean retBoolean = false;
        boolean done = false;
        String addItem = "";

        do{
            System.out.print("\n" + prompt + "[Y/N]: ");
            addItem = pipe.nextLine();
            if(addItem.equalsIgnoreCase("Y"))
            {
                retBoolean = true;

                done = true;
            }
            else if (addItem.equalsIgnoreCase("N"))
            {
                retBoolean = false;
                done= true;
            }
            else
            {
                System.out.println("You must enter a Y or N not : "+ addItem);
            }

        }while (!done);
        return retBoolean;

    }
}
