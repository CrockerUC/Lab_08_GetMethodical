import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int year = SafeInput.getRangedInt(scanner, "Enter your year of birth", 1950, 2015);
        int month = SafeInput.getRangedInt(scanner, "Enter your month of birth", 1, 12);

        int maxDays;

        switch(month)
        {
            case 4: case 6: case 9: case 11: maxDays = 30; break;
            case 2: maxDays = 29; break;
            default: maxDays = 31;
        }

        int day = SafeInput.getRangedInt(scanner, "Enter your day of birth", 1, maxDays);
        int hour = SafeInput.getRangedInt(scanner, "Enter your hour of birth", 1, 24);
        int minute = SafeInput.getRangedInt(scanner, "Enter your minute of birth", 0, 59);

        System.out.println("Your date of birth is: " + month + "/" + day + "/" + year + " " + hour + ":" + minute);
    }
}
