import java.util.Scanner;

public class Isomorph
{
    public static void main(String[] args)
    {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        for (int i = a; i <= b; i++)
        {
            int temp = i * i;
            if (i < 10)
            {
                if (temp % 10 == i)
                {
                    System.out.println(i);
                }
            } else
            {
                if (temp % 100 == i)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
