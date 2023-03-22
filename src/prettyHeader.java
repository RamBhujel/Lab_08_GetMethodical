import java.util.Scanner;

public class prettyHeader {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a message to print: ");
        String msg = in.nextLine();
        SafeInput.prettyHeader(msg);


    }
        public static void prettyHeader(String msg) {
        if (msg.length() < 52) {
            int count = 0;
            int space = 0;
            boolean isEvenLength = (msg.length() % 2 == 0);
            for (int cnt = 0; cnt < 3; cnt++) {
                if (cnt % 2 == 0) {
                    for(int i = 0; i < 60; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                } else {
                    count = (54 - msg.length());
                    System.out.print("***");
                    for (int i = 0; i< count / 2; i++) {
                        System.out.print(" ");
                    }
                    System.out.print(msg);
                    if (isEvenLength) {
                        space = count / 2;
                    } else {
                        space = count / 2 + 1;
                    }
                    for (int i = 0; i < space; i++) {
                        System.out.print(" ");
                    }
                    System.out.println("***");
                }
            }
        }
        else
        {
            System.out.println("Your message is not valid!!!.");
        }
    }
}

