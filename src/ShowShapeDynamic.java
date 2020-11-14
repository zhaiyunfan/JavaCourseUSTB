import java.util.Scanner;

public class ShowShapeDynamic
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int times = (n + 1) / 2;
        for (int i = 1; i <= times; ++i)
        {
            for (int j = 0; j < times - i; ++j)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; ++j)
            {
                System.out.print("*");
            }
            for (int j = 0; j < times - i; ++j)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
