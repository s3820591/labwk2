import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] months = new String[12];
        months [0] = "Jan";
        months [1] = "Feb";
        months [2] = "Mar";
        months [3] = "Apr";
        months [4] = "May";
        months [5] = "Jun";
        months [6] = "Jul";
        months [7] = "Aug";
        months [8] = "Sep";
        months [9] = "Oct";
        months [10] = "Nov";
        months [11] = "Dec";
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter a month: ");
        String month = input.nextLine();
        for (int i = 0; i<=7; i++) {
            if (month == months[i]) {
                System.out.print(month + year + "has 31 days");
            }
        }
    }
}
