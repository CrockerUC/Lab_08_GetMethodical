import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(scanner, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(scanner, "Enter your M Number", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(scanner, "Enter your menu choice", "^[OoSsVvQq]$");
    }
}
