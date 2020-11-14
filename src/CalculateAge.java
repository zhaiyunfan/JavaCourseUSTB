import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculateAge
{
    public static void main(String[] args)
    {
        String birthdayString;
        String todayString;

        Scanner scanner = new Scanner(System.in);
        birthdayString = scanner.next();
        todayString = scanner.next();

        String[] birthdayArray = birthdayString.split("\\.");
        String[] todayArray = todayString.split("\\.");

        int age = Integer.parseInt(todayArray[0]) - Integer.parseInt(birthdayArray[0]);

        if (Integer.parseInt(todayArray[1]) < Integer.parseInt(birthdayArray[1]))
        {
            age--;
        } else if (Integer.parseInt(todayArray[1]) == Integer.parseInt(birthdayArray[1]))
        {
            if (Integer.parseInt(todayArray[2]) < Integer.parseInt(birthdayArray[2]))
            {
                age--;
            }
        }

//        System.out.println(birthdayString);
//        System.out.println(todayString);
        System.out.println(age);
    }
}
