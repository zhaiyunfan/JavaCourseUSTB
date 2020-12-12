import java.util.Scanner;

public class MyOverload
{
    public static void main(String[] args)
    {
        int x, y, z;
        MyOverload myOverload = new MyOverload();
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        if (x < 0)
        {
            System.out.println(myOverload.f());
        } else if (y < 0)
        {
            System.out.println(myOverload.f(x));
        } else if (z < 0)
        {
            System.out.println(myOverload.f(x, y));
        } else
        {
            System.out.println(myOverload.f(x, y, z));
        }
    }

    public int f()
    {
        return 0;
    }

    public int f(int x)
    {
        return x * x;
    }

    public int f(int x, int y)
    {
        return x * x + y * y;
    }

    public int f(int x, int y, int z)
    {
        return x * x + y * y + z * z;
    }


}
