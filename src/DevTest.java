import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
//        String userString = getNonZeroLenString(scanner, "Enter a string");
//        System.out.println("You entered: " + userString);
        int userInt = getInt(scanner, "Enter an integer");
        System.out.println("You entered: " + userInt);
    }

    /**
     * A method that gets a non-zero-length String from the user.
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
//    public static String getNonZeroLenString(Scanner pipe, String prompt)
//    {
//        String retString = ""; // Set this to zero length. Loop runs until it isn't
//        do
//        {
//            System.out.print("\n" +prompt + ": "); // show prompt add space
//            retString = pipe.nextLine();
//        }while(retString.length() == 0);
//
//        return retString;
//
//    }

    /**
     * A method that prompts the user to input any integer. (That is that we don't have any pre-conception
     * of what the range for the integer might be.)
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return an integer response
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        int val = 0;
        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                val = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                String trash = pipe.nextLine();
                System.out.println("Enter a valid integer, not " + trash);
            }
        } while(!done);
        return val;
    }



}
