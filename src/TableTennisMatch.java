/*
【问题描述】两个乒乓球队进行比赛,各出三人.甲队为a,b,c三人,乙队为x,y,z三人.已抽签决定比赛名单.有人向队员打听比赛的名单,a说他不和x比,c说他不和x,z比,请编程找出三对赛手的名单.
【输入形式】控制台任意输入甲或者乙队一个队员的代号,是一个字符，可以是'a','b','c','x','y','z'.
【输出形式】控制台输出与该选手比赛的另一个选手的代号.
【样例输入】a
【样例输出】z
【样例说明】与a进行比赛的选手是z
 */

import java.util.Scanner;

public class TableTennisMatch
{
    public static void main(String[] args)
    {
        String name = new String();
        String target = new String();

        Scanner scanner = new Scanner(System.in);
        name = scanner.next();

        if (name.equals("a"))
        {
            target = "z";
        } else if (name.equals("b"))
        {
            target = "x";
        } else if (name.equals("c"))
        {
            target = "y";
        } else if (name.equals("x"))
        {
            target = "b";
        } else if (name.equals("y"))
        {
            target = "c";
        } else if (name.equals("z"))
        {
            target = "a";
        }
        //c and y
        //a and z
        //b and x
        System.out.println(target);
    }
}
