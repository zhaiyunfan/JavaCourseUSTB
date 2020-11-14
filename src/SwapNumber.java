import java.util.Scanner;

public class SwapNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        int temp;

        a = scanner.nextInt();
        b = scanner.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
