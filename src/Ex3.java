import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int lenght = input.nextInt();
        int[] arr = new int[lenght];
        for (int i = 0; i<lenght; i++)
            arr[i] = input.nextInt();
        for (int a = 1; a<lenght; a++){
            if (arr[a-1]<arr[a])
            System.out.println("This list is not sorted");
            break;
        }
        System.out.println("This list is sorted");
    }
}
