import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int favInt;
        double favDouble;

        favInt = SafeInput.getInt(scanner, "Enter your favorite integer");
        favDouble = SafeInput.getDouble(scanner, "Enter your favorite double");

        System.out.println("Your favorite integer is: " + favInt + " and your favorite double is: " + favDouble + ".");
    }
}
