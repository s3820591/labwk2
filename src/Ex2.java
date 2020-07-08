import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Enter the integer between 1 and 100: ");
        int a = input.nextInt();
        while (a != 0) {
            if ((a <= 100) && (a >= 1))
                arr[a - 1]++;
            a = input.nextInt();
        }
        for (int i = 0; i<100; i++){
            if (arr[i]>0)
                System.out.println((i+1) + " occur " + arr[i] + ((arr[i] == 1)? " time" : " times"));
        }
    }
}
