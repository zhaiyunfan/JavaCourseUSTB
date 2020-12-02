import java.util.Scanner;

public class SumInBit
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(sum(input));
    }

    public static int sum(int x)
    {
        int sum = 0;

        while (x / 10 > 0)
        {
            sum += x % 10;
            x /= 10;
        }
        sum += x;
        return sum;
    }
}
