import java.text.DecimalFormat;
import java.util.Scanner;


class MobilePhone extends Phone implements PayAble
{
    private double time;
    private double price;


    public MobilePhone(String code, double time, double price)
    {
        super(code);
        this.time = time;
        this.price = price;
    }

    public double pay()
    {
        return time * price;
    }
}

class Test
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String code = "18614038730";
        double time = scanner.nextDouble();
        double price = scanner.nextDouble();

        MobilePhone mobilePhone = new MobilePhone(code, time, price);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double pay = mobilePhone.pay();
        System.out.println("Fee=" + decimalFormat.format(pay));
    }
}

interface PayAble
{
    public double pay();
}

class Phone
{
    private String code;

    public Phone(String code)
    {
        this.code = code;
    }
}

