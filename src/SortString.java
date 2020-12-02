import java.util.Arrays;
import java.util.Scanner;

public class SortString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replaceAll(" ", "");
        input = input.replaceAll("(?s)(.)(?=.*\\1)", "");
        char[] array = input.toCharArray();
        Arrays.sort(array);
        System.out.println(array);
    }

}
