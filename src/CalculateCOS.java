import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateCOS
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double sum = 1.00000000;
        double tempSum = 0;
        double xPow = 1.0;
        double nFac = 1;
        for (int i = 1; i <= n; ++i)
        {
            xPow = xPow * x * x;
            nFac = nFac * (2 * i) * (2 * i - 1);
            tempSum = xPow / nFac;
            if (i % 2 == 1)
            {
                tempSum *= -1;
            }
            sum += tempSum;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#0.00000000");
        //decimalFormat.setMaximumFractionDigits(8);
        decimalFormat.setGroupingUsed(false);
        System.out.println(decimalFormat.format(sum));
    }
}
