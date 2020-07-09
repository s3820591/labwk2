import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();
        String [] arr = new String[3];
        arr[0] = city1;
        arr[1] = city2;
        arr[2] = city3;
        Arrays.sort(arr);
        String a = Arrays.toString(arr);
        System.out.println("The three cities in alphabetical order are: " + a);
    }
}
