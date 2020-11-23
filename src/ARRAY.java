import java.text.DecimalFormat;
import java.util.Scanner;

public class ARRAY
{
    private float data[];
    private float max;
    private float min;
    private float average;

    public ARRAY(float[] a)
    {
        data = new float[10];
        for (int i = 0; i < 10; ++i)
        {
            data[i] = a[i];
        }
        max = data[0];
        min = data[0];
        average = 0;
    }

    public void process()
    {
        for (int i = 0; i < 10; ++i)
        {
            if (data[i] > max)
            {
                max = data[i];
            }
            if (data[i] < min)
            {
                min = data[i];
            }
            average += data[i];
        }
        average /= 10;
    }

    public void print()
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (int i = 0; i < 10; ++i)
        {
            System.out.print(decimalFormat.format(data[i]) + " ");
            if (i % 5 == 4)
            {
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("max = " + decimalFormat.format(max));
        System.out.println("min = " + decimalFormat.format(min));
        System.out.println("average = " + average);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float[] a = new float[10];
        for (int i = 0; i < 10; ++i)
        {
            a[i] = scanner.nextFloat();
        }
        ARRAY array = new ARRAY(a);
        array.process();
        array.print();
    }
}

