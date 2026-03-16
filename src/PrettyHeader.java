import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the header message: ");
        String header = scanner.nextLine();
        SafeInput.prettyHeader(header);
    }
}
