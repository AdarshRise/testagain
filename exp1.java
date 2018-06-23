import java.util.Scanner;

public class exp1
{
    public static void main(String a[])
    {
        System.out.println("hello");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        while (!input.hasNextInt())
     {
        input.nextLine();
        System.out.print("Invalid integer; please enter an integer: ");
     }
        int i = input.nextInt();
    }

} 