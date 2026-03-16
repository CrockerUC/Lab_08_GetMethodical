import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double price;
        double total = 0;
        boolean moreItems;

        do
        {
            price = SafeInput.getRangedDouble(scanner, "Enter the price of an item", 0.50, 10.00);
            total += price;
            moreItems = SafeInput.getYNConfirm(scanner, "Do you want to add another item?");
        } while (moreItems);

        System.out.printf("Total cost: $%.2f", total);
    }
}
