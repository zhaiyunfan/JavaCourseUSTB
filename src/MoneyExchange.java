/*
【问题描述】一个百万富翁碰到一个陌生人,陌生人找他谈了一个换钱的计划.该计划如下:我每天给你10万,而你第一天给我一分钱,第二天我仍给你十万,你给我二分钱,第三天我仍给你十万,你给我四分钱......你每天给我的钱是前一天的两倍,直到满n(0<=n<=30)天.百万富翁非常高兴,欣然接受了这个契约.请编写一个程序,计算这n天中,陌生人给了富翁多少钱,富翁给了陌生人多少钱.
【输入形式】输入天数n(0<=n<=30)
【输出形式】控制台输出.分行给出这n天中，陌生人所付出的钱和富翁所付出的钱.输出舍弃小数部分,取整.
【样例输入】30
【样例输出】
3000000
10737418
【样例说明】两人交易了30天，陌生人给了富翁3000000的钱(以元为单位).富翁给了陌生人10737418元.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyExchange
{
    public static void main(String[] args)
    {
        int totalDay = 0;
        double richManSum = 0;
        double poorManSum = 0;
        double richManPer = 100000;
        double poorManPer = 0.01;
        Scanner scanner = new Scanner(System.in);
        totalDay = scanner.nextInt();

        for (int i = 0; i < totalDay; ++i)
        {
            richManSum += richManPer;
            poorManSum += poorManPer;
            poorManPer *= 2;
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(0);
        decimalFormat.setGroupingUsed(false);

        System.out.println(decimalFormat.format(richManSum));
        System.out.println(decimalFormat.format(Math.floor(poorManSum)));

    }
}
